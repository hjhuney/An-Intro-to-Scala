# Part 10: Maps

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**10-1:** [Creating a Map](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#creating-a-map)<br>
**10-2:** [Indexing](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#indexing)<br>
**10-3:** [Creating a Mutable Map](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#creating-a-mutable-map)<br>
**10-4:** [Adding a Key-Value Pair](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#adding-a-key-value-pair)<br>
**10-5:** [Get Keys and Values](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#get-keys-and-values)<br>


## Creating a Map

In Scala, maps are similar to dictionaries in Python. For those coming from a Python background, you might want to check out this [comparison between Python dictionaries and Scala maps](https://medium.com/r/?url=https%3A%2F%2Fwrobstory.gitbooks.io%2Fpython-to-scala%2Fcontent%2Fmaps%2FREADME.html). Maps can be immutable or mutable.

Let's start by creating a map. We'll use animals and assign them a number. By default, we'll create an immutable map. 

*input*

```
val animals_map = Map(("aardvark", 1), ("bison", 2), ("cheetah", 3), ("dingo", 4))
```

*output*

```
animals_map: scala.collection.immutable.Map[String,Int] = Map(aardvark -> 1, bison -> 2, cheetah -> 3, dingo -> 4)
```

## Indexing

Next, we should know how to find values within a map. In this example, we'll index "aardvark" to find its assigned value of "1". 

*input*

```
animals_map("aardvark")
```

*output*

```
res0: Int = 1
```

We can always use the "get" keyword to do this, as well, as shown in the example below. 

*input*

```
animals_map get "aardvark"
```

*output*

```
res0: Option[Int] = Some(1)
```

## Creating a Mutable Map

Now, let's look at how to create a mutable map. It's slightly more complex, but here goes. 

*input*

```
val animals_mutable = collection.mutable.Map(("elephant", 5), ("fox", 6), ("gecko", 7))
```

*output*

```
animals_mutable: scala.collection.mutable.Map[String,Int] = Map(elephant -> 5, fox -> 6, gecko -> 7)
```

## Adding a Key-Value Pair

For a mutable map, we can add a key-value pair. We use the "+=" operator to do this, but it's also very important to note that we enter the added key-value pair differently than when we created the map. Instead of the using code like "("hippo", 8)", we instead need to use the arrow symbol ("->") like in the example below. 

*input*

```
animals_mutable += ("hippo" -> 8)
```

*output*

```
res0: animals_mutable.type = Map(elephant -> 5, fox -> 6, gecko -> 7, hippo -> 8)
```

## Get Keys and Values

Finally, let's take a look at how to grab at the keys and values. This is simple. The method for keys is ".keys". 

*input*

```
animals_map.keys
```

*output*

```
res0: Iterable[String] = Set(aardvark, bison, cheetah, dingo)
```

Likewise, the method for values is ".values". 

*input*

```
animals_map.keys
```

*output*

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
res0: Iterable[Int] = MapLike(1, 2, 3, 4)
