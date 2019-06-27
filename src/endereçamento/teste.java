package endereçamento;


public class teste {

	public static void main(String[] args) {
		
		 
		        // Acrescentei:
		                
		        // Deve retornar o codigo de modo endereçamento Registrador: 000
		        IdentificaModoDeEnderecamento ident = new IdentificaModoDeEnderecamento();
		        System.out.println(ident.identificaModo("MOV R0 R1"));
		        System.out.println(ident.identificaModo("ADD (R2)+ (R3)+"));
		        System.out.println(ident.identificaModo("SUB -(R2) -(R3)"));
		        System.out.println(ident.identificaModo("BNE ddd(R4) ddd(R5)"));
		        System.out.println(ident.identificaModo("BEQ (R2)"));
		        System.out.println(ident.identificaModo("ADD ((R3)+)"));
		        System.out.println(ident.identificaModo("NOT (-(R5))"));
		        System.out.println(ident.identificaModo("AND (ddd(R0))"));
		    }
	
}
	

