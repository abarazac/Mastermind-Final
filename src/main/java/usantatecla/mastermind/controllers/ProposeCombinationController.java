package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

public class ProposeCombinationController extends Controller {

    public ProposeCombinationController (Game game) {
        super(game);        
    }

    @Override
    public void accept(VisitorController visitorController) {
        visitorController.visit(this);
    }
}