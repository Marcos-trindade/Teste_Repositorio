
package SistemaEmpresarial2;


public class GerenciamentoEmpresa {

	public static void main ( String [] arg) {
	
	Empresa empresa = new Empresa ("Maicrosofiti", "3347774/0001");
	Funcionario funcionario = new Funcionario ("João Paulo", "Despacho", 2000f, "17/02/1999", "controlador");
	
        Empresa empresa1 = new Empresa ("Linuqce", "3347774/0001");
	Funcionario funcionario1 = new Funcionario ("Clauido", "Oficina", 3000f, "17/02/1989", "Mecãnico");
        
	
	System.out.println(empresa);
	System.out.println(funcionario);
        System.out.println(empresa1);
	System.out.println(funcionario1);
	}	
	

}

    
