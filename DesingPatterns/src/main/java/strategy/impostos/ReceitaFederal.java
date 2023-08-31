package strategy.impostos;

import java.util.List;

/**
 * Esta classe representa a Receita Federal, responsável por fornecer uma lista de impostos vigentes.
 *
 * Permite a obtenção de uma lista contendo os impostos tributáveis vigentes.
 *
 * @author Luis Fillype VIlela Cunha
 * @version 1.0
 */
public class ReceitaFederal {

    /**
     * Retorna uma lista de impostos tributáveis vigentes, incluindo ImpostoISS, ImpostoICMS e ImpostoIVA.
     *
     * @return Uma lista contendo os impostos tributáveis vigentes.
     */
    public List<Tributavel> buscarListaImpostosVigentes(){
        return List.of(
                new ImpostoISS(),
                new ImpostoICMS(),
                new ImpostoIVA()
        );
    }
}
