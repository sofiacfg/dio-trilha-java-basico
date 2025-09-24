import java.util.Scanner;

public class ContaTerminal {
	
public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua agência");
		String agencia = scanner.nextLine ();
		
		System.out.println("Informe sua conta bancária");
		int conta = scanner.nextInt ();
		scanner.nextLine();
		
		System.out.println("Infome seu nome");
		String nome = scanner.nextLine();
		
		System.out.println("Informe seu saldo");
		Double saldo = scanner.nextDouble();
		
		
		System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + " , conta " + conta + " e seu saldo " + saldo + " já está disponível para saque."); 
	}


}
