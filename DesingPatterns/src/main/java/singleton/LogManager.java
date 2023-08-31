package singleton;

/**
 * Esta classe implementa um LogManager utilizando o padrão Singleton.
 *
 * Permite o registro de informações, erros e avisos no log do sistema.
 *
 * Implementa um padrão Singleton para garantir a existência de apenas uma instância
 * da classe LogManager.
 *
 * Utiliza métodos como info, error e warm para registrar mensagens no log.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class LogManager {
    private static LogManager instance;

    // Construtor privado para restringir a instanciação externa.
    private LogManager() {}

    /**
     * Obtém a instância única do LogManager.
     *
     * @return A instância única do LogManager.
     */
    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    /**
     * Registra uma mensagem de informação no log.
     *
     * @param msg A mensagem de informação a ser registrada.
     */
    public void info(String msg) {
        System.out.println("Info: " + msg);
    }

    /**
     * Registra uma mensagem de erro no log.
     *
     * @param msg A mensagem de erro a ser registrada.
     */
    public void error(String msg) {
        System.out.println("Error: " + msg);
    }

    /**
     * Registra uma mensagem de aviso no log.
     *
     * @param msg A mensagem de aviso a ser registrada.
     */
    public void warn(String msg) {
        System.out.println("Warning: " + msg);
    }
}
