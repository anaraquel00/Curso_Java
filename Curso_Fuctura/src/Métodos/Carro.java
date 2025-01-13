package Métodos;

public class Carro {
// Projeto automovel em construçao!
// Adiciona os dados do carro;
// Adiçao de métodos e atributos para o carro;
	String definicao="veiculo que se move sob rodas";
	private String modelo;
    private int ano;
    private String cor;
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        }
     // Métodos getters e setters
        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        // Sobrescreve o método toString para uma saída legível
        @Override
        public String toString() {
            return "Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor;
        
    }
    }
	/*
	 * String cor ="branco"; int ano=-1; String modelo="Byd";
	 */
	

	
	


