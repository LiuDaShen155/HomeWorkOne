package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TwoFirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_first);
        //跳转垂直布局
        Button btn=(Button)findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TwoFirstActivity.this,TwoActivity.class);
                startActivity(intent);
            }
        });
        //跳转向左靠近
        Button btn2=(Button)findViewById(R.id.button8);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(TwoFirstActivity.this,TwoSecondActivity.class);
                startActivity(intent2);
            }
        });

        Button btn3=(Button)findViewById(R.id.button5);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(TwoFirstActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}
