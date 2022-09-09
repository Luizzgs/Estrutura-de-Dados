public class SelectionSort {
    public static void main(String[] args) {
        Pets[] vetObj = new Pets[5];
        vetObj[0] = new Pets(1,"Jorge", "Cachorro");
        vetObj[1] = new Pets(2,"Bolinha", "Gato");
        vetObj[2] = new Pets(9,"Tucano", "Papagaio"); 
        vetObj[3] = new Pets(5,"Tadeu", "Jacaré");
        vetObj[4] = new Pets(8,"Juan", "Cavalo");
        // Selection Sort
        for (int i = 0; i < vetObj.length; i++) {
            int menor = i;
            for (int j = i + 1; j < vetObj.length; j++) {
                if (vetObj[j].chave < vetObj[menor].chave) {
                    menor = j;
                }
            }
            Pets aux = vetObj[i];
            vetObj[i] = vetObj[menor];
            vetObj[menor] = aux;
        }
       


        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i]);
        }



    }
}

