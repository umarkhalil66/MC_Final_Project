package com.example.anmoltohfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void Nextmove(View view) {
        Intent intent=new Intent(this,MainActivity13.class);
        startActivity(intent);
    }

    public void prevmove(View view) {
        Intent intent=new Intent(this,MainActivity11.class);
        startActivity(intent);
    }
}