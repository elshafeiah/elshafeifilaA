import java.util.Random;

class Museo {
    private int turistinelMuseo = 0;

    public synchronized void entrataTurista(String cognome) {
        while (turistinelMuseo >= 5) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        turistinelMuseo++;
        System.out.println(cognome + " è entrato nel museo.");



        System.out.println(cognome + " ha visto la Gioconda.");
        try {
          Thread.sleep(new Random().nextInt(3000)); 
        } catch (Exception e) {
           
        }
      

  

        


        
        turistinelMuseo--;
        notifyAll(); 

        System.out.println(cognome + " è uscito dal museo.");
    }
}