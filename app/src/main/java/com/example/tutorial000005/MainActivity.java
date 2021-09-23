package com.example.tutorial000005;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        EditText et1 = (EditText) findViewById(R.id.etfname);
        EditText et2 = (EditText) findViewById(R.id.etlname);
        EditText et3 = (EditText) findViewById(R.id.etemail);
        EditText et4 = (EditText) findViewById(R.id.etpass);
        RadioButton rb1 = (RadioButton) findViewById(R.id.rbmale);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rbfemale);
        CheckBox soe = (CheckBox) findViewById(R.id.cbsoe);
        Switch branch = (Switch) findViewById(R.id.swbranch);
        Spinner sp1 = (Spinner) findViewById(R.id.spcity);

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        String s3 = et3.getText().toString();
        String s4 = et4.getText().toString();
        String s5 = " ";
        if (rb1.isChecked()){
            s5 = "Male";
        }
        if (rb2.isChecked()){
            s5 = "Female";
        }
        else{
            s5 = "Other";
        }
        String s6 = " ";
        if (soe.isChecked()){
            s6 = "soe";
        }
        else{
            s6 = "12th science";
        }
        String s7 = " ";
        if (branch.isChecked()){
            s7 = "CE";
        }
        else{
            s7 = "IT";
        }
        String s8 = sp1.getSelectedItem().toString();

        Intent a1 = new Intent(this , MainActivity2.class);
        a1.putExtra("fname",s1);
        a1.putExtra("lname",s2);
        a1.putExtra("email",s3);
        a1.putExtra("pass",s4);
        a1.putExtra("gender",s5);
        a1.putExtra("admission",s6);
        a1.putExtra("branch",s7);
        a1.putExtra("city",s8);
        startActivity(a1);
    }
}