package endereçamento;

import java.util.ArrayList;
import java.util.Collections;

public class ModosDeEnderecamento {
	
	private String reg;	// modo de endereçamento registrador
	private String rpi;	// modo de endereçamento registrador pós-incrementado
	private String rpd;	// modo de endereçamento registrador pré-incrementado
	private String inx;	// modo de endereçamento indexado
	private String ind;	// modo de endereçamento registrador indireto
	private String pii;	// modo de endereçamento pós-incrementado indireto
	private String pdi;	// modo de endereçamento pré-decrementado indireto
	private String ixi;	// modo de endereçamento indexado indireto
	private ArrayList<String> tipoEnd = new ArrayList<String>();
	
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

    // Acrescentei esse getters pra poder pegar o código do modo.
    public String getReg() {
        return reg;
    }

    public String getRpi() {
        return rpi;
    }

    public String getRpd() {
        return rpd;
    }

    public String getInx() {
        return inx;
    }

    public String getInd() {
        return ind;
    }

    public String getPii() {
        return pii;
    }

    public String getPdi() {
        return pdi;
    }

    public String getIxi() {
        return ixi;
    }

    public ArrayList<String> getTipoEnd() {
        return tipoEnd;
    }
        
        

}