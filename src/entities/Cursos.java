package entities;

import java.util.HashSet;
import java.util.Set;

public class Cursos {
	private String curso;
	private Instrutor instrutor;
	private Set<User> alunos = new HashSet<>();
	
	public Cursos(String curso, Instrutor instrutor, Set<User> alunos) {
		this.curso = curso;
		this.instrutor = instrutor;
		this.alunos = alunos;
	}
	public String getCurso() {
		return curso;
	}
	public Instrutor getInstrutor() {
		return instrutor;
	}
	
	
}
