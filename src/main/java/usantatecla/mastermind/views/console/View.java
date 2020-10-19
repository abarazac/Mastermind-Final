package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.ProposeCombinationController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public abstract class View extends usantatecla.mastermind.views.View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new ResumeView();
		this.resumeView = new ProposedCombinationView();
	}

	public void interact(Controller controller) {
		boolean newGame;
		do {
			if(controller instanceof StartController){
				this.startView.interact((StartController) controller); 
			}
			boolean finished;
			do {
				if(controller instanceof ProposeCombinationController) {
					finished = this.proposalView.interact((ProposeCombinationController) controller);
				}
			} while (!finished);
			newGame = this.resumeView.interact((ResumeController) controller);
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
