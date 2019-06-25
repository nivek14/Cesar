package instruçõesDesvio;

public class Bpl extends InstrucoesDesvio{

	public Bpl() {
		super();
		c = "0011";
	}
	
	public void Deslocamento() {
		
		/*eslocamento que é somado ao
		registrador R7, em complemento de dois, se o desvio for realizado, ou seja, se a
		condição testada pela instrução for verdadeira*/
		
	}

	public String ConstruirInstrucaoBinaria() {
		
		String instrucao;
		
		instrucao = first4bits + c + d;	// concatena tudo para formar a instrução em binário
					
		return instrucao;
		
	}

}
