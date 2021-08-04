package estruturasdados.iesb;
public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[100];

        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        long inicio = System.currentTimeMillis();
        long fim; 
        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1; 
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));  
        
        System.out.println("Vetor ordenado com Insert Sort");
        for(int i=0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }       
    }
}

