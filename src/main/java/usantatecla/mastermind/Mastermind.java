package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.graphics.View;

public abstract class Mastermind {

	private Logic logic;
	private View view;

	private Mastermind() {
		this.logic = new Logic();
		this.view = this.CreateView(this.game);
	}

	protected abstract View createView(Logic logic);

	private void play() {
		this.view.interact();
	}	

}
