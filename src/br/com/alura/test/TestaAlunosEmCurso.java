package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaAlunosEmCurso {
	
	public static void main(String[] args) {

//		Instanciando o Curso
		Curso javaColecoes = new Curso("Aprendendo a programar", "Victor Moura");
		
//		Adicionando Aula
		javaColecoes.adiciona(new Aula("Java 8", 10));
		javaColecoes.adiciona(new Aula("PHP", 5));
		javaColecoes.adiciona(new Aula("Angular", 3));
		
//		Criando Aluno
		Aluno a1 = new Aluno("Orlando Silva", 65456);
		Aluno a2 = new Aluno("Fernanda Pietra", 8789);
		Aluno a3 = new Aluno("Joao Lima", 22143);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println(javaColecoes);
		
		System.out.println("------------------------------------------");
		System.out.println();
		
		
		Aluno a4 = new Aluno("Joao Lima", 22143);
		System.out.println("O aluno " + a4.getNome() + " está matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a4));
		
		System.out.println();
		
		System.out.println("O aluno a4 equals Joao Lima ?");
		System.out.println(a3.equals(a4));
		
		System.out.println("------------------------------------------");
		System.out.println();
		
		Aluno buscaMatriculado = javaColecoes.buscaMatriculado(65455);
		System.out.println("Aluno ".concat(buscaMatriculado != null ? buscaMatriculado.getNome() + " encontrado" : "não encontrado"));
		
	}
}
