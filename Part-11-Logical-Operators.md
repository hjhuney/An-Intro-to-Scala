# Part 11: Logical Operators

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**11-1:** ["And" Operator](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-11-Logical-Operators.md#and-operator)<br>
**11-2:** ["Or" Operator](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-11-Logical-Operators.md#or-operator)<br>
**11-3:** ["Not" Operator](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-11-Logical-Operators.md#not-operator)<br>

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

## Or Operator

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
