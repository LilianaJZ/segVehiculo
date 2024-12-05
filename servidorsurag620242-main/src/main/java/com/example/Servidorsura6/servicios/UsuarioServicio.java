package com.example.Servidorsura6.servicios;

import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {
    //Llamando al repositorio de usuario.
    @Autowired //sirve para inyectar y traer el repositorio
    IUsuarioRepositorio iUsuarioRepositorio; //se instancia el repositorio

    //Se crean métodos para definir las operaciones a realizar en la base de datos.

    //1. Registrar o guardar un usuario.
    public Usuario guardarUsuario(Usuario datosUsuario)throws Exception {// se llama a usuario porque es donde lo quiero hacer y se le activan las excepciones
        try {
            return iUsuarioRepositorio.save(datosUsuario);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //2. Buscar todos los usuarios.
    public List<Usuario> buscarUsuarios()throws Exception {
        //es una lista porque puede devolver varios usuarios
        try{
            return iUsuarioRepositorio.findAll();
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }

    //3.

}
