package instruções2operandos;

import endereçamento.ModosDeEnderecamento;

public abstract class Instrucoes2op extends ModosDeEnderecamento{
	
	/*
	 * instruções de dois operandos irão possuir um tipo de endereçamento para o primeiro operando
	 * e para o segundo operando, no caso mmm1 para o primeiro e mmm2 para o segundo.
	 */
	public String mmm1;
	public String mmm2;
	
	/*
	 * instruções de dois operandos irão possuir dois registradores em sua operação, no caso
	 * rrr1 para o primeiro registrador e rrr2 para o segundo registrador
	 */
	public String rrr1;
	public String rrr2;
	
	// 4 primeiros bits que identificam a instrução
	public String first4bits;
	
	//private BancoDeRegistradores aux;
	
	//private int r_destino;
	
	//private int r_fonte;
	
	
	public Instrucoes2op(){
		mmm1 = super.BitsModoDeEnderecamento();	// pega os bits do endereçamento do primeiro operando
		mmm2 = super.BitsModoDeEnderecamento();	// pega os bits do endereçamento do segundo operando 
		rrr1 = "";
		rrr2 = "";	
	}

	public abstract String ConstruirInstrucaoBinaria();
	
	public abstract void operacao();
     
    public abstract int getR_destino();
 
    public abstract void setR_destino(int r_destino);

    public abstract int getR_fonte();

    public abstract void setR_fonte(int r_fonte);
    
		

}
