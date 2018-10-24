package Cadastros;

public class CalculaDuracaoMinuto extends CalculaDuracao {

	private int duracaoMinutos;

	public CalculaDuracaoMinuto(Viagem viagem) {
		super(viagem);
	}

	
	public int compute() {
		if (viagem.getMinutosTermino() > viagem.getMinutoInicio()) 
			duracaoMinutos = viagem.getMinutosTermino() - viagem.getMinutoInicio();
		else {
			duracaoMinutos = 60 - viagem.getMinutoInicio() + viagem.getMinutosTermino();
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}
}
