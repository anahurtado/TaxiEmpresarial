<%@page import="pe.edu.upc.dsd.taxiempresarial.model.Usuario"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.dao.UsuarioDao "%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils "%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core "%>

<%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*,java.sql.Statement" %>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html> <!-- :html lang="true">  -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Realizar Reserva de Taxi - Taxi Empresarial</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="iframe">
            <div id="logo">
                <div class="title">
                    <span class="style2">
                        <h8><strong> Usuario: ${usuario.cod_user} - ${usuario.nombre_user} ${usuario.apePat_user} </strong></h8>
                    </span></div>
            	</div>
                   	<div>
                    	<form id = "form1" name = "form1" method = "post" action = "">
	                        <table width="200" border="0">
	                          <tr>
	                            <td colspan="3">Seleccionar una Empresa: </td>
	                            <td colspan="3">
	                            	<select id="cboEmpresa">
									
	                                </select> </td>
	                          </tr>
	                          <tr>
	                            <td>Origen: </td>
	                            <td colspan="3">
	                            	<select id="cboEmpresa">
									
	                                </select> </td>
	                            <td>Destino: </td>
	                            <td colspan="3">
	                            	<select id="cboEmpresa">
									
	                                </select> </td>                            
	                          </tr>
	                          <tr>
	                            <td colspan="6">Taxis disponibles:</td>                            
	                          </tr>
	                          <tr>
	                            <td>Codigo Servicio</td>
	                            <td>Conductor</td>
	                            <td>Placa Auto</td>
	                            <td>Modelo</td>
	                            <td>Color</td>
	                            <td></td>
	                          </tr>
	                        </table>
	                        <input type = "submit" name = "btnIngresar" id = "button1" value = "Ingresar" />	            			
	                	</form>
					</div>                        
    </body>
</html>
