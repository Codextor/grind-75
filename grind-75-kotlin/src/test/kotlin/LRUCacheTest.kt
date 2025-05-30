import kotlin.test.Test
import kotlin.test.assertEquals

class LRUCacheTest {

    @Test
    fun testLRUCache() {
        val lRUCache = LRUCache(2)
        lRUCache.put(1, 1)
        lRUCache.put(2, 2)
        assertEquals(1, lRUCache.get(1))
        lRUCache.put(3, 3)
        assertEquals(-1, lRUCache.get(2))
        lRUCache.put(4, 4)
        assertEquals(-1, lRUCache.get(1))
        assertEquals(3, lRUCache.get(3))
        assertEquals(4, lRUCache.get(4))
    }
}
