# Part 15: Functions

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**15-1:** [Simple Print Function](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-15-Functions.md#simple-print-function)<br>
**15-2:** [Return Function](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-15-Functions.md#return-function)<br>
**15-3:** [Prime Number Function](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-15-Functions.md#prime-number-function)<br>
**15-4:** [Collections in Functions](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-15-Functions.md#collections-in-functions)<br>

## Simple Print Function

In this function, we'll print "BADGER!". We use "def" to create the function and we need to provide the data type for the output. In this case, we'll use "[Unit](https://www.scala-lang.org/api/2.12.x/scala/Unit.html)", which is a general data type. See the example below.

*input*

```
def badger_print():  Unit = {
    println("BADGER!")
}

badger_print()
```

*output*

```
Loading scala_functions.scala...
badger_print: ()Unit
BADGER!
```
## Return Function

Let's do a quick return function. We'll create a function that takes in 2 arguments: "animal" and "name". Both will be strings. We'll then return a greeting. 

*input*

```
// greeting function

def hello(animal: String, name: String): String = {
    return "Hello " + animal + " " + name + "!"
}

hello("Aardvark", "Sam")
```

*output*

```
hello: (animal: String, name: String)String
res0: String = Hello Aardvark Sam!
```

## Prime Number Function

Let's create a function that tells us whether a number is prime or not. We'll then create some print statements to test it out. 

*input*

```
def isPrime(num:Int): Boolean = {
    for(n <- Range(2,num)){
        if(num%n == 0){
            return false
        }
    }
    return true
}

println("10 is a prime number: " + isPrime(10)) 
println("23 is a prime number: " + isPrime(23)) 
println("2 is a prime number: " + isPrime(2))

```

*output*

```
isPrime: (num: Int)Boolean
10 is a prime number: false
23 is a prime number: true
2 is a prime number: true

```

## Collections in Functions

Finally, we'll do an example of a collection in a function. We'll use our "animals" list from previous sections and create a function called "showAnimals" that will return out list of animals. 

*input*

```
// using collections in functions

var animals = List("aardvark", "hedgehog", "walrus")

def showAnimals(beasts: List[String]): List[String] = {
    return beasts
}

println(showAnimals(animals))
```

*output*

```
animals: List[String] = List(aardvark, hedgehog, walrus)
check: (beasts: List[String])List[String]
List(aardvark, hedgehog, walrus)
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
