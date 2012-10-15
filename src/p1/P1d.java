package p1;

public class P1d {
	
	private static int numero;
	public static void main (String args[]){
		if (args.length!=2){
			System.out.println("ERROR: Numero de argumentos incorrecto\nFormade uso: P1d letra numero");
			System.exit(1);
		}
		try{
			numero=Integer.parseInt(args[1]);		
		}
		catch (Exception e){
			System.out.println("ERROR: El numero es incorrecto["+args[1]+"]\n"+e);
			System.exit(1);
		}
		if (numero<1){
			System.out.println("ERROR: El numero debe ser mayor que 0");
			System.exit(1);
		}
		
		System.out.println(replicate(args[0].charAt(0),numero));
		
	}
	public static String replicate(char c,int n){
		String salida="";
		for(int i=0;i<numero;i++) salida+=c;			
		return salida;
	}
}
