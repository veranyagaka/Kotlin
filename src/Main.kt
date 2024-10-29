import java.util.*
fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
    println( decorations.filter {it[0] == 'p'}) //this is eager
    // lazy, will wait until asked to evaluate
    println("filtered: $filtered")
    println("new list: $newList")
    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))
    /*println(waterF(dirtlevel))
    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

     */
}
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}
/*
lazy filters.
fun main() {
    val temp = 20
    val isHot = if(temp > 40) true else false
    println(isHot)
    println("Hello Vera!")
}
*/

/* unit returning functions*/

fun print(name: String?) : Unit{
    println("Hey")
}
/* Default parameters*/
fun drive(speed: String? ="fast") : Unit{
    println("Hey")
}
/* Required parameters*/
fun tempToday(speed: String?) : Unit{
    println("Hey $speed" )
}
/* Named parameters
* to improve readability
* positional arguments
* */
/*
Compact functions
single expression function
 */
fun double(x : Int): Int = x * 2

/*
Lambda and high order functions
 */
var dirtlevel = 20
val waterF = {level: Int -> level / 2}
//println(waterF(dirtlevel))
        /*
        take functions(lambda) as parameters
        Passing a named function reference use
        scope resolution symbol ::

        Last parameter call syntax - make our code more concise


         */
/*
repeat(3){
    println("Hello")
}
List filters
- filter
eager and
lazy filters - at runtime

 */
/*
kotlin repl
$variable
in range operator = ..

val
when statement
when (numberOfFish) {
    0  -> println("Empty tank")
    in 1..39 -> println("Got fish!")
    else -> println("That's a lot of fish!")
}
nullability. variable cannot be null but you can hint it can be:
val x : Int? = null
chain null tests
null pointer exceptions
val len = s!!.length   // throws NullPointerException if s is null

LISTS
var m = listOf("tuna", "salmon")
mutableListOf()
list.remove("tuna")

ARRAYS
school = arrayOf()
to print the array: println(java.util.Arrays.toString(school))

type association
intArrayOf()

smth about initialising arrays with code

LOOPS
for (element in school){
}
withIndex()

downTo - descending order
step  - skip nos

do- while loops

Elvis operator
?: if the value is null use some non null value

Functions
default, required, named
Filters - it
 */
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
val x : Int? = null
val filtered = decorations.asSequence().filter { it[0] == 'p' }
// force evaluation of the lazy list
val newList = filtered.toList()

//val y = arrayListOf()