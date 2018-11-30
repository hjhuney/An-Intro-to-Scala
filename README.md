# An Intro to Scala

![Intro to Scala](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/intro_logo_004.jpg "An intro to Scala")

# Table of Contents

**Part 0:**  [An Intro to the Intro](https://github.com/hjhuney/Intro-to-Scala#part-0-intro-to-the-intro)<br>
**Part 1:**  [Installation, Set-Up, and "Hello World"](https://github.com/hjhuney/Intro-to-Scala#part-1-installation-set-up-and-hello-world)<br>
**Part 2:**  [Data Types](https://github.com/hjhuney/Intro-to-Scala#part-2-data-types)<br>
**Part 3:**  [Arithmetic Operators](https://github.com/hjhuney/Intro-to-Scala#part-3-arithmetic-operators)<br>
**Part 4:**  [Variables vs Values](https://github.com/hjhuney/Intro-to-Scala#part-4-variables-vs-values)<br>
**Part 5:** [String Operations](https://github.com/hjhuney/Intro-to-Scala#part-5-string-operations)<br>
**Part 6:**  [Tuples](https://github.com/hjhuney/Intro-to-Scala#part-6-tuples)<br>
**Part 7:**  [Lists](https://github.com/hjhuney/Intro-to-Scala#part-7-lists)<br>

*Work In Progress*

**Part 8:**  [Arrays]()<br>
**Part 9:**  [Sets]()<br>
**Part 10:**  [Maps]()<br>
**Part 11:**  [Logical Operators]()<br>
**Part 12:**  [If Statements]()<br>

**Appendix:** [List of Resources]()<br>



# Part 0: Intro to the Intro

This tutorial is designed to teach introductory Scala as a precursor to learning Apache Spark. 

Scala is an object-oriented and functional programming language. It’s is most closely related to Java, so Java programmers should have a leg up on learning it. However, Scala is designed to be more concise and have features of functional programming languages.

Spark is an open-source cluster-computing framework designed for big data processing. It is written in Scala. Spark can be run in Python ([PySpark](http://spark.apache.org/docs/2.2.0/api/python/pyspark.html)) and R ([SparkR and sparklyr](https://eddjberry.netlify.com/post/2017-12-05-sparkr-vs-sparklyr/)); however, the [best performance](https://www.dezyre.com/article/why-learn-scala-programming-for-apache-spark/198) with Spark can be achieved in Scala.



## Other Resources

I will offer some other sources as both alternatives and references. Jose Portilla's Udemy courses are great and my blog will series will loosely follow the structure for his ["Scala and Spark for Big Data and Machine Learning"](https://www.udemy.com/scala-and-spark-for-big-data-and-machine-learning/) course. If you learn better in video format, I highly recommend that course.

Marius Eriksen of Twitter has published ["Effective Scala"](http://twitter.github.io/effectivescala/), which is available online for free. That's a great resource, as well.

If you're coming from a Python background, you might also check out this [Python to Scala e-book](https://wrobstory.gitbooks.io/python-to-scala/content/index.html), written by [Rob Story](https://github.com/wrobstory). It's "short and sweet" and serves as a good quick reference for all you Pythoners and Pythonistas out there!


# Part 1: Installation, Set-Up, and "Hello World"

## Installing Scala

The first task is to download Scala. You'll need to go through several steps. If you're using Windows 10, I recommend the following tutorial on YouTube

[How to Install and Setup SBT + Scala on Windows 10](https://www.youtube.com/watch?v=uYcSYCGITeU)

You can decide on your own whether you want to install SBT, as well, as there are other options for running Scala (such as [IntelliJ](https://www.jetbrains.com/idea/)).

If you are using a Linux-based OS, here is a similar video for you. I cannot vouch for this, but it's by the same author.

[How to Install and Setup SBT on Ubuntu](https://www.youtube.com/watch?v=uYcSYCGITeU)

Finally, here are some Mac instructions.

[How to Install Scala on Mac](https://www.youtube.com/watch?v=OKiwZFMgnEk)

While I found installing Scala to be more difficult than Python or R, there are plenty of resources out on the web if you're struggling. The good news is this is probably the most challenging part for most people.


## VS Code for Scala

We'll use the command prompt for our early exercises, but we'll eventually need a code editor. I recommend VS Code and I'll walk you through how to download it.

You are obviously free to use other options, such as Atom or Sublime, as well. Alternatively, if you want to use a full IDE, [IntelliJ](https://www.jetbrains.com/idea/) is a good choice and there is a [Scala plug-in](https://plugins.jetbrains.com/plugin/1347-scala) for it.

If you want to use VS Code and do not have it yet, download it [here](https://code.visualstudio.com/).

Once you have VS Code on your computer, launch it. On the left hand side of the screen, you should see some icons. One of these icons is a square of sorts. If you hover it, it should say "Extensions." Click on that.

![SBT plugin installation](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/scala001.jpg "SBT plugin")

In the search bar, enter "Scala". You should see some plug-in options for Scala. Go to "Scala (sbt)" and install it. Screenshot below highlights the box and correct plug-in.

You might also consider some other Scala plug-ins. I haven't messed around much with the others, but I did download the Scala Syntax plug-in, as well.

In any case, now you should be configured for running Scala files.

## Getting Started

Once you have everything installed, you should be able to run Scala through your command prompt. If you follow the instructions successfully and you're running Windows, you can open the command prompt (shortcut: enter "cmd" in the search box at the "Start" menu) and type in:

```
spark-shell
```

This will launch Spark in local mode, which is what we'll use for learning the basics of Scala.

## "Hello World" in Command Prompt** 

Let's start with the simple print statement. Scala's print statements look similar to Java, but a bit more concise.

```
println("Hello world!")
```

And voila! You've now run your first Scala program.

## "Hello World" in VS Code**

We won't need a code editor till we're a few lessons in, but if you also want to make sure Scala works properly in VS Code, then go to File -> New File. Save your file as "hello_world.scala". Enter the correct code in the file and then save.

Now open your terminal: View -> Terminal. Enter "spark-shell" in the terminal just as we did in the command prompt. To run the program, enter:

```
:load hello_world.scala
```

With that, you should get your printout. Let's move onto data types. 



# Part 2: Data Types

**Top:** [Table of Contents](https://github.com/hjhuney/Intro-to-Scala#table-of-contents)<br><br>
**2-1:** [Integers](https://github.com/hjhuney/Intro-to-Scala#integers)<br>
**2-2:** [Doubles](https://github.com/hjhuney/Intro-to-Scala#doubles)<br>
**2-3:** [Strings](https://github.com/hjhuney/Intro-to-Scala#strings)<br>
**2-4:** [Booleans](https://github.com/hjhuney/Intro-to-Scala#booleans)<br>
**2-5:** [Others](https://www.tutorialspoint.com/scala/scala_data_types.htm)

## Integers

Like Java, Scala uses integers and doubles. Open the command prompt and launch the spark-shell. Now, let’s input an integer into the shell.

*input*

```
7
```

*output*

```
res1: Int=7
```

We can see in the output that Scala automatically recognizes “7” as an “Int”.

## Doubles

Next, let’s try a floating point number. Similar to Java, Scala uses a data type called a “double” which is short for double-precision floating point number. Let’s enter the value of Pi into the shell.

*input*

```
3.14
```

*output*

```
res1: Double = 3.14
```

Once again, you can see Scala automatically turned our floating point number into a “double.” Now, let’s do strings.

## Strings

If you’re coming from Python, the biggest thing to note with strings is that you need to use double quotes. I’ll take this opportunity to use my favorite word in the English language into the shell.

*input*

```
val string1 = “Defenestration of Prague”
```

*output*

```
string1: String = Defenestration of Prague
```

For those not “in the know”, defenestration is a fancy way of saying ‘to throw someone out of a window.’

## Booleans

Let’s move onto Booleans, which as you likely know are binary variables (“true” and “false”). We’ll enter “true” in lower-case.

*input*

```
true
```

*output*

```
res1: Boolean = true
```

Simple enough.

## And the Rest 

If you want to see a more exhaustive of Scala data types, visit this [link](https://www.tutorialspoint.com/scala/scala_data_types.htm). A few to note are “Char”, which is a single character (a string is made up of chars). Scala also has a “Null” data type.

```
val x1 = null
```

Also, “Any” is a supertype. A list that contains multiple data types will be “Any”. Now, let’s move onto arithmetic operators.


# Part 3: Arithmetic Operators

* [Back to Table of Contents](https://github.com/hjhuney/Intro-to-Scala#table-of-contents)<br><br>

* [Addition](https://github.com/hjhuney/Intro-to-Scala#addition)<br>
* [Subtraction](https://github.com/hjhuney/Intro-to-Scala#subtraction)<br>
* [Multiplication](https://github.com/hjhuney/Intro-to-Scala#multiplication)<br>
* [Division](https://github.com/hjhuney/Intro-to-Scala#division)<br>
* [Modulus](https://github.com/hjhuney/Intro-to-Scala#modulus)
* [Exponents](https://github.com/hjhuney/Intro-to-Scala#exponents)<br>
* [Square Roots](https://github.com/hjhuney/Intro-to-Scala#square-roots)<br>
* [Absolute Value](https://github.com/hjhuney/Intro-to-Scala#absolute-value)<br>
* [Math Library](https://github.com/hjhuney/Intro-to-Scala#math-library)<br>
* [Order of Operations](https://github.com/hjhuney/Intro-to-Scala#order-of-operations)<br>

## Addition

*input*

```
2+7
```

*output*

```
res1: Int=9
```

## Subtraction

*input*

```
4–2
```

*output*

```
res1: Int=2
```

## Multiplication

Multiplication uses the asterisk (“*”) symbol.

*input*

```
4 * 5
```

*output*

```
res1: Int=20
```

## Division

Division is a bit less straight-forward.

*input*

```
9 / 4
```

*output*

```
res6: Int=2
```

Note that 9/4 = 2.25, but Scala rounds down our result. This is because we divided two integers and the result will also be an integer. In order to get a floating point number, we need to make at least one of the numbers a “double.”

*input*

```
9.0/4
```

*output*

```
res1: Double = 2.25
```

We can see now that we get the proper result. Let’s move onto remainders.

## Modulus

To find the remainder of a number after division, we use the “%” operator.

*input*

```
7 % 2
```

*output*

```
res1: Int = 1
```

Since 7 divided by 2 is equal to 3 with a remainder of 1, we get an output of “1”.

## Exponents

Exponents are a bit less simple in Scala than in Python. We need to access the math library and use the “.pow” method.

*input*

```
math.pow(3,3)
```

*output*

```
res1: Double=27.0
```

## Square Roots

Similar process for square roots.

*input*

```
math.sqrt(64)
```

*output*

```
res1: Double = 8.0
```

## Absolute Value

Absolute value is another good one.

*input*

```
math.abs(-7.8)
```

*output*

```
res1: Double = 7.8
```

## Math Library

You can check out more mathematical operations in the [math library](https://www.scala-lang.org/api/2.12.3/scala/math/index.html). Other features include rounding, logarithms, and trigonometric operations (e.g. sin, cos, tan).

## Order of Operations

Finally, order of operations are pretty straight-forward.

*input*

```
3+4*1+1
```

*output*

```
res10: Int=9
```

*input*

```
(3+4)*(1+1)
```

*output*

```
res11: Int=14
```

# Part 4: "Variables vs Values"

## Variables

In Scala, we have variables and values. The difference between the two is that variables can be reassigned while values cannot. When reassigning variables, however, we must use the same data type.

Open up the spark-shell and let’s start with a variable. We’ll create a variable called “thing1” and make it an “Int” with a value of “7”.

*input*

```
var thing1: Int = 7
```

*output*

```
thing1: Int =7
```

Now, let’s reassign it.

*input*

```
thing1 = 53
```

*output*

```
thing1: Int = 53
```

Note, however, we can not reassign a floating-point number to “thing1”. We will get an error if we try.

*input*

```
thing1 = 4.79
```

*output*

```
<console>:25: error: type mismatch;
 found : Double(4.79)
 required: Int
 thing1 = 4.79
```

## Values

Now, let’s do values. We’ll create a string with my favorite city name of all-time “Sarmizegetusa”, the capital of Roman Dacia.

*input*

```
val city = “Sarmizegetusa”
```

*output*

```
city: String = Sarmizegetusa
```

Just for fun, we’ll try to reassign “Londinium” to “city”

*input*

```
city = “Londinium”
```

*output*

```
<console>:25: error: reassignment to val
 city = “Londinium”
```

No surprise that we get an error since “values” can not be reassigned in Scala.

# Part 5: String Operations

* [ToC](https://github.com/hjhuney/Intro-to-Scala#table-of-contents)<br>
* [Comparison Operators](https://github.com/hjhuney/Intro-to-Scala#comparison-operators)<br>
* [String Concatenation](https://github.com/hjhuney/Intro-to-Scala#string-concatenation)<br>
* [Methods Available](https://github.com/hjhuney/Intro-to-Scala#methods-available)<br>
* [Length](https://github.com/hjhuney/Intro-to-Scala#length)<br>
* [Last](https://github.com/hjhuney/Intro-to-Scala#last)
* [String Interpolation](https://github.com/hjhuney/Intro-to-Scala#string-interpolation)<br>
* [S-Interpolation](https://github.com/hjhuney/Intro-to-Scala#s-interpolation)<br>
* [F-Interpolation](https://github.com/hjhuney/Intro-to-Scala#f-interpolation)<br>
* [Matching](https://github.com/hjhuney/Intro-to-Scala#matching)<br>
* [Contains](https://github.com/hjhuney/Intro-to-Scala#contains)<br>

## Comparison Operators

Let’s take a look at comparison operators. Like Python and Java, you need the double equals sign (“==”) to test equality.

*input*

```
6 == 6
```

*output*

```
res0: Boolean = true
```

Also “!=” is “not equals” in Scala.

*input*

```
6 != 6
```

*output*

```
res1: Boolean = false
```

In this case, 6 “NOT EQUAL TO” 6 is “false”.

## String Concatenation

Let’s do some string concatenation. Enter the three values below.

```
val string1 = “marmot”

val string2 = “dance”

val string3 = “party!”
```

We can use multiplication here to duplicate a string. For instance.

*input*

```
string1*3
```

*output*

```
res1: String=marmotmarmotmarmot
```

Or we can combine the three strings. Note that in the input below, there is a space in each of the quote marks.

*input*

```
val string4 = string1 + “ ”+ string2 + “ ” + string3
```

*output*

```
string4: String = marmot dance party!
```

Unfortunately, I have no images of marmot dance parties saved on my PC, but here’s a marmot!

![marmot](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/marmot.jpg)


## Methods Available

We can find all of the methods available for a string by entering the code below and pressing ‘tab’.

```
string4.
```

Let’s take a look at a couple of them.

## Length

Length, as the name suggests, tells us the number of characters in a string.

*input*

```
string1.length
```

*output*

```
res0: Int = 6
```

Since “marmot” is 6 characters, we get an *output* of “6”.

## Last

Last will give us the last “char” in a string.

*input*

```
string1.last
```

*output*

```
res0: Char = t
```

Let’s move onto string interpolation.

## String Interpolation

For string interpolation, we use ‘s’ or ‘f’ at beginning of a string in front of the quotation marks, then use dollar sign and curly braces.

Let’s create a “value” called “animal” and assign “llamas” to it.

```
val animal = “llamas”
```

## S-Interpolation

For s-interpolation, we use the ‘s’ before the quote marks and we insert a “$” symbol before curly braces that will be around our value.

Now that we have our value (“animal”), let’s create a hosiery ad!

*input*

```
val hosiery_ad = s“Now, you can buy hosiery specifically designed for ${animal}”
```

*output*

```
hosiery_ad: String = Now, you can buy hosiery specifically designed for llamas
```

That’s pretty good news if you’re a llama that has been searching for high-quality hosiery that suits your unique needs!

We can also do s-interpolation within a print statement.

*input*

```
println(s”Larry sells {animal} in Lhasa”)
```

*output*

```
Larry sells llamas in Lhasa
```

Let’s try f-interpolation now.


## F-Interpolation

With f-interpolation, we put an “f” before the quote marks and we use a “$” sign before the value we want to interpolate. For example.

*input*

```
val hosiery_ad = f“Now, you can buy hosiery specifically designed for $animal”
```

*output*

```
hosiery_ad: String = Now, you can buy hosiery specifically designed for llamas
```

We can also use f-interpolation with a print statement by using “printf”. We need to use a format specifier, which is the “%” sign and a “char”. This is not always intuitive; for a string, we’d use “%s”, which makes sense. However, for an integer, we’d use “%d”, which seems like it should represent a “double” (i.e. a floating-point number), but actually %f represents that.

Here’s an example of the f-interpolator in a print statement.

*input*

```
printf(“%d llamas purchased %s for a price of $%f”, 62, “hosiery”, 5.99)
```

*output*

```
62 llamas purchased hosiery for a price of $5.99
```

For a full guide on format specifiers, check out the Scala Cookbook’s section on “Substituting Variables into Strings”
Indexing

Now we move on to indexing. Remember that string1 has been assigned the string “marmot”. We’ll use “.charAt” to find the “char” at index-2, which will be the 3rd character in the string (since the index starts at 0).

*input*

```
string1.charAt(2)
```

*output*

```
Char = r
```

We can use “.indexOf” to find where a character is located in the string.

*input*

```
string1.indexOf(“m”)
```

*output*

```
Int = 0
```

Note that while there are two m’s in “marmot”, the .indexOf method will only give us the first one, which is at index-0.
Slicing

Onto slicing and here we’ll simply type our value (“string4” in this case), “slice”, and the beginning and end indices separated by a comma. See the example below, which will extract “dance” out of “marmot dance party”.

*input*

```
string4 slice (7,12)
```

*output*

```
res1: String = dance
```

## Matching

We can also use “matches” to find equivalence. In the example below, we test whether string1 matches “marmot”.

*input*

```
string1 matches “marmot”
```

*output*

```
res1: Boolean = true
```

However, when we uses “matches”, itneeds to be an exact match. Here’s another example using “string4”, which is “marmot dance party”.

*input*

```
string4 matches “marmot”
```

*output*

```
res1: Boolean = false
```

## Contains

If instead of an exact match, we merely wanted to tested whether a string contained a certain pattern, we’d use “contains”, as in the example below.

*input*

```
string4 contains “marmot”
```

*output*

```
res1: Boolean = true
```

Now it resolves to “true” since “marmot dance party” does contain the pattern “marmot” within it.


# Part 6: Tuples

In Scala, tuples are immutable and can hold elements of different types. Here’s an example.

*input*

```
val junk_tup = (6, 3.14, “elephant”, true)
```

*output*

```
junk_tup: (Int, Double, String, Boolean) = (6,3.14,elephant,true)
```

## Indexing Tuples

Tuples start at index “1” rather than “0” and have a unique indexing method as illustrated below.

*input*

```
junk_tup._2
```

*output*

```
res0: Double = 3.14
```

In this example, we grabbed the 2nd element from our tuple, which was “3.14”.

# Part 7: Lists

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


# Part 8: Arrays

## Overview of Arrays

In Scala, one of the biggest differences between a list and an array is that a list is immutable (i.e. unable to be changed), while arrays are mutable. Lists are typically used more frequently. 

Scala arrays are similar to Java arrays, but have some added functionality, as well. Scala arrays can be generic and they are compatabile with sequences. 

## Create an Array

*input*

```
val array1 = Array(3,6,9)
```

*output*

```
array1: Array[Int] = Array(3, 6, 9)
```

*input*

```
val array2 = Array(3.14, 62, "walrus")
```

*output*

```
array2: Array[Any] = Array(3.14, 62, walrus)
```

## Ranges

To populate an array with a range, we *input* the starting index, ending index, and we can also implement step argument. It follows the basic format below:

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

# Part 9: Sets

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

We'll create a list

val listy_mcgillicuddy = List(6, 8, 8, 12, 13, 13, 19)

Now, we'll cast it to a set. 

```
val set_mcgillicuddy = listy_mcgillicuddy.toSet
```

*output*

```
set_mcgillicuddy: scala.collection.immutable.Set[Int] = Set(6, 13, 12, 8, 19)
```

Note that the set eliminates the duplicates since a set can only contain unique values. Also remember that a set is unordered so we can not slice or index it.

# Part 10: Maps

## Creating a Map
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

We can always use the "get" keyword to do this, as shown in the example below. 

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

Finally, let's take a look at how to grab at the keys and values. This is simple. The method for keys is ".keys" and the method for values is ".values". 

*input*

```
animals_map.
```

*output*

```
res0: Iterable[String] = Set(aardvark, bison, cheetah, dingo)
```

*input*

```
animals_map.keys
```

*output*

```
res0: Iterable[Int] = MapLike(1, 2, 3, 4)
```

*input*

```

```

*output*

```

```


*input*

```

```

*output*

```

```


*input*

```

```

*output*

```

```


*input*

```

```

*output*

```

```


# Part 11: Logical Operators

Now we're moving onto flow control, with if statements, for loops, etc. We're going to move away from the command prompt and switch to a text editor. You're free to use your editor or IDE of preference, of course, but I'll be using VS Code. If you need to know how to get Scala running in VS Code, check out Part 1 in my series.

## And Operator

In Scala, "&&" is the "AND" operator. For example:

*input*

```
println(("aardvark" == "aardvark") && ("quokka" == "aardvark"))
```

*output*

```
false
```

In this case, since only 1 of the 2 conditions is true, the operation evaluates out to "false". 

## Or 

Now we'll use the "OR" operator, which is "||". We'll use the exact same statement, except with as an or-statement. 

*input*

```
println(("aardvark" == "aardvark") || ("quokka" == "aardvark"))
```

*output*

```
true
```

This time it evaluates to "true" since only one of the statements needs to be true. 

## Not Operator

Finally, let's do the "NOT" operator which is "!". 

*input

```
println(!("aardvark" == "aardvark"))
```

*output*

```
false
```

In this instance, ("aardvark" == "aardvark") evaluates to true. Since we put the "!" operator in front of this statement, it will return the reverse, which is "false". 

# If Statements

With the logical operators out of the way, let's work on if statements. In Scala, we follow the if -> else if -> else line of logic. 
First, let's create a list of animals. 

```
var animals = List("aardvark", "hedgehog", "walrus")
```

Now, we'll try out first "if statement" which tests whether the list contains both "aardvark" and "walrus" in it. 



Next, let's take a look at an if statement with an "else if" clause. 

Error: note in the image above that the last bar (after the final curly brace) is actually the cursor, not code. 
Since only one condition in the "if" clause is true, it evaluates to "false". However, the "else if" clause contains an "or" statement that evaluates to true. 

Finally, let's run the whole shebang by adding an "else" clause. 

Welcome to Marmot Land, my friends!







# Resources

Jose Portilla, Scala and Spark for Bit Data & Machine Learning (Udemy course), [Link](https://www.udemy.com/scala-and-spark-for-big-data-and-machine-learning/)<br>
Marius Eriksen. Effective Scala, [Link](http://twitter.github.io/effectivescala/)<br>
Rob Story, Python to Scala, [Link](https://wrobstory.gitbooks.io/python-to-scala/content/index.html)<br>

