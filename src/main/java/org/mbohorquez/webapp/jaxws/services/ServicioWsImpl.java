package org.mbohorquez.webapp.jaxws.services;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.mbohorquez.webapp.jaxws.models.Curso;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface="org.mbohorquez.webapp.jaxws.services.ServicioWs")
public class ServicioWsImpl implements ServicioWs {

    private int contador;

    @Override
    @WebMethod
    public String saludar(String persona) {
        System.out.println("Imprimiendo dentro del servicio web con instancia: " + this);
        contador++;
        System.out.println("Valor del contador en método saludar es: " + contador);
        return "Hola que tal " + persona;
    }

    @Override
    @WebMethod
    public List<Curso> listar() {
        return Arrays.asList(new Curso("java"),
                new Curso("spring"),
                new Curso("jakarta ee"));
    }

    @Override
    @WebMethod
    public Curso crear(Curso curso) {
        System.out.println("Curso guardado con éxito ... " + curso.getNombre());
        Curso nuevoCurso = new Curso();
        nuevoCurso.setNombre(curso.getNombre());
        return nuevoCurso;
    }
}
