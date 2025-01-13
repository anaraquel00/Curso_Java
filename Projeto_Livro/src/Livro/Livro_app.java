package Livro;

public class Livro_app {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2]; 
		Livro[] l= new Livro[3];	
		p[0]= new Pessoa("Pedro","M",20);
		p[1]= new Pessoa("Maria","F",25);
		
		l[0]= new Livro("Aprendendo Java","Jose da Silva",300,0,false,p[0]);
		l[1]= new Livro("Java iniciantes","Maria Carvalho",400,0,false,p[1]);
		l[2]= new Livro("Java avançado","Joao Padilha",500,0,false,p[0]);
	    System.out.println(l[0].detalhes());
	    l[0].abrir();
	    l[0].folhear(200);
	    l[0].avancarPag();
	    System.out.println(l[1].detalhes());
	}}


