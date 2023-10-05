package entities;

public class GestioneDipendenti  extends Dipendente {


    public GestioneDipendenti(int matricola, double stipendio, int straordinario, Livello livello, Dipartimento dipartimento) {
        super(matricola, stipendio, straordinario, livello, dipartimento);
        Dipendente giovanni = new Dipendente(1243, 1000.0,20, Livello.OPERAIO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente andrea = new Dipendente(1243, 1000.0,20, Livello.OPERAIO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente giacomino = new Dipendente(1243, 1200.0,20, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente roberto = new Dipendente(1243, 2000.0,20, Livello.DIRIGENTE, Dipendente.Dipartimento.AMMINISTRAZIONE);
        giovanni.promuovi();
        giacomino.promuovi();

        Dipendente[] dipendentes= {giovanni,giacomino,andrea,roberto};
        for(Dipendente dipendente: dipendentes){
            dipendente.stampaDatiDipendente();
        }

    }
}
