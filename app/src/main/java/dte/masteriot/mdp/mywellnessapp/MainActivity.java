package dte.masteriot.mdp.mywellnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Comprobar si las credenciales son correctas (esto es solo un ejemplo, debes implementar tu propia lógica de autenticación).
               // if (isValidCredentials(username, password)) {
                    // Las credenciales son correctas, redirigir a la pantalla de inicio.
                    Intent intent = new Intent(MainActivity.this, PantallaInicioActivity.class);
                    startActivity(intent);
                    finish(); // Finaliza la actividad actual para que no se pueda volver atrás.
                    /*
                } else {
                    // Las credenciales son incorrectas, muestra un mensaje de error.
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
                */

            }
        });
    }


    private boolean isValidCredentials(String username, String password) {
        // Aquí debes verificar las credenciales en tu sistema de autenticación.
        // Este es solo un ejemplo básico, deberías usar una base de datos o autenticación más segura en una aplicación real.

        return username.equals("usuario") && password.equals("contraseña");
    }
}