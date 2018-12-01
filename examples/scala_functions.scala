// functions

def badger_print():  Unit = {
    println("BADGER!")
}

badger_print()

// addition function

def adder(num1: Int, num2: Int): Int = {
    return num1 + num2
}

adder(4,5)

// greeting function

def hello(animal: String, name: String): String = {
    return "Hello " + animal + " " + name + "!"
}

hello("Aardvark", "Sam")


// prime number function

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


// using collections in functions

var animals = List("aardvark", "hedgehog", "walrus")

def check(beasts: List[String]): List[String] = {
    return beasts
}

println(check(animals))