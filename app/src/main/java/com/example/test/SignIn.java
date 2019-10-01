package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chcek);
        Button boo=findViewById(R.id.button);
        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignIn.this,tab.class);
                startActivity(i);
            }
        });
        listenSignUp();
        listenforgot();

    }
    void listenforgot()
    {
        TextView tv=findViewById(R.id.textView4);
        tv.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignIn.this,ForgotPass.class);
                startActivity(i);

            }
        });

    }
    void listenSignUp()
    {
        TextView signUp=findViewById(R.id.txtsignup);
        signUp.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignIn.this,MainActivity.class);
                startActivity(i);

            }
        });
    }



}
