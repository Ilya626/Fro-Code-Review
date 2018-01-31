package com.roller.domain;

import javax.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String name;
    private Integer passion;
    private Integer bliss;
    private Integer depression;

    @ManyToOne
    private Player owner;

    @ManyToOne
    private Party game;

    protected Character() {}

    public Character(String name, Integer passion, Integer bliss, Integer depression, Player owner, Party game) {

        this.name = name;
        this.passion = passion;
        this.bliss = bliss;
        this.depression = depression;
        this.owner = owner;
        this.game = game;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[name='%s',\n passion='%d',\n bliss='%d',\n depression='%d'\n]",
                this.name, this.passion, this.bliss, this.depression);
    }

    public Integer getDepression() {
        return this.depression;
    }

    public void setDepression(Integer depression) {
        this.depression = depression;
    }

    public Integer getBliss() {
        return this.bliss;
    }

    public void setBliss(Integer bliss) {
        this.bliss = bliss;
    }

    public Integer getPassion() {
        return this.passion;
    }

    public void setPassion(Integer passion) {
        this.passion = passion;
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
