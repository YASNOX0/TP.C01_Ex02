package com.example.tpc01_ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText number;
    TextView parite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        parite = findViewById(R.id.parite);

        number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    int nbr = Integer.parseInt(number.getText().toString());
                    parite.setTextColor(getResources().getColor(R.color.green));
                    parite.setText(String.format("%d est impair",nbr));
                    if( nbr % 2 == 0){
                        parite.setText(String.format("%d est pair",nbr));
                    }
                }catch (Exception e){
                    parite.setTextColor(getResources().getColor(R.color.red));
                    parite.setText("?");
                }

            }
        });
    }
}