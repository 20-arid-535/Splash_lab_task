package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView t1,t2;
String s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1 = (TextView) findViewById(R.id.textView12) ;
        t2 = (TextView) findViewById(R.id.textView11) ;
        Intent i = getIntent();
        s1 = i.getStringExtra("key1");
        s2 = i.getStringExtra("key2");
        t1.setText(s1);
        t2.setText(s2);
    }
}