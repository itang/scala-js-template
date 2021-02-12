package example

import org.scalajs.dom
import org.scalajs.dom.{document => g}
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.querki.jquery._


@JSExportTopLevel("ScalaJSExample")
object ScalaJSExample {

  def main(_args: Array[String]): Unit = {
    println("Hello from scala.js!")

    val paragraph = g.createElement("p")
    val s = "hello"
    paragraph.innerHTML = s"<strong>It works!</strong> ${s} ${new js.Date()}"

    g.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
      println(s"g.getElementsByTagName('p').length: ${g.getElementsByTagName("p").length}")
    })

    $("playground").append(paragraph)

    $("body").append("<div><h2>Append from jQuery</div></h2>")
  }

  /**
    * Computes the square of an integer.
    * This demonstrates unit testing.
    */
  @JSExport
  def square(x: Int): Int = {
    println("invoke square...")
    x * x
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(g.body, "You clicked the button!")
  }

  private def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = g.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def setupUI(): Unit = {
    val button = g.createElement("button")
    button.textContent = "Click me too!"
    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
   })
   g.body.appendChild(button)

   appendPar(g.body, "Hello World")
  }
}
