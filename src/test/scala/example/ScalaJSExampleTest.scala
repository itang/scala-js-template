package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import minitest._

object ScalaJSExampleTest extends SimpleTestSuite {

  test("ScalaJSExample should implement square()") {
    import ScalaJSExample._

    assertEquals(square(0), 0)
    assertEquals(square(4), 16)
    assertEquals(square(-5), 25)
  }
}
