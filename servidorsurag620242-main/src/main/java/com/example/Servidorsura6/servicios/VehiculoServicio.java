package com.example.Servidorsura6.servicios;

import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.modelos.Vehiculo;
import com.example.Servidorsura6.repositorios.IVehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServicio {

    @Autowired
    IVehiculoRepositorio iVehiculoRepositorio;

    //Se crean métodos para definir las operaciones a realizar en la base de datos.
    //1. Registrar o guardar un usuario.
    public Vehiculo guardarVehiculo(Vehiculo datosVehiculo) throws Exception {// se llama a usuario porque es donde lo quiero hacer y se le activan las excepciones
        try {
            return iVehiculoRepositorio.save(datosVehiculo);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //2. Buscar todos los usuarios.
    public List<Vehiculo> buscarVehiculos()throws Exception {
        //es una lista porque puede devolver varios usuarios
        try{
            return iVehiculoRepositorio.findAll();
        }catch (Exception error){
            throw  new Exception(error.getMessage());
        }
    }
}
