package entities;

public  class  Dipendente {
    public static double stipendioBase =1000.0;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;
    private double importoOrarioStaordinario;

    public enum Livello {
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    }

    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStaordinario() {
        return importoOrarioStaordinario;
    }
    public Livello getLivello() {
        return livello;
    }
    public void setImportoOrarioStaordinario(double importoOrarioStaordinario) {
        this.importoOrarioStaordinario = importoOrarioStaordinario;
    }
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    public Dipartimento getDipartimento() {
        return dipartimento;
    }
    ////////////////////////// 2 Costruttori///////////////////////////////

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30.0;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }
    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;}

    ///////////////////////METODI///////////////////////////////////
    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
    }
    public void promuovi() {
        switch (livello) {
            case OPERAIO:
                livello = Livello.IMPIEGATO;
                stipendio = stipendio * 1.2;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                stipendio = stipendio * 1.5;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                stipendio = stipendio * 2.0;
                break;
            case DIRIGENTE:
                System.err.println("Grado massimo.");
                break;
            default:
                System.out.println("operaio");
                stipendio = stipendioBase;
                break;
        }
    }
    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();

    }
    public static double calcolaPagaExtra(Dipendente dipendente, int orarioStaordinario) {
        double importoOrarioStraordinarioDipendete = dipendente.getImportoOrarioStaordinario();
        return dipendente.getStipendio() +  (importoOrarioStraordinarioDipendete * orarioStaordinario);

    }


}
