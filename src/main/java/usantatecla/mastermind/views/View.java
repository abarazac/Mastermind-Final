package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public abstract class View {

	protected Game game;

	public View(Game game) {
		this.game = game;
	}

	public void interact() {
		boolean newGame;
		do {
			this.startView.interact();
			boolean finished;
			do {
				finished = this.proposalView.interact();
			} while (!finished);
			newGame = this.resumeView.interact();
		} while (newGame);
	}

	protected abstract void start();
	protected abstract void play();
	protected abstract void isNewGame();
	

}
