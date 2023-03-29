package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity3 extends AppCompatActivity implements OnClickListener {
EditText t1,t2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = (EditText) findViewById(R.id.editText1) ;
        t2 = (EditText) findViewById(R.id.editText2) ;
        b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent i = new Intent(this,MainActivity4.class);
        i.putExtra("key1",t1.getText().toString());
        i.putExtra("key2",t2.getText().toString());
        startActivity(i);
    }
}