package bat.bool1

import plm.universe.bat.BatTest
import plm.universe.bat.BatEntity

class ScalaMonkeyTroubleEntity extends BatEntity {
  override def run(t: BatTest) {
    t.setResult( monkeyTrouble(t.getParameter(0).asInstanceOf[Boolean],t.getParameter(1).asInstanceOf[Boolean]))
  }

  /* BEGIN TEMPLATE */
  def monkeyTrouble(aSmile:Boolean, bSmile:Boolean): Boolean = {
    /* BEGIN SOLUTION */
    ((aSmile && bSmile) || (!aSmile && !bSmile))
    /* END SOLUTION */
  }
  /* END TEMPLATE */
}