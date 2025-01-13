package Livro;

public class Livro {

private String nome;
private String descriçao;
private Double valor;
private String isbn;
private Autor autor;

public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getDescriçao() {
	return descriçao;
}


public void setDescriçao(String descriçao) {
	this.descriçao = descriçao;
}


Double getValor() {
	return valor;
}


public void setValor(Double valor) {
	this.valor = valor;
}


public String getIsbn() {
	return isbn;
}


public void setIsbn(String isbn) {
	this.isbn = isbn;
}


public Autor getAutor() {
	return autor;
}


public void setAutor(Autor autor) {
	this.autor = autor;
}


boolean temAutor(){
boolean naoEhNull = this.autor != null;
return naoEhNull;
}


	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro:";
		System.out.println(mensagem);
		System.out.println("Nome:" +nome);
		System.out.println("Descriçao:" +descriçao);
		System.out.println("Valor:" +valor);
		System.out.println("ISBN:" +isbn);
		if (this.temAutor()) {
			autor.mostrarDetalhes();
			}
			
	System.out.println("-------");
		
	}
	public boolean aplicaDescontoDe(double porcentagem) {
		valor -= valor * porcentagem;
		if (porcentagem > 0.3) {
			System.out.println("Desconto não pode ser"+
			"maior do que 30%");
			
			this.valor -= this.valor * porcentagem;
			}
		return false;
		}
	void adicionaValor(double valor) {
		this.valor = valor;
	}	
	

	double retornaValor() {
		return this.valor;
		}
	

}
