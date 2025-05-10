package trabalho2;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Animal {
	    private static final Logger logger = Logger.getLogger(Animal.class.getName());

	    private String nome;

	    public Animal(String nome) {
	        this.nome = nome;
	        logger.info("Animal: " + nome);
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void emitirSom() {
	        logger.info("fazendo qualquer genérico");
	        System.out.println("qualquer som de animal");
	    }
	}




