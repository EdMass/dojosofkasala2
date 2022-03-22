package com.example.dojosofkasala2.model;

import java.util.Objects;

public class Correo {

    private String correo;
    private Boolean enviado = false;


    public Correo(String correo) {
        this.correo = correo;
    }

    public Correo(String correo, Boolean enviado) {
        this.correo = correo;
        this.enviado = enviado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Correo)) return false;
        Correo correo1 = (Correo) o;
        return getCorreo().equals(correo1.getCorreo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCorreo());
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                ", enviado=" + enviado +
                '}';
    }
}
