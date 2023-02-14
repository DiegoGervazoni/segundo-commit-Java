import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int numeroInteiro;
		double numeroFlutuante;
		char caractere;
		
		nome = sc.next();
		numeroInteiro = sc.nextInt();
		numeroFlutuante = sc.nextDouble();
		caractere = sc.next().charAt(0);
		
		System.out.println("Dados digitados: ");
		System.out.println(nome);
		System.out.println(numeroInteiro);
		System.out.println(numeroFlutuante);
		System.out.println(caractere);
		
		sc.close();

	}

}
