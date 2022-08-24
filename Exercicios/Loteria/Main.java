public class Main {
    public static void main(String[] args) {
    Loteria apostador[] = new Loteria[5];
    Loteria gabarito = new Loteria(5);
    
    for (int i = 0; i < apostador.length; i++) {
        apostador[i] = new Loteria();
        apostador[i].gerador();
        }

    apostador[0].nome = "Pikachu";
    apostador[1].nome = "Psyduck";
    apostador[2].nome = "Abra";
    apostador[3].nome = "Vulpix";
    apostador[4].nome = "Gengar";

    for (int i = 0; i < apostador.length; i++) {
        System.out.println("\n\n"+apostador[i].nome+" G--R");
        for (int j = 0; j < gabarito.G.length; j++) {

            System.out.println(j+"-----"+apostador[i].G[j]+"  "+gabarito.G[j]);
                if(gabarito.G[j] == apostador[i].G[j]) {
                    apostador[i].count++;
            }
        }
    }
    for (int I = 0; I < apostador.length; I++) {
        System.out.println(apostador[I].nome+" teve "+apostador[I].count+" acertos");
        if(apostador[I].count==13){
            System.out.print("GANHADOR, PRABENS!!!");
        }
    }

    }
}
