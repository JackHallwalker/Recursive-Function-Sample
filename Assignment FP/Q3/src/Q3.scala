//19001436
object Q3 extends App{
  def SUM(n:Int): Int ={
    if(n<=1){
      n
    }
    else{
      n+SUM(n-1)
    }
  }
  println(SUM(5))
}
