//Red Black Trees

trait Color
object Red   extends Color
object Black extends Color

trait Tree[+K,+V]
case object Leaf extends Tree[Nothing,Nothing]
case class  Node[+K,+V] (k:K, v:V, c:Color, l:Tree[K,V], r:Tree[K,V]) //mapping K to V, and a left subtree and right subtree
 
  extends Tree[K,V]

def rotateLeft  [K,V] (t:Node[K,V]) : Node[K,V] = {
  t match {
    case Node (k1, v1, c, l, Node (k2, v2, Red, m, r)) =>
      Node (k2, v2, c, Node (k1, v1, Red, l, m), r)
    case _ => 
      throw new RuntimeException ("does not match: " + t)
  }
}

//how does rotate look like?
//rotateLeft: given a node of tree, returnnew top of tree --> PATTERN MATCH
//case Node: fi this tree has some color C we dont know and left subtree
	//t must be node of k1 going to v1, with subtree l
	//right hand subtree must be node, taking k2 to v1, must be red, must have subtrees m and r
//built up result : Node (k2, v2, c, Node (k1, v1, Red, l, m), r)
	//k2 builfing to v2
	//left hand side has stuff, right hand has r, node k1 going to v1, colored red, with subtrees l and m

