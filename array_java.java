import java.util.Scanner;

public class array_java{
    public static void main(String[] args){
        
        /* int[] num=new int[5];
        int[] numeros={10,20,30,40,50}; 

        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
       // System.out.printf("%d", numeros[4]);

        for(int i=0; i<numeros.length; i++){
            System.out.printf(" %d \n", numeros[i]);
        }*/
        final int tam=5;
        char[] gabarito={'a','a','d','b','c',};
        char[] respostas=new char[tam];
        int nota=0;
        respostas[0]='a';respostas[1]='a';respostas[2]='d';respostas[3]='b';respostas[4]='c';
        Scanner scan=new Scanner (System.in);

        for (int i=0; i<tam;i++){
            System.out.printf("Informe sua resposta da questao %d: ", i);
            respostas[i]=scan.nextLine().charAt(0);
            }
         
        for (int i=0; i<tam;i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
         
        }
        System.out.printf("%n Nota do aluno foi %d", nota);   
        scan.close();
    }


}