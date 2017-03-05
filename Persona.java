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
    
   
    private String identificador;    
    private String cedula;
    private String nombre;
    private String dia_nacimiento;
    private String mes_nacimiento;
    private String ano_nacimiento;
    private String ganancia_anual;

    public Persona() {
    }

    public Persona(String identificador, String cedula, String nombre, String dia_nacimiento, String mes_nacimiento, String ano_nacimiento, String ganancia_anual) {
        this.identificador = identificador;
        this.cedula = cedula;
        this.nombre = nombre;
        this.dia_nacimiento = dia_nacimiento;
        this.mes_nacimiento = mes_nacimiento;
        this.ano_nacimiento = ano_nacimiento;
        this.ganancia_anual = ganancia_anual;
    }
    
    

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
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

    public String getAno_nacimiento() {
        return ano_nacimiento;
    }

    public void setAno_nacimiento(String ano_nacimiento) {
        this.ano_nacimiento = ano_nacimiento;
    }

    public String getGanancia_anual() {
        return ganancia_anual;
    }

    public void setGanancia_anual(String ganancia_anual) {
        this.ganancia_anual = ganancia_anual;
    }
    
    
    
}