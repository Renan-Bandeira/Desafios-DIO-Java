import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio {
  public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Double a = Double.parseDouble(br.readLine());
    Double b = Double.parseDouble(br.readLine());
    Double c = Double.parseDouble(br.readLine());
    Double d = Double.parseDouble(br.readLine());
    Double e = Double.parseDouble(br.readLine());
    Double f = Double.parseDouble(br.readLine());
   
   Double vetor[] = new Double[6];
   vetor[0]=a;
   vetor[1]=b;
   vetor[2]=c;
   vetor[3]=d;
   vetor[4]=e;
   vetor[5]=f;
   
    int re = 0;
    
    for (int ct = 0; ct < 6; ct++){
      
        if  (vetor[ct] >= 0){
        re++;
        } 
    }
   
    System.out.println(re + " valores positivos");
  } 
}