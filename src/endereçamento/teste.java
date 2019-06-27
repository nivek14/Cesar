package endereçamento;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {
		
		 
		// Acrescentei:
        
        // Deve retornar o codigo de modo endereçamento Registrador: 000
        IdentificaModoDeEnderecamento ident = new IdentificaModoDeEnderecamento();
        ArrayList<String> aux = new ArrayList<String>();
        
        aux.add("MOV R0 R1");
        aux.add("ADD (R2)+ (R3)+");
        aux.add("SUB -(R2) -(R3)");
        aux.add("BNE ddd(R4) ddd(R5)");
        aux.add("BEQ (R2)");
        aux.add("NOT (-(R5))");
        aux.add("AND (ddd(R0))");
        aux.add("MOV #100");
        
        ident.identificaModo(aux);
        ident.mostraBits();
        
    }
    
}
	

