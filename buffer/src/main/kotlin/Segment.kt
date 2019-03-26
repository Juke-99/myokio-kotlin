/* This class may be better to object. */
class Segment {
    var data: ByteArray

    /** The first byte of available data ready to be written to. */
    var limit: Int = 0

    /** True if other segments or byte strings use the same byte array. */
    var shared: Boolean

    /** True if this segment owns the byte array and can append to it, extending {@code limit}. */
    var owner: Boolean

    /** Next segment in a linked or circularly-linked list. */
    var next: Segment? = null

    /** Previous segment in a circularly-linked list. */
    var prev: Segment? = null

    companion object {
        /** The size of all segments in bytes. */
        const val SIZE: Int = 8192
    }

    init {
        this.data = ByteArray(SIZE)
        this.owner = true
        this.shared = false
    }
}