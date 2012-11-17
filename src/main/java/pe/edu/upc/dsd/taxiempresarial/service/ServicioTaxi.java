package pe.edu.upc.dsd.taxiempresarial.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import pe.edu.upc.dsd.taxiempresarial.model.Servicio;

@WebService
public interface ServicioTaxi {

    @WebResult(name="servicios")
    List<Servicio> obtenerDisponibilidadServicios();
}
