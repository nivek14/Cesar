package instruções2operandos;

public class Or extends Instrucoes2op{
	
	public Or() {
		super();
		first4bits = "1110";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}
	
}
