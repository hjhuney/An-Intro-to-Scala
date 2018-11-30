# Part 2: Data Types

**Top:** [Table of Contents](https://github.com/hjhuney/Intro-to-Scala#table-of-contents)<br>
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
