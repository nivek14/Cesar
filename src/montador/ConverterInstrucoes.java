package montador;

import endereçamento.IdentificaModoDeEnderecamento;

import java.util.ArrayList;

public class ConverterInstrucoes {
	
	public ArrayList<String> instrucoes = new ArrayList<String>();
	public IdentificaModoDeEnderecamento indentifica;
	
	public ConverterInstrucoes(ArrayList<String> instrucoes) {
		this.instrucoes = instrucoes;
		this.indentifica = new IdentificaModoDeEnderecamento();
	}
	
	public void VerificaArray() {
		System.out.print(instrucoes);
		System.out.printf("passado com sucesso classe de conversão\n");
	}
	
	public void VerificaBitsEnderecamento() {
		indentifica.identificaModo(instrucoes);
		indentifica.mostraBits();
	}
	


}
