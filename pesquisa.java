//github.com/Ilorran/Estudos-a-parte.git
public class pesquisa {

	
	private static int sequencia;
	private int numPesquisa;
	private char sexo;
	private char resposta;
	
	
	public pesquisa(int numPesquisa, char sexo, char resposta) {
		this.numPesquisa = ++sequencia;
		this.sexo = sexo;
		this.resposta = resposta;
	}
	
	public pesquisa() {
	}
	public static int getSequencia() {
		return sequencia;
	}
	public static void setSequencia(int sequencia) {
		pesquisa.sequencia = sequencia;
	}
	public int getNumPesquisa() {
		return numPesquisa;
	}
	public void setNumPesquisa(int numPesquisa) {
		this.numPesquisa = numPesquisa;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getResposta() {
		return resposta;
	}
	public void setResposta(char resposta) {
		this.resposta = resposta;
	}
}
