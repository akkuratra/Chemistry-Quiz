package com.example.divya.chemistryquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class marks extends AppCompatActivity {
    public static int k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        TextView tv= (TextView)findViewById(R.id.textView);
        TextView tv2= (TextView)findViewById(R.id.textView2);
        tv2.setText(Ques1.m + " out of 3");
    }
    public void onBackPressed()
    {
        Log.e("My Tags", "onBackPressed");
        k++;
        if(k == 1)
        {
            Toast.makeText(marks.this, "Please Press Again To Exit.", Toast.LENGTH_SHORT).show();
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
