package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import js.annotation.JSExport
import js.annotation.JSExportDescendentObjects


object ScalaJSExample extends js.JSApp {

  def main(): Unit = {
    val paragraph = g.document.createElement("p")
    val s = "hello"
    paragraph.innerHTML = s"<strong>It works!</strong> ${s} ${new js.Date()}"
    $("playground").appendChild(paragraph)
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}

object $ {
  def apply(id : String) = g.document.getElementById(id)
}
