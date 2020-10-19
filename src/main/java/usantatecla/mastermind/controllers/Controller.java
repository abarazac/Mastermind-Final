package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

public abstract class Controller {

    protected Game game;    
	protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public abstract void accept (VisitorController visitorController);
}