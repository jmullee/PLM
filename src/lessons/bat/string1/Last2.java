package lessons.bat.string1;
import jlm.core.model.Game;
import jlm.core.model.lesson.Lesson;
import jlm.universe.bat.BatExercise;
import jlm.universe.bat.BatTest;
import jlm.universe.bat.BatWorld;

public class Last2 extends BatExercise {
	public Last2(Lesson lesson) {
		super(lesson);

		BatWorld myWorld = new BatWorld("last2");
		myWorld.addTest(VISIBLE, "hixxhi") ;
		myWorld.addTest(VISIBLE, "xaxxaxaxx") ;
		myWorld.addTest(VISIBLE, "axxxaaxx") ;
		myWorld.addTest(INVISIBLE, "xxaxxaxxaxx") ;
		myWorld.addTest(INVISIBLE, "xaxaxaxx") ;
		myWorld.addTest(INVISIBLE, "13121312") ;
		myWorld.addTest(INVISIBLE, "11212") ;
		myWorld.addTest(INVISIBLE, "13121311") ;
		myWorld.addTest(INVISIBLE, "1717171") ;
		myWorld.addTest(INVISIBLE, "hi") ;
		myWorld.addTest(INVISIBLE, "h") ;
		myWorld.addTest(INVISIBLE, "") ;

		langTemplate(Game.PYTHON, "last2", 
				"def last2(str):\n",
				"  l = len(str)\n" +
				"  if l < 2:\n" +
				"    return 0\n" +
				"  end = str[l-2:l]\n" +
				"  count = 0\n" +
				"  for i in range(len(str)-2):\n" +
				"    if str[i:i+2] == end:\n" +
				"      count += 1\n" +
				"  return count\n");
		setup(myWorld);
	}

	public void run(BatTest t) {
		/* BEGIN SKEL */
		t.setResult( last2((String)t.getParameter(0)) );
		/* END SKEL */
	}

	/* BEGIN TEMPLATE */
	int last2(String str) {
		/* BEGIN SOLUTION */
		// Screen out too-short string case.
		if (str.length() < 2) return 0;

		String end = str.substring(str.length()-2);
		// Note: substring() with 1 value goes through the end of the string
		int count = 0;

		// Check each substring length 2 starting at i
		for (int i=0; i<str.length()-2; i++) {
			String sub = str.substring(i, i+2);
			if (sub.equals(end)) {  // Use .equals() with strings
				count++;
			}
		}

		return count;
		/* END SOLUTION */
	}
	/* END TEMPLATE */
}
