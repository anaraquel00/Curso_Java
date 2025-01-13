package Livro;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
  public static void main(String[] args) {
		      try (FileWriter writer = new FileWriter("example.txt")) {
		            writer.write("Testando o FileWriter.");
		        } catch (IOException e) {
		            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		        }
		    }
		


	}


