package com.example.veronica.leonardo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Qualification extends AppCompatActivity {
    TextView edu,edu1,ed2,ed3,intern,intern1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualification);
        edu=(TextView)findViewById(R.id.edu);
        edu1=(TextView)findViewById(R.id.ed1);
        ed2=(TextView)findViewById(R.id.ed2);
        ed3=(TextView)findViewById(R.id.ed3);
        intern=(TextView)findViewById(R.id.intern);
        intern1=(TextView)findViewById(R.id.intern1);

    }
}
