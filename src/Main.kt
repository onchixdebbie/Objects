fun main() {

    println(Numbers.APP_NAME)
    Numbers.helloMate()
    Apple.randomNumber()

    var apple = Apple()
    apple.fruit()
}
    class Apple{

        companion object{
            private var x = 0
            private var y = 30

            fun randomNumber(){
                val random = (x..y).random()

                println("Random number = $random")
            }
        }

        fun fruit(){
            x = 50
            y = 100
            randomNumber()
        }
    }
