//L Values

//what does x=x +1; mean
//right hand side: read current location storing x, read value x out
//left size: storing location you want to write into, give me storage location i can read


//R MODE and L Mode
//r mode: right hand side--reading from it

//l mode: looking for storage location


//NOT L VALUES:
/* In C:

int x = 5;
int y = 6;
int *p = &(x + y); // not allowed
(x + y) = 7;       // not allowed
you cant assign x+ y because doesnt denote storage location: x+ y is not an l value
*/


//further l values
//how do you evaluate the n?  arr[n + 2] = 7;
//read value of n, use index of array and determine address of that array index
//calaucate in index in r mode

/*

variable x=20;
array position array [n+1]=20;
array_1 [arr_2[n+1]]= 20
//here n+1 is evaulated in r mode
//arr2 is in r mode, that index in arr_1
//arr1 is evaluated in l mode


class C {
	int f;

}
//feild c.f=20;

class D{
	C c;]
}	
//D d = new D();
//(d.c).f=20;
//variable of type d, go into it's c object with points to instance of c, which has field f. we write 20 in that f.
//which adress we get when we evaluate (d.c).f=20; ? we get feild f in instance of c
(d.c) =in l mode
.f = in r mode


C[] arr = ....;
arr[5].f= 20;
reference to soemthing of type C, update f field in c instance
-are you assigning into variable or field?


-suppose you declare method foo that returns type C
C foo () {...}
foo()
-you get back something with type c
-foo()lf=20; 
//assigning 20 to what you get in return

*/
