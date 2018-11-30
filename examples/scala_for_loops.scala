var animals = List("aardvark", "hedgehog", "walrus")
var badgers = List("mushroom", "mushroom", "it's a snake")

// for loops
for(item <- animals){
    println("BADGER!")
}

for(item <- badgers){
    println(item)
}

for(number <- Array.range(0,20,5)){
    println(number)
}


for(num <- Range(0,10)){
    if(num%2 == 0){
        println(s"$num is even")
    }else{
        println(s"$num is odd")
    }
}

for(word <- animals){
    if(word.startsWith("a")){
        println(s"$word starts with a a")
    }
}