package SistemaEmpresarial2;

import java.util.Date;

public class Funcionario {

    public String nomeFunc;
    public String departamento;
    public float salario;
    public Date admissao;
    public String cargo;

    public Funcionario (String nomeFunc, String departamento, float salario, Date admissao, String cargo){
        this.nomeFunc = nomeFunc;
        this.departamento = departamento;
        this.salario = salario;
        this.admissao = admissao;
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

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
	public String toString() {
		return "Funcionário [Nome do Funcionário:" + nomeFunc + "\nDepartamento:" + departamento +
                        "\nSalário:" + salario + "\nData de admissão:" + admissao +
                        "\nCargo:" + cargo + "]";
	}


}
