package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

import usantatecla.mastermind.controllers.ProposeCombinationController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;


public class Logic {

    private Game game;
    
    private StartController StartController;
    private ResumeController ResumeController;
    private ProposeCombinationController ProposeCombinationController;

    public Logic() {
        this.game = new Game();
        this.StartController = new StartController(this.game);
        this.ProposeCombinationController = new ProposeCombinationController(this.game);
        this.ResumeController = new ResumeController(this.game);
    }

}