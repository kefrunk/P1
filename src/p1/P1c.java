package p1;

public class P1c {
	private static int primero;
	private static int ultimo;
	public static void main (String args[]){
		if (args.length!=2){
			System.out.println("ERROR: Numero de argumentos incorrecto\nFormade uso: P1c inicio final");
			System.exit(1);
		}
		try{
			primero=Integer.parseInt(args[0]);
			ultimo=Integer.parseInt(args[1]);				
		}
		catch (Exception e){
			System.out.println("ERROR: Alguno de los argumentos no es correcto");
			System.exit(1);
		}
		if (primero<1 || ultimo<1){
			System.out.println("ERROR: Alguno de los argumentos es menor que 1");
			System.exit(1);
		}
		if (ultimo<=primero) {
			System.out.println("ERROR: el primer numero debe ser menor que el ultimo");
			System.exit(1);
		}
		int suma =0;
		
		for (int i=primero;i<=ultimo;i++){
			suma=suma+i;
			}
		double media =0;
		media=suma/(ultimo-primero);
		String esImpar="impar";
		if (suma%2==0) esImpar ="par";
		System.out.println("La suma es: "+suma+"\nLa media es: "+media+" que es "+esImpar);
	}
}
	