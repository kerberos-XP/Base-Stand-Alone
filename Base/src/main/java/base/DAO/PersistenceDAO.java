/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.DAO;

/**
 *
 * @author itorres
 */
public interface PersistenceDAO {

    void insertar(Object object);

    Object actualizar(Object object);

    void eliminar(Object object);
}
