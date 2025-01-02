package classesESubclasses;

//subclasse pessoa física
public class PF extends Pessoa {
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
    // Construtor
	public PF(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public void exibirDados() {
        System.out.println("Nome: " + getNome() + ", CPF: " + cpf);
    }


	
}
