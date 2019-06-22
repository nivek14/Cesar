package instruções2operandos;

public class Mov extends Instrucoes2op{
	
	public Mov() {
		super();
		first4bits = "1001";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}
	
}
