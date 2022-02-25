package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		/*
		String a = "Maria";
		String b = "Alex";
		
		//equals: lento, resposta 100%
		System.out.println(a.equals(b));		
		
		//hashCode: rápido, porém resposta positiva não é 100% 
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		*/
		
		Client c1 = new Client ("Maria", "maria@gmail.com");
		Client c2 = new Client ("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 =  new String("Test");
		String s4 =  new String("Test");
		
		System.out.println(c1.hashCode());//compara o conteudo do objeto
		System.out.println(c2.hashCode());//compara o conteudo do objeto
		System.out.println(c1.equals(c2));//compara o conteudo do objeto
		System.out.println(c1 == c2); // compara a referencia dos objetos
		
		System.out.println(s1 == s2);//compara a forma literal do objeto a comparação será verdadeira
		
		System.out.println(s3 == s4);//força a criação de um objeto da forma comum com isso a comparação será falsa
	}

}
