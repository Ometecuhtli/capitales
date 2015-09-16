package com.pidilino.Capital;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.Random;

public class capital_activity extends Activity {

   private opciones[] mPaíses = new opciones[]{
         new opciones(R.string.país001, R.string.capital001, R.string.continente001),
         new opciones(R.string.país002, R.string.capital002, R.string.continente002),
         new opciones(R.string.país003, R.string.capital003, R.string.continente003),
         new opciones(R.string.país004, R.string.capital004, R.string.continente004),
         new opciones(R.string.país005, R.string.capital005, R.string.continente005),
         new opciones(R.string.país006, R.string.capital006, R.string.continente006),
         new opciones(R.string.país007, R.string.capital007, R.string.continente007),
         new opciones(R.string.país008, R.string.capital008, R.string.continente008),
         new opciones(R.string.país009, R.string.capital009, R.string.continente009),
         new opciones(R.string.país010, R.string.capital010, R.string.continente010),
         new opciones(R.string.país011, R.string.capital011, R.string.continente011),
         new opciones(R.string.país012, R.string.capital012, R.string.continente012),
         new opciones(R.string.país013, R.string.capital013, R.string.continente013),
         new opciones(R.string.país014, R.string.capital014, R.string.continente014),
         new opciones(R.string.país015, R.string.capital015, R.string.continente015),
         new opciones(R.string.país016, R.string.capital016, R.string.continente016),
         new opciones(R.string.país017, R.string.capital017, R.string.continente017),
         new opciones(R.string.país018, R.string.capital018, R.string.continente018),
         new opciones(R.string.país019, R.string.capital019, R.string.continente019),
         new opciones(R.string.país020, R.string.capital020, R.string.continente020),
         new opciones(R.string.país021, R.string.capital021, R.string.continente021),
         new opciones(R.string.país022, R.string.capital022, R.string.continente022),
         new opciones(R.string.país023, R.string.capital023, R.string.continente023),
         new opciones(R.string.país024, R.string.capital024, R.string.continente024),
         new opciones(R.string.país025, R.string.capital025, R.string.continente025),
         new opciones(R.string.país026, R.string.capital026, R.string.continente026),
         new opciones(R.string.país027, R.string.capital027, R.string.continente027),
         new opciones(R.string.país028, R.string.capital028, R.string.continente028),
         new opciones(R.string.país029, R.string.capital029, R.string.continente029),
         new opciones(R.string.país030, R.string.capital030, R.string.continente030),
         new opciones(R.string.país031, R.string.capital031, R.string.continente031),
         new opciones(R.string.país032, R.string.capital032, R.string.continente032),
         new opciones(R.string.país033, R.string.capital033, R.string.continente033),
         new opciones(R.string.país034, R.string.capital034, R.string.continente034),
         new opciones(R.string.país035, R.string.capital035, R.string.continente035),
         new opciones(R.string.país036, R.string.capital036, R.string.continente036),
         new opciones(R.string.país037, R.string.capital037, R.string.continente037),
         new opciones(R.string.país038, R.string.capital038, R.string.continente038),
         new opciones(R.string.país039, R.string.capital039, R.string.continente039),
         new opciones(R.string.país040, R.string.capital040, R.string.continente040),
         new opciones(R.string.país041, R.string.capital041, R.string.continente041),
         new opciones(R.string.país042, R.string.capital042, R.string.continente042),
         new opciones(R.string.país043, R.string.capital043, R.string.continente043),
         new opciones(R.string.país044, R.string.capital044, R.string.continente044),
         new opciones(R.string.país045, R.string.capital045, R.string.continente045),
         new opciones(R.string.país046, R.string.capital046, R.string.continente046),
         new opciones(R.string.país047, R.string.capital047, R.string.continente047),
         new opciones(R.string.país048, R.string.capital048, R.string.continente048),
         new opciones(R.string.país049, R.string.capital049, R.string.continente049),
         new opciones(R.string.país050, R.string.capital050, R.string.continente050),
         new opciones(R.string.país051, R.string.capital051, R.string.continente051),
         new opciones(R.string.país052, R.string.capital052, R.string.continente052),
         new opciones(R.string.país053, R.string.capital053, R.string.continente053),
         new opciones(R.string.país054, R.string.capital054, R.string.continente054),
         new opciones(R.string.país055, R.string.capital055, R.string.continente055),
         new opciones(R.string.país056, R.string.capital056, R.string.continente056),
         new opciones(R.string.país057, R.string.capital057, R.string.continente057),
         new opciones(R.string.país058, R.string.capital058, R.string.continente058),
         new opciones(R.string.país059, R.string.capital059, R.string.continente059),
         new opciones(R.string.país060, R.string.capital060, R.string.continente060),
         new opciones(R.string.país061, R.string.capital061, R.string.continente061),
         new opciones(R.string.país062, R.string.capital062, R.string.continente062),
         new opciones(R.string.país063, R.string.capital063, R.string.continente063),
         new opciones(R.string.país064, R.string.capital064, R.string.continente064),
         new opciones(R.string.país065, R.string.capital065, R.string.continente065),
         new opciones(R.string.país066, R.string.capital066, R.string.continente066),
         new opciones(R.string.país067, R.string.capital067, R.string.continente067),
         new opciones(R.string.país068, R.string.capital068, R.string.continente068),
         new opciones(R.string.país069, R.string.capital069, R.string.continente069),
         new opciones(R.string.país070, R.string.capital070, R.string.continente070),
         new opciones(R.string.país071, R.string.capital071, R.string.continente071),
         new opciones(R.string.país072, R.string.capital072, R.string.continente072),
         new opciones(R.string.país073, R.string.capital073, R.string.continente073),
         new opciones(R.string.país074, R.string.capital074, R.string.continente074),
         new opciones(R.string.país075, R.string.capital075, R.string.continente075),
         new opciones(R.string.país076, R.string.capital076, R.string.continente076),
         new opciones(R.string.país077, R.string.capital077, R.string.continente077),
         new opciones(R.string.país078, R.string.capital078, R.string.continente078),
         new opciones(R.string.país079, R.string.capital079, R.string.continente079),
         new opciones(R.string.país080, R.string.capital080, R.string.continente080),
         new opciones(R.string.país081, R.string.capital081, R.string.continente081),
         new opciones(R.string.país082, R.string.capital082, R.string.continente082),
         new opciones(R.string.país083, R.string.capital083, R.string.continente083),
         new opciones(R.string.país084, R.string.capital084, R.string.continente084),
         new opciones(R.string.país085, R.string.capital085, R.string.continente085),
         new opciones(R.string.país086, R.string.capital086, R.string.continente086),
         new opciones(R.string.país087, R.string.capital087, R.string.continente087),
         new opciones(R.string.país088, R.string.capital088, R.string.continente088),
         new opciones(R.string.país089, R.string.capital089, R.string.continente089),
         new opciones(R.string.país090, R.string.capital090, R.string.continente090),
         new opciones(R.string.país091, R.string.capital091, R.string.continente091),
         new opciones(R.string.país092, R.string.capital092, R.string.continente092),
         new opciones(R.string.país093, R.string.capital093, R.string.continente093),
         new opciones(R.string.país094, R.string.capital094, R.string.continente094),
         new opciones(R.string.país095, R.string.capital095, R.string.continente095),
         new opciones(R.string.país096, R.string.capital096, R.string.continente096),
         new opciones(R.string.país097, R.string.capital097, R.string.continente097),
         new opciones(R.string.país098, R.string.capital098, R.string.continente098),
         new opciones(R.string.país099, R.string.capital099, R.string.continente099),
         new opciones(R.string.país100, R.string.capital100, R.string.continente100),
         new opciones(R.string.país101, R.string.capital101, R.string.continente101),
         new opciones(R.string.país102, R.string.capital102, R.string.continente102),
         new opciones(R.string.país103, R.string.capital103, R.string.continente103),
         new opciones(R.string.país104, R.string.capital104, R.string.continente104),
         new opciones(R.string.país105, R.string.capital105, R.string.continente105),
         new opciones(R.string.país106, R.string.capital106, R.string.continente106),
         new opciones(R.string.país107, R.string.capital107, R.string.continente107),
         new opciones(R.string.país108, R.string.capital108, R.string.continente108),
         new opciones(R.string.país109, R.string.capital109, R.string.continente109),
         new opciones(R.string.país110, R.string.capital110, R.string.continente110),
         new opciones(R.string.país111, R.string.capital111, R.string.continente111),
         new opciones(R.string.país112, R.string.capital112, R.string.continente112),
         new opciones(R.string.país113, R.string.capital113, R.string.continente113),
         new opciones(R.string.país114, R.string.capital114, R.string.continente114),
         new opciones(R.string.país115, R.string.capital115, R.string.continente115),
         new opciones(R.string.país116, R.string.capital116, R.string.continente116),
         new opciones(R.string.país117, R.string.capital117, R.string.continente117),
         new opciones(R.string.país118, R.string.capital118, R.string.continente118),
         new opciones(R.string.país119, R.string.capital119, R.string.continente119),
         new opciones(R.string.país120, R.string.capital120, R.string.continente120),
         new opciones(R.string.país121, R.string.capital121, R.string.continente121),
         new opciones(R.string.país122, R.string.capital122, R.string.continente122),
         new opciones(R.string.país123, R.string.capital123, R.string.continente123),
         new opciones(R.string.país124, R.string.capital124, R.string.continente124),
         new opciones(R.string.país125, R.string.capital125, R.string.continente125),
         new opciones(R.string.país126, R.string.capital126, R.string.continente126),
         new opciones(R.string.país127, R.string.capital127, R.string.continente127),
         new opciones(R.string.país128, R.string.capital128, R.string.continente128),
         new opciones(R.string.país129, R.string.capital129, R.string.continente129),
         new opciones(R.string.país130, R.string.capital130, R.string.continente130),
         new opciones(R.string.país131, R.string.capital131, R.string.continente131),
         new opciones(R.string.país132, R.string.capital132, R.string.continente132),
         new opciones(R.string.país133, R.string.capital133, R.string.continente133),
         new opciones(R.string.país134, R.string.capital134, R.string.continente134),
         new opciones(R.string.país135, R.string.capital135, R.string.continente135),
         new opciones(R.string.país136, R.string.capital136, R.string.continente136),
         new opciones(R.string.país137, R.string.capital137, R.string.continente137),
         new opciones(R.string.país138, R.string.capital138, R.string.continente138),
         new opciones(R.string.país139, R.string.capital139, R.string.continente139),
         new opciones(R.string.país140, R.string.capital140, R.string.continente140),
         new opciones(R.string.país141, R.string.capital141, R.string.continente141),
         new opciones(R.string.país142, R.string.capital142, R.string.continente142),
         new opciones(R.string.país143, R.string.capital143, R.string.continente143),
         new opciones(R.string.país144, R.string.capital144, R.string.continente144),
         new opciones(R.string.país145, R.string.capital145, R.string.continente145),
         new opciones(R.string.país146, R.string.capital146, R.string.continente146),
         new opciones(R.string.país147, R.string.capital147, R.string.continente147),
         new opciones(R.string.país148, R.string.capital148, R.string.continente148),
         new opciones(R.string.país149, R.string.capital149, R.string.continente149),
         new opciones(R.string.país150, R.string.capital150, R.string.continente150),
         new opciones(R.string.país151, R.string.capital151, R.string.continente151),
         new opciones(R.string.país152, R.string.capital152, R.string.continente152),
         new opciones(R.string.país153, R.string.capital153, R.string.continente153),
         new opciones(R.string.país154, R.string.capital154, R.string.continente154),
         new opciones(R.string.país155, R.string.capital155, R.string.continente155),
         new opciones(R.string.país156, R.string.capital156, R.string.continente156),
         new opciones(R.string.país157, R.string.capital157, R.string.continente157),
         new opciones(R.string.país158, R.string.capital158, R.string.continente158),
         new opciones(R.string.país159, R.string.capital159, R.string.continente159),
         new opciones(R.string.país160, R.string.capital160, R.string.continente160),
         new opciones(R.string.país161, R.string.capital161, R.string.continente161),
         new opciones(R.string.país162, R.string.capital162, R.string.continente162),
         new opciones(R.string.país163, R.string.capital163, R.string.continente163),
         new opciones(R.string.país164, R.string.capital164, R.string.continente164),
         new opciones(R.string.país165, R.string.capital165, R.string.continente165),
         new opciones(R.string.país166, R.string.capital166, R.string.continente166),
         new opciones(R.string.país167, R.string.capital167, R.string.continente167),
         new opciones(R.string.país168, R.string.capital168, R.string.continente168),
         new opciones(R.string.país169, R.string.capital169, R.string.continente169),
         new opciones(R.string.país170, R.string.capital170, R.string.continente170),
         new opciones(R.string.país171, R.string.capital171, R.string.continente171),
         new opciones(R.string.país172, R.string.capital172, R.string.continente172),
         new opciones(R.string.país173, R.string.capital173, R.string.continente173),
         new opciones(R.string.país174, R.string.capital174, R.string.continente174),
         new opciones(R.string.país175, R.string.capital175, R.string.continente175),
         new opciones(R.string.país176, R.string.capital176, R.string.continente176),
         new opciones(R.string.país177, R.string.capital177, R.string.continente177),
         new opciones(R.string.país178, R.string.capital178, R.string.continente178),
         new opciones(R.string.país179, R.string.capital179, R.string.continente179),
         new opciones(R.string.país180, R.string.capital180, R.string.continente180),
         new opciones(R.string.país181, R.string.capital181, R.string.continente181),
         new opciones(R.string.país182, R.string.capital182, R.string.continente182),
         new opciones(R.string.país183, R.string.capital183, R.string.continente183),
         new opciones(R.string.país184, R.string.capital184, R.string.continente184),
         new opciones(R.string.país185, R.string.capital185, R.string.continente185),
         new opciones(R.string.país186, R.string.capital186, R.string.continente186),
         new opciones(R.string.país187, R.string.capital187, R.string.continente187),
         new opciones(R.string.país188, R.string.capital188, R.string.continente188),
         new opciones(R.string.país189, R.string.capital189, R.string.continente189),
         new opciones(R.string.país190, R.string.capital190, R.string.continente190),
         new opciones(R.string.país191, R.string.capital191, R.string.continente191),
         new opciones(R.string.país192, R.string.capital192, R.string.continente192),
         new opciones(R.string.país193, R.string.capital193, R.string.continente193),
         new opciones(R.string.país194, R.string.capital194, R.string.continente194),
         new opciones(R.string.país195, R.string.capital195, R.string.continente195),
         new opciones(R.string.país196, R.string.capital196, R.string.continente196),
         new opciones(R.string.país197, R.string.capital197, R.string.continente197)
   };

