//Argument Passing

def f (x:String, y:Int) = x * y

f ("hello", 10)

void g (int y) {
  y = y + 1;
}

void f () {
  int x = 1;
  g (x); //calls g with x
  print (x);
}
//what gets printed? 
//passing 1, so g updates 1+1=2, so 2 gets printed

//another behavior: y gets created, and 1 is printed bc it is x
//explantion of g and f:
/*
-f calls g
-evalaytes x to 1
-send a copy of 1 to y
-

*/

//Call By Value (CBV)

/*
void g (int y) {
  y = y + 1;
}

void f () {
  int x = 1;
  g (x);
  print (x);
}

int main (int argc, char **argv) {
	f();
	return 0;
}

*/


//Call by reference
/*
-x contains 1 for example at storage location 1000
-call g
	- this evaluates argument x in l mode
	- get storage location 1000
	-pass 1000 to g
	-x now contians 2
-in g
	-



In java: you look at call stack and heap
-when g runs does it not affect f's data
if f passed x to g, and when g updates to y, is it not seen in x?

Java: is call-by-value but watch out for references
class Ref {
	int n;
}

void f () {
	Ref r= new Ref ()
	r.n=5;
	g(r)
}

*/

