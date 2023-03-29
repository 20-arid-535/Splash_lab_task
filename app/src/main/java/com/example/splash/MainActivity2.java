package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity2 extends AppCompatActivity implements OnClickListener{
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = (Button) findViewById(R.id.button3);
        b.setOnClickListener(this);
    }
    public void onClick(View v){

                Intent itr = new Intent(this,MainActivity3.class);
                startActivity(itr);

        }

    }
