# Part 14: While Loops


## Creating a While Loop

While loops have a similar format to for loops in Scala. We'll create a while loop, with a variable "x" defined as "0". If "x" is less than 5, then we will print "x" and add 1 to it. 

*input*

```
var x = 0

while(x < 5){
    println(s"x is currently $x; adding 1 to x")
    x = x + 1
}
```

*output*

```
x: Int = 0
x is currently 0; adding 1 to x
x is currently 1; adding 1 to x
x is currently 2; adding 1 to x
x is currently 3; adding 1 to x
x is currently 4; adding 1 to x

```


## Break

In order to "break" in Scala, we need to import the "break" keyword. 

```
// import break keyword
import util.control.Breaks._
```

We'll write a similar while loop as the previous one, but we'll use a break if our variable "y" is equal to 3. 

*input*

```
var y = 0

while(y < 10) {
    println(s"y is currently $y; adding 1 to y")
  
    y = y + 1
    if(y==3) break
}
```

*output*

```
import util.control.Breaks._
y: Int = 0
y is currently 0; adding 1 to y
y is currently 1; adding 1 to y
y is currently 2; adding 1 to y
scala.util.control.BreakControl
```
