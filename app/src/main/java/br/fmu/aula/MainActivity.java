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

    public void somar(View view){
        int x = Integer.parseInt(editTextNumber.getText() toString);
        int y = Integer.parseInt(editTextNumber2.getText() toString);
        int soma = x + y;
        Intent Intent = new Intent(createPackageContext()this, MainActivity2.class);
        Intent.putExtra("soma", soma);
        startActivity(Intent);


    }
}