package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.models.State;
import usantatecla.mastermind.models.GameState;


public class Logic {

    private Game game;
    private State state;
    private Map<StateValue, Controller> controllers;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<StateValue, Controller>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state));
        this.controllers.put(StateValue.IN_GAME, new ProposeCombinationController(this.game, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }

}