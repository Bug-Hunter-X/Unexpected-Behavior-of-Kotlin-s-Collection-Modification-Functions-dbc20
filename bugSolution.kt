fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }.toMutableList() //Create a new list to avoid modifying the original
    println(newList) // Output: [1, 2]
    println(list) //Output: [1,2,3,4,5]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val newList2 = list2.filterNot { it > 2 }.toMutableList()
    println(newList2) // Output: [1, 2]
    println(list2) //Output: [1,2,3,4,5]

    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val newList3 = list3.filter { it <= 2 }.toMutableList()  //Create a new list to avoid modifying the original
    println(newList3) // Output: [1, 2]
    println(list3) //Output: [1,2,3,4,5]
}