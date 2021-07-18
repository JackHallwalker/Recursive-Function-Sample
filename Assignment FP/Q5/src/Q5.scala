//19001436

object Q5 extends App {

  def Addeven(n:Int):Int={
    if(n>1 && n%2==0){
      n + Addeven(n-2)
    }
    else if (n>1 && n%2==1){
      Addeven(n-1)
    }
    else{
      0
    }
  }
  print(Addeven(10))
}
