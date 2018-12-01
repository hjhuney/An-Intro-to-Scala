
# Part 8: Arrays

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
