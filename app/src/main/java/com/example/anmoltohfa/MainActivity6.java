package com.example.anmoltohfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void Nextmove(View view) {
        Intent intent=new Intent(this,MainActivity7.class);
        startActivity(intent);
    }

    public void prevmove(View view) {
        Intent intent=new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}