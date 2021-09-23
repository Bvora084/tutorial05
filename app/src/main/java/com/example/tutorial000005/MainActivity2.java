package com.example.tutorial000005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String s1 = getIntent().getStringExtra("fname");
        String s2 = getIntent().getStringExtra("lname");
        String s3 = getIntent().getStringExtra("email");
        String s4 = getIntent().getStringExtra("pass");
        String s5 = getIntent().getStringExtra("gender");
        String s6 = getIntent().getStringExtra("admission");
        String s7 = getIntent().getStringExtra("branch");
        String s8 = getIntent().getStringExtra("city");

        TextView t1 = (TextView) findViewById(R.id.tvfname);
        TextView t2 = (TextView) findViewById(R.id.tvlname);
        TextView t3 = (TextView) findViewById(R.id.tvemail);
        TextView t4 = (TextView) findViewById(R.id.tvpass);
        TextView t5 = (TextView) findViewById(R.id.tvgender);
        TextView t6 = (TextView) findViewById(R.id.tvsoe);
        TextView t7 = (TextView) findViewById(R.id.tvbranch);
        TextView t8 = (TextView) findViewById(R.id.tvcity);

        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);
        t5.setText(s5);
        t6.setText(s6);
        t7.setText(s7);
        t8.setText(s8);
    }
}