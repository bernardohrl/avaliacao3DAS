package Cadastros;

public class CalculaDuracaoMinuto extends CalculaDuracao {

	private int duracaoMinutos;
	final int MINUTOS_EM_HORA = 60;

	public CalculaDuracaoMinuto(Viagem viagem) {
		super(viagem);
	}

	
	public int compute() {
		if (viagem.getMinutosTermino() > viagem.getMinutoInicio()) 
			duracaoMinutos = viagem.getMinutosTermino() - viagem.getMinutoInicio();
		else {
			duracaoMinutos = MINUTOS_EM_HORA - viagem.getMinutoInicio() + viagem.getMinutosTermino();
			if (duracaoMinutos == MINUTOS_EM_HORA) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}
}
