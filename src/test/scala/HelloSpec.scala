import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "elementreturner" must {

    "return 3 when given a list of intergers" in {
      Hello.elementreturner(List(1,2,3,1,2)) mustEqual 3
    }

  }

}
