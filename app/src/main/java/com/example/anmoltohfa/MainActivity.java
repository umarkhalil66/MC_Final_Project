package com.example.anmoltohfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstmove(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void secondmove(View view) {
        Intent intent=new Intent(this,MainActivity11.class);
        startActivity(intent);
    }

    public void thirdmove(View view) {
        Intent intent=new Intent(this,MainActivity21.class);
        startActivity(intent);
    }
}