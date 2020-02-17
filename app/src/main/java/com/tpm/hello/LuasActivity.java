package com.tpm.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LuasActivity extends AppCompatActivity {

    private EditText TextJari, TextHasil;
    private Button btnHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        TextJari = (EditText) findViewById(R.id.aLuas);
        TextHasil = (EditText) findViewById(R.id.aHasil);
        btnHitung = (Button) findViewById(R.id.aHitung);

//        btnHitung.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v)
    {
        double jari = Double.parseDouble(String.valueOf(TextJari.getText()));
        double luaslingkaran = (3.14 * jari *jari);
        TextHasil.setText(String.valueOf(luaslingkaran));

    }
}
