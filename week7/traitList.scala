trait MyList
case object MyNil extends MyList
case class MyCons (head:Int, tail: MyList) extends MyList

val q:MyList =MyCons (1, MyCons (2, MyCons (3, MyNil)))

//recursion in data types, recursively refers to MyList
//this is recursive data type

//do sum funciton of this:

def sum (xs: MyList): Int = {
	xs match {
		case MyNil => 0 
		case MyCons () (y,ys) => y+ ys //in this case get 2 parameters head and tail
	}
}

//doing sum of list we had, we get 6

def toList (xs:MyList) :List[Int] = {
	//using pattern match again
	xs match {
		case MyNil => Nil
		case MyCons (y,ys) => y :: toList (ys)
		//MyCons gets converted to cons
	}
}


//toList (MyCons (1, MyCons (2, MyCons (3, MyNil))))


------
def fromList (xs:MyList[Int]) :List = {
	//using pattern match again
	xs match {
		case MyNil => Nil
		case y::ys => MyCons (y,ys) List (ys)//this line needs to be fixed
		
	}
}

