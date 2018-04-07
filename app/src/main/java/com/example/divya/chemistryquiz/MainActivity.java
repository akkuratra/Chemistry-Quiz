package com.example.divya.chemistryquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView best= (TextView)findViewById(R.id.best);
        final TextView start=(TextView)findViewById(R.id.start);
        Button btn=(Button)findViewById(R.id.b);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,Ques1.class);
                startActivity(myIntent);
            }
        });
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        Ques1.m=0;
        }
    }
}
