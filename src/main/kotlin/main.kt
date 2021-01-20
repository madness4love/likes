fun main() {
    val likes = "111"
    if (likes.takeLast(1) == "1" && likes.takeLast(2) != "11") {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}