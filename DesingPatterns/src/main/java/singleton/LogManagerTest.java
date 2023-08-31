package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Esta classe contém testes unitários para a classe LogManager,
 * verificando a implementação do padrão Singleton.
 *
 * Verifica se múltiplas chamadas para getInstance() retornam a mesma referência.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class LogManagerTest {

    /**
     * Testa se duas instâncias do LogManager retornam a mesma referência ao chamar getInstance().
     */
    @Test
    void dada2Instancias_quandoGetInstance_entaoSeraAMesmaReferencia() {
        LogManager instance1 = LogManager.getInstance();
        assertNotNull(instance1);
        LogManager instance2 = LogManager.getInstance();
        assertNotNull(instance2);
        assertEquals(instance1, instance2);
    }
}
