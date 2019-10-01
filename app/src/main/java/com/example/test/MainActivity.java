package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button boo = findViewById(R.id.btsignIn);
            boo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    CheckBox ck = findViewById(R.id.checkBox);
                    if (ck.isChecked()) {
                        Intent i = new Intent(MainActivity.this, tab.class);
                        startActivity(i);
                    }
                }
            });
        TextView tv=findViewById(R.id.already);
        tv.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, SignIn.class);
                startActivity(i);

            }
        });
        }
    }

