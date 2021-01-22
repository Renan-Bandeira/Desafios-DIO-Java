import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(br.readLine());
      
      for (int i = 2 ; i <= a ; i+=2) {
    	  System.out.println(i);
      }
      
    }
}