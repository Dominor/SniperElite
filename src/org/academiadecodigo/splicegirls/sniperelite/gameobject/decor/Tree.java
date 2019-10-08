package org.academiadecodigo.splicegirls.sniperelite.gameobject.decor;

import org.academiadecodigo.splicegirls.sniperelite.gameobject.GameObject;

public class Tree extends GameObject {

    private String message = "\n I am a Tree. Save the Planet! \n ";

    @Override
    public String getMessage() {
        return message;
    }
}
