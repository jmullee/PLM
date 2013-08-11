/* automatically converted from the Nick Parlante's excellent exercising site http://javabat.com/ */

package lessons.welcome.conditions.bool2;
import jlm.core.model.Game;
import jlm.core.model.lesson.Lesson;
import jlm.universe.bat.BatExercise;
import jlm.universe.bat.BatTest;
import jlm.universe.bat.BatWorld;

public class AnswerCell extends BatExercise {
	public AnswerCell(Lesson lesson) {
		super(lesson);

		BatWorld myWorld = new BatWorld("answerCell");
		myWorld.addTest(VISIBLE, false, false, false) ;
		myWorld.addTest(VISIBLE, false, false, true) ;
		myWorld.addTest(VISIBLE, true, false, false) ;
		myWorld.addTest(INVISIBLE, true, true, false) ;
		myWorld.addTest(INVISIBLE, false, true, false) ;
		myWorld.addTest(INVISIBLE, true, true, true) ;

		langTemplate(Game.PYTHON, "answerCell", 
				"def answerCell(isMorning, isMom, isAsleep):\n",
				"   return (not isAsleep) and not (isMorning and not isMom)");
		setup(myWorld);
	}

	public void run(BatTest t) {
		/* BEGIN SKEL */
		t.setResult( answerCell((Boolean)t.getParameter(0), (Boolean)t.getParameter(1), (Boolean)t.getParameter(2)) );
		/* END SKEL */
	}

	/* BEGIN TEMPLATE */
	boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		/* BEGIN SOLUTION */
		return (! isAsleep) && ! (isMorning && ! isMom);
		/* END SOLUTION */
	}
	/* END TEMPLATE */
}
