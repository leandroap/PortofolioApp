package com.leandroap.portofolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibirToast (View view) {

        //Recupera o texto do botao acionado
        String strBtnTitle = ((Button)view).getText().toString();

        //Formata msg pre-definida passando como parametro o texto do botao
        String strToastMsg = String.format(getString(R.string.msg_toast), strBtnTitle);

        Toast.makeText(this, strToastMsg, Toast.LENGTH_SHORT).show();
    }
}
