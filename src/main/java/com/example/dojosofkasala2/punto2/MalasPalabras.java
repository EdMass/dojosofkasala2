package com.example.dojosofkasala2.punto2;

import java.util.Objects;

public class MalasPalabras {

    private String malas;

    public MalasPalabras(String malas) {
        this.malas = malas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MalasPalabras)) return false;
        MalasPalabras that = (MalasPalabras) o;
        return Objects.equals(getMalas(), that.getMalas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMalas());
    }

    public String getMalas() {
        return malas;
    }

    public void setMalas(String malas) {
        this.malas = malas;
    }

    @Override
    public String toString() {
        return "MalasPalabras{" +
                "malas='" + malas + '\'' +
                '}';
    }
}
