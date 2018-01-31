package com.roller.viewModels;

import com.roller.domain.Character;

import javax.validation.constraints.NotNull;

public class CharacterFrom {

    private Long id;

    @NotNull
    private String name;

    private Integer hp;

    private Integer ас;

    private Integer initiative;

    private String owner;

    private String game;

    public CharacterFrom() { }

    public CharacterFrom(Character character) {
        id = character.getId();
        name = character.getName();
        hp = character.getHp();
        ас = character.getAc();
        initiative = character.getInitiative();
        owner = character.getOwner().getUsername();
        game = character.getGame() == null ? null : character.getGame().getName();
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getАс() {
        return ас;
    }

    public Integer getInitiative() {
        return initiative;
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

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setАс(Integer ас) {
        this.ас = ас;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
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
