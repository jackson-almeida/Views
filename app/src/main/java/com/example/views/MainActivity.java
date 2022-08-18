package com.example.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.views.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;
    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(amb.getRoot());

        amb.btSalvar.setOnClickListener(view -> {
            pessoa = new Pessoa(
                    amb.etNome.getText().toString(),
                    amb.etSobrenome.getText().toString(),
                    amb.etEmail.getText().toString(),
                    amb.spEstadoCivil.getSelectedItem().toString(),
//                    ((TextView) amb.spEstadoCivil.getSelectedView()).getText(),
                    amb.rbFem.isChecked() ? getString(R.string.feminino) : getString(R.string.masculino)
            );
            ;
            Toast.makeText(this, pessoa.toString(), Toast.LENGTH_SHORT).show();
        });

        amb.btLimpar.setOnClickListener(view -> {
            amb.etNome.setText("");
            amb.etSobrenome.setText("");
            amb.etEmail.setText("");
            amb.spEstadoCivil.setSelection(0);
            amb.rbFem.setSelected(true);
            pessoa = null;
        });
    }
}