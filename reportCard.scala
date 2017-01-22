object reportCard extends App{
  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"),Student(3,"Shubhra"),Student(4,"Mahesh"))

  val l2: List[Marks] = List(Marks(1, 1, 80), Marks(2, 2,85), Marks(3, 2, 78), Marks(1, 4, 90), Marks(2, 1, 75), Marks(3, 2, 6), Marks( 4 , 4 ,80))

def func(l1:List[Student],l2:List[Marks])= l2.map(x=>x.marksObtained).sorted

println(func(l1,l2))

//}

 //print (report(l1,l2)
}