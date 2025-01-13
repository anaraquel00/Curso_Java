package Videos;

public class Gafanhoto extends Pessoa{

public Gafanhoto(String nome, String sexo, int idade,String login) {
super(nome, sexo, idade);
this.login=login;		
this.TotAssistindo=0;	
}
private String login;
private int TotAssistindo;
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public int getTotAssistindo() {
	return TotAssistindo;
}
public void setTotAssistindo(int toAssistindo) {
	this.TotAssistindo = TotAssistindo;
}
@Override
public String toString() {
return "Gafanhoto" +super.toString() + "\n[login=" + login + ","
	+ "TotAssistindo=" + TotAssistindo + "]";
}

	
}
