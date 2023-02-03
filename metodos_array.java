//import java.util.Arrays;

public class metodos_array {
    public static void main(String[] args){
        
        final int tam=10;
        //int[] num={9,5,7,3,4,1,2,8,0,6};
        int[] numeros=new int[tam];
        //int pesquisa=3;
        // System.arraycopy(num, 0, numeros, 0, tam);
        // Arrays.fill(numeros, 10);
        // Arrays.sort(num);
        // System.out.printf("Arrays sao iguais? %s", Arrays.equals(num,numeros) ? "Sim" : "Nao");

        for(int n:numeros){
            System.out.printf(" %d - ",n);
        }
    }
}
