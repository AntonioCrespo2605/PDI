package com.example.mijardin;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Bundle b=this.getIntent().getExtras();
        String verdura=b.getString("verdura");

        ImageView iverdura=findViewById(R.id.imagenVerdura);
        TextView titulo=findViewById(R.id.titulo);
        TextView muchotexto=findViewById(R.id.muchotexto);

        switch(verdura){
            case "aguacate":
                iverdura.setImageDrawable(getDrawable(R.drawable.aguacate));
                titulo.setText("Aguacate");
                muchotexto.setText("Variedad de la fruta Persea americana, la cual fue originada a partir de una semilla de raza guatemalteca cultivada por el horticultor Rudolph Hass en la Habra, California, en 1926, patentada en 1935 e introducida globalmente en el mercado en 1960. Es la variedad más cultivada a nivel mundial");
                break;
            case "alcachofa":
                iverdura.setImageDrawable(getDrawable(R.drawable.alcachofa));
                titulo.setText("Alcachofa");
                muchotexto.setText("planta herbácea del género Cynara en la familia Asteraceae; es cultivada desde la antigüedad como alimento en climas templados." +
                        "\n" +
                        "La parte comestible de la planta consiste en los botones florales antes de que florezcan. El capullo de Cynara scolymus en ciernes es un grupo de muchas flores tubulares pequeñas en ciernes (una inflorescencia), recubiertas de numerosas brácteas coriáceas, imbricadas, sobre una base comestible. Una vez que los capullos florecen, la estructura cambia a una forma tosca, apenas comestible.");
                break;
            case "cebolla":
                iverdura.setImageDrawable(getDrawable(R.drawable.cebolla));
                titulo.setText("Cebolla");
                muchotexto.setText("Planta herbácea bienal perteneciente a la familia de las amarilidáceas. Es la especie más cultivada del género Allium, el cual contiene varias especies que se denominan «cebollas» y que se cultivan como alimento. Ejemplos de las mismas son la cebolla de verdeo (Allium fistulosum), la cebolla escalonia (Allium ascalonicum) y la cebolla de hoja o ciboulette (Allium schoenoprasum)");
                break;
            case "dinoseto1":
                iverdura.setImageDrawable(getDrawable(R.drawable.dinoseto));
                titulo.setText("Dinoseto");
                muchotexto.setText("El Dinoseto es un arbusto con forma de dinosaurio que se exhibe en el centro de la ciudad de Vigo (España)." +
                        "\n" +
                        "Su primera ubicación fue en la calle Rosalía de Castro de la ciudad debido a una equivocación de la empresa encargada de su instalación, ya que debía situarse inicialmente en un parque infantil situado en la parroquia de Navia, en las afueras de la ciudad. Sin embargo, el Dinoseto se convirtió de inmediato en un éxito en las redes sociales, lo que provocó que se ubicara permanentemente en el casco urbano de la ciudad, concretamente en la Plaza de Compostela.");
                break;
            case "dinoseto2":
                iverdura.setImageDrawable(getDrawable(R.drawable.dinoseto2));
                titulo.setText("Dinoseto 2");
                muchotexto.setText("vivieron a finales del período Cretácico, hace aproximadamente entre 68 y 66 millones de años, durante el Maastrichtiense, en lo que hoy es Norteamérica. Es uno de los últimos géneros en aparecer antes del gran evento de extinción masiva del Cretácico-Terciario. Poseía una gran gola ósea que le cubria dorsal y lateral del cuello y tres cuernos, un cuerpo grande sobre cuatro fornidas patas, y varias similitudes con respecto al moderno rinoceronte y los bovinos.");
                break;
            case "melon":
                iverdura.setImageDrawable(getDrawable(R.drawable.melon));
                titulo.setText("Melon");
                muchotexto.setText(" especie de la familia de las cucurbitáceas. Domesticada hace más de cuatro mil años en la región mediterránea oriental y Asia occidental, el origen exacto de la especie silvestre es aún desconocido. Su dilatado cultivo en domesticación ha dado origen a numerosas variedades cuya producción se extiende por todas las regiones cálidas de la mayor parte del mundo con veranos secos y calurosos.");
                break;
            case "pepino":
                iverdura.setImageDrawable(getDrawable(R.drawable.pepino));
                titulo.setText("Pepino");
                muchotexto.setText("Cucumis sativus, conocido popularmente como pepino, es una planta anual de la familia de las cucurbitáceas.");
                break;
            case "zanahoria":
                iverdura.setImageDrawable(getDrawable(R.drawable.zanahoria));
                titulo.setText("Zanahoria");
                muchotexto.setText("forma domesticada de la zanahoria silvestre (Daucus carota), especie de la familia de las umbelíferas, también denominadas apiáceas, y considerada la más importante y de mayor consumo dentro de esta familia. Es oriunda de Europa y Asia sudoccidental. Se cultiva por su raíz mucho más grande, sabrosa y de textura menos fibrosa que la especie silvestre.");
                break;
        }

        Button volver=findViewById(R.id.bvolver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}