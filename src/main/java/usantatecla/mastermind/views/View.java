package usantatecla.mastermind.views;

public abstract class View {

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
