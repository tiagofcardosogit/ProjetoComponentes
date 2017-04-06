package com.example.tiago.projetocomponentes;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void receberDados(View v){
        String dados = "";
        EditText editNome = (EditText) findViewById(R.id.editNome);// pega o objeto que for digitado no teclado
        CheckBox checkNews = (CheckBox) findViewById(R.id.checkNews);
        RadioGroup grupoPlano = (RadioGroup) findViewById(R.id.grupoPlano);
        Spinner spGeneros = (Spinner) findViewById(R.id.spGeneros);
        RatingBar ratingApp = (RatingBar) findViewById(R.id.ratingApp);
        TextView lblDados = (TextView) findViewById(R.id.lblDados);

        dados += editNome.getText()+ "\n";
        dados += checkNews.isChecked() + "\n"; //retorna o chackbox selecionado
        int idGrupo = grupoPlano.getCheckedRadioButtonId(); //retorna qual radiobutton foi selecionado
        if (idGrupo == R.id.rbMensal){
            dados += "Plano Mensal" + "\n";
        }else
            dados += "Plano Semestral" + "\n";

        dados += spGeneros.getSelectedItem().toString() + "\n";
        dados += ratingApp.getRating() + "\n";

        lblDados.setText(dados);


    }
}
