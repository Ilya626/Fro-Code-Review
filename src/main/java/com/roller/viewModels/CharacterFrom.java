package com.roller.viewModels;

import com.roller.domain.Character;

import javax.validation.constraints.NotNull;

public class CharacterFrom {

    private Long id;

    @NotNull
    private String name;

    private Integer passion;

    private Integer bliss;

    private Integer depression;

    private String owner;

    private String game;

    public CharacterFrom() { }

    public CharacterFrom(Character character) {
        id = character.getId();
        name = character.getName();
        passion = character.getPassion();
        bliss = character.getBliss();
        depression = character.getDepression();
        owner = character.getOwner().getUsername();
        game = character.getGame() == null ? null : character.getGame().getName();
    }

    public Integer getPassion() {
        return passion;
    }

    public Integer getBliss() {
        return bliss;
    }

    public Integer getDepression() {
        return depression;
    }

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getGame() {
        return game;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassion(Integer passion) {
        this.passion = passion;
    }

    public void setBliss(Integer bliss) {
        this.bliss = bliss;
    }

    public void setDepression(Integer depression) {
        this.depression = depression;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setName(String name) {
        this.name = name;

    }
}
