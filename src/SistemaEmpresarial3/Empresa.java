package SistemaEmpresarial3;

/**
 *
 * @author Gustavo e Marcos
 */
public class Empresa {

    public String nomeEmpresa;
    public String cnpj;

    //metodos construtores
    public Empresa(String texto) {

        System.out.println("Empresa" + texto + " criada!");

    }

    public Empresa(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.nomeEmpresa = NomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void apresentarDados() {
	System.out.println("\tEmpresa:");
        System.out.println("\tNome:" + this.nomeEmpresa);
	System.out.println("\tCNPJ:" + this.cnpj);
	
	}
    
    @Override
	public String toString() {
		return "Empresa [Nome=" + nomeEmpresa + "/n CNPJ=" + cnpj + "]";
	}

}
