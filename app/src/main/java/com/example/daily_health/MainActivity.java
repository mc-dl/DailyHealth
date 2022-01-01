package com.example.daily_health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pre_btn(View view){
        Toast.makeText(this, "尚未开放", Toast.LENGTH_SHORT).show();
    }
    public void startActivity2(View view){
        startActivity(new Intent(this,MainActivity2.class));
    }

}