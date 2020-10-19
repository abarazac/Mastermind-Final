package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public abstract class View extends usantatecla.mastermind.views.View {

	private StartView startView;

	private ProposalView proposalView;

	public View(Game game) {
		super(game);
		this.startView = new StartView(this.game);
		this.playView = new PlayView(this.game);
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

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected void play() {
		this.startView.setVisible(false);
		this.playView.interact();
	}

	@Override
	protected boolean isNewGame() {
		if (new ResumeView().isResumedGame()) {
			return true;
		}
		this.playView.setVisible(false);
		System.exit(0);
		return false;
	}

}
