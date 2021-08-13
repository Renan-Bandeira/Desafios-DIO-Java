import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(br.readLine());
      int cont = a;
      
      int nota100 = 100;
      int nota50 = 50;
      int nota20 = 20;
      int nota10 = 10;
      int nota5 = 5;
      int nota2 = 2;
      int nota1 = 1;
     
      int res100 = 0;
      int res50 = 0;
      int res20 = 0;
      int res10 = 0;
      int res5 = 0;
      int res2 = 0;
      int res1 = 0;
      
  
        if(cont >= nota100){
        res100 = cont / nota100;
        cont %= nota100;
        }
        
        if(cont >= nota50){
         res50 = cont / nota50;
         cont %= nota50;
        }
        
         if(cont >= nota20){
         res20 = cont / nota20;
         cont %= nota20;
        }
         
         if(cont >= nota10){
         res10 = cont / nota10;
         cont %= nota10;
        }
         
        if(cont >= nota5){
         res5 = cont / nota5;
         cont %= nota5;
        }
        
        if(cont >= nota2){
         res2 = cont / nota2;
         cont %= nota2;
        }
        
        if(cont >= nota1){
         res1 = cont / nota1;
         cont %= nota1;
        }
    
    System.out.println(a);
    System.out.println(res100 + " nota(s) de R$ 100,00");
    System.out.println(res50 + " nota(s) de R$ 50,00");
    System.out.println(res20 + " nota(s) de R$ 20,00");   
    System.out.println(res10 + " nota(s) de R$ 10,00");
    System.out.println(res5 + " nota(s) de R$ 5,00");
    System.out.println(res2 + " nota(s) de R$ 2,00");
    System.out.println(res1 + " nota(s) de R$ 1,00");
   
  }
}