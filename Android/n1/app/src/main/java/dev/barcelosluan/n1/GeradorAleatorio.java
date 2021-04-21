package dev.barcelosluan.n1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GeradorAleatorio extends AppCompatActivity {

    EditText editValorMinimo;
    EditText editValorMaximo;
    TextView txtResultado;
    Button btnGerar;
    Button btnVoltar;
    int valorMinimo;
    int valorMaximo;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerador_aleatorio);

        editValorMinimo = findViewById(R.id.edit_gerador_aleatorio_minimo);
        editValorMaximo = findViewById(R.id.edit_gerador_aleatorio_maximo);
        txtResultado = findViewById(R.id.gerador_aleatorio_resultado);
        btnGerar = findViewById(R.id.btn_gerador_aleatorio_gerar);
        btnVoltar = findViewById(R.id.btn_gerador_aleatorio_voltar);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random aleatorio = new Random();

                closeKeyboard();

                if (editValorMinimo.getText().toString().isEmpty()) {
                    Toast.makeText(GeradorAleatorio.this,
                            "Valor Minimo não informado, definindo ZERO por padrão",
                            Toast.LENGTH_SHORT).show();

                    editValorMinimo.setText("0");
                    valorMinimo = 0;
                } else {
                    valorMinimo = Integer.parseInt(editValorMinimo.getText().toString());
                }

                if (editValorMaximo.getText().toString().isEmpty()) {
                    Toast.makeText(GeradorAleatorio.this,
                            "Valor Maximo não informado, definindo como ZERO por padrão",
                            Toast.LENGTH_SHORT).show();

                    editValorMaximo.setText("0");
                    valorMaximo = 0;
                } else {
                    valorMaximo = Integer.parseInt(editValorMaximo.getText().toString());
                }

                if (valorMinimo > valorMaximo) {
                    Toast.makeText(GeradorAleatorio.this,
                            "Valor minimo não pode ser maior do que o valor maximo!",
                            Toast.LENGTH_SHORT).show();
                } else {
                    if (valorMaximo == 0) {
                        resultado = aleatorio.nextInt() + valorMinimo;
                    }

                    resultado = aleatorio.nextInt(valorMaximo + 1 - valorMinimo) + valorMinimo;

                    txtResultado.setText(String.valueOf(resultado));
                }
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GeradorAleatorio.this, Indice.class);
                startActivity(i);
            }
        });

    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();

        if (view != null) {
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
