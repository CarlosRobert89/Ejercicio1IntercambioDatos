package carlos.robert.ejercicio1intercambiodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtFrase;
    private Button btnCaracteres;
    private Button btnPalabras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVariables();

        String frase = txtFrase.getText().toString();
        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, frase.length(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inicializarVariables() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
    }
}