package com.example.vlog;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add extends AppCompatActivity {
    EditText e1,e2,e3;
    AppCompatButton b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        b1=(AppCompatButton) findViewById(R.id.post);
        b2=(AppCompatButton) findViewById(R.id.backtomenu);
        e1=(EditText) findViewById(R.id.title);
        e2=(EditText) findViewById(R.id.sub);
        e3=(EditText) findViewById(R.id.details);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getPostTitle=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getPostTitle+" "+"Succesfully Posted",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(), MainActivity.class);
               startActivity(i);
            }
        });

    }
}