package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


public class quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        
        // ustawienie chcecBoxów na onclicklistener

        final CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8;
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        
        //wyniki czy poprawnee zostało zaznaczone

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Super! Masz rację!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox2.isChecked()){
                    Toast.makeText(getApplicationContext(), "Super! Masz rację!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Niestety nie.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox4.isChecked()){
                    Toast.makeText(getApplicationContext(), "Super! Masz rację!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox5.isChecked()){
                    Toast.makeText(getApplicationContext(), "Niestety nie.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox6.isChecked()){
                    Toast.makeText(getApplicationContext(), "Niestety nie.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox7.isChecked()){
                    Toast.makeText(getApplicationContext(), "Niestety nie.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox8.isChecked()){
                    Toast.makeText(getApplicationContext(), "Niestety nie.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}




