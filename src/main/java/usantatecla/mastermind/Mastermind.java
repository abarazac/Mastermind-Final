package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.graphics.View;

public abstract class Mastermind {

	private Game game;
	
	private View view;

	private Mastermind() {
		this.game = new Game();
		this.view = this.CreateView(this.game);
	}

	protected abstract View createView(Game game);

	private void play() {
		this.view.interact();
	}	

}
