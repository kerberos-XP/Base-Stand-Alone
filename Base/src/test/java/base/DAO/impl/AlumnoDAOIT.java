/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.DAO.impl;

import base.modelo.Alumno;
import base.validacion.ResultadoMetodo;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omar
 */
public class AlumnoDAOIT {
    
    public AlumnoDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAlumno method, of class AlumnoDAO.
     */
    @Test
    public void testGetAlumno() {
        System.out.println("getAlumno");
        AlumnoDAO instance = null;
        List<Alumno> expResult = null;
        List<Alumno> result = instance.getAlumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class AlumnoDAO.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Alumno alumno = null;
        AlumnoDAO instance = null;
        ResultadoMetodo expResult = null;
        ResultadoMetodo result = instance.insertar(alumno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class AlumnoDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Alumno alumno = null;
        AlumnoDAO instance = null;
        ResultadoMetodo expResult = null;
        ResultadoMetodo result = instance.actualizar(alumno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class AlumnoDAO.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Alumno alumno = null;
        AlumnoDAO instance = null;
        ResultadoMetodo expResult = null;
        ResultadoMetodo result = instance.eliminar(alumno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
