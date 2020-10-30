//Exercise1
//Submit three in-class exercises:
// The second of two in a .sc format
//Create a List of integer from 1-9
val intList = List(1,2,3,4,5,6,7,8,9)

//Remove the even numbers and make a new list
val oddList = intList.filter((num:Int)=> (num%2!=0))
println(oddList)

//write a cube function x=>x^3
def cube(x:Int):Int = x * x * x

//Map the cube function to the filtered list and print the result in a separate line
val result = oddList.map((x:Int)=>cube(x:Int))
println(result)