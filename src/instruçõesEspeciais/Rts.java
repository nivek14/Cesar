package instruçõesEspeciais;

public class Rts extends InstrucoesEspeciais{
	
	public Rts() {
		this.first4bits = "0111";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		int val = (int) (Math.random() * 1);
		
		x = Integer.toString(val);
		
		instrucao = first4bits + x + rrr;
		
		return instrucao;
		
		
	}
	
}
