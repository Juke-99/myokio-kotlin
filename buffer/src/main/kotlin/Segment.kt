class Segment {
    companion object {
        /** The size of all segments in bytes. */
        const val SIZE: Int = 8192
    }

    var data: ByteArray

    /** True if other segments or byte strings use the same byte array. */
    var shared: Boolean

    /** True if this segment owns the byte array and can append to it, extending {@code limit}. */
    var owner: Boolean

    init {
        this.data = ByteArray(SIZE)
        this.owner = true
        this.shared = false
    }
}