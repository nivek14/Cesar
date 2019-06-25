package instruçõesEspeciais;

public class Sob extends InstrucoesEspeciais{

	public Sob() {
		this.first4bits = "0101";
	}
	
	public void Deslocamento() {
		
		
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		int val;
		
		val = (int) (Math.random() * 1);
		x = Integer.toString(val);
		
		instrucao = first4bits + x + rrr + d;
		
		return instrucao;
		
		
	}
	
	
}
