# Part 9: Sets

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**9-1:** [Creating a Set](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-09-Sets.md#creating-a-set)<br>
**9-2:** [Mutable Sets](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-09-Sets.md#mutable-sets)<br>
**9-3:** [Cast a List to a Set](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-09-Sets.md#cast-a-list-to-a-set)<br>


## Creating a Set

A set is a collection with no duplicate elements. In Scala, we can create both immutable and mutable sets. First, let's create an empty set. 

*input*

```
val set1 = Set()
```

*output*

```
set1: scala.collection.immutable.Set[Nothing] = Set()
```

By default, we can see that this set is immutable. Now, let's give the set some data. 

*input*

```
val set1 = Set(1,5,9)
```

*output*

```
set1: scala.collection.immutable.Set[Int] = Set(1, 5, 9)
```

## Mutable Sets

Now, let's create a mutable set. 

*input*

```
val mutable_set1 = collection.mutable.Set(1,5,9)
```

*output*

```
mutable_set1: scala.collection.mutable.Set[Int] = Set(9, 1, 5)
```

We can now add an integer to the mutable set. 

*input*

```
mutable_set1 += 27
```

*output*

```
res1: mutable_set1.type = Set(9, 27, 1, 5)
```

We can also use ".add" to add an integer to a mutable set.

*input*

```
mutable_set1.add(77)
```

*output*

```
res1: Boolean = true
```

Notice that in this case, adding an integer to the set gives us a return value of "Boolean = true" rather than the set itself, but we can simply call the set and get this result. 

```
res1: scala.collection.mutable.Set[Int] = Set(9, 27, 1, 5, 77)
```

## Cast a List to a Set

There are many instances where we might want to turn a list into a set. Let's first create a list. 

```
val listy_mcgillicuddy = List(6, 8, 8, 12, 13, 13, 19)
```

Now, we'll cast it to a set with the .toSet method. 

```
val set_mcgillicuddy = listy_mcgillicuddy.toSet
```

*output*

```
set_mcgillicuddy: scala.collection.immutable.Set[Int] = Set(6, 13, 12, 8, 19)
```

Note that the set eliminates the duplicates since a set can only contain unique values. Also remember that a set is unordered so we can not slice or index it.

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
