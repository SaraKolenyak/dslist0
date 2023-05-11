package com.sarak.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn (name = "list_id")
    private GameList list;
    @ManyToOne
    @JoinColumn (name = "game_id")
    private Game game;

    public BelongingPK (){

    }

    public BelongingPK(GameList list, Game game) {
        this.list = list;
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(list, that.list) && Objects.equals(game, that.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, game);
    }
}
