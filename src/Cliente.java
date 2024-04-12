package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class Cliente {
    private String nombre;
    private boolean tieneTarjetaDebito;
    private Date fechaNacimiento;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }



    // Constructor, getters y setters aquí...

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", tieneTarjetaDebito=" + tieneTarjetaDebito +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                '}';
    }

    public boolean isTieneTarjetaDebito() {
        return tieneTarjetaDebito;
    }

    public void setTieneTarjetaDebito(boolean tieneTarjetaDebito) {
        this.tieneTarjetaDebito = tieneTarjetaDebito;
    }
}

