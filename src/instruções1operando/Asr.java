package instruções1operando;

public class Asr  extends Instrucoes1op{
	
	public Asr() {
		super();
		c = "1000";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		int val1 = (int) (Math.random() * 1);
		int val2 = (int) (Math.random() * 1);
		
		x1 = Integer.toString(val1);
		x2 = Integer.toString(val2);
		
		instrucao = first4bits + c + x1 + x2 + mmm;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
			
	}

}
