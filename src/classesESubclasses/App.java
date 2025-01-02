package classesESubclasses;

public class App {

	public static void main(String[] args) {

		 // Criando uma Pessoa Jurídica
        PJ empresa = new PJ("Puppies Store", "12.345.678/0001-00");
        PF Mariana = new PF("Mariana", "123");

        // Exibindo os dados
        empresa.exibirDados(); // Saída: Nome: Puppies Store, CNPJ: 12.345.678/0001-00
        Mariana.exibirDados();	}

}
