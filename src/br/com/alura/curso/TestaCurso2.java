package br.com.alura.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.Aula;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Aprendendo a programar", "Victor Moura");
		
		javaColecoes.adiciona(new Aula("Java 8", 10));
		javaColecoes.adiciona(new Aula("PHP", 5));
		javaColecoes.adiciona(new Aula("Angular", 3));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		
		
	}
}
