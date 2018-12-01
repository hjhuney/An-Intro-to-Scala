
# Part 7: Lists

**Top:** [Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**7-1:** [Creating a List](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#creating-a-list)<br>
**7-2:** [Indexing](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#indexing)<br>
**7-3:** [List Attributes](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#list-attributes)<br>
**7-4:** [Head](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#head)<br>
**7-5:** [Tail](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#tail)<br>
**7-6:** [Take](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#take)<br>
**7-7:** [Contains](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#contains)<br>
**7-8:** [Sort](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#fsort)<br>
**7-9:** [Size](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#size)<br>
**7-10:** [Min & Max](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#min--max)<br>
**7-11:** [Sum & Product](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#sum-and-product)<br>
**7-12:** [Drop](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#drop)<br>
**7-13:** [TakeRight](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#takeright)<br>
**7-14:** [Embedded List](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#embedded-list)<br>
**7-15:** [Slicing](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#slicing)<br>
**7-16:** [List of Tuples](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#list-of-tuples)<br>
**7-17:** [Adding Elements](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-07-Lists.md#adding-elements-to-a-list)<br>


## Creating a List

For those coming from a Python background, you’ll find there are significant differences with lists between Python and Scala. In Python, lists are mutable. You can easily add elements.

In Scala, lists are immutable. There is, however, a mutable version of a list called a “ListBuffer”. For now, we’ll deal solely with the immutable version.

Let’s create a list of four animals.

*input*

```
val animals = List(“aardvark”, “penguin”, “hippo”, “sloth”)
```

*output*

```
animals: List[String] = List(“aardvark”, “penguin”, “hippo”, “sloth”)
```

Note that the list has a data type. In this case, it’s “String” since all four entries are strings.

Next, let’s create a list of numbers. This list will only be integers.

*input*

```
val numbers = List(62,9,2,7)
```

*output*

```
numbers: List[Int] = List(62,9,2,7)
```

We can also create lists with mixed data types. In the example below, I create a list with a string, an integer, a double, and a Boolean.

*input*

```
val stuff1 = List(“aardvark”, 62, 3.14, false)
```

*output*

```
stuff1: List[Any] = List(“aardvark”, 62, 3.14, false)
```

Note that when I create a list with multiple data types, it will use the “Any” data type.

## Indexing

Indexing lists in Scala is straight-forward. We simply input the list name and, in parenthesis, the index number. The index starts at “0” for lists. For example, using our “numbers” list, if we find what is at index “2”, we’ll get the result “2” (which is the 3rd entry in the list).

*input*

```
numbers(2)
```

*output*

```
res1: Int = 2
```

For our animals list, index “0” will give us “aardvark.”

*input*

```
stuff1(0)
```

*output*

```
res1: Any = aardvark
```

## List Attributes

To see all the methods available for a list, enter the list name, followed by a period, and then press ‘Tab’.

```
stuff1.
```

Here are a few list methods that are useful.

## Head

Head returns the first item in a list. This is slightly different than the .head() Python users might be accustomed to in Pandas.

*input*

```
stuff1.head
```

*output*

```
res1: Any = aardvark
```

## Tail

Tail *output*s everything but the head in a Scala list.

*input*

```
stuff1.tail
```

*output*

```
res1: List[Any] = List(62, 3.14, false)
```

## Take

Take allows us to see the first N elements of a list. For Python users, “.take” is similar to “.head()” in Pandas.

*input*

```
numbers.take(3)
```

*output*

```
res1: List[Int] = List(62,9,2)
```

## Contains

The “contains” method allows us to search for a value in a list. Here’s an example using our numbers list.

*input*

```
numbers.contain(62)
```

*output*

```
res1: Boolean = true
```

## Sort

We can also sort our lists with “.sorted”.

*input*

```
numbers.sorted
```

*output*

```
res1: List[Int] = List(2, 7, 9, 62)
```

## Size

The “.size” method will give us the number of elements in a list, similar to “len()” in Python.

*input*

```
stuff1.size
```

*output*

```
res1: Int = 4
```

## Min & Max

Two obvious features are “.min” and “.max”, which give you precisely what you’d expect.

*input*

```
numbers.min
```

*output*

```
res1: Int = 2
```

*input*

```
numbers.max
```

*output*

```
res1: Int = 62
```

## Sum and Product

Sum and product are two useful methods for Scala lists.

*input*

```
numbers.sum
```

*output*

```
res1: Int = 80
```

*input*

```
numbers.product
```

*output*

```
res1: Int = 7812
```

## Drop

The drop function is sort of like the reverse of “take”. It drops the first N elements.

*input*

```
numbers.drop(2)
```

*output*

```
res1: List[Int] = List(2,7)
```

## TakeRight

The “.takeRight” method is similar to “.take” except, as you probably guessed, it starts from the right side of the list, rather than from index “0”.

*input*

```
numbers.takeRight(3)
```

*output*

```
res1: List[Int] = List(9,2,7)
```

## Embedded List

In Scala, we can embed a list inside a list. An example is below.

*input*

```
val combo = List(List(2,7,9), List(62, 33,4))
```

*output*

```
combo: List[List[Int]] = List(List(2,7,9), List(62, 33,4))
```

## Slicing

We use “slice” to slice a list. In the example below, we slice our mixed (“Any” type) list named “stuff1” starting at index “1” to index “3” (which means we’ll get index 1 through 2 only).

*input*

```
stuff1 slice (1,3)
```

*output*

```
res1: List[Any] = List(62, 3.14)
```

## List of Tuples

We can create a list of tuples. See example below.

*input*

```
val list_of_tuples = List((“aardvark”, 1), (“hippo”, 2), (“hedgehog”, 3))
```

*output*

```
list_of_tuples: List[(String, Int)] = List((aardvark, 1), (hippo, 2), (hedgehog, 3))
```

## Adding Elements to a List

If lists are immutable, then the obvious question is “how do we add new items to a list?” There are a few ways. One is that you could declare your list a “var” instead of a “val”. While you can’t directly add items this way, you can reassign the result in a way that effectively takes your old list and adds a new element.

Let’s create a new “animals” list (as a “var”).

```
var animals = List(“aardvark”, “penguin”, “hippo”, “sloth”)
```

Now, let’s add a “quokka” to it by reassigning the list.

*input*

```
animals = “quokka” :: animals
```

*output*

```
animals: List[String] = List(quokka, aardvark, penguin, hippo, sloth)
```

Another method using similar logic would be to create a new list. We’ll add “zebra” to our “animals” list by creating a new list called “animals2”.

*input*

```
val animals2 = “zebra” :: animals
```

*output*

```
animals2: List[String] = List(zebra, quokka, aardvark, penguin, hippo, sloth)
```
