# Part 13: For Loops

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**13-1:** [Creating For Loops](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-13-For-Loops.md#creating-for-loops)<br>
**13-2:** [Looping Through a Range](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-13-For-Loops.md#looping-through-a-range)<br>
**13-3:** [If - Else If - Else](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-13-For-Loops.md#if-statement-embedded-within-for-loop)<br>

## Creating For Loops

Let's create a new file in our text editor (mine is named "scala_for_loops.scala"). We'll create a new list called "badgers". 

```
var badgers = List("mushroom", "mushroom", "it's a snake")
```
Now, we'll create a "for loop" using this list. 

*input*

```
for(item <- badgers){
    println("BADGER!")
}
```

As in the last section, mark sure to launch your spark-shell in your text editor. Run your file. 

```
:load scala_for_loops.scala
```

And now we get our badgers!

*output*

```
BADGER!
BADGER!
BADGER!
```
We can also print each individual item in the list. 

*input*

```
for(item <- animals){
    println(item)
}
```

*output*

```
mushroom
mushroom
it's a snake
```
## Looping Through a Range

Next, let's use a "for loop" to loop through a range. We'll use the "Array.range(start, stop, step)" format to create a range from 0 to 20. In Scala (as in other programming languages), remember that this range will go up to but not include 20. We can also use a step argument; I'll use 5 as our step, so we'll return every 5th number. 

*input*

```
for(number <- Array.range(0,20,5)){
    println(number)
}
```

*output*

```
0
5
10
15
```

## If Statement Embedded Within For Loop

Let's create an if-else statement embedded within a for loop. We create a range of 0 to 10 and print whether the number is odd or even. 

*input*

```
for(num <- Range(0,10)){
    if(num%2 == 0){
        println(s"$num is even")
    }else{
        println(s"$num is odd")
    }
}
```

*output*

```
0 is even
1 is odd
2 is even
3 is odd
4 is even
5 is odd
6 is even
7 is odd
8 is even
9 is odd
```

Finally, let's revive our animals list. 

```
var animals = List("aardvark", "hedgehog", "walrus")
```

*input*

```
for(word <- animals){
    if(word.startsWith("a")){
        println(s"$word starts with a a")
    }
}
```

*output*

```
aardvark starts with a a
```

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
