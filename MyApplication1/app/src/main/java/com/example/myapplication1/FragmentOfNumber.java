package com.example.myapplication1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentOfNumber extends Fragment {
    private TextView textViewWithNumber;
    private int positionIndex;
     public FragmentOfNumber (int positionIndex){
         this.positionIndex=positionIndex;

     }

    public int getPositionIndex() {
        return positionIndex;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     textViewWithNumber= view.findViewById(R.id.tv_number);
     textViewWithNumber.setText(String.valueOf(getPositionIndex()));
     }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_fragment_of_number, container, false);
    }


}
