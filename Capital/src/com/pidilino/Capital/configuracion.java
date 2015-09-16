package com.pidilino.Capital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Fújur on 9/11/2015.
 */
public class configuracion extends Activity {
   @Override
   protected void onCreate(Bundle savedInstaceState) {
      super.onCreate(savedInstaceState);
      setContentView(R.layout.configuracion);
      int numOpciones = getIntent().getExtras().getInt("NUM_OPCIONES");
      TextView txtConfOpciones = (TextView) findViewById(R.id.txtConfiguración);
      txtConfOpciones.setText(R.string.txtOpciones);

      RadioGroup rgConfOpciones = (RadioGroup) findViewById(R.id.rgConfOpciones);
      for ( int i = 0; i < 5; i++ ) {
         RadioButton radioButtonView = new RadioButton(this);
         radioButtonView.setText(String.valueOf(i + 4));
         radioButtonView.setId(i);
         rgConfOpciones.addView(radioButtonView);
      }

      rgConfOpciones.check(numOpciones-4);

      Button btnCancelar = (Button) findViewById(R.id.btnCancelar);
      btnCancelar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            try {
               finish();
            }
            catch( Exception e1 ) {

            }
            catch( Throwable t1 ) {

            }
         }
      });


      Button btnAceptar = (Button) findViewById(R.id.btnAceptar);
      btnAceptar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            try {
               Intent intentCapital = new Intent(configuracion.this, capital_activity.class);
               int número = Integer.valueOf(rgConfOpciones.getCheckedRadioButtonId()) + 4;
               intentCapital.putExtra("NUM_OPCIONES", número);
               startActivity(intentCapital);
               //finish();
            }
            catch( Exception e1 ) {

            }
            catch( Throwable t1 ) {

            }
         }
      });
   }

}

/*
      <RadioButton
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:id="@+id/rbCuatroOpciones"/>
*/