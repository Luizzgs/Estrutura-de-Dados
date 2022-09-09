public class InsertionSort{
    public static void main(String[] args) {
        Pets[] vetObj = new Pets[5];
        vetObj[0] = new Pets(1,"Jorge", "Cachorro");
        vetObj[1] = new Pets(2,"Bolinha", "Gato");
        vetObj[2] = new Pets(9,"Tucano", "Papagaio"); 
        vetObj[3] = new Pets(5,"Tadeu", "Jacaré");
        vetObj[4] = new Pets(8,"Juan", "Cavalo");
        // Insertion Sort
        for (int i = 1; i < vetObj.length; i++) {
            Pets aux = vetObj[i];
            int j = i - 1;
            while (j >= 0 && vetObj[j].chave > aux.chave) {
                vetObj[j + 1] = vetObj[j];
                j--;
            }
            vetObj[j + 1] = aux;
        }
        


        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i]);
        }



    }
}
