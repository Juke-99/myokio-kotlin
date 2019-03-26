object SegmentPool {
    /** Singly-linked list of segments. */
    var next: Segment? = null

    /** Total bytes in this pool. */
    var byteCount: Long = 0

    fun take(): Segment? {
        synchronized(SegmentPool::class) {
            if(next != null) {
                var result: Segment? = next
                next = result?.next
                result?.next = null
                byteCount -= Segment.SIZE
                return result
            }
        }

        return Segment()
    }
}