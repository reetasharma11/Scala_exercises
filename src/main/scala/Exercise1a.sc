//Exercise 1 (Mandatory)
//Submit three in-class exercises:
// The first of two in a .sc format

def greet1(name: String): String = s"Hello $name, How are you doing?"
def greet2(name: String): String = s"Hello $name, How was your day?"

def frame(name:String, f:String => String): String ={
  f(name)
}
println(frame("Alice", greet1))
println(frame("Nick", greet2))

