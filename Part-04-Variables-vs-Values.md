# Part 4: "Variables vs Values"

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**4-1:** [Variables](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-04-Variables-vs-Values.md#variables)<br>
**4-2:** [Values](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-04-Variables-vs-Values.md#values)<br>

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
