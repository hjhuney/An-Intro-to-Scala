
# Part 8: Arrays


[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**8-1:** [Overview of Arrays](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-08-Arrays.md#overview-of-arrays)<br>
**8-2:** [Create an Array](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-08-Arrays.md#overview-of-arrays)<br>
**8-3:** [Ranges](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-08-Arrays.md#ranges)<br>



## Overview of Arrays

In Scala, one of the biggest differences between a list and an array is that a list is immutable (i.e. unable to be changed), while arrays are mutable. Lists are typically used more frequently. 

Scala arrays are similar to Java arrays, but have some added functionality, as well. Scala arrays can be generic and they are compatabile with sequences. 

## Create an Array

Let's create an array of integers. 

*input*

```
val array1 = Array(3,6,9)
```

*output*

```
array1: Array[Int] = Array(3, 6, 9)
```

We can also create an array of mixed types, such as the one below. 

*input*

```
val array2 = Array(3.14, 62, "walrus")
```

*output*

```
array2: Array[Any] = Array(3.14, 62, walrus)
```

## Ranges

To populate an array with a range, we input the starting index, ending index, and we can also implement step argument. It follows the basic format below:

```
Array.range(start, end, step)
```

Here's an example of an array which starts at 0 goes to 27 and has a step size of 3. Note that since 27 is the end point, this array does not include 27. 

*input*

```
val array3 = Array.range(0,27,3)
```

*output*

```
array3: Array[Int] = Array(0, 3, 6, 9, 12, 15, 18, 21, 24)
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
