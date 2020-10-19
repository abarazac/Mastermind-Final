package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.graphics.View;

import usantatecla.mastermind.StartController;
import usantatecla.mastermind.ResumeController;
import usantatecla.mastermind.ProposeCombinationController;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected View createView(StartController startController, ResumeController resumeController, ProposeCombinationController proposeCombinationController) {
		return new View(startController, resumeController, proposeCombinationController);
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}	

}
