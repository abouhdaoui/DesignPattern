package com.itcode.decorator;

public abstract class DecorateurIngredient extends Dessert {
    protected Dessert dessert;// Dessert sur leuquel on applique l'ingrédient.
    // On oblige les ingrédients à implémenter la méthode getLibelle().
    public abstract String getLibelle();
    // On oblige les ingrédients à implémenter la méthode getPrix().
    public abstract double getPrix();

}
