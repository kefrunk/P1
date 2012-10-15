package p1;

public class P1b {

	private static final int DIEZ=10;
	public static void main (String args[]){
		int suma =0;
		for (int i=1;i<=DIEZ;i++){
			suma=suma+i;
		}
		double media =0;
		media=suma/DIEZ;
		String esImpar="impar";
		if (suma%2==0) esImpar ="par";
		System.out.println("La suma es: "+suma+"\nLa media es: "+media+" que es "+esImpar);
	}

}
