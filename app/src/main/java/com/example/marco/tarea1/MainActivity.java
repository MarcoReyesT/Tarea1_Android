package com.example.marco.tarea1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonNombre = (Button)findViewById(R.id.botonNombre);
        Button botonEstado = (Button)findViewById(R.id.botonEstado);
        final EditText nombre = (EditText)findViewById(R.id.textoNombre);
        final Switch estado = (Switch)findViewById(R.id.switch1);


        estado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (estado.isChecked()){
                    estado.setText("Dormido");
                }else{
                    estado.setText("Despierto");
                }
            }
        });

        botonEstado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EstadoActivity.class);
                if (estado.isChecked()){
                    intent.putExtra("estado", "Dormido");
                }else{
                    intent.putExtra("estado", "Despierto");
                }
                startActivity(intent);
                setResult(Activity.RESULT_OK);
                finish();
            }
        });

        botonNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = "" + nombre.getText();
                Intent intent = new Intent(MainActivity.this, NombreActivity.class);
                intent.putExtra("nombre", texto);
                startActivity(intent);
                setResult(Activity.RESULT_OK);
                finish();
            }
        });



    }
}
