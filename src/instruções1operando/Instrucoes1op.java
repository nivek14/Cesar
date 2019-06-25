package instruções1operando;

import endereçamento.ModosDeEnderecamento;

public abstract class Instrucoes1op extends ModosDeEnderecamento{

	// bits referentes ao MODO DE ENDEREÇAMENTO
	public String mmm;
		
	// bits referentes ao registrador usado na instrução
	public String rrr;
		
	// bits referentes ao código especifico das instruções
	public String c;
		
	// bits que podem possuir qualquer valor
	public String x1;
	public String x2;
	
	// pegar os primeiros 4 bits da instução
	public String first4bits;

	public Instrucoes1op() {
		mmm = super.BitsModoDeEnderecamento(); // gera o endereçamento da instrução
		rrr = "";
		x1 = "";
		x2 = "";
		first4bits = "1000";
	}
	
	public abstract String ConstruirInstrucaoBinaria();
	
	// fazer lógica dos registradores 
	// terminar tabela de simbolos
}
