package com.example.smartlab_danilk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Zastavka1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zastavka1);
    }


    public void OnClick(View view){
        Intent intent = new Intent(Zastavka1.this, Zastavka2.class);
        startActivity(intent);
    }
}