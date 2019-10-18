package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myscreen);
        final  TextView text= (TextView) findViewById(R.id.textView1);
        final Button buttonOk= (Button) findViewById(R.id.Ok);
        final Button buttonCancel= (Button) findViewById(R.id.Cancel);
        buttonOk.setText("Ok");
        buttonCancel.setText("Cancel");
        View.OnClickListener onClickListener= new View.OnClickListener(){
            public void  onClick(View v){
               switch (v.getId()){
                   case R.id.Cancel:
                       text.setText("Нажата кнопка Cancel");
               break;
                   case R.id.Ok:
                       text.setText("Нажата кнопка Ok");
               break;

               }
            }

        };
       buttonOk.setOnClickListener(onClickListener);
        buttonCancel.setOnClickListener(onClickListener);
    }
}
