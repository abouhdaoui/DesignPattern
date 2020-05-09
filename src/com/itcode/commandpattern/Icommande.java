package com.itcode.commandpattern;

import javax.swing.text.BadLocationException;

/**
 * Created by abouhdaoui on 08/05/2020
 */
public interface Icommande {
    public void execute();
    public void undo();

}
