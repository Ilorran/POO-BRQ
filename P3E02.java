//Autor: Iorran Gabrieli Vieira

import java.util.Scanner;
import java.util.ArrayList;
public class P3E02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		pesquisa p = new pesquisa();
		int y = 1;
		int pesquisaHn = 0;
		int pesquisaMn = 0;
		int pesquisaHs = 0;
		int pesquisaMs = 0;
		int totalpesquisa = 0;
		int autoHS = 0;
		int autoHN = 0;
		int autoMS = 0;
		int autoMN = 0;
		
		System.out.print("Tipo de pesquisa \n"
				+ "[1] para manual \n"
				+ "[2] para autom�tica \n"
				+ "Digite: ");
		int deci = teclado.nextInt();
		
		
		
		ArrayList pesquisa = new ArrayList();  
		
		switch(deci) {
		case 1:
		//capta��o de pesquisa:
		while(y == 1){
		   
		System.out.print("Digite [M] - mulher: \n"
		   		+ "Digite [H] para homem: ");     
		char sexo = teclado.next().toUpperCase().charAt(0);   
		  
		  
		System.out.print("Gostou do produto? [S] para sim\n"
		  		+ "[N] para n�o.");     
		char resp = teclado.next().toUpperCase().charAt(0); 		  
		
		//condi��es para contagem:
		if (sexo == 'M' && resp == 'S') {
			pesquisaMs++;
		}
		else if (sexo == 'M' && resp == 'N') {
			pesquisaMn++;
		}
		else if (sexo == 'H' && resp == 'N') {
			pesquisaHn++;
		}
		else if (sexo == 'H' && resp == 'S') {
			pesquisaHs++;
		}
		
		totalpesquisa = pesquisaHn + pesquisaMn + pesquisaHs + pesquisaMs;
				
		p.setSexo(sexo);
		p.setNumPesquisa(totalpesquisa);
		pesquisa.add(sexo);
		  
		
		System.out.print("Deseja informar mais valores? Digite: \n[1] para Sim: \n"
				+ "[2] para N�o e medir a porcentagem das respostas de respostas:");  
		y = teclado.nextInt();
		
		
		if(y == 2) {
			System.out.println("Mulheres que respoderam SIM: " + pesquisaMs + "\n" + "Mulheres que respoderam N�O: " +
		 pesquisaMn + "\n" + "Homens que respoderam N�O: " + pesquisaHn  + "\n" + "Homens que respoderam SIM: " + pesquisaHs);
			
			}
		
			System.out.println("Total de pesquisa: " + p.getNumPesquisa());
		
			double pctMs = (pesquisaMs * (totalpesquisa * 0.100));
			double pctMn = (pesquisaMn * (totalpesquisa * 0.100));
			double pctHs = (pesquisaHs * (totalpesquisa * 0.100));
			double pctHn = (pesquisaHn * (totalpesquisa * 0.100));

			System.out.println("Porcentagem de mulheres/SIM: " + pctMs + "%" + "\n" + "Porcentagem de mulheres/N�O: " +
			pctMn + "%" + "\n" + "Porcentagem de Homens/N�O:  " + pctHn + "%"  + "\n" + "Porcentagem de Homens/SIM:  " + pctHs + "%");
		}
		break;
		
		case 2:
			
			System.out.print("Quantidade de homens que responderam SIM: ");
			autoHS = teclado.nextInt();
			System.out.print("Quantidade de homens que responderam N�O: ");
			autoHN = teclado.nextInt();
			System.out.print("Quantidade de mulheres que responderam SIM: ");
			autoMS = teclado.nextInt();
			System.out.print("Quantidade de mulheres que responderam N�O: ");
			autoMN = teclado.nextInt();
			
			totalpesquisa = autoHS + autoHN + autoMS + autoMN;
			
			double pctMs = (autoHS * (totalpesquisa * 0.100));
			double pctMn = (autoHN * (totalpesquisa * 0.100));
			double pctHs = (autoMS * (totalpesquisa * 0.100));
			double pctHn = (autoMN * (totalpesquisa * 0.100));
			
			pesquisa.add(pctMs);
			System.out.println("Total de pesquisas: " + totalpesquisa);
			System.out.println("Porcentagem de mulheres/SIM: " + pctMs + " %" + "\n" + "Porcentagem de mulheres/N�O: " +
					pctMn + " %" + "\n" + "Porcentagem de Homens/N�O:  " + pctHn + " %" + "\n" + "Porcentagem de Homens/SIM:  "  + pctHs + " %");
			
			
			
		}
		
		
	}

}
