package com.example.testing_para_aire_libre;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button btn_registro;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn_registro.setOnContextClickListener(new) View.OnClickListener() {
            @Override
            public void onClick (View view) {
                intent i = new Intent(getApplicationContext(this, Registro.class));
                startActivity(i);
            }
        }
    }


}