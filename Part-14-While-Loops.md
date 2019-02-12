# Part 14: While Loops


[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**14-1:** [Creating a While Loop](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-14-While-Loops.md#creating-a-while-loop)<br>
**14-2:** [While Loop with Break](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-14-While-Loops.md#while-loop-with-break)<br>

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


## While Loop with Break

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

## Project Table of Contents

**Part 1:**  [Installation, Set-Up, and "Hello World"](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-01-Installation-and-Setup.md)<br>
**Part 2:**  [Data Types](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-02-Data-Types.md)<br>
**Part 3:**  [Arithmetic Operators](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md)<br>
**Part 4:**  [Variables vs Values](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-04-Variables-vs-Values.md)<br>
**Part 5:** [String Operations](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md)<br>
**Part 6:**  [Tuples](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-06-Tuples.md)<br>
**Part 7:**  [Lists](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md)<br>
**Part 8:**  [Arrays](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-08-Arrays.md)<br>
**Part 9:**  [Sets](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-09-Sets.md)<br>
**Part 10:**  [Maps](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md)<br>
**Part 11:**  [Logical Operators](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-11-Logical-Operators.md)<br>
**Part 12:**  [If Statements](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-12-If-Statements.md)<br>
**Part 13:** [For Loops](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-13-For-Loops.md)<br>
**Part 14:** [While Loops](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-14-While-Loops.md)<br>
**Part 15:** [Functions](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-15-Functions.md)<br>
