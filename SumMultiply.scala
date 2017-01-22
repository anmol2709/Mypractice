
object SumMutiply extends App{
  def sum(srcList:List[Int]):Int={
    def innerSum(l1:List[Int],index:Int,sum:Int):Int={
      index match {
        case -1=> sum
        case _ => innerSum(l1.tail,index-1,sum+l1.head)
      }
    }
    innerSum(srcList,srcList.length-1,0)
  }
  def multiply(srcList:List[Int]):Int={
    def innerMultiply(l1:List[Int],index:Int,mul:Int):Int={
      index match {
        case -1=> mul
        case _ => innerMultiply(l1.tail,index-1,mul*l1.head)
      }
    }
    innerMultiply(srcList,srcList.length-1,1)
  }
  val l=List(1,2,3,4,5)

  println(sum(l))
  println(multiply(l))
}
