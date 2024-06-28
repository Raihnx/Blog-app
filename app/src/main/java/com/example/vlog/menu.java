package com.example.vlog;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menu extends AppCompatActivity {
    AppCompatButton b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
       b1=(AppCompatButton) findViewById(R.id.add);
       b2=(AppCompatButton) findViewById(R.id.search);
       t1=(TextView) findViewById(R.id.logout);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(), Add.class);
               startActivity(i);
           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Search.class);
                startActivity(i);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              SharedPreferences preference=getSharedPreferences("Vlog",MODE_PRIVATE);
              String username=preference.getString("user",null);
              SharedPreferences.Editor editor=preference.edit();
              editor.clear();
              editor.apply();
              Intent i =new Intent(getApplicationContext(), MainActivity.class);
              startActivity(i);
            }
        });
    }
}