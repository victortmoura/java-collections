package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	
//	Outras implementacoes para a interface SET:
//	LinkedHashSet - conjunto que mantem a ordem da insercao dos elementos
//	TreeSet

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.getAlunos().contains(aluno);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Curso: " + this.getNome() + ", insrutor: " + this.getInstrutor() + "\n");
		sb.append("Aulas: " + this.getAulas() + "\n");
		sb.append("Alunos matriculados: " + this.getAlunos());
		
		return sb.toString();
	}

	
	

}
