package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

public class ResumeController extends Controller {

    public ResumeController (Game game) {
        super(game);        
    }

    @Override
    public void accept(VisitorController visitorController) {
        visitorController.visit(this);
    }
}