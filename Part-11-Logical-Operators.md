# Part 11: Logical Operators

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**11-1:** ["And" Operator](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#creating-a-map)<br>
**11-2:** ["Or" Operator](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#indexing)<br>
**11-3:** ["Not" Operator](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-10-Maps.md#creating-a-mutable-map)<br>

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
