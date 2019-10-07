package org.academiadecodigo.splicegirls.sniperelite.gameobjects;

import org.academiadecodigo.splicegirls.sniperelite.gameobjects.GameObject;

public class Tree extends GameObject {

    private String message = "\n I am a Tree. Save the Planet! \n ";

    @Override
    public String getMessage() {
        return message;
    }
}
