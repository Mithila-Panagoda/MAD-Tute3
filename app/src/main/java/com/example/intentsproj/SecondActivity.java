package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String no1 = intent.getStringExtra("N1");
        TextView textView = findViewById(R.id.txtNo1);
        textView.setText(no1);

        String no2 = intent.getStringExtra("N2");
        textView = findViewById(R.id.txtNo2);
        textView.setText(no2);
    }

    public void add(View view){
        EditText editText =(EditText) findViewById(R.id.txtNo1);
        Float no1 = Float.valueOf(editText.getText().toString());
        editText=(EditText) findViewById(R.id.txtNo2);
        Float no2 = Float.valueOf(editText.getText().toString());

        float ans = no1+no2;

        TextView textView = findViewById(R.id.lbl_ans);
        textView.setText(""+no1+" + "+no2+" = " + ans);

    }

    public void sub(View view){
        EditText editText =(EditText) findViewById(R.id.txtNo1);
        Float no1 = Float.valueOf(editText.getText().toString());
        editText=(EditText) findViewById(R.id.txtNo2);
        Float no2 = Float.valueOf(editText.getText().toString());
        float ans = no1-no2;

        TextView textView = findViewById(R.id.lbl_ans);
        textView.setText(""+no1+" - "+no2+" = " + ans);
    }

    public void mult(View view){
        EditText editText =(EditText) findViewById(R.id.txtNo1);
        Float no1 = Float.valueOf(editText.getText().toString());
        editText=(EditText) findViewById(R.id.txtNo2);
        Float no2 = Float.valueOf(editText.getText().toString());
        float ans = no1*no2;

        TextView textView = findViewById(R.id.lbl_ans);
        textView.setText(""+no1+" * "+no2+" = " + ans);
    }

    public void div(View view){
        EditText editText =(EditText) findViewById(R.id.txtNo1);
        Float no1 = Float.valueOf(editText.getText().toString());
        editText=(EditText) findViewById(R.id.txtNo2);
        Float no2 = Float.valueOf(editText.getText().toString());
        float ans = no1/no2;

        TextView textView = findViewById(R.id.lbl_ans);
        textView.setText(""+no1+" / "+no2+" = " + ans);
    }
}