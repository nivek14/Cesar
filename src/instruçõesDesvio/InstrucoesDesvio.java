package instruçõesDesvio;

import endereçamento.ModosDeEnderecamento;

public abstract class InstrucoesDesvio extends ModosDeEnderecamento{
	
	// bits referentes ao código especifico das instruções
	public String c;
	
	public String first4bits;
	
	// deslocamentos
	public String d;
	
	public InstrucoesDesvio() {
		this.first4bits = "0011";
	}
	
	public abstract void Deslocamento();
	
	public abstract String ConstruirInstrucaoBinaria();
		

}
