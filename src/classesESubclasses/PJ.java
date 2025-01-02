package classesESubclasses;

public class PJ extends Pessoa {
    
	private String cnpj;

    // Construtor
    public PJ(String nome, String cnpj) {
        super(nome); 
        this.cnpj = cnpj; 
    }

    // Getter e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() + ", CNPJ: " + cnpj);
    }
}
