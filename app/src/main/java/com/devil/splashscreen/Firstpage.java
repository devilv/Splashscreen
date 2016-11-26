package com.devil.splashscreen;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class Firstpage extends Activity {
    TextView t1,t2;
    ProgressBar p1;
    ProgressDialog a;
    int i=0;
    SeekBar s1;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.firstpage);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        p1=(ProgressBar)findViewById(R.id.progressBar3);
        s1=(SeekBar)findViewById(R.id.seekBar2);
        s1.setMax(10000);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if(i<=10000){
                    t2.setText("Loading..."+(i/100)+"%");
                    s1.setProgress(i);
                    i=i+100;
                    handler.postDelayed(this, 100);
                }
                else{
                    Intent i = new Intent("shift");
                    startActivity(i);
                }

            }
        },100);
    }
}
