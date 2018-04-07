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

public class ques2 extends AppCompatActivity {
    public static int k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        TextView txt= (TextView)findViewById(R.id.Q2);
        RadioGroup grp= (RadioGroup)findViewById(R.id.grp2);
        final RadioButton bt1= (RadioButton)findViewById(R.id.bt1);
        final RadioButton bt2= (RadioButton)findViewById(R.id.bt2);
        final RadioButton bt3= (RadioButton)findViewById(R.id.bt3);
        final RadioButton bt4= (RadioButton)findViewById(R.id.bt4);
        Button btn= (Button)findViewById(R.id.pre);
        Button btn2= (Button)findViewById(R.id.nxt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --Ques1.m;
                Intent myIntent = new Intent(ques2.this,Ques1.class);
                startActivity(myIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bt2.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                    ++Ques1.m;
                }
                else if (bt1.isChecked()||bt3.isChecked()||bt4.isChecked())
                    {
                    Toast.makeText(getApplicationContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show();
                }
                goToQues3();
            }
        });
    }
private void goToQues3()
{
    Intent myIntent = new Intent(ques2.this,Ques3.class);
    startActivity(myIntent);
}
    public void onBackPressed()
    {
        Log.e("My Tags", "onBackPressed");
        k++;
        if(k == 1)
        {
            Toast.makeText(ques2.this, "Please Press Again To Exit.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            startActivity(intent);
        }
    }}










