package bat.bool1;

import plm.universe.bat.BatEntity;
import plm.universe.bat.BatTest;

public class HasTeenEntity extends BatEntity {
    public void run(BatTest t) {
        t.setResult(hasTeen((Integer) t.getParameter(0), (Integer) t.getParameter(1), (Integer) t.getParameter(2)));
    }

    /* BEGIN TEMPLATE */
    boolean hasTeen(int a, int b, int c) {
        /* BEGIN SOLUTION */
        return a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20;
		/* END SOLUTION */
    }
	/* END TEMPLATE */
}
