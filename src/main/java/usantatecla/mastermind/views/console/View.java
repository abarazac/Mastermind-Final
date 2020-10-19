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
		controller.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(ProposeCombinationController proposeCombinationController) {
		this.ProposedCombinationView.interact(proposeCombinationController);	}

	@Override
	public boolean visit(ResumeController resumeController) {
		return this.resumeView.interact(resumeController);
	}

}
