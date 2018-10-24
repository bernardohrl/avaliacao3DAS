package Cadastros;

public class CalculaDuracao {

	protected Viagem viagem;
	private int duracaoMinutos;

	public CalculaDuracao(Viagem viagem) {
		this.viagem = viagem;
	}

	
	public int emHoras() {
		return new CalculaDuracaoHora(this.viagem).compute();
	}
	
	
	public int emMinutos() {
		return new CalculaDuracaoMinuto(this.viagem).compute();
	}
	
	
	public int totalEmMinutos() {
		return this.emHoras() * 60 + this.emMinutos();
	}
}