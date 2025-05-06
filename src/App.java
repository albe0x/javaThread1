import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception{
       ArrayList<Corridore> corridori = new ArrayList<>();
        String nomi[] = {"Luca", "Mario" ,"Alessio", "Federico"};
        for (String n : nomi){
            corridori.add(new Corridore(n));
        }
    
    for (Corridore c : corridori){
        c.start();
    }

    for (Corridore c : corridori){
        c.join();
    }

    System.out.println("Gara finita");


    }    
}