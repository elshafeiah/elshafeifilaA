
class Turista extends Thread {
    private Museo museo;
    private String cognome;

    public Turista(Museo museo, String cognome) {
        this.museo = museo;
        this.cognome = cognome;
    }

    @Override
    public void run() {
        museo.entrataTurista(cognome);
    }
}

