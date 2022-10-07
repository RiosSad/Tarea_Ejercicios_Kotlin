
fun suma_Lista(num: Array<Int> , op:(Int)->Int): Array<Int> {
    for (pos in 0..num.size-1){
        num.set(pos,op(num.get(pos)))
        println(num.get(pos))
    }
    return num
}
fun suma(num: Int): Int{
    return num+10
}
fun main() {
    val numeros = arrayOf<Int>(1,2,3,4,5,6,7,8,9);
    suma_Lista(numeros, ::suma)
}