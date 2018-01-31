package com.roller.domain;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String name;
    private Integer hp;
    private Integer ас;
    private Integer initiative;

    @ManyToOne
    private Player owner;

    @ManyToOne
    private Party game;

    protected Character() {}

    public Character(String name, Integer hp, Integer ас, Integer initiative, Player owner, Party game) {

        this.name = name;
        this.hp = hp;
        this.ас = ас;
        this.initiative = initiative;
        this.owner = owner;
        this.game = game;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[name='%s',\n hp='%d',\n aс='%d',\n initiative='%d'\n]",
                this.name, this.hp, this.ас, this.initiative);
    }

    public Integer getInitiative() {
        return this.initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getAc() {
        return this.ас;
    }

    public void setAc(Integer ас) {
        this.ас = ас;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getOwner() {
        return this.owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Party getGame() { return this.game; }

    public void setGame(Party game) {
        this.game = game;
    }

    public Long getId() { return this.id; }
}
