package com.frases.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;
    private Button apagarFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);
        apagarFrase = findViewById(R.id.apagarFrase);

        //Esconder action bar
        getSupportActionBar().hide();

        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] frasesMotivacionais = {"Na vida um monte de gente sabe o que fazer, mas poucos fazem, de fato, o que sabem que é preciso.Saber não é o suficiente. Você precisa agir",
                        "Saiba que são suas decisões, e não suas condições, que determinam seu destino",
                        "Se você faz o que sempre fez, você obterá o que você sempre obteve",
                        "É nos momentos de decisão que o seu destino é traçado",
                        "Onde há foco a energia flui",
                        "Ação é a chave para o sucesso.",
                        "Não desista, os fracassos são apenas oportunidades para aprender e crescer.",
                        "Acredite em si mesmo e tudo será possível.",
                        "Não há limites para aqueles que sonham grande e agem com determinação.",
                        "Faça a diferença hoje e crie um amanhã melhor.",
                        "O sucesso é resultado de escolhas corajosas.",
                        "Se você acredita, pode conquistar.",
                        "Não tenha medo de tentar e errar, apenas tenha medo de não tentar.",
                        "A vida é curta para viver com medo, se joga.",
                        "O sucesso é uma jornada, não um destino."};

                Random random = new Random();
                int numerosAleatorios = random.nextInt(frasesMotivacionais.length);

                frases.setText(frasesMotivacionais[numerosAleatorios]);

            }
        });

        apagarFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frases.setText("");
            }
        });
    }
}