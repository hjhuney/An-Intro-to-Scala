# An Intro to Scala

**Part 0:**  [An Intro to the Intro](https://github.com/hjhuney/Intro-to-Scala#part-0-intro-to-the-intro-to-scala)

**Part 1:**  [Installation, Set-Up, and "Hello World"](https://github.com/hjhuney/Intro-to-Scala#part-1-installation-setup-and-hello-world)

**Part 2:**  [Data Types](https://github.com/hjhuney/Intro-to-Scala#part-2-data-types)

**Part 3:**  [Arithmetic Operators](https://github.com/hjhuney/Intro-to-Scala#part-2-data-types--arithmetic-operators)

**Part 4:**  [Variables vs Values + String Operations](https://medium.com/@hjhuney/an-intro-to-scala-part-3-variables-vs-values-string-operations-2a5c7b612163)

**Part 5:** [Lists + Tuples](https://medium.com/@hjhuney/an-intro-to-scala-part-4-lists-tuples-85e023f15e75)

**Part 5:**

**Part 6:**

**Part 7:**


# Part 0: Intro to the Intro

![Intro to Scala](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/intro_logo_004.jpg "An intro to Scala")

This tutorial is designed as a precursor to learning Apache Spark. Spark is an open-source cluster-computing framework designed for big data processing. It is written in Scala. Spark can be run in Python ([PySpark](http://spark.apache.org/docs/2.2.0/api/python/pyspark.html)) and R ([SparkR and sparklyr](https://eddjberry.netlify.com/post/2017-12-05-sparkr-vs-sparklyr/)); however, the [best performance](https://www.dezyre.com/article/why-learn-scala-programming-for-apache-spark/198) with Spark can be achieved in Scala.

Scala is an object-oriented and functional programming language. It’s is most closely related to Java, so Java programmers should have a leg up on learning it. However, Scala is designed to be more concise and have features of functional programming languages.

**References and Resources** 

I will offer some other sources as both alternatives to my own blogs as well as references. Jose Portilla's Udemy courses are great and my blog will series will loosely follow the structure for his ["Scala and Spark for Big Data and Machine Learning"](https://www.udemy.com/scala-and-spark-for-big-data-and-machine-learning/) course. If you learn better in video format, I highly recommend that course.

Marius Eriksen of Twitter has published ["Effective Scala"](http://twitter.github.io/effectivescala/), which is available online for free. That's a great resource, as well.

If you're coming from a Python background, you might also check out this [Python to Scala e-book](https://wrobstory.gitbooks.io/python-to-scala/content/index.html), written by [Rob Story](https://github.com/wrobstory). It's pretty short and sweet and serves as a good quick reference for all you Pythoners and Pythonistas out there!

**Learning Assumptions for this Series**

Before we start, let's get some assumptions out of the way. Scala is rarely one's first programming language, so while I try to start out pretty basic, I assume you have basic knowledge of at least one language, whether it be Python, R, Java, JavaScript, etc.

I come more from a Python background so I probably think more like a 'Python programmer'. That may come through at times.

I am also using a Windows 10 machine, which probably won't impact too much in this tutorial beyond installation and setup, but it's worth noting. Your experience may vary slightly.

Finally, I'll note that through these early articles, I will follow a format that labels input code and output. For instance:

*input*

```
Scala code goes here
```

*output*

```
res0: this is the output in the shell resulting from the code
```

With that, let's get started.

# Part 1: Installation, Set-Up, and "Hello World"

The first task is to download Scala. Admittedly, this can be one of the more challenging parts of the process. You'll need to go through several steps. If you're using Windows 10, I recommend the following tutorial on YouTube

[How to Install and Setup SBT + Scala on Windows 10](https://www.youtube.com/watch?v=uYcSYCGITeU)

You can decide on your own whether you want to install SBT, as well, as there are other options for running Scala (such as [IntelliJ](https://www.jetbrains.com/idea/)).

If you are using a Linux-based OS, here is a similar video for you. I cannot vouch for this, but it's by the same author.

[How to Install and Setup SBT on Ubuntu](https://www.youtube.com/watch?v=uYcSYCGITeU)

Finally, here are some Mac instructions.

[How to Install Scala on Mac](https://www.youtube.com/watch?v=OKiwZFMgnEk)

While I found installing Scala to be more difficult than Python or R, there are plenty of resources out on the web if you're struggling. The good news is this is probably the most challenging part for most people.

**VS Code for Scala** 

We'll use the command prompt for our early exercises, but we'll eventually need a code editor. I recommend VS Code and I'll walk you through how to download.

You are obviously free to use other options, such as Atom or Sublime, as well. Alternatively, if you want to use a full IDE, IntelliJ is a good choice and there is a Scala plug-in for it.

If you want to use VS Code and do not have it yet, download it here.

Once you have VS Code on your computer, launch it. On the left hand side of the screen, you should see some icons. One of these icons is a square of sorts. If you hover it, it should say "Extensions." Click on that.

![SBT plugin installation](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/scala001.jpg "SBT plugin")

In the search bar, enter "Scala". You should see some plug-in options for Scala. Go to "Scala (sbt)" and install it. Screenshot below highlights the box and correct plug-in.

You might also consider some other Scala plug-ins. I haven't messed around much with the others, but I did download the Scala Syntax plug-in, as well.

In any case, now you should be configured for running Scala files.

**Getting Started**

Once you have everything installed, you should be able to run Scala through your command prompt. If you follow the instructions successfully and you're running Windows, you can open the command prompt (shortcut: enter "cmd" in the search box at the "Start" menu) and type in:

```
spark-shell
```

This will launch Spark in local mode, which is what we'll use for learning the basics of Scala.

**"Hello World" in Command Prompt** 

Let's start with the simple print statement. Scala's print statements look similar to Java, but a bit more concise.

```
println("Hello world!")
```

And voila! You've now run your first Scala program.

**"Hello World" in VS Code**

We want need a code editor till we're a few lessons in, but if you also want to make sure Scala works properly in VS Code, then go to File -> New File. Save your file as "hello_world.scala". Enter the correct code in the file and then save.

Now open your terminal: View -> Terminal. Enter "spark-shell" in the terminal just as we did in the command prompt. To run the program, enter:

```
:load hello_world.scala
```

With that, you should get your printout. Let's move onto data types. 



# Part 2: Data Types

**Integers**

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

**Doubles**

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

**Strings**

If you’re coming from Python, the biggest thing to note with strings is that you need to use double quotes. I’ll take this opportunity to use my favorite word in the English language into the shell.

*input*

val string1 = “Defenestration of Prague”

*output*

string1: String = Defenestration of Prague

For those not “in the know”, defenestration is a fancy way of saying ‘to throw someone out of a window.’

**Booleans**

Let’s move onto Booleans, which as you likely know are binary variables (“true” and “false”). We’ll enter “true” in lower-case.

*input*

true

*output*

res1: Boolean = true

Simple enough.

**And the Rest …**

If you want to see a more exhaustive of Scala data types, visit this [link](https://www.tutorialspoint.com/scala/scala_data_types.htm). A few to note are “Char”, which is a single character (a string is made up of chars). Scala also has a “Null” data type.

val x1 = null

Also, “Any” is a supertype. A list that contains multiple data types will be “Any”. Now, let’s move onto arithmetic operators.

# Part 3: Arithmetic Operators

**Addition**

If you know another programming language, this will likely be very simple, so we’ll work through it quickly.

*input*

2+7

*output*

res1: Int=9

Exactly what you likely expect for addition.
Subtraction

*input*

4–2

*output*

res1: Int=2

Multiplication

Multiplication uses the asterisk (“*”) symbol.

*input*

4 * 5

*output*

res1: Int=20

Division

Division is a bit less straight-forward.

*input*

9 / 4

*output*

res6: Int=2

Note that 9/4 = 2.25, but Scala rounds down our result. This is because we divided two integers and the result will also be an integer. In order to get a floating point number, we need to make at least one of the numbers a “double.”

*input*

9.0/4

*output*

res1: Double = 2.25

We can see now that we get the proper result. Let’s move onto remainders.
Modulus / Remainder

To find the remainder of a number after division, we use the “%” operator.

*input*

7 % 2

*output*

res1: Int = 1

Since 7 divided by 2 is equal to 3 with a remainder of 1, we get an output of “1”.

**Exponents**

Exponents are a bit less simple in Scala than in Python. We need to access the math library and use the “.pow” method.

*input*

math.pow(3,3)

*output*

res1: Double=27.0

**Square Root**

Similar process for square roots.

*input*

math.sqrt(64)

*output*

res1: Double = 8.0

**Absolute Value**

Absolute value is another good one.

*input*

math.abs(-7.8)

*output*

res1: Double = 7.8

**Math Library**

You can check out more mathematical operations in the math library. Other features include rounding, logarithms, and trigonometric operations (e.g. sin, cos, tan).

**Order of Operations**

Finally, order of operations are pretty straight-forward.

*input*

3+4*1+1

*output*

res10: Int=9

*input*

(3+4)*(1+1)

*output*

res11: Int=14

# Part 4: "Variables vs Values"

**Variables**

In Scala, we have variables and values. The difference between the two is that variables can be reassigned while values cannot. When reassigning variables, however, we must use the same data type.

Open up the spark-shell and let’s start with a variable. We’ll create a variable called “thing1” and make it an “Int” with a value of “7”.

input

var thing1: Int = 7

output

thing1: Int =7

Now, let’s reassign it.

input

thing1 = 53

output

thing1: Int = 53

Note, however, we can not reassign a floating-point number to “thing1”. We will get an error if we try.

input

thing1 = 4.79

output

<console>:25: error: type mismatch;
 found : Double(4.79)
 required: Int
 thing1 = 4.79

Values

Now, let’s do values. We’ll create a string with my favorite city name of all-time “Sarmizegetusa”, the capital of Roman Dacia.

input

val city = “Sarmizegetusa”

output

city: String = Sarmizegetusa

Just for fun, we’ll try to reassign “Londinium” to “city”

input

city = “Londinium”

output

<console>:25: error: reassignment to val
 city = “Londinium”

No surprise that we get an error since “values” can not be reassigned in Scala.
Comparison Operators

Let’s take a look at comparison operators. Like Python and Java, you need the double equals sign (“==”) to test equality.

input

6 == 6

output

res0: Boolean = true

Also “!=” is “not equals” in Scala.

input

6 != 6

output

res1: Boolean = false

In this case, 6 “NOT EQUAL TO” 6 is “false”.
String Concatenation

Let’s do some string concatenation. Enter the three values below.

val string1 = “marmot”

val string2 = “dance”

val string3 = “party!”

We can use multiplication here to duplicate a string. For instance.

input

string1*3

output

res1: String=marmotmarmotmarmot

Or we can combine the three strings. Note that in the input below, there is a space in each of the quote marks.

input

val string4 = string1 + “ ”+ string2 + “ ” + string3

output

string4: String = marmot dance party!

Unfortunately, I have no images of marmot dance parties saved on my PC, but here’s a marmot …
Methods Available

We can find all of the methods available for a string by entering the code below and pressing ‘tab’.

string4.

Let’s take a look at a couple of them.
Length

Length, as the name suggests, tells us the number of characters in a string.

input

string1.length

output

res0: Int = 6

Since “marmot” is 6 characters, we get an output of “6”.
Last

Last will give us the last “char” in a string.

input

string1.last

output

res0: Char = t

Let’s move onto string interpolation.
String Interpolation

For string interpolation, we use ‘s’ or ‘f’ at beginning of a string in front of the quotation marks, then use dollar sign and curly braces.

Let’s create a “value” called “animal” and assign “llamas” to it.

val animal = “llamas”

S-Interpolation

For s-interpolation, we use the ‘s’ before the quote marks and we insert a “$” symbol before curly braces that will be around our value.

Now that we have our value (“animal”), let’s create a hosiery ad!

input

val hosiery_ad = s“Now, you can buy hosiery specifically designed for ${animal}”

output

hosiery_ad: String = Now, you can buy hosiery specifically designed for llamas

That’s pretty good news if you’re a llama that has been searching for high-quality hosiery that suits your unique needs!

We can also do s-interpolation within a print statement.

input

println(s”Larry sells {animal} in Lhasa”)

output

Larry sells llamas in Lhasa

Let’s try f-interpolation now.
F-Interpolation

With f-interpolation, we put an “f” before the quote marks and we use a “$” sign before the value we want to interpolate. For example.

input

val hosiery_ad = f“Now, you can buy hosiery specifically designed for $animal”

output

hosiery_ad: String = Now, you can buy hosiery specifically designed for llamas

We can also use f-interpolation with a print statement by using “printf”. We need to use a format specifier, which is the “%” sign and a “char”. This is not always intuitive; for a string, we’d use “%s”, which makes sense. However, for an integer, we’d use “%d”, which seems like it should represent a “double” (i.e. a floating-point number), but actually %f represents that.

Here’s an example of the f-interpolator in a print statement.

input

printf(“%d llamas purchased %s for a price of $%f”, 62, “hosiery”, 5.99)

output

62 llamas purchased hosiery for a price of $5.99

For a full guide on format specifiers, check out the Scala Cookbook’s section on “Substituting Variables into Strings”
Indexing

Now we move on to indexing. Remember that string1 has been assigned the string “marmot”. We’ll use “.charAt” to find the “char” at index-2, which will be the 3rd character in the string (since the index starts at 0).

input

string1.charAt(2)

output

Char = r

We can use “.indexOf” to find where a character is located in the string.

input

string1.indexOf(“m”)

output

Int = 0

Note that while there are two m’s in “marmot”, the .indexOf method will only give us the first one, which is at index-0.
Slicing

Onto slicing and here we’ll simply type our value (“string4” in this case), “slice”, and the beginning and end indices separated by a comma. See the example below, which will extract “dance” out of “marmot dance party”.

input

string4 slice (7,12)

output

res1: String = dance

Matching

We can also use “matches” to find equivalence. In the example below, we test whether string1 matches “marmot”.

input

string1 matches “marmot”

output

res1: Boolean = true

However, when we uses “matches”, itneeds to be an exact match. Here’s another example using “string4”, which is “marmot dance party”.

input

string4 matches “marmot”

output

res1: Boolean = false

Contains

If instead of an exact match, we merely wanted to tested whether a string contained a certain pattern, we’d use “contains”, as in the example below.

input

string4 contains “marmot”

output

res1: Boolean = true

Now it resolves to “true” since “marmot dance party” does contain the pattern “marmot” within it.



# Resources

Jose Portilla, Scala and Spark for Bit Data & Machine Learning (Udemy course), [Link](https://www.udemy.com/scala-and-spark-for-big-data-and-machine-learning/)
Marius Eriksen. Effective Scala, [Link](http://twitter.github.io/effectivescala/)
Rob Story, Python to Scala, [Link](https://wrobstory.gitbooks.io/python-to-scala/content/index.html)

