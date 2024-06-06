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
public class SalaDTO {
    private Long id;
    private int numero;
    private List<FuncionDTO> funciones;
    private int numeroDeAsientos;

    public SalaDTO() {
    }

    public SalaDTO(Long id, int numero,int numeroDeAsientos, List<FuncionDTO> funciones) {
        this.id = id;
        this.numero = numero;
        this.funciones = funciones;
        this.numeroDeAsientos=numeroDeAsientos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<FuncionDTO> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<FuncionDTO> funciones) {
        this.funciones = funciones;
    }
    
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }
    
}
