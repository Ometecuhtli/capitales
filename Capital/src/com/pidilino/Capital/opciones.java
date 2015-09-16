package com.pidilino.Capital;

/**
 * Created by Fújur on 9/10/2015.
 */
public class opciones {
   public int getPaís() { return País; }

   public void setPaís(int país) {
      País = país;
   }

   public int getCapital() {
      return Capital;
   }

   public void setCapital(int capital) {
      Capital = capital;
   }

   public int getContinente() {
      return Continente;
   }

   public void setContinente(int continente) {
      Continente = continente;
   }

   public opciones( int país, int capital, int continente ) {
      this.País = país;
      this.Capital = capital;
      this.Continente = continente;
   }

   private int País;
   private int Capital;
   private int Continente;
}
