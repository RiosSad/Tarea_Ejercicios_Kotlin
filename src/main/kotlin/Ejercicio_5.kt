import kotlin.math.*

fun moduloVector(a: Double, b: Double):Double{
    var x= sqrt(a.pow(2)+b.pow(2))
    return x
}

fun main(){
    val a=4.0
    val b=3.0
    println(moduloVector(a,b))
}