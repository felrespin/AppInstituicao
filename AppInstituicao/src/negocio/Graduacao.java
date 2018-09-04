package negocio;

public class Graduacao {
	private String nome = "João";
	private int cargaHoraria = 44;
	private float valor = 3300;
	private boolean indicaTecnologo;
		
	public Graduacao(String nome, String cargaHoraria, float valor, int indicaTecnologo) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
		this.indicaTecnologo = indicaTecnologo;
	}

	public void show() {
		System.out.printf("%s\n"
				+ "tem a carga horaria %d\n"
				+ "paga o valor de R$%.2f %f \n"
				+ "e termina a graduação em %d",
				nome,
				cargaHoraria,
				valor,
				indicaTecnologo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getIndicaTecnologo() {
		return indicaTecnologo;
	}

	public void setIndicaTecnologo(int indicaTecnologo) {
		this.indicaTecnologo = indicaTecnologo;
	}
	
	
}
