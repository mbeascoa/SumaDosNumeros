package net.beastek.ejemplonotasevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText cajaNota;
    private EditText resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.cajaNota = findViewById(R.id.txtNumero1);   //se registra el objeto de la caja de texto 1
        this.resultado = findViewById(R.id.txtNumero2);    //se escribe las propiedades del objeto caja resultado notas en colores
    }



    public void enviarNota(View view) {    //obligatorio que reciba un View  el boton va a llamar a este método, es obligatorio poner View . View dice qué control ha llamado, si tengo dos botones View indica quien lo ha llamado.
        // si desde algun control, al seleccionar un elemento de una lista, al seleccionar un checkbox, desde cualquier control hay que recibir este argumento. Si no lo recibe da error.
        //getTxt rei¡cibo un texto de un campo de texto
        //setText asigno un valor a la caja de texto

            int nombre = Integer.parseInt(this.cajaNota.getText().toString());
            boolean ciclo = true;
            String nota ="";

            while (ciclo) {
                switch (nombre) {

                    case 0: case 1: case 2: case 3: case 4:
                        nota = "INSUFICIENTE";
                        this.resultado.setTextColor(Color.RED);
                        ciclo = false;
                        break;
                    case 5: case 6:
                        nota = "APROBADO";
                        this.resultado.setTextColor(Color.GREEN);
                        ciclo = false;

                        break;
                    case 7: case 8:
                        nota = "NOTABLE";
                        this.resultado.setTextColor(Color.BLUE);
                        ciclo = false;
                        break;
                    case 9:   case 10:
                        nota = "SOBRESALIENTE";
                        this.resultado.setTextColor(Color.parseColor("#d173b2"));

                        ciclo = false;
                        break;
                    default:
                        nota = " Meta una nota válida , entre 0 a 10 por favor";
                        if (nombre <30) {
                            this.resultado.setTextColor(Color.parseColor("#fb6e55"));
                    } else {

                            this.resultado.setTextColor(Color.parseColor("#00bbd9"));
                        }

                        ciclo = false;
                        break;

                }
            }

            this.resultado.setText(nota);

        }
}
