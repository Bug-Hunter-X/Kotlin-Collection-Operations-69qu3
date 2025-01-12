```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2, 4]

    val sum = list.sum()
    println(sum) //Output: 15

    val average = list.average()
    println(average) // Output: 3.0

    val firstEven = list.firstOrNull { it % 2 == 0 }
    println(firstEven) //Output: 2

    val lastOdd = list.lastOrNull { it % 2 != 0 }
    println(lastOdd) //Output: 5

    val anyEven = list.any { it % 2 == 0 }
    println(anyEven) //Output: true

    val allEven = list.all { it % 2 == 0 }
    println(allEven) // Output: false

    val noneEven = list.none { it % 2 == 0 }
    println(noneEven) //Output: false
}
```