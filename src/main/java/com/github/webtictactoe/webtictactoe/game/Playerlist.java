package com.github.webtictactoe.webtictactoe.game;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is a list of players that the server the is broadcast to
 * the Atmosphere suspended resource "/playerlist".
 * @author pigmassacre
 */
@XmlRootElement
public class Playerlist {

    public List<String> names;

    public Playerlist() {
        this.names = new ArrayList<String>();
    }
    
    public void addUsername(String name) {
        this.names.add(name);
    }

}