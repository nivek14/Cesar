package instruções2operandos;

public class And extends Instrucoes2op{
	
	public And() {
		super();
		first4bits = "1101";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}
	
}
