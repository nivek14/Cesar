package instruções2operandos;

public class Add extends Instrucoes2op{

	public Add() {
		super();
		first4bits = "1010";
		//this.aux = new BancoDeRegistradores();
	    //this.r_destino = destino;
	    //this.r_fonte = fonte;
	}
	
	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		instrucao = first4bits + mmm1 + mmm2;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}
	
	/*public void operacao(){
        aux.insereRegUsoGeral(r_destino, r_fonte);
    }

    public int getR_destino() {
        return r_destino;
    }

    public void setR_destino(int r_destino) {
        r_destino = r_destino;
    }

    public int getR_fonte() {
        return r_fonte;
    }

    public void setR_fonte(int r_fonte) {
        r_fonte = r_fonte;
    }*/
    
	
}
