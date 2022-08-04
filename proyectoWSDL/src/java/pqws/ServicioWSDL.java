/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Eliezer
 */
@WebService(serviceName = "ServicioWSDL")
public class ServicioWSDL {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    //Nuevo parametro en webService para WSDL
    @WebMethod(operationName = "mostrarTarea")
    public String mostrarSaludo(@WebParam(name = "nombre") String nombre) {
        return "Bienvenido" + nombre;
    }
}
