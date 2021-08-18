fun main() {

    val array : Array<Int> = arrayOf(5,7,12,24,42,255,256,512,1024)

    fun findTwoMaxNumbers(array: Array<Int>): Pair<Int, Int> {
        val length = array.size - 1
        var maxed10 = 0
        var maxed20 = 0
        for (tempVar in 0..length) {
            if (array[tempVar] > maxed10) {
                maxed10 = array[tempVar]
            }
        }
        for (tempVar2 in 0..length) {
            if (array[tempVar2] > maxed20) {
                if (array[tempVar2] != maxed10) {
                    maxed20 = array[tempVar2]
                }
            }
        }

        return maxed10 to maxed20
    }
    println(findTwoMaxNumbers(array).toString())
}