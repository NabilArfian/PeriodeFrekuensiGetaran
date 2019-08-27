package com.example.periodefrekuensigetaran;

import android.app.Instrumentation;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int req_code = 1;
    private Button periode, frekuensi;
    private TextView tResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tResult = findViewById(R.id.result_rec);
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
                startActivityForResult(ff, req_code);
                break;

            case R.id.periode:
                Intent pp = new Intent(this, Main3Activity.class);
                startActivity(pp);
                break;

        }


    }



    public void onActivityResult(int requestCode, int resultCode, Intent rtn) {

        if (requestCode == req_code){
            if (resultCode == RESULT_OK){
                tResult.setText(rtn.getData().toString());
            }
        }

    }

}
