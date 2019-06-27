package instruçõesEspeciais;

public class Hlt extends InstrucoesEspeciais{
	
	public Hlt() {
		this.first4bits = "1111";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		int val;
		
		for(int i=0;i<4;i++) {
			val = (int) (Math.random() * 1);
			xaux = Integer.toString(val);
			xx.add(xaux);
		}
		
		instrucao = first4bits + xx;
		
		return instrucao;
		
		
	}
	
	
}
