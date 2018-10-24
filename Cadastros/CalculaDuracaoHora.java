package Cadastros;

public class CalculaDuracaoHora extends CalculaDuracao {

	public CalculaDuracaoHora(Viagem viagem) {
		super(viagem);
	}

	
	public int compute() {
		int duracao = 0;
		
		if (viagem.getHoraTermino() == viagem.getHoraInicio())
			duracao = 0;

		if (viagem.getHoraTermino() > viagem.getHoraInicio()) //varias possibilidades... 
			duracao = this.getDuracao();

		if (viagem.getHoraTermino() < viagem.getHoraInicio()) 
			duracao = -1; //para casos em que a hora de termino nao foi registrada
		
		return duracao;
		
	}

	private int getDuracao () {
		int duracao = 0;

		if(viagem.getMinutosTermino() < viagem.getMinutoInicio())
			duracao = viagem.getHoraTermino() - viagem.getHoraInicio() - 1;
		else
			duracao = viagem.getHoraTermino() - viagem.getHoraInicio();

		return duracao;
	}
}
