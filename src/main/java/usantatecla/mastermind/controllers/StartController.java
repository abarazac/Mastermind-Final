package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

public class StartController extends Controller {

    public StartController (Game game) {
        super(game);        
    }
    
    @Override
    public void accept(VisitorController visitorController) {
        visitorController.visit(this);
    }
    
}