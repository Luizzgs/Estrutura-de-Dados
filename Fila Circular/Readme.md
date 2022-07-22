https://www.devmedia.com.br/fila-circular-dinamica/24572

Remove e Adciona em qualque posição em um vetor definido, atualizando os ponteiros inicio e fim.


Fila Circular
 Inserção Circular:
 ->localiza fim;
 ->verificaoproximo de fim;
 ->insere na próxima posição de fim;
 ->atualizaofim;
  Remoção Circular:
  ->Localiza inicio
  ->apagaoconteúdo de inicio
  ->verifica qualaproxima posição de inicio
  ->atribuiainicioaproxima posição
  
int fila[]=new int[20]
inicio=-1;
fim=-1;

public int proximo(int pont){
  if(pont+1)== fila.lenght()
  return 0;
  else
    return pont+1;
 }
