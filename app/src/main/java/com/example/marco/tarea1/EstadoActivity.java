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

public class EstadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        Button botonAtras2 = (Button)findViewById(R.id.botonAtras2);
        TextView textoEstado = (TextView)findViewById(R.id.mostrarEstado);

        Bundle bundle = this.getIntent().getExtras();
        String estado = bundle.getString("estado");

        textoEstado.setText(estado);

        botonAtras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EstadoActivity.this, MainActivity.class);
                startActivity(intent);
                setResult(Activity.RESULT_OK);
                finish();
            }
        });



    }
}
