package br.fmu.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    Private EditText editTextNumber;
    Private EditText editTextNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
    }

    public void somar(View View){
        int x = Integer.parseInt(EditTextNumber.getText()toString);
        int y = Integer.parseInt(EditTextNumber2.getText()toString);
        int soma = x + y;
        Intent Intent = new Intent(createPackageContext()this, MainActivity2.class);
        Intent.putExtra("soma", soma);
        startActivity(Intent);


    }
}