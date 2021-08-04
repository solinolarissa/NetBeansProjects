package estruturasdados.iesb;
public class SelectionSort {
  public static void main(String[] args) {
         int[] vetor = new int[100];
        
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        long inicio = System.currentTimeMillis();
        long fim;    
        int posicao_menor, aux;
        for(int i=0; i < vetor.length; i++){
            posicao_menor = i;
            for(int j = i+1; j < vetor.length; j++){ 
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        } 
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));
        
        System.out.println("Vetor ordenado com Selection Sort");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }       
    }
}
