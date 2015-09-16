package com.pidilino.Capital;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Fújur on 9/11/2015.
 */
public class acercade extends Activity {
   @Override
   protected void onCreate(Bundle savedInstaceState) {
      super.onCreate(savedInstaceState);
      setContentView(R.layout.acercade);
      TextView txtAcercaDe = (TextView) findViewById(R.id.txtAcercaDe);
      txtAcercaDe.setText(R.string.txtAcercaDe);
      Button btnAceptar = (Button) findViewById(R.id.btnAceptar);
      btnAceptar.setOnClickListener(new View.OnClickListener() {
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
   }

}