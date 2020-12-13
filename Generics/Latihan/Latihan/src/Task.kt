/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("String result: $stringResult")
    println("Int result: $intResult")
}

// TODO 1
fun <T> getResult(args: T): Int {
    when {
        args is Int -> return args*5
        args is String -> return args.length
        else -> return 0
    }
    return 0
}