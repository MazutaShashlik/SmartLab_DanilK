package com.example.smartlab_danilk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Zastavka3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zastavka3);
    }


    public void Konec(View view){
        Intent intent = new Intent(Zastavka3.this, Vhod.class);
        startActivity(intent);
    }
}
