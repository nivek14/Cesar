package instruções2operandos;

public class Cmp extends Instrucoes2op{
	
	public Cmp() {
		super();
		first4bits = "1100";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao; 
		
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}
	
}
