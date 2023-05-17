
public class App {
    public static void main(String[] args) {
        Museo museo = new Museo();

        for (int i = 1; i <= 50; i++) {
            String cognome = "Turista " + i;
            Turista turista = new Turista(museo, cognome);
            turista.start();
        }

      
      
    }
}
