package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

import usantatecla.mastermind.StartController;
import usantatecla.mastermind.ResumeController;
import usantatecla.mastermind.ProposeCombinationController;

public abstract class View extends usantatecla.mastermind.views.View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController) {
		this.startView = new StartView(startController);
		this.playView = new ResumeView(resumeController);
		this.resumeView = new ProposedCombinationView(proposeCombinationController);
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
	protected void start(){
		this.startView.interact();
	}

	@Override
	protected void play(){
		this.playView.interact();
	}

	@Override
	protected boolean isNewGame(){
		return this.resumeView.interact();
	}

}
