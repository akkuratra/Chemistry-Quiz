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

public class Ques1 extends AppCompatActivity {
    public static int m=0;
    public static int k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);
        TextView txt = (TextView) findViewById(R.id.Q1);
        RadioGroup rad = (RadioGroup) findViewById(R.id.grp);
        final RadioButton b1 = (RadioButton) findViewById(R.id.b1);
        final RadioButton b2 = (RadioButton) findViewById(R.id.b2);
        final RadioButton b3 = (RadioButton) findViewById(R.id.b3);
        final RadioButton b4 = (RadioButton) findViewById(R.id.b4);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (b2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                    ++Ques1.m;
                } else if (b1.isChecked()||b3.isChecked()||b4.isChecked())
                    Toast.makeText(getApplicationContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show();
                goToques2();
            }


        });

    }

    private void goToques2() {
        Intent intent = new Intent(this, ques2.class);
        startActivity(intent);
    }
    public void onBackPressed()
    {
        Log.e("My Tags", "onBackPressed");
        k++;
        if(k == 1)
        {
            Toast.makeText(Ques1.this, "Please Press Again To Exit.", Toast.LENGTH_SHORT).show();
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
