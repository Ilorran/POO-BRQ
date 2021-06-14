import java.util.Scanner;
public class P2PG52 {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ContacCorrente d1 = new ContacCorrente(0.0, 0.0 ,0, 1000.0);
		ContacCorrente d2 = new ContacCorrente();
		System.out.println("Bem vindo! Qual operação deseja? \n" + "[1] - depositar \n" + "[2] - sacar");
		System.out.print("Digite a opção desejada: ");
		int deci = teclado.nextInt();
		switch (deci) {
		case 1:
			
			System.out.print("Digite o número da Conta corrente: ");
			d1.setNumCC(teclado.nextInt());
			
			System.out.print("Digite o valor do depósito: ");
			d1.setDepositar(teclado.nextInt());
			
			System.out.print("Saldo anterior: " + d1.getSaldoCC() + "\n" +
					"Novo saldo: " + d1.getDepositar());
			break;
			
		case 2:
			
			System.out.print("Digite o número da Conta corrente: ");
			d1.setNumCC(teclado.nextInt());
			
			System.out.print("Digite o valor do saque: ");
			d1.setSacar(teclado.nextInt());
			
			System.out.print("Saldo anterior: " + d1.getSaldoCC() + "\n" +
					"Novo saldo: " + d1.getSacar());
			break;
		}
}
}
