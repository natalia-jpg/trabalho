package trabalho2;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Cachorro extends Animal {
	    private static final Logger logger = Logger.getLogger(Cachorro.class.getName());

	    public Cachorro(String nome) {
	        super(nome);
	        logger.info("Cachorro criado: " + nome);
	    }

	    @Override
	    public void emitirSom() {
	        logger.info("Cachorro fazendo som");
	        System.out.println(getNome() + " faz: Au Au!");
	    }
	}

