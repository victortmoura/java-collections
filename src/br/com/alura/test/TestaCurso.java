package br.com.alura.test;

import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Aprendendo a programar", "Victor Moura");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println("Curso vazio: "+aulas);
		System.out.println();
		
//		Com a modificacao em getAulas() sendo encapsulada com
//		"Collections.unmodifiableList()" que faz com que a lista
//		de AULAS seja apenas retornada para READ-ONLY, nao ha
//		mais modificacoes (add, remove) ao acessar diretamente
//		as aulas por meio do getAulas().
		
//		aulas.add(new Aula("Java 8", 10));
//		aulas.add(new Aula("PHP", 5));
//		aulas.add(new Aula("Angular", 3));
//		
//		System.out.println("Cursos: "+aulas);
		
//		para tal operacao, deve-se utilizar o novo metodo implementado
//		"adiciona(Aula aula)" que ira acessar a lista de AULA dentro
//		do objeto CURSO para realizar tal operacao.
		
		javaColecoes.adiciona(new Aula("Java 8", 10));
		javaColecoes.adiciona(new Aula("PHP", 5));
		javaColecoes.adiciona(new Aula("Angular", 3));
		
		System.out.println(javaColecoes.getAulas());
		
		
	}
}
