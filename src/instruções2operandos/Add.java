package instruções2operandos;

public class Add extends Instrucoes2op{

	public Add() {
		super();
		first4bits = "1010";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}
}
