package instruçõesEspeciais;

import java.util.ArrayList;

import endereçamento.ModosDeEnderecamento;

public class Jsr extends ModosDeEnderecamento{

	public String first4bits;
	public String mmm;
	public String rrr1;
	public String rrr2;
	public String x;
	public String xaux;
	public ArrayList<String> x1 = new ArrayList<String>();
	
	
	public Jsr() {
		this.first4bits = "0110";
		this.mmm = super.BitsModoDeEnderecamento(); // gera o endereçamento da instrução
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		int val;
		int val1 = (int) (Math.random() * 1);
		
		x = Integer.toString(val1);
		
		for(int i=0;i<2;i++) {
			val = (int) (Math.random() * 1);
			xaux = Integer.toString(val);
			x1.add(xaux);
		}
		
		instrucao = first4bits + x + rrr1 + x1 + mmm + rrr2;
		
		return instrucao;
		
		
	}
	
}
