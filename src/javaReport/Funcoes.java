package javaReport;

public class Funcoes {

	
	private void helloWorld() {
		System.out.println("Olá Mundo!!!!");
	}	
	
	private long soma(long valor1, long valor2) {
		System.out.println("Somou!!!!");
		return valor1+valor2;
	}	
	
	public static void main(String[] args) {
	Funcoes funcao = new Funcoes();
	//funcao.helloWorld();
	//System.out.println(funcao.soma(2,3));
		
	String str = "Curso de Java";
	String email = "algumacoisa@gmail.com   ";
	//str.charAt(2);
	//str.equals("dsfsf");
	
	//System.out.println(str.startsWith("Curs"));
	System.out.println(str.substring(3));
	System.out.println(str.substring(3));
	System.out.println(str.substring(2, 3));
	System.out.println(str.replace("Java", "Javaaaaaaa"));
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(email.trim());
	System.out.println(str.length());
	}

}
