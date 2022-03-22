package com.example.dojosofkasala2.punto2;

import java.util.Objects;

public class Texto {

    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "texto='" + texto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Texto)) return false;
        Texto texto1 = (Texto) o;
        return Objects.equals(getTexto(), texto1.getTexto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTexto());
    }
}
