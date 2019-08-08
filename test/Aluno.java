
import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int idade;
	private int matricula;

	//um aluno tem um endereço.
	//private Endereco endereco;

	//Associação de varios veiculo
	private ArrayList <Veiculo> veiculos = new ArrayList <Veiculo>();
	
	//Método construtor.
	public Aluno(String nome, int idade, int matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}

	
	//Métodos de acesso
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getNome(){
		return this.nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void apresentarDados(){
		System.out.println("Nome: " + nome);
		if(nome.equals("Paulo")){
			System.out.println("Blalala");
		}
		System.out.println("Idade: " + idade);
		System.out.println("Matricula: " + matricula);
	}

	private String toStringVeiculos () {
		String veiculoString = "";
		for (Veiculo v : veiculos) {
			veiculoString = veiculoString.concat(v.toString () + "\n");
			
		}
		return veiculoString;
		
	}
		
	@Override
	public String toString() {
		return "Nome do Aluno: " + nome + " \nIdade: " + idade + " \nMatricula: " + matricula + " \nEndereco:" + endereco + "\nVeiculos:" + this.toStringVeiculos();
	}
	
	public boolean incluirVeiculo (Veiculo veiculo) {
		veiculos.add(veiculo);
		return true;
		
	}
	
	
}
