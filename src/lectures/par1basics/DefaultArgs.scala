package lectures.par1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def trFact(n: Int, accu: Int = 1): Int = {
    if(n<= 1) accu
    else trFact(n-1, n*accu)
  }
  var fact10 = trFact(10)
  def savePicture(format: String = "jpg", width: Int = 800, height: Int = 600): Unit = println("Picture saved")
  savePicture()
  savePicture(width = 900)
  savePicture(width = 900, format = "bmp")
}
