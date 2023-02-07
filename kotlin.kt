class HashSet<T> {
    private val data = hashMapOf<T, Boolean>()

    fun add(element: T) {
        data[element] = true
    }

    fun remove(element: T) {
        data.remove(element)
    }

    fun contains(element: T): Boolean {
        return data.containsKey(element)
    }
}
