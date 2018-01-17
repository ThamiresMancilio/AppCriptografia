package com.example.acer.appcriptografia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtKey;
    private  EditText edtText;
    private RadioButton rbCifra;
    private RadioButton rbDecifra;
    private Button btnCifrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtKey = (EditText) findViewById(R.id.edtKey);
        edtText = (EditText) findViewById(R.id.edtText);
        rbCifra = (RadioButton) findViewById(R.id.rbCifra);
        rbDecifra = (RadioButton) findViewById(R.id.rbDecifra);
        btnCifrar = (Button) findViewById(R.id.btnCripta);

    }

    public void btnCifrar(View view) {

        if(edtText.getText().equals("")){

            Toast.makeText(this, "Informe o texto", Toast.LENGTH_LONG).show();

        }else{

            String texto = edtText.getText().toString();

            Criptografia c = new Criptografia();

            String chave = c.Criptografar(texto, rbCifra.isChecked());

            edtKey.setText(chave);

        }

    }

    public void btnClear(View view) {

        edtKey.setText("");
        edtText.setText("");

        rbCifra.setChecked(true);
    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()) {
            case R.id.rbCifra:
                if (checked)

                    btnCifrar.setText("Cifrar");

                    break;
            case R.id.rbDecifra:
                if (checked)

                    btnCifrar.setText("Decifrar");

                    break;
        }
    }
}
