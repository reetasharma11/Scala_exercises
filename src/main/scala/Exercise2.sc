//Exercise 2 (Mandatory)
//Generate a list from 1 to 45 then apply .filter to compute the following results
val list2 = (1 to 45).toList
//● Sum of the numbers divisible by 4
val num_div4 = list2.filter(_%4==0)
println(s"sum of numbers from 1 to 45 divisible by 4 = ${num_div4.sum}")
//● Sum of the squares of the numbers divisible by 3 and less than 20
val list_Square = list2.map(x=>x*x)

val num_sumSquare = list_Square.filter(_%3==0)
val less_20 = num_sumSquare.filter(_<20)
println(s"Sum of Squares of integers in [1,45] divisible by 3 and which are less than 20 = ${less_20.map(x=>x*x).sum}")