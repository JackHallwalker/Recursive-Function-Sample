//19001436
object Q4 extends App {
  def Even(n:Int): Unit = {
    if (n==0) {
      print("even")
    }
    else if (n==1){
      print("odd")
    }
    else {
      Even(n-2)
    }
  }
  Even(5)
}
