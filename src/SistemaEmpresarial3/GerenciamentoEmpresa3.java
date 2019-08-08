
package SistemaEmpresarial3;

/**
 *
 * @author Gustavo e Marcos
 */
import SistemaEmpresarial3.Empresa;
import SistemaEmpresarial3.Funcionario;


public class GerenciamentoEmpresa3 {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa empresa1 = new Empresa (" Microsoft");
		Empresa empresa2 = new Empresa (" Linux");
		System.out.println("Empresas criadas");
                
                empresa1.setNomeEmpresa("Microsoft");
                empresa1.setCnpj("20000/00");
                
                empresa2.setNomeEmpresa("Linux");
                empresa2.setCnpj("30000/00");
    
}
}
