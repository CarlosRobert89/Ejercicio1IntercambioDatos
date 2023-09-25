package carlos.robert.ejercicio1intercambiodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtFrase;
    private Button btnCaracteres;
    private Button btnPalabras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVariables();


        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();

                Toast.makeText(MainActivity.this, "La frase contiene " + frase.length() + " carácteres", Toast.LENGTH_SHORT).show();
            }
        });

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                String[] palabras = frase.split(" ");
                int contador = palabras.length;

                Toast.makeText(MainActivity.this, "La frase contiene " + contador + " palabras", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inicializarVariables() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
    }
}