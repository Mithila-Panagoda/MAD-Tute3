package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void sendNumbers(View view){

       /* Context context = getApplicationContext();
        CharSequence message= "You just clicked the ok button";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,message,duration);
        //toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);
        toast.show();*/



        LayoutInflater li = getLayoutInflater();
        View layout = ((LayoutInflater) li).inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        Toast ctoast = new Toast(getApplicationContext());
        ctoast.setDuration(Toast.LENGTH_SHORT);
        //ctoast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        ctoast.setView(layout);//setting the view of custom toast layout
        ctoast.show();


        Intent intent =  new Intent(this , SecondActivity.class);
        EditText editText=(EditText) findViewById(R.id.txtNo1);
        String number1= editText.getText().toString();
        editText=(EditText) findViewById((R.id.txtNo2));
        String number2=editText.getText().toString();
        intent.putExtra("N1",number1);
        intent.putExtra("N2",number2);
        startActivity(intent);
    }
}