package com.example.myapplication1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatCallback;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class NumbersFragment extends Fragment implements NumbersAdapter.OnNumberListener{
    private RecyclerView numberList;
    private  NumbersAdapter numbersAdapter;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        numberList = view.findViewById(R.id.rv_numbers);

        GridLayoutManager gridLayoutManager= new GridLayoutManager(getContext(),3);
        numberList.setLayoutManager(gridLayoutManager);

        numberList.setHasFixedSize(true);// set fixed size of list

        numbersAdapter= new NumbersAdapter(100, this);
        numberList.setAdapter(numbersAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_numbers, container, false);
    }


    @Override
    public void onNumberListener(int position) {

    }
}
