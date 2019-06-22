package instruções2operandos;

public class Sub extends Instrucoes2op{
	
	public Sub() {
		super();
		first4bits = "1011";
	}
		
	public String ConstruirInstrucaoBinaria() {
			
		String instrucao;
			
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
						
		return instrucao;
			
	}

}
