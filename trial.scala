object topOfClass1 extends App{
  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"),Student(3,"Shubhra"),Student(4,"Mahesh"))

  val l2: List[Marks] = List(Marks(1, 1, 80), Marks(2, 2,85), Marks(3, 2, 78), Marks(1, 4, 90), Marks(2, 1, 75), Marks(3, 2, 6), Marks( 4 , 4 ,80))
  def toppers(l:List[Student],l1:List[Marks],id:Int,count:Int,choice:String)
  {
    val l2=l1.sortBy(x=>x.marksObtained)
    println(l2)
    // val l3=List[String,Int]()
    l2.foreach(x =>{
    def innertop(l:List[Student],l1:List[Marks],id:Int,count:Int){
   if (x.subjectId == id && count>0) {
     print(x.studentId, x.marksObtained)
   }
   innertop(l,l1,id,count-1)
    }})
}
}
  /*  choice match {
      case "top"=> {
        l2.map(x => if (x.subjectId == id )print(x.studentId,x.marksObtained) )
      }
      //  case "fail"=>{
      //        val count = marksList.flatMap(x => if (x.subjectId == id && x.marksObtained < percent) Some(x) else None)
      //        count.size
    }}
  toppers(l1,l2,1,4,"top")
}
*/
