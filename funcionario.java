
	public class funcionario {
	
		
		
				private String nomeFunc;
				private int codFunc;
				private double salarioMensal;
				private double salarioAnual;
				
		

				public funcionario(int codFunc, String nomeFunc, double salarioMensal) {
					this.codFunc = codFunc;
					this.nomeFunc = nomeFunc;
					this.salarioMensal = salarioMensal;
				}

				
				public funcionario() {
				}
				
				public void setnomeFunc(String nomeFunc) {
					this.nomeFunc = nomeFunc;
				}
				
				public String getnomeFunc(){
					return this.nomeFunc;
				}
				
				public void setcodFunc(int codFunc) {
					this.codFunc = codFunc;
				}
				
				public int getcodFunc(){
					return this.codFunc;
				}
				
				public void setsalarioMensal(double salarioMensal) {
					this.salarioMensal = salarioMensal;
				}
				
				public Double getsalarioMensal(){
					return this.salarioMensal;
				}
				
				public Double setsalarioAnual(){
					return this.salarioAnual + 1;
				}
				
				public double getsalarioAnual() {
					return salarioAnual = ((salarioMensal * 0.15) + salarioMensal) * 12;
				}
	
	}