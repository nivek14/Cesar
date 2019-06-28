package montador;

import java.util.ArrayList;
import Registradores.Simbolo;
import Registradores.TratarBitsRegistradores;
import endereçamento.IdentificaModoDeEnderecamento;

public class ConverterInstrucoes {
	
	public ArrayList<String> instrucoes = new ArrayList<String>();
	public IdentificaModoDeEnderecamento indentifica;
	public Tim codigoInstrucoes;
	public Simbolo[] simbolos = null;
	public TratarBitsRegistradores registrador;
	public ArrayList<String>bitsEnderecamento = new ArrayList<String>();
	public ArrayList<String>bitsInstrucao = new ArrayList<String>();
	public ArrayList<String>codigoBinario = new ArrayList<String>();
	public ArrayList<String>bitsRegistradores = new ArrayList<String>();
	public ArrayList<String>aux = new ArrayList<String>();
	
	public ConverterInstrucoes(ArrayList<String> instrucoes) {
		this.instrucoes = instrucoes;
		this.indentifica = new IdentificaModoDeEnderecamento();
		this.codigoInstrucoes = new Tim();
		this.registrador = new TratarBitsRegistradores(instrucoes);
	}
	
	// metodo que só é usado para testes 
	public void VerificaArray() {
		System.out.print(instrucoes);
		System.out.printf("passado com sucesso classe de conversão\n");
	}
	
	// pega os bits de endereçamento
	public void VerificaBitsEnderecamento() {
		bitsEnderecamento = indentifica.identificaModo(instrucoes);
		//indentifica.mostraBits();
		System.out.println(bitsEnderecamento);
		//System.out.println();
	}
	
	// pega os bits de instruções 
	public void VerificaBitsInstrucoes() {
		bitsInstrucao = codigoInstrucoes.procurarBits(instrucoes);
		//codigoInstrucoes.verificarBits();
		System.out.println(bitsInstrucao);
		//System.out.println();
	}
	
	// pega os bits dos registradores
	public void VerificaBitsRegistradores() {
		
		int i;
		
		simbolos = registrador.bitsRegistradores();
		
		for(i=0;i<simbolos.length;i++) {
			aux = simbolos[i].pegaBits();
			bitsRegistradores.add(aux.get(i));
		}
		
		System.out.println(bitsRegistradores); 
		
	}
	
	// monta as instruções
	public void InstrucaoMontada() {
		
		int i,val1,val2,val3,val4;
		String x1,x2,x3,x4;
		
		System.out.println(instrucoes.size()); 
		
		for(i=0;i<instrucoes.size();i++) {
			
			// Montando pra 2 operandos
			if(bitsInstrucao.get(i).equals("1001") || bitsInstrucao.get(i).equals("1010") ||
			   bitsInstrucao.get(i).equals("1011") || bitsInstrucao.get(i).equals("1100")||
			   bitsInstrucao.get(i).equals("1101") || bitsInstrucao.get(i).equals("1110")){
					codigoBinario.add(bitsInstrucao.get(i) + bitsEnderecamento.get(i));
			}
			
			// Montando pra 1 operando
			else if(bitsInstrucao.get(i).substring(0, 4) == "1000"){
				
				val1 = (int) (Math.random() * 1);
				val2 = (int) (Math.random() * 1);
				
				x1 = Integer.toString(val1);
				x2 = Integer.toString(val2);
		
				codigoBinario.add(bitsInstrucao.get(i) + x1 + x2 + bitsEnderecamento.get(i));
				
			}
			
			// Montando para Instruções de desvio condicional
			else if(bitsInstrucao.get(i).substring(0, 4) == "0011") {
				codigoBinario.add(bitsInstrucao.get(i) + bitsEnderecamento.get(i));
			}
			
			// para intruções NOP
			else if(bitsInstrucao.get(i) == "0000") {
				
				val1 = (int) (Math.random() * 1);
				val2 = (int) (Math.random() * 1);
				val3 = (int) (Math.random() * 1);
				val4 = (int) (Math.random() * 1);
				
				x1 = Integer.toString(val1);
				x2 = Integer.toString(val2);
				x3 = Integer.toString(val3);
				x4 = Integer.toString(val4);
				
				codigoBinario.add(bitsInstrucao.get(i) + x1 + x2 + x3 + x4);
				
			}
			
			// para instruções HLT
			else if(bitsInstrucao.get(i) == "1111") {
				
				val1 = (int) (Math.random() * 1);
				val2 = (int) (Math.random() * 1);
				val3 = (int) (Math.random() * 1);
				val4 = (int) (Math.random() * 1);
				
				x1 = Integer.toString(val1);
				x2 = Integer.toString(val2);
				x3 = Integer.toString(val3);
				x4 = Integer.toString(val4);
				
				codigoBinario.add(bitsInstrucao.get(i) + x1 + x2 + x3 + x4);
				
			}
			
		}
			
		for(i=0;i<instrucoes.size();i++) {
			System.out.printf("%s\n",codigoBinario.get(i)); 
		}
		
		System.out.printf("%d\n", i); 
		
	}


}
