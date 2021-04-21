package dev.barcelosluan.cadproduto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nome, id, preco;
    Button registrar, ver_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);
        id = findViewById(R.id.id);
        preco = findViewById(R.id.preco);
        registrar = findViewById(R.id.registrar);


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alert = new AlertDialog.Builder(MainActivity.this).create();

                String nomeProduto = nome.getText().toString();
                String idProduto = id.getText().toString();
                String precoProduto = preco.getText().toString();

                closeKeyboard();

                if (nomeProduto.isEmpty()
                        || idProduto.isEmpty()
                        || precoProduto.isEmpty()) {

                    alert.setTitle("Erro");
                    alert.setMessage("Cadastro não efetuado\n\n"
                            + "Favor Preencher todos os campos!");

                    alert.show();
                } else {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("nome", nomeProduto);
                    extras.putString("id", idProduto);
                    extras.putString("preco", precoProduto);

                    intent.putExtras(extras);
                    startActivity(intent);

                }
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