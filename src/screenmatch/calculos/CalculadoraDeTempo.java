package src.screenmatch.calculos;

import src.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void inclui(Titulo titulo) {
		tempoTotal += titulo.getDuracaoEmMinutos();
	}
}
