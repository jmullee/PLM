package plm.universe.bugglequest.operations;

import org.json.simple.JSONObject;

import plm.universe.bugglequest.AbstractBuggle;

public class ChangeBuggleCarryBaggle extends BuggleOperation {
	private boolean oldCarryBaggle;
	private boolean newCarryBaggle;

	public ChangeBuggleCarryBaggle(AbstractBuggle buggle, boolean oldCarryBaggle, boolean newCarryBaggle) {
		super("changeBuggleCarryBaggle", buggle.getName());
		this.oldCarryBaggle = oldCarryBaggle;
		this.newCarryBaggle = newCarryBaggle;
	}

	public boolean getOldCarryBaggle() {
		return oldCarryBaggle;
	}

	public boolean getNewCarryBaggle() {
		return newCarryBaggle;
	}
}