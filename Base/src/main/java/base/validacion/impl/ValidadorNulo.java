package base.validacion.impl;

import base.validacion.ResultadoMetodo;
import base.validacion.Validador;

/**
 * Valida si objeto es nulo.
 *
 * @author Cristián Alarcón de la Maza
 */
public class ValidadorNulo implements Validador {

    private ValidadorNulo() {
    }

    public static ResultadoMetodo aplicar(Object valor) {
        return new ValidadorNulo().validar(valor);
    }

    @Override
    public ResultadoMetodo validar(Object object) {
        if (object != null) {
            return ResultadoMetodoImpl.setSinError();
        } else {
            return ResultadoMetodoImpl.setError("Valor Nulo");
        }
    }

}
