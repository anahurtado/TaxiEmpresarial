package pe.edu.upc.dsd.taxiempresarial.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import pe.edu.upc.dsd.taxiempresarial.model.Servicio;

@WebService(endpointInterface = "pe.edu.upc.dew.txiseguro.service.ServicioTaxi")
public class ServicioTaxiImpl implements ServicioTaxi {

	public List<Servicio> obtenerDisponibilidadServicios() {
		List<Servicio> lista = new ArrayList<Servicio>();
        
		return lista;
	}
}
