package Livro;

public class Livro implements Publicaçao{
private String titulo;
private String autor;
private int totalDePaginas;
private int pagAtual;
private boolean aberto;
private Pessoa leitor;


public String detalhes() {
	return "Livro [titulo=" + titulo + ",\n"
			+ " autor=" + autor + ",\n totalDePaginas="
			+ totalDePaginas + ", pagAtual="
			+ pagAtual + ", aberto=" + aberto + ",\n "
			+ "leitor=" + leitor.getNome() + 
			" idade: "+leitor.getIdade()
			+" sexo: "+leitor.getSexo()+" ]";
}

public Livro(String titulo, String autor, int totalDePaginas, int pagAtual, boolean aberto, Pessoa leitor) {
	
	this.titulo = titulo;
	this.autor = autor;
	this.totalDePaginas = totalDePaginas;
	this.aberto=false;
	this.pagAtual=0;
	this.leitor = leitor;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public int getTotalDePaginas() {
	return totalDePaginas;
}

public void setTotalDePaginas(int totalDePaginas) {
	this.totalDePaginas = totalDePaginas;
}

public int getPagAtual() {
	return pagAtual;
}

public void setPagAtual(int pagAtual) {
	this.pagAtual = pagAtual;
}

public boolean Aberto() {
	return aberto;
}

public void setAberto(boolean aberto) {
	this.aberto = aberto;
}

public Pessoa getLeitor() {
	return leitor;
}

public void setLeitor(Pessoa leitor) {
	this.leitor = leitor;
}

@Override
public void abrir() {
	this.aberto=true;
	
}

@Override
public void fechar() {
	this.aberto=false;
	
}

@Override
public void folhear(int p) {
this.pagAtual=p;
	
}

@Override
public void avancarPag() {
this.pagAtual++;	
	
}

@Override
public void voltarPag() {
this.pagAtual--;	
	
}


}
