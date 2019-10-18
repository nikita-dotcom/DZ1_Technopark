package com.example.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


import java.time.format.TextStyle;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumberViewHolder>  {
    private OnNumberListener mOnNumberListener;
    private int numberItems;


    public NumbersAdapter(int numberItems, OnNumberListener mOnNumberListener){
        this.numberItems=numberItems;
        this.mOnNumberListener=mOnNumberListener;
    }


    @NonNull
    @Override  //to create new ViewHolders
    public NumberViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        Context context= parent.getContext();
        int layoutidForListItem= R.layout.number_list_item;

        LayoutInflater inflater= LayoutInflater.from(context);

        View view= inflater.inflate(layoutidForListItem,parent, false);// creating of java object from number_list_item.xml

        NumberViewHolder viewHolder= new NumberViewHolder(view,mOnNumberListener);

        return viewHolder;
    }

    @Override
    //to change values in ViewHolders
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    // to return number of elements in list
    public int getItemCount() {
        return numberItems;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Button numberButton;
        OnNumberListener onNumberListener;

        public NumberViewHolder(View itemView, OnNumberListener onNumberListener) {
            super(itemView);
            numberButton = itemView.findViewById(R.id.b_number_item);
            itemView.setOnClickListener(this);
            this.onNumberListener= onNumberListener;

        }
            void bind ( int listIndex){

                numberButton.setText(String.valueOf(listIndex));  //updating of value in list
            }

        @Override
        public void onClick(View v) {
            onNumberListener.onNumberListener(getAdapterPosition());
        }
    }

    public interface OnNumberListener{

        public void onNumberListener(int position);

    }

}
