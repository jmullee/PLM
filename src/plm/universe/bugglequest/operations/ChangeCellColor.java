package plm.universe.bugglequest.operations;

import java.awt.Color;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import plm.core.utils.ColorMapper;
import plm.universe.bugglequest.BuggleWorldCell;

public class ChangeCellColor extends BuggleWorldCellOperation{

	private Color oldColor;
	private Color newColor;

	public ChangeCellColor(BuggleWorldCell cell, Color oldColor, Color newColor) {
		super("changeCellColor", cell);
		this.oldColor = oldColor;
		this.newColor = newColor;
	}

	public Color getOldColor() {
		return oldColor;
	}

	public Color getNewColor() {
		return newColor;
	}
}
