import cats.effect.unsafe.implicits.global
import doodle.core.*
import doodle.image.*
import doodle.syntax.all.*
import doodle.image.syntax.all.*
import doodle.java2d.*

@main def jaja = 
 val circles = Image.circle(100). fillColor(Color.red)
   .on (Image.circle(200).fillColor(Color.white))
   .on (Image.circle(300)).fillColor(Color.blue)

   val rectangles = Image.rectangle(40, 120).fillColor(Color.black)
   .above (Image.rectangle(120,40)).fillColor(Color.black)

   circles
   .above(rectangles)
   .draw()
  /*
val circles = Image.circle(100). fillColor(Color.red)
  .on (Image.circle(200)).fillColor(Color.white)
  .on (Image.circle(300)).fillColor(Color.blue)

  val rectangles = Image.rectangle(40, 120).fillColor(Color.black)
  .above (Image.rectangle(120,40)).fillColor(Color.black)

  circles
  .above(rectangles)
  .draw()
  .draw()
  */
