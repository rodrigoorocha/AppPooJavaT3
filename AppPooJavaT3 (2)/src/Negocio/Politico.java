package Negocio;

public class Politico {
	public String nome;
	public float salario;
	public boolean indicativo_senador;
	public int qtd_mandatos;
	public float total;
	
	
	final int SENADOR = 72;
	final int OUTROS = 48;
	
	private float salario_total() {
		total = salario *(indicativo_senador ? SENADOR : OUTROS);  
		
		return total;
		
	}
	private void show() {
		System.out.println(nome + "arrecadou R$" +  salario_total() + " em sua vida política");
	}
	


}
