package com.github.webtictactoe.webtictactoe.login;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Yes, we know this is terribly unsafe and not at all how you're supposed to handle this,
 * but we're lacking time! :(
 * 
 * @author pigmassacre
 */
@XmlRootElement
public class LoginMessage {

    public String name;
    public String password; // stupid stupid stupid... :/

    public LoginMessage(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public LoginMessage() {
    }
}