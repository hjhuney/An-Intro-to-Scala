# Part 12: If Statements

With the logical operators out of the way, let's work on if statements. In Scala, we follow the if -> else if -> else line of logic. Open up your text editor and create a new .scala file. I named mine "scala_if_statements.scala", but you're free to use any name you like. 

First, let's create a list of animals. 

```
var animals = List("aardvark", "hedgehog", "walrus")
```

Now, we'll try out first "if statement" which tests whether the list contains both "aardvark" and "walrus" in it. 

*input*

```
// if statement #1 
if((animals.contains("aardvark") && animals.contains("walrus"))){
    println("#1: Aardvarkwalrus!")
} 
```

If you're using VS Code, remember to open the terminal and launch spark-shell. Make sure to save your file, either by going to the "File" menu or, in Windows, using "CTRL + S". Once the spark-shell is up and you see the "scala>" prompt, enter:

```
:load scala_if_statements.scala
```

Alternatively, if you gave your file a different name than mine, remember to change that. Your output should be as below:

```
#1: Aardvarkwalrus!

```

Next, let's take a look at an if statement with an "else if" clause. We'll keep our original "if statement", but now we'll add an "else if" clause that tests whether the 'animals' list contains either "aardvark" or "rhino". If it does, we'll print out "#2: Aardvark or Rhino?"

*input*

```
// if statement #2 
if((animals.contains("aardvark") && animals.contains("rhino"))){
    println("#2: Aardvarkocerous!")
} else if((animals.contains("aardvark") || animals.contains("rhino"))) {
    println("#2: Aardvark or Rhino?")
} 
```

*output*

```
#2: Aardvark or Rhino?
```


Finally, let's run the whole shebang by adding an "else" clause. We'll keep our "if" and "else if" statements, but we'll add an "else" statement to the end. This condition does not test anything; it merely runs if the "if" and "else if" statement are both false. The "else" clause will return "#3: Welcome to Marmot Land!"


*input*

```
// if statement #3
if((animals.contains("penguin") && animals.contains("rhino"))){
    println("#3: PENGUARHINO!")
} else if((animals.contains("penguin") || animals.contains("rhino"))) {
    println("#3: Penguin or Rhino?")
} else{
    println("#3: Welcome to Marmot Land!")
}

```

*output*

```
#3: Welcome to Marmot Land!
```

Indeed, welcome to Marmot Land, ladies and gentlemarmots!
