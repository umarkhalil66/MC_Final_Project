package com.example.anmoltohfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void Nextmove(View view) {
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    public void prevmove(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}