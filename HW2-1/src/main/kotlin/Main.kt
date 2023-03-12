import kotlin.math.roundToInt

fun main() {
    val amount = 20_000
    val percent = 0.0075
    val percentageAmount = amount * percent
    val comission = if (percentageAmount > 35) percentageAmount.roundToInt() else 35
    val result = amount - comission
    println("Комиссия за перевод суммы: $amount , составит $comission . Сумма перевода с комиссией: $result")

}
