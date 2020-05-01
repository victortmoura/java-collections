package br.com.alura.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.Funcionario;
import br.com.alura.OrdenaPorIdade;

public class TesteOrdenaPorIdade {

	public static void main(String[] args) {
		Set<Funcionario> funcionarios = new TreeSet<Funcionario>(new OrdenaPorIdade());
		
		Funcionario f1 = new Funcionario("Victor", 25);
		Funcionario f2 = new Funcionario("Waleska", 44);
		Funcionario f3 = new Funcionario("Thalita", 23);
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterator = funcionarios.iterator();
		while(iterator.hasNext() ) {
			System.out.println(iterator.next().getNome());
		}
	}
}
