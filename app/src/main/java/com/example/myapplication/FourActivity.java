package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import javax.net.ssl.HandshakeCompletedListener;

public class FourActivity extends AppCompatActivity {


    private LinearLayout linearlayout;

    private ImageView main_imageview;

    private int i = 0;

    Timer timer = new Timer();

    private Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {

            Log.e("@@@", i + "");
            //index=msg.what;
            if (i > 5)
            {
                i = 0;
            }
            else
            {
                switch (i)
                {
                    case 1:
                        main_imageview.setImageResource(R.drawable.first);
                        break;
                    case 2:
                        main_imageview.setImageResource(R.drawable.second);
                        break;
                    case 3:
                        main_imageview.setImageResource(R.drawable.thired);
                        break;
                    case 4:
                        main_imageview.setImageResource(R.drawable.forth);
                        break;
                    case 5:
                        main_imageview.setImageResource(R.drawable.fifth);
                        break;
                    default:
                        break;
                }
                linearlayout.invalidate();
            }
            super.handleMessage(msg);
        }
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Button btn3=(Button)findViewById(R.id.button5);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(FourActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });
        initView();
    }

    public void initView()
    {
        linearlayout = (LinearLayout) findViewById(R.id.lin1);
        main_imageview = (ImageView) findViewById(R.id.view1);

        timer.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                i++;
                Message mesasge = new Message();
                mesasge.what = i;
                handler.sendMessage(mesasge);
            }
        }, 0, 700);
    }

    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        timer.cancel();
        super.onDestroy();
    }

}
