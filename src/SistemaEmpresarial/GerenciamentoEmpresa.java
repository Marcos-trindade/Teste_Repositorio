
package SistemaEmpresarial;

import SistemaEmpresarial.Empresa;
import SistemaEmpresarial.Funcionario;
import java.util.ArrayList;


public class GerenciamentoEmpresa {
    
    public static void main(String[] args) {
       
        
        ArrayList<Empresa> nomeEmpresa = new ArrayList<Empresa>();
        
        Empresa emp = new Empresa();
        Empresa emp2 = new Empresa();
        
        nomeEmpresa.add(emp);
        nomeEmpresa.add(emp2);
       
        emp.setNomeEmpresa("Microsot");
        emp2.setNomeEmpresa("Linux");
      
        for (Empresa empresa : nomeEmpresa){
            
         System.out.println ("Nome da Empresa:" + empresa.getNomeEmpresa ());
        }
    }
    
    
}
