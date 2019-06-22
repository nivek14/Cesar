package instruções2operandos;

public class teste {

public static void main(String[] args) {
		
		Add add = new Add();
		Sub sub = new Sub();
		Mov mov = new Mov();
		Or or = new Or();
		And and = new And();
		Cmp cmp = new Cmp();
		
		System.out.println("Add: " + add.ConstruirInstrucaoBinaria());
		System.out.println("Sub: " + sub.ConstruirInstrucaoBinaria());
		System.out.println("Mov: " + mov.ConstruirInstrucaoBinaria());
		System.out.println("Or:  " + or.ConstruirInstrucaoBinaria());
		System.out.println("And: " + and.ConstruirInstrucaoBinaria());
		System.out.println("Cmp: " + cmp.ConstruirInstrucaoBinaria());
		
	}
	
}
