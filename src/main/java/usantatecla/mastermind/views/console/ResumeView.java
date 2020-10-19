package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.YesNoDialog;

import usantatecla.mastermind.ResumeController;

class ResumeView {

	private ResumeController resumeController;

	ResumeView(ResumeController resumeController) {
		this.resumeController = resumeController;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.resumeController.clear();
		}
		return newGame;
	}

}
