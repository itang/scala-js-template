package example

import org.scalajs.dom.{document => g}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.jquery.jQuery


@JSExportTopLevel("example.ScalaJSExample")
object ScalaJSExample {

  def main(_args: Array[String]): Unit = {
    val paragraph = g.createElement("p")
    val s = "hello"
    paragraph.innerHTML = s"<strong>It works!</strong> ${s} ${new js.Date()}"
    $("playground").appendChild(paragraph)

    jQuery("body").append("<div><h2>Append from jQuery</div></h2>")
  }

  /**
    * Computes the square of an integer.
    * This demonstrates unit testing.
    */
  @JSExport
  def square(x: Int): Int = {
    println("square")
    x * x
  }
}

object $ {
  def apply(id: String) = g.getElementById(id)
}
