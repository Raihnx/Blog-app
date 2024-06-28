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

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton b1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SharedPreferences preference=getSharedPreferences("Vlog",MODE_PRIVATE);
        String username=preference.getString("user",null);
        if (username != null) {
            Intent i=new Intent(getApplicationContext(), menu.class);
            startActivity(i);

        }
        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.log);
        t1=(TextView) findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUsername=e1.getText().toString();
                String getPassword=e2.getText().toString();
                if(getUsername.equals("Raihan") || getPassword.equals("12345"))
                {
                    SharedPreferences preference=getSharedPreferences("Vlog",MODE_PRIVATE);
                    SharedPreferences.Editor editor=preference.edit();
                    editor.putString("user","Raihan");
                    editor.apply();
                    Intent i=new Intent(getApplicationContext(), menu.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Incorrect Username or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Pattiche",Toast.LENGTH_SHORT).show();
            }
        });
    }
}