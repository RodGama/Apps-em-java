import java.io.Console; 
public class ConverteImperial {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("digite uma medida em centimetros, para a conversao:");
        String aux = c.readLine();
		double medida = Double.parseDouble(aux);
		if(medida < 2 ){
			System.out.println(medida+" centimetro equivale a "+(medida/2.53995)/12+" pes");
			System.out.println(medida+" centimetro equivale a "+((medida/2.53995)/12)/3+" jardas");
			System.out.println(medida+" centimetro equivale a "+(((medida/2.53995)/12)/3)/1760+" milhas");
			}
		else{
			System.out.println(medida+" centimetros equivalem a "+(medida/2.53995)/12+" pes");
			System.out.println(medida+" centimetros equivalem a "+((medida/2.53995)/12)/3+" jardas");
			System.out.println(medida+" centimetros equivalem a "+(((medida/2.53995)/12)/3)/1760+" milhas");
			}
     }
}