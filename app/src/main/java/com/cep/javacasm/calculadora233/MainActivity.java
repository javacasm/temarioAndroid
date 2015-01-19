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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void pulsacionCE(View v)
    {
        View vResultado=findViewById(R.id.tvResultado);
        TextView tvResultado=(TextView)vResultado;

        tvResultado.setText("");
    }

    public void pulsacion(View v)
    {

        Button bt=(Button)v;
        String strBtText=bt.getText().toString();
        String strTextoAviso="Pulsacion tecla "+strBtText+" !!!!";
        Toast.makeText(this, strTextoAviso, Toast.LENGTH_LONG).show();

        View vResultado=findViewById(R.id.tvResultado);
        TextView tvResultado=(TextView)vResultado;
        String strValorAntiguo=tvResultado.getText().toString();
        String strValorNuevo=strValorAntiguo+strBtText;
        tvResultado.setText(strValorNuevo);
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
