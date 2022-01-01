package com.example.daily_health;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Spinner;


public class MainActivity2 extends AppCompatActivity {
    private int who=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner spinner=findViewById(R.id.spinner);
        spinner.setSelection(who);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                who=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void retu(View view){
        finish();

    }

    public void startActivity3(View view){

        MainActivity3.openActivity(this,who);
    }
}