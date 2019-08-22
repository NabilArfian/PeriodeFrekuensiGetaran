package com.example.periodefrekuensigetaran;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button periode, frekuensi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        periode = findViewById(R.id.periode);
        frekuensi = findViewById(R.id.frekuensi);

        frekuensi.setOnClickListener(this);
        periode.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.frekuensi:
                Intent ff = new Intent(this, Main2Activity.class);
                startActivity(ff);
                break;

            case R.id.periode:
                Intent pp = new Intent(this, Main3Activity.class);
                startActivity(pp);
                break;

        }


    }
}
