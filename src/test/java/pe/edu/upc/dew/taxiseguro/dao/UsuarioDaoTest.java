package pe.edu.upc.dew.taxiseguro.dao;

import org.junit.Assert;
import org.junit.Test;
<<<<<<< HEAD

import pe.edu.upc.dsd.taxiempresarial.dao.UsuarioDao;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.exception.LoginException;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;
=======
import pe.edu.upc.dew.taxiseguro.model.UsuarioWeb;
>>>>>>> 7f0d1e5ea4683644663105e38452ed8e83893651

public class UsuarioDaoTest {

    @Test
<<<<<<< HEAD
    public void elUsuarioConUsernameAdminTieneNombreAdministrador() throws LoginException, DaoException{
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = usuarioDao.login("max", "max");
        Assert.assertEquals("Carlos Alberto", usuario.getNombre_user());
=======
    public void elUsuarioConUsernameAdminTieneNombreAdministrador(){
        UsuarioDao usuarioDao = new UsuarioWebDaoJdbc();
        UsuarioWeb usuario = usuarioDao.getUsuarioPorUsername("U00001");
        Assert.assertEquals("Carlos Alberto", usuario.getUSNoNombres());
>>>>>>> 7f0d1e5ea4683644663105e38452ed8e83893651
    }

}
