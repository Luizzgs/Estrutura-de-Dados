https://www.devmedia.com.br/fila-circular-dinamica/24572
https://www.programiz.com/dsa/circular-queue

Remove e Adciona em qualque posição em um vetor definido, atualizando os ponteiros inicio e fim.


Fila Circular
 Inserção Circular:
 ->localiza fim;
 ->verifica o proximo de fim;
 ->insere na próxima posição de fim;
 ->atualiza o fim;
  Remoção Circular:
  ->Localiza inicio
  ->apaga o conteúdo de inicio
  ->verifica qualaproxima posição de inicio
  ->atribui a inicio a proxima posição
  
int fila[]=new int[20]
inicio=-1;
fim=-1;

public int proximo(int pont){
  if(pont+1)== fila.lenght()
  return 0;
  else
    return pont+1;
 }
