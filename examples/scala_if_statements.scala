var animals = List("aardvark", "hedgehog", "walrus")

// if statement #1 
if((animals.contains("aardvark") && animals.contains("walrus"))){
    println("#1: Aardvarkwalrus!")
} 

// if statement #2 
if((animals.contains("aardvark") && animals.contains("rhino"))){
    println("#2: Aardvarkocerous!")
} else if((animals.contains("aardvark") || animals.contains("rhino"))) {
    println("#2: Aardvark or Rhino?")
} 

// if statement #3
if((animals.contains("penguin") && animals.contains("rhino"))){
    println("#3: PENGUARHINO!")
} else if((animals.contains("penguin") || animals.contains("rhino"))) {
    println("#3: Penguin or Rhino?")
} else{
    println("#3: Welcome to Marmot Land!")
}

