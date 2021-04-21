package dev.barcelosluan.n1;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class RegistraEventos  extends AppCompatActivity {

    EditText nomeEvento;
    EditText dataEvento;
    Button btnRegistrar;
    Button btnVoltar;
    ListView lvEventos;

    DatePickerDialog.OnDateSetListener datePicker;
    ArrayList<Evento> listaEventos = new ArrayList<>();
    AdaptadorCustomizado adaptador;

    int id = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registra_evento);

        nomeEvento = findViewById(R.id.edit_registra_evento_nome);
        dataEvento = findViewById(R.id.edit_registra_evento_data);
        btnRegistrar = findViewById(R.id.btn_registra_evento_registrar);
        btnVoltar = findViewById(R.id.btn_registra_evento_voltar);
        lvEventos = findViewById(R.id.lista_registra_evento);

        adaptador = new AdaptadorCustomizado(this, R.layout.registra_evento_lista, listaEventos);
        AlertDialog alert = new AlertDialog.Builder(RegistraEventos.this).create();

        lvEventos.setAdapter(adaptador);

        listaEventos.add(new Evento("  E vento stock", "18/02/2020", 1));
        listaEventos.add(new Evento("  Campus Party 2021", "02/01/2020", 2));
        listaEventos.add(new Evento("  Pãodemia", "11/03/2020", 3));
        listaEventos.add(new Evento("  Melhor dia", "09/08/1993", 4));
        listaEventos.add(new Evento("  FORMEI!!!", "31/07/2022", 5));

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeKeyboard();

                String nome = nomeEvento.getText().toString();
                String data = dataEvento.getText().toString();

                if (nome.isEmpty() || data.isEmpty()) {

                    alert.setTitle("Erro");
                    alert.setMessage("Cadastro não efetuado\n\n"
                            + "Favor Preencher todos os campos!");

                    alert.show();
                } else {
                    id++;

                    listaEventos.add(new Evento("  " + nome, data, id));

                    lvEventos.setAdapter(adaptador);
                }
            }
        });

        dataEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendario = Calendar.getInstance();

                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH);
                int ano = calendario.get(Calendar.YEAR);

                DatePickerDialog dialog = new DatePickerDialog(
                        RegistraEventos.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        datePicker, ano, mes, dia
                );

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        datePicker = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int ano, int mes, int dia) {
                String dataString;
                String diaString;
                String mesString;

                diaString = String.valueOf(dia);
                mesString = String.valueOf(mes + 1);

                if (dia < 10) {
                    diaString = "0" + diaString;
                }
                if (mes < 10) {
                    mesString = "0" + mesString;
                }

                dataString = diaString + "/" + mesString + "/" + ano;

                dataEvento.setText(dataString);
            }
        };

    }

    private void closeKeyboard() {
        View view = this.getCurrentFocus();

        if (view != null) {
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
