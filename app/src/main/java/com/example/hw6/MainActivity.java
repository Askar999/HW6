package com.example.hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_pochta, et_parol;
    private TextView vhod_up, get_vhod, sign_in, zabylParol, clickTo;
    private Button btn_voyti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_pochta = findViewById(R.id.Pochta);
        et_parol = findViewById(R.id.parol);
        btn_voyti = findViewById(R.id.Voyti);
        vhod_up = findViewById(R.id.vhod_up);
        get_vhod = findViewById(R.id.get_vhod);
        sign_in = findViewById(R.id.sign_in);
        clickTo = findViewById(R.id.clickTo);
        zabylParol = findViewById(R.id.password_zabyl);
        et_pochta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_pochta.getText().toString().isEmpty()) {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        et_parol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_pochta.getText().toString().isEmpty()) {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btn_voyti.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        btn_voyti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_pochta.getText().toString().equals("admin") && et_parol.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Успешно", Toast.LENGTH_SHORT).show();
                    et_parol.setVisibility(View.INVISIBLE);
                    et_pochta.setVisibility(View.INVISIBLE);
                    btn_voyti.setVisibility(View.INVISIBLE);
                    get_vhod.setVisibility(View.INVISIBLE);
                    vhod_up.setVisibility(View.INVISIBLE);
                    sign_in.setVisibility(View.INVISIBLE);
                    clickTo.setVisibility(View.INVISIBLE);
                    zabylParol.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Повторите", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}