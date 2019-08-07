
package SistemaEmpresarial2;
import java.util.ArrayList;


public class Empresa {
    public String nomeEmpresa;
    public String cnpj;
    public ArrayList <Funcionario> funcionario = new ArrayList <Funcionario>();

    //abaixo método construtor
    public Empresa(String nomeEmpresa, String cnpj){
       this.nomeEmpresa = nomeEmpresa;
       this.cnpj = cnpj;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
   /* public void apresentarDados(){
		System.out.println("Nome: " + nome);
		if(nome.equals("Paulo")){
			System.out.println("Blalala");
		}
		System.out.println("Idade: " + idade);
		System.out.println("Matricula: " + matricula);
	}*/

	public String toStringFuncionario () {
		String funcionarioString = "";
		for (Funcionario f : funcionario) {
		funcionarioString = funcionarioString.concat(f.toString () + "\n");
			
		}
		return funcionarioString;
		
	}
		
	@Override
	public String toString() {
		return "Nome da Empresa : " + nomeEmpresa + " \nCNPJ: " + cnpj + "\nFuncionário:" + this.toStringFuncionario();
	}
	
	public boolean incluirFuncionario (Funcionario funcionario) {
		funcionario.add(funcionario);
		return true;
		
	}

    }

    
