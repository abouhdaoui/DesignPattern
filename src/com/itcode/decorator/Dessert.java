package com.itcode.decorator;

import java.text.NumberFormat;

public abstract class Dessert {
    private String libelle;// Libellé du dessert.
    private double prix;// Prix du dessert.

    // Accesseurs en lecture pour le libellé et le prix.
    public String getLibelle()
    {
        return libelle;
    }
    public double getPrix()
    {
        return prix;
    }

    // Accesseurs en écriture pour le libellé et le prix.
    protected void setLibelle(String libelle)
    {
        this.libelle = libelle;
    }
    protected void setPrix(double prix)
    {
        this.prix = prix;
    }

    // Méthode utilisée pour l'affichage d'un dessert.
    public String toString()
    {
        NumberFormat format= NumberFormat.getInstance();
        format.setMinimumFractionDigits(2);// 2 chiffres après la virgule suffisent pour l'affichage.
        return getLibelle()+" : "+format.format(getPrix())+"€";
    }
}
