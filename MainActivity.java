package com.example.veronica.leonardo;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDialog=new Dialog(this);


    }
    public void Callprashant(View view){
        TextView txtclose,qlfn1;
        Button btnFollow;
        myDialog.setContentView(R.layout.custompopup);

        txtclose=(TextView) myDialog.findViewById(R.id.txtclose);



        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });


        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();


        }
    public void qlfn(View view){
        TextView qlfn1;
        qlfn1=(TextView)myDialog.findViewById(R.id.qlfn1);
        qlfn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Qualification.class);
                startActivity(intent);
            }
        });




    }
    public  void projects(View view){
        TextView sk1;
        sk1=(TextView)myDialog.findViewById(R.id.sk1);
        sk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,skills.class);
                startActivity(intent);
            }
        });
    }
}

