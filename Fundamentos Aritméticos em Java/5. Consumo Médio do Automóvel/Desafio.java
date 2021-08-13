import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Desafio {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Double a = Double.parseDouble(br.readLine());
    Double b = Double.parseDouble(br.readLine());
    DecimalFormat df = new DecimalFormat("0.000");
    
    Double resul;
    resul = a / b;
    
    
    System.out.println(df.format(resul)+" km/l");
  
  }
  
}