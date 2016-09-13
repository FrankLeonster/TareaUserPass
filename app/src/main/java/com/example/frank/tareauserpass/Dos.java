package com.example.frank.tareauserpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Dos extends AppCompatActivity {

    TextView xUser, xPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        xUser = (TextView) findViewById (R.id.user2);
        xPass = (TextView) findViewById( R.id.pass2);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        if (extras != null) {
            String datoUsuario = (String) extras.get("usuario");
            String datoContra= (String) extras.get("contra");

            xUser.setText(datoUsuario);
            xPass.setText(datoContra);
        }
    }
}
