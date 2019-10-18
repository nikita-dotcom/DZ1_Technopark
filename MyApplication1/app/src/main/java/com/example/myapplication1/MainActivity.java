package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NumbersAdapter.OnNumberListener{
    private RecyclerView numberList;
    private  NumbersAdapter numbersAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberList = findViewById(R.id.rv_numbers);

         GridLayoutManager gridLayoutManager= new GridLayoutManager(this,3);
        numberList.setLayoutManager(gridLayoutManager);

        numberList.setHasFixedSize(true);// set fixed size of list

         numbersAdapter= new NumbersAdapter(100, this);
         numberList.setAdapter(numbersAdapter);
    }


    @Override
    public void onNumberListener(int position) {



    }
}
