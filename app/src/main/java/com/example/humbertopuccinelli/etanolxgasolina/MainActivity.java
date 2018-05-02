package com.example.humbertopuccinelli.etanolxgasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botaoCacular;
    EditText precoAlcool;
    EditText precoGasolina;
    TextView campoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         botaoCacular = (Button) findViewById(R.id.botaoCalcular);
         precoAlcool = (EditText)findViewById(R.id.campoAlccol);
         precoGasolina = (EditText)findViewById(R.id.campoGasolina);
         campoResultado = (TextView)findViewById(R.id.campoResultado);


        botaoCacular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (precoAlcool.getText().toString().isEmpty() || precoGasolina.getText().toString().isEmpty()){
                    campoResultado.setText("Preencha todos os campos");
                }else {
                    Float precoAlcoolFloat = Float.parseFloat(precoAlcool.getText().toString());
                    Float precoGasolinaFloat = Float.parseFloat(precoGasolina.getText().toString());

                    if ((precoAlcoolFloat/precoGasolinaFloat) < 0.7){
                        campoResultado.setText("Abasteça com Alcool");
                    }else {
                        campoResultado.setText("Abasteça com Gasolina");
                    }

                }
            }
        });
    }
}
