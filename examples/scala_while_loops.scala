var x = 0

while(x < 5){
    println(s"x is currently $x; adding 1 to x")
    x = x + 1
}

// break statement
// scala doesn't have build in break functionality
// must import from utility controls

// import break keyword
import util.control.Breaks._

var y = 0

while(y < 10) {
    println(s"y is currently $y; adding 1 to y")
  
    y = y + 1
    if(y==3) break
}
