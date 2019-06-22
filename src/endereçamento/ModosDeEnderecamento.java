package endereçamento;

import java.util.ArrayList;
import java.util.Collections;

public class ModosDeEnderecamento {
	
	protected String reg;	// modo de endereçamento registrador
	protected String rpi;	// modo de endereçamento registrador pós-incrementado
	protected String rpd;	// modo de endereçamento registrador pré-incrementado
	protected String inx;	// modo de endereçamento indexado
	protected String ind;	// modo de endereçamento registrador indireto
	protected String pii;	// modo de endereçamento pós-incrementado indireto
	protected String pdi;	// modo de endereçamento pré-decrementado indireto
	protected String ixi;	// modo de endereçamento indexado indireto
	protected ArrayList<String> tipoEnd = new ArrayList<String>();
	
	public ModosDeEnderecamento() {
		this.reg = "000";
		this.rpi = "001";
		this.rpd = "010";
		this.inx = "011";
		this.ind = "100";
		this.pii = "101";
		this.pdi = "110";
		this.ixi = "111";
	}
	
	
	// Gera de forma aleatória a forma de endereçamento da instrução
	public String BitsModoDeEnderecamento() {
		
		int val = (int) (Math.random() * 7);
		
		tipoEnd.add(reg);
		tipoEnd.add(rpi);
		tipoEnd.add(rpd);
		tipoEnd.add(inx);
		tipoEnd.add(ind);
		tipoEnd.add(pii);
		tipoEnd.add(pdi);
		tipoEnd.add(ixi);
		
		//System.out.println(val);
		
		Collections.shuffle(tipoEnd);
		
		return tipoEnd.get(val);
			
	}

}
