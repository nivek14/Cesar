package endereçamento;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import montador.LerArquivo;

public class teste {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		 
		// Acrescentei:
        
        // Deve retornar o codigo de modo endereçamento Registrador: 000
        IdentificaModoDeEnderecamento ident = new IdentificaModoDeEnderecamento();
        ArrayList<String> aux = new ArrayList<String>();
    	LerArquivo file = new LerArquivo("/home/nivek/Área de Trabalho/Cesar/src/Fibonacci.txt");
    	
    	
    	aux = file.lerArquivo();
        
        //System.out.println(aux);
    	
        ident.identificaModo(aux);
        ident.mostraBits();
        
    }
    
}
	

