/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;


import java.util.List;

/**
 *
 * @author diana
 */
public class SucursalDTO {
    private String nombre;
    private String ubicacion;
    List<SalaDTO> salas;

    public SucursalDTO() {
    }

    public SucursalDTO(String nombre, String ubicacion, List<SalaDTO> salas) {
       
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.salas = salas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<SalaDTO> getSalas() {
        return salas;
    }

    public void setSalas(List<SalaDTO> salas) {
        this.salas = salas;
    }
    
    
}
