package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.graphics.View;

import usantatecla.mastermind.StartController;
import usantatecla.mastermind.ResumeController;
import usantatecla.mastermind.ProposeCombinationController;

public abstract class Mastermind {

	private Game game;
	
	private View view;

	private StartController startController;
	private ResumeController resumeController;
	private ProposeCombinationController proposeCombinationController;


	private Mastermind() {
		this.game = new Game();
		this.startController = new StartController(this.game);
		this.resumeController = new ResumeController(this.game);
		this.proposeCombinationController = new ProposeCombinationController(this.game);
		this.view = this.CreateView(this.game);
	}

	protected abstract View createView(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController);

	private void play() {
		this.view.interact();
	}	

}
