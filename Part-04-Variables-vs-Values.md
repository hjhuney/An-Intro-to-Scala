# Part 4: "Variables vs Values"

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**4-1:** [Variables](https://github.com/hjhuney/Intro-to-Scala#variables)<br>
**4-2:** [Values](https://github.com/hjhuney/Intro-to-Scala#values)<br>

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
