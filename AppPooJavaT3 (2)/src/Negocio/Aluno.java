package Negocio;

public class Aluno {
	public String nome;
	public int idade;
	public float mensalidade;
	public boolean masculino;
	
	final int ANO_ATUAL = 2018;
	
	public void exibir(){
		System.out.printf("%s %s tem %d anos e paga R$%.2f\n",
				(masculino ? "O aluno" : "A aluna"),
				nome,
				idade,
				mensalidade
			);	
		impressao();
	}
	
	private void impressao() {
		System.out.println("Ano de nascimento: " + calcularAnoNascimento());
		System.out.println("tipo de mensalidade " + calcularMensalidade());
	}
	
	private int calcularAnoNascimento() {
		return ANO_ATUAL - idade;
	}
	
	private String calcularMensalidade(){
		if(mensalidade >= 1000) {
			return "Muito caro!!";
		} else if(mensalidade >= 500 & mensalidade < 1000){
			return "Barato!!!";
		} else {
			System.out.println("Muito Barato!!!");
		}
		return "";
	}
}