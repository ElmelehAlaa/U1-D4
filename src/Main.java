import entities.Dipendente;

import static entities.Dipendente.calcolaPaga;
import static entities.Dipendente.calcolaPagaTotale;


public class Main {
    public static void main(String[] args) {


        Dipendente giacomo = new Dipendente(1243, 1300.0,20, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        giacomo.stampaDatiDipendente();
        giacomo.promuovi();
        giacomo.stampaDatiDipendente();
       double stipendioMensile= Dipendente.calcolaPaga(giacomo);
       System.out.println(stipendioMensile);


       double stipendioMensileExtra = Dipendente.calcolaPagaTotale( giacomo,  10);
       System.out.println(giacomo.getImportoOrarioStaordinario());
      System.out.println( "Stipendio  con straordinari " + stipendioMensileExtra);
    }

}