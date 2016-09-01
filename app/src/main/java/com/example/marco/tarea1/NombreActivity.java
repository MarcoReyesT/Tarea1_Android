package com.example.marco.tarea1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class NombreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button botonAtras = (Button)findViewById(R.id.botonAtras);
        TextView textoNombre = (TextView)findViewById(R.id.mostrarNombre);

        Bundle bundle = this.getIntent().getExtras();
        String nombre = bundle.getString("nombre");

        textoNombre.setText(nombre);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NombreActivity.this, MainActivity.class);
                startActivity(intent);
                setResult(Activity.RESULT_OK);
                finish();
            }
        });



    }
}
