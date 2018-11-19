package guias;
import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un numero");
		N=sc.nextInt();
		for(int i=1;i<=N;i++){   //calcula y muestra resultado
			System.out.print("El cuadrado de "+i+" ");
			System.out.println("es: "+(i*i));
		}
	}

}
