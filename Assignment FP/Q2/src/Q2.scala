//19001436

object Q2 extends App {
  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
  }

  def prime(p:Int,n:Int=2):Boolean= n match{
    case x if p==1 => false
    case x if x==p => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }

  def primeseq(n:Int,i:Int=1):Unit={
    if(i<=n) {
      if(prime(i)==true){
        print(i +", ")
        primeseq(n,i+1)
      }
      else {
        primeseq(n,i+1)
      }
    }

  }
  primeseq(10)

}
