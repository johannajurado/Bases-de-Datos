/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

/**
 *
 * @author Alejandra
 */
public class Persona {
    
   
    private int identificador;    
    private String cedula;
    private String nombre;
    private String dia_nacimiento;
    private String mes_nacimiento;
    private int ano_nacimiento;
    private int ganancia_anual;

    public Persona() {
    }
    
    
    

    public Persona(int identificador, String cedula, String nombre, String dia_nacimiento, String mes_nacimiento, int ano_nacimiento, int ganancia_anual) {
        this.identificador = identificador;
        this.cedula = cedula;
        this.nombre = nombre;
        this.dia_nacimiento = dia_nacimiento;
        this.mes_nacimiento = mes_nacimiento;
        this.ano_nacimiento = ano_nacimiento;
        this.ganancia_anual = ganancia_anual;
    }



    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia_nacimiento() {
        return dia_nacimiento;
    }

    public void setDia_nacimiento(String dia_nacimiento) {
        this.dia_nacimiento = dia_nacimiento;
    }

    public String getMes_nacimiento() {
        return mes_nacimiento;
    }

    public void setMes_nacimiento(String mes_nacimiento) {
        this.mes_nacimiento = mes_nacimiento;
    }

    public int getAno_nacimiento() {
        return ano_nacimiento;
    }

    public void setAno_nacimiento(int ano_nacimiento) {
        this.ano_nacimiento = ano_nacimiento;
    }

    public int getGanancia_anual() {
        return ganancia_anual;
    }

    public void setGanancia_anual(int ganancia_anual) {
        this.ganancia_anual = ganancia_anual;
    }
    
    
    
}

    

