package src.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import src.screenmatch.modelos.Filme;
import src.screenmatch.modelos.Serie;
import src.screenmatch.modelos.Titulo;

public class PrincipalComListas {
	public static void main(String[] args) {
		Filme meuFilme = new Filme("O poderoso chefão", 1970);
		meuFilme.avalia(9);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(6);
		var filmeDoPaulo = new Filme("Dogville", 2003);
		filmeDoPaulo.avalia(10);
		Serie lost = new Serie("Lost", 2000);

		List<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);

		for (Titulo item : lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme && ((Filme) item).getClassificacao() > 2) {
				Filme filme = (Filme) item;
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}

		ArrayList<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Al Pacino");
		buscaPorArtista.add("Zendaya");
		buscaPorArtista.add("James Cameron");
		buscaPorArtista.add("Sandra Bullock");
		System.out.println("Buscar por artista: " + buscaPorArtista);

		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação");
		System.out.println(buscaPorArtista);
		System.out.println("Lista de titulos ordenados");
		Collections.sort(lista);
		System.out.println(lista);

		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("Ordenando por ano");
		System.out.println(lista);
	}
}
