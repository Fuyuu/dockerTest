package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	StudentManager studentManager;

	@BeforeEach
	void setUp() throws Exception {
        studentManager = new StudentManager();
        studentManager.addStudent("exception");
	}

	@Test
	void testAddStudent() {
		studentManager.addStudent("user1");
        assertTrue(studentManager.hasStudent("user1"));
	}
	
	@Test
	void testAddStudentEx() {
		assertThrows(IllegalArgumentException.class, () -> studentManager.addStudent("exception"));
	}

	@Test
	void testRemoveStudent() {
		studentManager.addStudent("user2");
		studentManager.removeStudent("user2");
		assertFalse(studentManager.hasStudent("user2"));
	}
	
	@Test
	void testRemoveStudentEx() {
		assertThrows(IllegalArgumentException.class, () -> studentManager.removeStudent("userA"));
	}
}
