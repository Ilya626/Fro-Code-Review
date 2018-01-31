package com.roller.viewModels;

import com.roller.domain.Character;
import com.roller.domain.Party;
import groovy.lang.Tuple2;

import java.util.*;
import java.util.stream.Collectors;

public class Board {

    private Long id;

    private String name;

    private String description;

    private List<Character> characters = new ArrayList<>();

    private String master;

    private String newMessage;

    private List<String> messages = new ArrayList<>();

    protected Board() {}

    public Board(Party party) {
        id = party.getId();
        name = party.getName();
        description = party.getDescription();
        master = party.getMaster().getUsername();
        characters = new ArrayList<>(party.getCharacters());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMaster() {
        return master;
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<Character> getCharacters() { return this.characters; }

}
