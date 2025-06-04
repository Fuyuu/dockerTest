package book;

import java.util.HashSet;
import java.util.Set;

public class BookManager
{
	// 젠킨스 자동화 실습 관련 책관리자 기능 일부 구현 - C011039 김영재
	private Set<String> books = new HashSet<>();

    // 책 추가
    public void addBook(String title) {
        if (books.contains(title)) {
            throw new IllegalArgumentException("이미 존재하는 책입니다: " + title);
        }
        books.add(title);
    }

    // 책 제거
    public void removeBook(String title) {
        if (!books.contains(title)) {
            throw new IllegalArgumentException("존재하지 않는 책입니다: " + title);
        }
        books.remove(title);
    }
	// C011039 작업 끝
}
