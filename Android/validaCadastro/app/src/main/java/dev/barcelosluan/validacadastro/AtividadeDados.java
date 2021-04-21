package dev.barcelosluan.validacadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AtividadeDados extends AppCompatActivity {

    Button editar;
    TextView tv_nome,tv_cpf,tv_nasc,tv_tel,tv_cel,tv_email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_dados);

        tv_nome = findViewById(R.id.tv_nome);
        tv_cpf = findViewById(R.id.tv_cpf);
        tv_nasc = findViewById(R.id.tv_nasc);
        tv_tel = findViewById(R.id.tv_fone);
        tv_cel = findViewById(R.id.tv_cel);
        tv_email = findViewById(R.id.tv_email);

        editar = findViewById(R.id.btn_adicionar_novo);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String cpf = intent.getStringExtra("cpf");
        String nasc = intent.getStringExtra("nasc");
        String tel = intent.getStringExtra("tel");
        String cel = intent.getStringExtra("cel");
        String email = intent.getStringExtra("email");

        tv_nome.setText("Nome: " + nome);
        tv_cpf.setText("CPF: " + cpf);
        tv_nasc.setText("DN: " + nasc);
        tv_tel.setText("Telefone: " + tel);
        tv_cel.setText("Celular: " + cel);
        tv_email.setText("E-mail: " + email);

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AtividadeDados.this, AtividadeCadastro.class);
                Bundle extras = new Bundle();
                extras.putString("nome", nome);
                extras.putString("cpf", cpf);
                extras.putString("nasc", nasc);
                extras.putString("tel", tel);
                extras.putString("cel", cel);
                extras.putString("email", email);

                intent.putExtras(extras);
                startActivity(intent);
            }
        });

    }

}