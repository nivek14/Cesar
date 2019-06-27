package montador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Montador {
	
	public LerArquivo file;	
	public ConverterInstrucoes converte;	// objeto usado para fazer a conversão das instruções
	public ArrayList<String> instrucoes = new ArrayList<String>();	// array que contém as instruções mnemonicas
	
	// passa o caminho do arquivo que vai ser lido com as instruções mnmonicas
	public Montador() {
		this.file  = new LerArquivo("/home/nivek/Área de Trabalho/Cesar/src/Fibonacci.txt");
	}
	
	// le o arquivo com as instruções mnemonicas
	public void LerArquivoMnemonio() throws FileNotFoundException, IOException {
		instrucoes = file.lerArquivo();
	}
	
	// printa o arquivo com as instruções mnemonicas
	public void ArquivoMnemonios() {
		 file.mostrarLinhas();
	}
	
	public void PassaArquivoMnemonio() {
		converte = new ConverterInstrucoes(instrucoes);
	}
	
	// apenas para verificar se o array com as instruções em mnemonios está correto
	public void Print() {
		System.out.print(instrucoes);
	}
	
	public void PrintVetorPassado() {
		converte.VerificaArray();
	}
	
	

}
