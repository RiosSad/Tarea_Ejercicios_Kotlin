
fun descuento(descuento: Double, precio: Double):Double{
    val precioDescuento= precio-(precio*descuento)
    return precioDescuento
}
fun iva(iva: Double, precio: Double):Double{
    val priceIva= precio+(precio*iva)
    return priceIva
}
fun cesta(productos: Array<Double>, porcentaje: Double,operacion:(Double, Double)->Double): Double{
    var total=0.0
    for (pos in 0..productos.size-1){
        total+=operacion(porcentaje,productos.get(pos))
    }
    return total
}

fun main(){
    val numeros = arrayOf<Double>(10.5,10.0,52.0,8.5,3.5);
    val iva=0.16
    val descuento=0.1
    println(cesta(numeros,iva,::iva))
    println(cesta(numeros,descuento,::descuento))
}