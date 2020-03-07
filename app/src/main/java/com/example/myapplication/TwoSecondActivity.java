package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TwoSecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_two_second);
        //跳转水平布局
        Button btn=(Button)findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TwoSecondActivity.this,TwoActivity.class);
                startActivity(intent);
            }
        });
        //跳转垂直布局
        Button btn2=(Button)findViewById(R.id.button7);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(TwoSecondActivity.this,TwoFirstActivity.class);
                startActivity(intent2);
            }
        });

        Button btn3=(Button)findViewById(R.id.button5);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(TwoSecondActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}
