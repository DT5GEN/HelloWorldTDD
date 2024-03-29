interface Numbers {

    fun sum(): Int
    fun different(): Int

    class Base(
        private val number1: Int,
        private val number2: Int
    ) : Numbers {
        override fun sum(): Int {
            return number1 + number2
        }

        override fun different(): Int {
            return number1 - number2
        }

    }


}