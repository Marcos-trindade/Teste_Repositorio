package SistemaEmpresarial2;

import java.util.Date;

public class Funcionario {

    public String nomeFunc;
    public String departamento;
    public float salario;
    public String datAdmissao;
    public String cargo;

    public Funcionario (String nomeFunc, String departamento, float salario, String datAdmissao, String cargo){
        this.nomeFunc = nomeFunc;
        this.departamento = departamento;
        this.salario = salario;
        this.datAdmissao = datAdmissao;
        this.cargo = cargo;
        
    }
    
    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDatAdmissao() {
        return datAdmissao;
    }

    public void setDatAdmissao(String datAdmissao) {
        this.datAdmissao = datAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
	public String toString() {
		return "Nome:" + nomeFunc + "\nDepartamento:" + departamento +
                        "\nSalário:" + salario + "\nData de admissão:" + datAdmissao +
                        "\nCargo:" + cargo + "\n\n";
	}


}
