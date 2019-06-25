package instruçõesEspeciais;

import java.util.ArrayList;

import endereçamento.ModosDeEnderecamento;

public class Jmp extends ModosDeEnderecamento{
	
	public String first4bits;
	public ArrayList<String> xx = new ArrayList<String>();
	public String xaux;
	public String mmm;
	public String rrr;
	
	public Jmp() {
		this.first4bits = "0100";
		mmm = super.BitsModoDeEnderecamento(); // gera o endereçamento da instrução
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		int val;
		
		for(int i=0;i<6;i++) {
			val = (int) (Math.random() * 1);
			xaux = Integer.toString(val);
			xx.add(xaux);
		}
		
		instrucao = first4bits + xx + mmm + rrr;
		
		return instrucao;
		
		
	}
	
	

}
