//Jennifer Nguyen - May 9, 2018
//algebraic data types

//binary tree
// class Node { int value; Node left; Node right;}
//  new Node { 5; new Node (4, null, null), new Node (6, null, null) }

new Node {
	5,
	new Node (4, null, null),
	new Node (6, null, null)
} //these are sub expressions, can swap 4 and 6

//changing defition of myList type to Mytree type
//delcare trait called BTree

trait Btree
case object Leaf	extends BTree //lead is a kind of tree
case class Node (value:Int, left: BTree, right:BTree) 	extends BTree

//both declare a trait, both has case object that etends trait

trait MyList
case object MyNil 	extend MyList
case class MyCons (head:Int, tail:MyList) extends MyList
//the difference is the left and right of trait--shape of these declaration
// on a linked list: class Node { int value; Node nest; }

traitMWTree//multiway tree
case object Leaf	extends MWTree
case class Node (value:Int, children:List[MWTree]) extends MWTree
//you have decide wheter you want to allow MW node with 0 children as well 
//as a leaf


//building a BTree with the 5,4,6


Node (
	5,
	Node(4,Leaf, Leaf), //we have node containing 4, jusing case class dont need keyword!
	Node (6, Leaf, Leaf)
}
//node 4 with 2 leafs on either side ^^^,
// dont say NIl, we use Leaf (what youo named it)

//tetsing in scala: copy and paste, t: BTree =Node (5,Node(4,Leaf,Leaf),Node(6,Leaf,Leaf))


//measuring number of nodes in tree: USE PATTERN MATCHING WITH ALGEBRAIC TYPES
def size (t:BTree) : Int = {
	t match {
		case Leaf => 0 //one possibility is leaf, leaf takes no parameters
 		case Node (v, l, r) => 1 + size (l) + size (r)//what would size of this be? 
 }
}
def depth (t:BTree) : Int = {
        t match {
                case Leaf => 0 //one possibility is leaf, leaf takes no parameters
                case Node (v, l, r) => 1 + ((depth (l)) max (depth (r)))//what would size of this be?
 }
}

//In scala: depth(t) res: Int= 2
//if you use case classes like this, it is IMMUTABLE by default, if you want otherwise, you must use VAR

//converting tree to list

def treeToList (t:BTree) : Int = List[Int]  {
	t match {
		case Leaf 	      => Nil
		case Node ( v, l, r)  => treeToList (1) ::: List (v) ::: treeToList (r) //traversal
		//direct expression 
 }
}


//Linked LIst contianing for all types --we've been only doing it for integers
trait List[+X]
case object Nil                             extends List[Nothing]
case class  Cons[+X] (head:X, tail:List[X]) extends List[X]

//head of list -if integers then head is ints
//tail - is what type parameter is
//you have to tie all types togther

//what is list type [Nothing]? --> the empty set
//what is type [Any]? anything


//suppose you have var q:Any=5
//q="hello" ...this means Anything can be in it, universal set of all types


//when you make linked list of string and intgers, is it the same nill at the end of them?
//linked list of 1,2,3 in scala:   1::(2::(3::Nil))

//false and true is: false::(true ::Nil) 
//Nilis actually an object



