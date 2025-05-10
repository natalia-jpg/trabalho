package trabalho2;
import java.util.logging.Logger;
import java.util.logging.Level;
public class main {
	    private static final Logger logger = Logger.getLogger(main.class.getName());

	    public static void main(String[] args) {
	        logger.info("Iniciando o programa...");

	        Animal meuCachorro = new Cachorro("Thor");

	        meuCachorro.emitirSom();

	        logger.info("Programa finalizado.");
	    }
	}