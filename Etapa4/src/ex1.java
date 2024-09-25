import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ex1 {
	
	// Declaração da Classe Produto
	public static class Produto {
	    String nome; 	// Atributos da Classe
	    double custo;
	    double venda;
	    LocalDate fabricacao;
	    LocalDate validade;

	    // Construtor da Classe Produto que aceita a Validade 
	    public Produto(String nome, double custo, double venda, LocalDate fabricacao, LocalDate validade) {
	        this.nome = nome; // Inicializa o Nome do Produto
	        this.custo = custo; // Inicializa o valor do Custo
	        this.venda = venda;	// Inicializa o valor de Venda
	        this.fabricacao = fabricacao; // Inicializa a data de Fabricação
	        this.validade = validade; // Inicializa a data de Validade
	    }

	 // Construtor da Classe Produto que não aceita a Validade 
	   public Produto(String nome, double custo, double venda, LocalDate fabricacao) {
	        this.nome = nome; // Inicializa o Nome do Produto
	        this.custo = custo; // Inicializa o valor do Custo
	        this.venda = venda; // Inicializa o valor de Venda
	        this.fabricacao = fabricacao; // Inicializa a data de Fabricação
	        this.validade = fabricacao.plus(1, ChronoUnit.MONTHS); // Define que a validade será de 1 mês após a fabricação
	    }
	   
	   // Construtor que aceita apenas o Nome e o Custo
	   public Produto(String nome, double custo) {
	        this.nome = nome; // Inicializa o Nome do Produto
	        this.custo = custo; // Inicializa o valor do Custo
	        this.venda = venda * 1.10; // O preço da venda será 10% maior do que o custo
	        this.fabricacao = LocalDate.now(); // Inicializa a data de Fabricação (Data atual)
	        this.validade = fabricacao.plus(1, ChronoUnit.MONTHS); // Define que a validade será de 1 mês após a fabricação
	    }
	   
	   public void descricao() {
	        System.out.println("Nome: " + nome); // Exibe o Nome
	        System.out.println("Preço de Custo: R$" + custo); // Exibe o Valor do Custo
	        System.out.println("Preço de Venda: R$" + venda); // Exibe o Valor da Venda
	        System.out.println("Data de Fabricação: " + fabricacao); // Exibe a data de Fabricação
	        System.out.println("Data de Validade: " + validade+"\n"); // Exibe a data de Validade
	    }

	    public static void main(String[] args) {
	    	
	    	// Inserção de Parâmetros dos dados do Produto1 com data de Validade
	        Produto produto1 = new Produto("Produto 1", 50.0, 70.0, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 9, 1));
    
	        // Inserção de Parâmetros dos dados do Produto2 sem a data de Validade, que será definida como 1 mês após a fabricação
	        Produto produto2 = new Produto("Produto 2", 40.0, 55.0, LocalDate.of(2024, 9, 1));
	        
	        // Inserção apenas dos Parâmetros Nome e Custo. O valor de Venda e Validade serão calculados
	        Produto produto3 = new Produto("Produto 3", 30.0);
	        
	    	// Chama o método que exibe os dados do Produto1
	        produto1.descricao();
	        
	        // Chama o método que exibe os dados do Produto2
	        produto2.descricao();
	        
	        // Chama o método que exibe os dados do Produto3	        
	        produto3.descricao();
	    }
	}
}