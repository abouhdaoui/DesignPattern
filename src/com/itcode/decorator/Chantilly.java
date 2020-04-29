package com.itcode.decorator;

//Classe chantily qui hérite de decorateurIngredient et donc indirectement de dessert.
public class Chantilly extends DecorateurIngredient
{
    // Constructeur qui prend en paramètre le dessert.
    public Chantilly(Dessert d)
    {
        dessert = d;
    }

    // On affiche le libellé du dessert et on rajoute le libellé de l'ingrédient chantilly.
    public String getLibelle()
    {
        return dessert.getLibelle()+", chantilly";
    }

    // On additionne le prix du dessert et le prix de l'ingrédient chantilly.
    public double getPrix()
    {
        return dessert.getPrix()+0.50;
    }
}
