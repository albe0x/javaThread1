public class Corridore extends Thread{
    int metriPercorsi = 0;
    public Corridore(String nome){
        super(nome);
    }
    @Override
    public void run() {
        while (metriPercorsi < 100) {
            metriPercorsi ++;
            System.out.println(getName() + " -> " + metriPercorsi);
        }
        System.out.println(getName() +" Ha finito");
    }
}