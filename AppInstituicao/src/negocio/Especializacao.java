package negocio;

public class Especializacao {
	private String nome;
	private String cargaHoraria;
	private float valor;
	private int anoFimGraduacao;
	
	public void show() {
		System.out.printf("%s\n tem a carga horaria %s\n, paga o valor de R$%.2f %f \n, e termina a graduação em %d",
				nome,
				cargaHoraria,
				valor,
				anoFimGraduacao);
	}	
	
}