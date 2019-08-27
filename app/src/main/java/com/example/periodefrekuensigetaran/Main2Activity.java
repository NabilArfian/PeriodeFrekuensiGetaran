package com.example.periodefrekuensigetaran;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button b_hitung;
    private EditText con_km;
    private TextView report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.setTitle("Menghitung Frekuensi Getaran");

        b_hitung = findViewById(R.id.hitung);

        con_km   = findViewById(R.id.hkm);

        report   = findViewById(R.id.rekap);

        b_hitung.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        int rumus = 1;
        if (v.getId() == R.id.hitung)
        {

            String inp_km = con_km.getText().toString().trim();

            boolean tidakKosong = false;

            Double hkm = toInt(inp_km);

            if (inp_km.length() < 0){

                con_km.setError("Kolom ini harus di isi");

            }

            if (!tidakKosong)
            {
                double hasil = rumus / hkm;
                Intent data = new Intent();
                data.setData(Uri.parse("Total: "+String.valueOf(hasil)));
                setResult(RESULT_OK, data);

                finish();

            }





        }


    }

    private Double toInt(String str) {
        try {
            return Double.valueOf(str);
        }catch (Exception we){
            return null;
        }

    }
}
