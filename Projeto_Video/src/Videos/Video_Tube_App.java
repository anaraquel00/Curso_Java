package Videos;

public class Video_Tube_App {
public static void main(String[] args) {
Video v[] = new Video[3];
v[0] = new Video("Aula 1");
v[1] = new Video("Aula 2");
v[2] = new Video("Aula 3");

Gafanhoto g[] = new Gafanhoto[2]; 
g[0]= new Gafanhoto("Rosa", "F", 18, "anpk");
g[1]= new Gafanhoto("Jose", "M", 25, "Jkpq");

Visualizacao vw []= new Visualizacao[5];
vw [0] = new Visualizacao (g[0],v[2]);
vw [1] = new Visualizacao (g[1],v[2]);
vw[0].avaliar();
System.out.println(vw[0].toString());
vw [0] = new Visualizacao (g[0],v[1]);
vw[1].avaliar(87.0f);
System.out.println(vw[1].toString());

/*System.out.println(v[0].toString());
System.out.println(v[1].toString());
System.out.println(v[2].toString());
System.out.println(g[0].toString());
System.out.println(g[1].toString());*/
}
}
