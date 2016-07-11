package base.modelo;

import base.tipoDato.Correo;
import base.tipoDato.Fecha;
import base.tipoDato.RUT;
import base.tipoDato.Sexo;
import base.tipoDato.Texto;

/**
 *
 * @author Iván Torres Curinao
 */
public class Alumno extends Usuario {

    public Alumno(RUT rut, Texto nombres, Texto apellidos, Fecha fechaNacimiento,
            Texto telefonoMovil, Correo correo, Sexo sexo) {
        super(
                rut,
                nombres,
                apellidos,
                fechaNacimiento,
                telefonoMovil,
                correo,
                sexo
        );
    }

}
