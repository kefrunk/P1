package p1;

public class P1e {
	private static int numero;
	public static void main (String args[]){
		if (args.length!=1){
			System.out.println("ERROR: Numero de argumentos incorrecto\nFormade uso: P1e numero");
			System.exit(1);
		}
		try{
			numero=Integer.parseInt(args[0]);				
		}
		catch (Exception e){
			System.out.println("ERROR: El numero es incorrecto["+args[0]+"]\n"+e);
			System.exit(2);
		}
		if (numero<0){
			System.out.println("ERROR: El numero debe ser mayor o igual que 0");
			System.exit(2);
		}
		
		int r1=factorialIt(numero);
		int r2=factorialRc(numero);
		System.out.println("Resultado modo Iterativo: "+r1+"\nResultado modo Recursivo: "+r2);
		if (r1==r2) System.exit(0);
		else System.exit(3);
			
		}
	
	public static int factorialIt(int num){
		int resultado=1;
		for(int i=num;i>0;i--){
			resultado=resultado*i;
			}
		return resultado;
	}
	public static int factorialRc(int num){
		if (num>0)return num*factorialRc(num-1);
		else return 1;
	}
}
