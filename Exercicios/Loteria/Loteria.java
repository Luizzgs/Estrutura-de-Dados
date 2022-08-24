import java.util.Random;

public class Loteria {
    int G[] = new int[13];
    String nome;
    int count = 0;
    
    public Loteria(){
        for (int i = 0; i < G.length; i++) {
            G[i] = 0;
        }
    }
    public Loteria(int i){
        G[0] = 4;
        G[1] = 1;
        G[2] = 3;
        G[3] = 1;
        G[4] = 5;
        G[5] = 1;
        G[6] = 4;
        G[7] = 2;
        G[8] = 3;
        G[9] = 3;
        G[10] = 2;
        G[11] = 2;
        G[12] = 1;
        
    }
    public void gerador() {
        for (int i = 0; i < G.length; i++) {
            Random random = new Random();
            G[i] = random.nextInt(5)+1;


        }
    }
}