   private Button mAyudaButton;
   private Button mSiguienteButton;
   private TextView mPreguntaTextView;
   private RadioGroup mOpcionesRadioGroup;
   private ImageView mImagenContinente;

   private int mActualIndex = 0;
   private int mNivelAyuda;
   private int mNumOpciones = 4;
   private int mRespuestaCorrecta;
   private int numOpciones;
   Random brandon = new Random();

   private void actualizarInterfaz() {
      mActualIndex = brandon.nextInt(mPaíses.length);

      // Imagen del mundo por defecto
      mImagenContinente.setBackgroundResource(R.drawable.mundo);

      // Reiniciar el nivel de ayuda a 0 (sin ayuda)
      mNivelAyuda = 0;
      mAyudaButton.setEnabled(true);
      mPreguntaTextView.setText(mPaíses[mActualIndex].getPaís());
      mOpcionesRadioGroup = (RadioGroup) findViewById(R.id.rgOpciones);
      mOpcionesRadioGroup.removeAllViews();

      Integer[] nomCapitales = new Integer[numOpciones];
      mRespuestaCorrecta = brandon.nextInt(numOpciones);

      for (int i = 0; i < numOpciones; i++)
         nomCapitales[i] = -1;
      nomCapitales[mRespuestaCorrecta] = mActualIndex;

      for (int i = 0; i < numOpciones; i++) {
         RadioButton radioButtonView = new RadioButton(this);
         if (nomCapitales[i] == -1) {
            int azar;
            boolean desigual;
            do {
               desigual = true;
               azar = brandon.nextInt(mPaíses.length);
               while (azar == mActualIndex)
                  azar = brandon.nextInt(mPaíses.length);
               for (int j = i - 1; j >= 0; j--) {
                  if (azar == nomCapitales[j])
                     desigual = false;
               }
            } while (!desigual);

            nomCapitales[i] = azar;
            radioButtonView.setText(mPaíses[azar].getCapital());
            radioButtonView.setId(i);
            radioButtonView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                  Toast mensaje = Toast.makeText(capital_activity.this, R.string.respuesta_incorrecta, Toast.LENGTH_SHORT);
                  mensaje.setGravity(Gravity.RIGHT | Gravity.TOP, 0, 0);
                  mensaje.show();
                  actualizarInterfaz();
               }
            });
         } else {
            radioButtonView.setText(mPaíses[mActualIndex].getCapital());
            radioButtonView.setId(i);
            radioButtonView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                  Toast mensaje = Toast.makeText(capital_activity.this, R.string.respuesta_correcta, Toast.LENGTH_SHORT);
                  mensaje.setGravity(Gravity.RIGHT | Gravity.TOP, 0, 0);
                  mensaje.show();
                  actualizarInterfaz();
               }
            });
         }
         mOpcionesRadioGroup.addView(radioButtonView);
      }

   }

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      Bundle bundle;

      numOpciones = mNumOpciones;
      try {
         bundle = getIntent().getExtras();
         if (bundle.getInt("NUM_OPCIONES") >= mNumOpciones)
            numOpciones = getIntent().getExtras().getInt("NUM_OPCIONES");
      } catch (Exception e1) {

      }

      mPreguntaTextView = (TextView) findViewById(R.id.txtPregunta);
      mImagenContinente = (ImageView) findViewById(R.id.imgContinente);
      mImagenContinente.setVisibility(View.VISIBLE);

      // Funciones de ayuda (2 niveles: Imagen y respuesta)
      mAyudaButton = (Button) findViewById(R.id.btnAyuda);
      mAyudaButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            mNivelAyuda++;
            switch (mNivelAyuda) {
               // Primer nivel de ayuda: Mostrar el continente
               case 1:
                  mostrarContinente();
                  break;

               // Segundo nivel de ayuda: Eliminar una de las opciones
               case 2:
                  eliminarOpcion();
                  mAyudaButton.setEnabled(false); // No más ayuda, reiniciar con nueva interfaz
                  break;
            }
         }
      });

      // Siguiente pregunta (nueva interfaz)
      mSiguienteButton = (Button) findViewById(R.id.btnSiguiente);
      mSiguienteButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) { actualizarInterfaz(); }
      });

      // Llamar a actualizarInterfaz al iniciar la actividad
      actualizarInterfaz();
   }

   // Primer nivel de ayuda (mostrar continente)
   public void mostrarContinente() {
      String strContinente = getResources().getString(mPaíses[mActualIndex].getContinente());
      switch (strContinente) {
         case "América":
            mImagenContinente.setBackgroundResource(R.drawable.america);
            break;
         case "Asia":
            mImagenContinente.setBackgroundResource(R.drawable.asia);
            break;
         case "Europa":
            mImagenContinente.setBackgroundResource(R.drawable.europa);
            break;
         case "Oceanía":
            mImagenContinente.setBackgroundResource(R.drawable.oceania);
            break;
         case "África":
            mImagenContinente.setBackgroundResource(R.drawable.africa);
            break;
      }
   }

   // Segundo nivel de ayuda (eliminar opción)
   public void eliminarOpcion() {
      int eliminar = brandon.nextInt(numOpciones);
      while (eliminar == mRespuestaCorrecta)
         eliminar = brandon.nextInt(numOpciones);
      RadioButton radioButtonView = (RadioButton) mOpcionesRadioGroup.findViewById(eliminar);
      radioButtonView.setPaintFlags(radioButtonView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
      radioButtonView.setClickable(false);
   }

   /* Menú del programa */
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      MenuInflater menuInflater = getMenuInflater();
      menuInflater.inflate(R.menu.menu, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {

      switch (item.getItemId()) {
         case R.id.menu_acercade:
            Intent intentAcercaDe = new Intent(capital_activity.this, acercade.class);
            startActivity(intentAcercaDe);
            return true;

         case R.id.menu_configuración:
            Intent intentConfiguración = new Intent(capital_activity.this, configuracion.class);
            intentConfiguración.putExtra("NUM_OPCIONES", numOpciones);
            startActivity(intentConfiguración);
            return true;

         default:
            return super.onOptionsItemSelected(item);
      }
   }
   /* Fin menú del programa */
}