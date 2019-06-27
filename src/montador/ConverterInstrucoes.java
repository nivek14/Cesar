package montador;

import java.util.ArrayList;

public class ConverterInstrucoes {
	
	public ArrayList<String> instrucoes = new ArrayList<String>();
	
	public ConverterInstrucoes(ArrayList<String> instrucoes) {
		this.instrucoes = instrucoes;
	}
	
	public void VerificaArray() {
		System.out.print(instrucoes);
		System.out.printf("passado com sucesso classe de conversão\n");
	}

}
