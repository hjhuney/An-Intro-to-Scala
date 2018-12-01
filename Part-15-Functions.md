# Part 15: Functions

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
