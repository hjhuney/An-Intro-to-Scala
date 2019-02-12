
# Part 5: String Operations

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**5-1:** [Comparison Operators](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#comparison-operators)<br>
**5-2:** [String Concatenation](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#string-concatenation)<br>
**5-3:** [Methods Available](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#methods-available)<br>
**5-4:** [Length](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#length)<br>
**5-5:** [Last](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#last)<br>
**5-6:** [String Interpolation](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#string-interpolation)<br>
**5-7:** [S-Interpolation](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#s-interpolation)<br>
**5-8:** [F-Interpolation](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#f-interpolation)<br>
**5-9:** [Matching](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#matching)<br>
**5-10:** [Contains](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-05-String-Operations.md#contains)<br>

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
