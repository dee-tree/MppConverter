actual class simpleClass {
    actual val a: Int?
    actual val aa: Int = 13
    actual lateinit var late: Set<Int>
    actual private var privateVar = "Hello"
    actual internal val internalVal = 130L

    actual val getter: Int
        get() = 5

    actual var getter2: Int
        private set
        get() = 5

    actual val getter3: Int
        get() {
            return 5
        }

    actual var setter: Int
        set(value) {
            field = value + 3
        }

    actual var delegated: Int by lazy { println("lazy"); 0 }
        private set
}