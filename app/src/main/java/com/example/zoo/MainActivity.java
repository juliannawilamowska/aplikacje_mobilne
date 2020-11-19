package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cennik = findViewById(R.id.cennikb);
        Button godziny = findViewById(R.id.godzinyb);
        Button mapa = findViewById(R.id.mapab);
        Button lista = findViewById(R.id.listab);
        Button lwy = findViewById(R.id.lwyb);
        Button zubr = findViewById(R.id.zubrb);
        Button zbik = findViewById(R.id.zbikb);
        Button kolczatka = findViewById(R.id.kolczatkab);
        Button okapi = findViewById(R.id.okapib);
        Button ibis = findViewById(R.id.ibisb);
        Button zolw = findViewById(R.id.zolwb);
        Button zyrafa = findViewById(R.id.zyrafab);
        Button quiz = findViewById(R.id.quizb);



        cennik.setOnClickListener(this);
        godziny.setOnClickListener(this);
        mapa.setOnClickListener(this);
        lista.setOnClickListener(this);
        lwy.setOnClickListener(this);
        zubr.setOnClickListener(this);
        zbik.setOnClickListener(this);
        kolczatka.setOnClickListener(this);
        okapi.setOnClickListener(this);
        ibis.setOnClickListener(this);
        zolw.setOnClickListener(this);
        zyrafa.setOnClickListener(this);
        quiz.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.cennikb:
                Intent cennikIntent = new Intent(getApplicationContext(), cennik.class);
                startActivity(cennikIntent);
                break;
            case R.id.godzinyb:
                Intent godzinyIntent = new Intent(getApplicationContext(), godziny.class);
                startActivity(godzinyIntent);
                break;
            case R.id.mapab:
                Intent mapaIntent = new Intent(getApplicationContext(), mapa.class);
                startActivity(mapaIntent);
                break;
            case R.id.listab:
                Intent listaIntent = new Intent(getApplicationContext(), lista.class);
                startActivity(listaIntent);
                break;
            case R.id.lwyb:
                Intent lwyIntent = new Intent(getApplicationContext(), lwy.class);
                startActivity(lwyIntent);
                break;
            case R.id.zubrb:
                Intent zubrIntent = new Intent(getApplicationContext(), zubr.class);
                startActivity(zubrIntent);
                break;
            case R.id.zbikb:
                Intent zbikIntent = new Intent(getApplicationContext(), zbik.class);
                startActivity(zbikIntent);
                break;
            case R.id.okapib:
                Intent okapiIntent = new Intent(getApplicationContext(), okapi.class);
                startActivity(okapiIntent);
                break;
            case R.id.kolczatkab:
                Intent kolczatkaIntent = new Intent(getApplicationContext(), kolczatka.class);
                startActivity(kolczatkaIntent);
                break;
            case R.id.ibisb:
                Intent ibisIntent = new Intent(getApplicationContext(), ibis.class);
                startActivity(ibisIntent);
                break;
            case R.id.zolwb:
                Intent zolwIntent = new Intent(getApplicationContext(), zolw.class);
                startActivity(zolwIntent);
                break;
            case R.id.zyrafab:
                Intent zyrafaIntent = new Intent(getApplicationContext(), zyrafa.class);
                startActivity(zyrafaIntent);
                break;
            case R.id.quizb:
                Intent quizIntent = new Intent(getApplicationContext(), quiz.class);
                startActivity(quizIntent);
                break;










        }
    }
}
