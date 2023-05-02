package com.example.smartlab_danilk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Zastavka2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zastavka2);
    }


    public void Prod(View view){
        Intent intent = new Intent(Zastavka2.this, Zastavka3.class);
        startActivity(intent);
    }
}