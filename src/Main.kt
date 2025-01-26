fun main() {

    /*
    Создайте scope – функцию let, которая будет вызываться у строки.
    В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.
    */
    "В главной функции создать его экземпляр".let {
        println(it)
        println(it.length)
    }
    println()

    /*
    Создать класс City, в конструкторе передается название города и population(население).
    В главной функции создать его экземпляр, в конструктор передать название, через функцию apply объекту
    назначить население в любом количестве. Всю информацию об объекте, созданного City вывести в консоль.
    */
    City("Ivanovo").apply {
        population = 100000
        println(this)
    }
    println()

    /*
    Дан массив целых чисел.
    С помощью scope – функции with вывести в консоль данный массив, количество элементов массива, сумму элементов массива.
    */
    val array = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    with(array) {
        println(this.contentToString())
        println(this.size)
        println(this.sum())
    }
}

class City(val nameCity: String, var population: Int = 0){

    override fun toString(): String {
        return "City(nameCity=$nameCity, population=$population)"
    }
}

