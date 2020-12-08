package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Cursos;
import entities.Instrutor;
import entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Instrutor instrutor = new Instrutor ("Alex");
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		Set<User> A = new HashSet<>();
		for (int i=0; i<n;i++) {
			A.add(new User(sc.nextInt()));
		}
		Cursos cursoA = new Cursos("A", instrutor, A);
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		Set<User> B = new HashSet<>();
		for (int i=0; i<n;i++) {
			B.add(new User(sc.nextInt()));
		}
		Cursos cursoB = new Cursos("B", instrutor, B);
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		Set<User> C = new HashSet<>();
		for (int i=0; i<n;i++) {
			C.add(new User(sc.nextInt()));
		}
		Cursos cursoC = new Cursos("C", instrutor, C);
		
		A.addAll(B);
		A.addAll(C);
		System.out.println(A.size());
		
		
		
		
		sc.close();
	}

}
