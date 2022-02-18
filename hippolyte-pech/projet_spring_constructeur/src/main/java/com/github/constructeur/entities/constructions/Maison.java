package com.github.constructeur.entities.constructions;

public class Maison implements Construction {
    private String denomination;
    private float surfaceEnM2;
    private boolean possedePiscine;

    public Maison() {
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public float getSurfaceEnM2() {
        return surfaceEnM2;
    }

    public void setSurfaceEnM2(float surfaceEnM2) {
        this.surfaceEnM2 = surfaceEnM2;
    }

    public boolean isPossedePiscine() {
        return possedePiscine;
    }

    public void setPossedePiscine(boolean possedePiscine) {
        this.possedePiscine = possedePiscine;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "denomination='" + denomination + '\'' +
                ", surfaceEnM2=" + surfaceEnM2 +
                ", possedePiscine=" + possedePiscine +
                '}';
    }
}
