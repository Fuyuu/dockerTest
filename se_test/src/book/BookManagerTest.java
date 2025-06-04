package book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookManagerTest {
    @Test
    public void testAddBook() {
        BookManager bm = new BookManager();
        bm.addBook("이방인");
        assertTrue(bm.hasBook("이방인"));
    }

    @Test
    public void testRemoveBook() {
        BookManager bm = new BookManager();
        bm.addBook("이방인");
        bm.removeBook("이방인");
        assertFalse(bm.hasBook("이방인"));
    }
}
