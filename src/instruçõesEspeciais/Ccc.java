package instruçõesEspeciais;

public class Ccc extends InstrucoesEspeciais{

	public Ccc() {
		this.first4bits = "0001";
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		int val1 = (int) (Math.random() * 1);
		int val2 = (int) (Math.random() * 1);
		int val3 = (int) (Math.random() * 1);
		int val4 = (int) (Math.random() * 1);
		
		c = Integer.toString(val1);
		v = Integer.toString(val2);
		z = Integer.toString(val3);
		n = Integer.toString(val4);
		
		instrucao = first4bits + n + z + v + c;
		
		return instrucao;
		
	}

}
