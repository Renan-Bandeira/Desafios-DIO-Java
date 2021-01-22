import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      int c = Integer.parseInt(br.readLine());
      int d = Integer.parseInt(br.readLine());
      int e = Integer.parseInt(br.readLine());
     
      int vetor[] = new int[5];
      vetor[0]=a;
      vetor[1]=b;
      vetor[2]=c;
      vetor[3]=d;
      vetor[4]=e;
   
      int par = 0;
      int impar = 0;
      int positivo = 0;
      int negativo = 0;

    for (int ct = 0; ct < 5; ct++){
      
      if  (vetor[ct] > 0){
        positivo++;
      
        
        }else if(vetor[ct] < 0 ){
          negativo++;
        }  
      
      
      if (vetor[ct] % 2 == 0){
        par++;
        
        } else{
          impar++;
        }
    }
  
    System.out.println(par + " valor(es) par(es)");
    System.out.println(impar + " valor(es) impar(es)");
    System.out.println(positivo + " valor(es) positivo(s)");
    System.out.println(negativo + " valor(es) negativo(s)");
   
  }
}