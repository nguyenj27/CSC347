//Product Types

case c (val x:int, val y:String)
//with val, x and y could be read but not changed
 
 case class c ( x:int,  y:String)
 //support for pattern matching
//dont have to say new when you call on terminal C(5, "hello")


def foo (z:C) : Int = z.x + x.y.length //takes instance of type C and returns integer, is going to be x + length of string y

//foo (q) ==> Int =10

//wriitng with pattern matching

def bar (z:C) : Int = z match {} case C (a,b) => a+b.length}

//a is first value,x  and b is second, y
//bar (q) ==> Int =10

class Node {
	int valuel
	Node next;
	Node (int value, Node next) {
		this.value = valuel
		this.next = next;

	}
}
//new Node (1, new Node (2, new Node, (3, null)));
//it gets annoying writing this


//Tupes are case Classes
//pairs in scala is just case classes built into scala


//Set Union

//what is size of union of x and y? |X U Y| = |X| + |Y| - |x intersection y|
// X U Y 
//if you get 1, you know it came from X

//Coproduct or disjoint union of sets
//you take eveerything from set x and tag to make it unique, you do the same for y


//X = {1, 2 , 3}
//Y= { 3,4,5}

X U Y= {1 , 2,3,4,5}
X tag Y = { (0,1)

//Disjoint union case classes
//trait: like a class with memthods, but methods didnt have body
//with aninterface you cant create an instance of it bc method doesnt 
have body

trait DateSpecifier
case class Absolute (year:Int, mon:Int, day:Int) extends DateSpecifier
case class Relative (daysOffset:Int) extends DateSpecifier

//creating instances
val ds= new Array[DateSpecifier] (2)
//you get Array[DateSpecifier= Array(null,null)

ds (0)= Absolute (2030, 0, 1)

//given a dateSpecifier--it would Absolute or Relative
//pattern on dateSpecifer you will need one case for Absolute and one case for Relative

//absolute  has year, month date
//relative 1 argument--> 1 pattern variable

//disjoint union in C
//corresponds to a struct

struct abs_t {
	Int year;
	int mon;
	int day'
}

struct abs_t =malloc (sizeof(struct abs_t))
//doing this you create 12 bytes toal of each integer in heap  year,mon, and day stored in memory
(*s).year= 2018;
(*s).mon=5;
(*s).day =7;


s -> year = 2018; //dereferecning

//foo_t is anew type

c x=new (c)
//with struct, you write


//how to represent either Absolute or Relative
//in ana array with offset 1 and offset 0, what should be the size? size of max of two different things could go in there
//relative = 1 integers
//absoultue= 12 byytes bc 3 integers
  0     1
[    |    ]
   ^12  ^12 bytes

In offset 0: 2|0|1|8| 5| 7
in offset 1: -5|   |   |
//in the empty is garbage in byte 1
//how do you tell that they are relative or absoulte? you add header
// so you need at least 13 bytes, adding a tag

Offset 0: tag| 2|0|1|8|5|7
offset 1: tag|-5|  |  
