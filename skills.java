package com.example.veronica.leonardo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class skills extends AppCompatActivity {
    TextView sk,java,um,web,database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        sk=(TextView)findViewById(R.id.sk);
        java=(TextView)findViewById(R.id.java);
        um=(TextView)findViewById(R.id.um);
        web=(TextView)findViewById(R.id.web);
        database=(TextView)findViewById(R.id.database);



    }
}
