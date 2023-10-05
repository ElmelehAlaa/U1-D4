import entities.Dipendente;

import static entities.Dipendente.calcolaPaga;

public class Main {
    public static void main(String[] args) {


        Dipendente giacomo = new Dipendente(1243, 1300.0, 20.0, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        giacomo.stampaDatiDipendente();
        giacomo.promuovi();
        giacomo.stampaDatiDipendente();
       double stipendioMensile= Dipendente.calcolaPaga(giacomo);
       System.out.println(stipendioMensile);
       double stipendioMensileExtra = Dipendente.calcolaPagaExtra(giacomo, 30);
       System.out.println(stipendioMensileExtra);
    }
}