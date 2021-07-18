//19001436
object Q6 extends App {
  def FIB(n:Int):Int =n match {
    case 0 => 0
    case x if x==1 => 1
    case _ =>FIB(n-1) + FIB(n-2)
  }
  def FIBseq(n:Int):Unit= {
    if (n>0){
      FIBseq(n-1)
    }
    print(FIB(n))
    print(", ")
  }
  FIBseq(4)
  //3 is considered as 4th fibbonanci number
}
