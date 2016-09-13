package com.example.frank.tareauserpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class Uno extends AppCompatActivity implements View.OnClickListener {

    private Button enviar;
    private EditText usuario, contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);

        enviar = (Button) findViewById (R.id.send);
        usuario = (EditText) findViewById (R.id.user);
        contra = (EditText) findViewById (R.id.password);

        enviar.setOnClickListener(this);
    }

    public void onClick(View v) {

        Intent i;

        i = new Intent(this, Dos.class);

        String dosUser = usuario.getText().toString();
        String dosPassword = contra.getText().toString();

        i.putExtra("usuario", dosUser);
        i.putExtra("contra", dosPassword);

        startActivity(i);

    }
}
