package com.cep.javacasm.calculadora233;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    // Caja de texto que representa a la pantalla
    TextView tvResultado;
    // Númeor máximo de cifras que usaremos
    int iLongitudMaxima=11;

    // guardaremos el primer operando a usar
    int operando1;

    // guardaremos el id del botón de cada operación
    int idOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View vResultado=findViewById(R.id.tvResultado);
        tvResultado=(TextView)vResultado;
    }

    // Realiza las tareas de borrado completo
    public void pulsacionCE(View v)
    {
        String strTextoInicial=getString(R.string.valorInicialCajaDeTexto);
        tvResultado.setText(strTextoInicial);
    }


    // TODO: Borra el último caracter
    public void pulsacionC(View v)
    {

    }

    // Pulsación de un número
    public void pulsacion(View v)
    {
        Button bt=(Button)v;
        String strBtText=bt.getText().toString();
        String strTextoAviso="Pulsacion tecla "+strBtText+" !!!!";
      //  Toast.makeText(this, strTextoAviso, Toast.LENGTH_LONG).show();

        String strValorAntiguo=tvResultado.getText().toString();

        String strValorNuevo;
        if(strValorAntiguo.equals("0"))
            strValorNuevo=strBtText;
        else
            strValorNuevo=strValorAntiguo+strBtText;

        if(strValorNuevo.length() <= iLongitudMaxima)
        {
            tvResultado.setText(strValorNuevo);
        }
        else
        {
            Toast.makeText(this,R.string.longitudMaxima,Toast.LENGTH_LONG).show();
        }


    }
    //Pulsación sobre un botón de operador + - / *

    public void pulsacionOperador(View v)
    { // Se ha pulsado el operador  ....
      // TODO: Añadir código para avisar al usuario
        try {
            // Recuperamos el operando 1 1
            String strValorOperador1 = tvResultado.getText().toString();
            operando1 = Integer.parseInt(strValorOperador1);

            // Guardamos el operador pulsado
            idOperacion = v.getId();

            // borrar texto
            pulsacionCE(v);
        }
        catch (Exception e)
        {   Toast.makeText(this,R.string.error,Toast.LENGTH_LONG).show();
            pulsacionCE(v);}
     }

    // Se ha pulsado el operador =
    public void pulsacionIgual(View v)
    {
        try {
            // guardar 2º operando
            String strOperando2 = tvResultado.getText().toString();
            int operando2 = Integer.parseInt(strOperando2);

            // En funcion del operador hacer el calculo
            int iResultado = 0;
            if (idOperacion == R.id.bSuma) {
                iResultado = operando1 + operando2;              }

            if (idOperacion == R.id.bResta) {
                iResultado = operando1 - operando2;             }

            if (idOperacion == R.id.bMultiplicacion) {
                iResultado = operando1 * operando2;             }

            if (idOperacion == R.id.bDivision) {
                iResultado = operando1 / operando2;
               /* if (operando2 != 0) {
                    iResultado = operando1 / operando2;
                } else {
                    Toast.makeText(this, R.string.divisionPorCero, Toast.LENGTH_LONG).show();
                    pulsacionCE(v);
                } */
            }
            // Mostrar el resultado
            // Comprobar la longitud del resultado
            String strResultado = Integer.toString(iResultado);
            if (strResultado.length() < iLongitudMaxima) {
                tvResultado.setText(strResultado);
            } else {
                Toast.makeText(this, R.string.longitudMaxima, Toast.LENGTH_LONG).show();
                pulsacionCE(v);
            }
        }
        catch(Exception e)
        {
            String sTipoDeError=e.getMessage();
            Toast.makeText(this,R.string.error,Toast.LENGTH_LONG).show();
        }

    }

    // TODO: Uso de decimales
    public void teclaPunto(View v) {
        Toast.makeText(this, R.string.noImplementado, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
