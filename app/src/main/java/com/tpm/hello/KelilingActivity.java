package com.tpm.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelilingActivity extends AppCompatActivity {

    private EditText TextJari1, TextHasil;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling);

        TextJari1 = (EditText) findViewById(R.id.eKeliling);
        TextHasil = (EditText) findViewById(R.id.eHasil);
        btnHitung = (Button) findViewById(R.id.eHitung);

//        btnHitung.setOnClickListener(new (View.OnClickListener) this);
    }

    public void onClick(View v) {
        double jari = Double.parseDouble(String.valueOf(TextJari1.getText()));
        double Kelilinglingkaran = (2 * 3.14 * jari);
        TextHasil.setText(String.valueOf(Kelilinglingkaran));
    }
}
