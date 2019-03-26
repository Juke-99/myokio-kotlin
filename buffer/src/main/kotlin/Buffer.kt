class Buffer {
    var head: Segment? = null

    init {}

    open fun writeUtf8(string: String, beginIndex: Int, endIndex: Int): Buffer {
        if (beginIndex < 0) throw IllegalArgumentException("beginIndex < 0: " + beginIndex)
        if (endIndex < beginIndex) throw IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex)
        if (endIndex > string.length) throw IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length)
        return Buffer()
    }
}