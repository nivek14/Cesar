package montador;

import java.io.FileNotFoundException;
import java.io.IOException;

public class teste {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Montador mont = new Montador();
		//LerArquivo ler = new LerArquivo("/home/nivek/Área de Trabalho/Cesar/src/teste.txt");
		
		mont.LerArquivoMnemonio();
		mont.ArquivoMnemonios();
		//mont.Print();
		System.out.printf("\n");
		mont.PassaArquivoMnemonio();
		//mont.PrintVetorPassado();
		System.out.printf("\n");
		mont.RetornaBitsEnderecamento();
		mont.RetornaBitsInstrucoes();
		mont.RetornaBitsRegistradores();
		//mont.Instrucao();
		
		
		//ler.lerArquivo();
		//ler.mostrarLinhas();
		
		
	}	

}
