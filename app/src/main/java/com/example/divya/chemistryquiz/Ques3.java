package com.example.divya.chemistryquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Ques3 extends AppCompatActivity {
    public static int k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);
        TextView txt = (TextView) findViewById(R.id.Q3);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.grp3);
        final RadioButton btn1 = (RadioButton) findViewById(R.id.btn1);
        final RadioButton btn2 = (RadioButton) findViewById(R.id.btn2);
        final RadioButton btn3 = (RadioButton) findViewById(R.id.bt3);
        final RadioButton btn4 = (RadioButton) findViewById(R.id.btn4);
        Button previous = (Button) findViewById(R.id.pr);
        Button submit = (Button) findViewById(R.id.sb);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --Ques1.m;
                Intent myIntent = new Intent(Ques3.this, ques2.class);
                startActivity(myIntent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn4.isChecked())
                { Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                    ++Ques1.m;}
                else if(btn1.isChecked()||btn3.isChecked()||btn2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show(); }

                goTomarks();
            }
        });
    }

    public void goTomarks() {
        Intent myIntent = new Intent(this, marks.class);
        startActivity(myIntent);
    }
    public void onBackPressed()
    {
        Log.e("My Tags", "onBackPressed");
        k++;
        if(k == 1)
        {
            Toast.makeText(Ques3.this, "Please Press Again To Exit.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }
    }
}
