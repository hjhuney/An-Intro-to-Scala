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
