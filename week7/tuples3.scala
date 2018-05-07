case class Tuple3[+T1, +T2, +T3](_1: T1, _2: T2, _3: T3)
  extends Product3[T1, T2, T3]
{
  override def toString() = "(" + _1 + "," + _2 + "," + _3 + ")"
}

//scala> (5, "hello", true).getClass
//res0: Class[_ <: (Int, String, Boolean)] = class scala.Tuple3
