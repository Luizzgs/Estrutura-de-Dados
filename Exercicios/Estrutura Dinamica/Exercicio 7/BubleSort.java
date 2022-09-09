public class BubleSort {
    public static void main(String[] args) {
        Pets[] vetObj = new Pets[5];
        vetObj[0] = new Pets(1,"Jorge", "Cachorro");
        vetObj[1] = new Pets(2,"Bolinha", "Gato");
        vetObj[2] = new Pets(9,"Tucano", "Papagaio"); 
        vetObj[3] = new Pets(5,"Tadeu", "Jacaré");
        vetObj[4] = new Pets(8,"Juan", "Cavalo");
        // BUBLE SORT
        for (int i = 0; i < vetObj.length; i++) {
            for (int j = 0; j < vetObj.length - 1; j++) {
                if (vetObj[j].chave > vetObj[j + 1].chave) {
                    Pets aux = vetObj[j];
                    vetObj[j] = vetObj[j + 1];
                    vetObj[j + 1] = aux;
                }
            }
        }


        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i]);
        }



    }
}
