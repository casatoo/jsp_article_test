import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	public LocalDateTime regDate;
	
	public static void main(String[] args) {
		System.out.println("== 시스템 시작 ==");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("명령어를 입력해주세요 : ");
			String cmd = sc.nextLine();

			if (cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				System.out.printf("%d번 글이 %s에 작성되었습니다.");
			}

		}

	}

	public void Article() {
		int id;
		String title;
		String body;
		String regDate;
		
		
	}

}
/**
 * 0. 스케너 입력 
 * 1. 제목 내용 입력 받기 
 * 2. 현재 날짜 불러와서 저장메세지 띄우기 
 * 3. array list 하나 만들어서 작성된 글 저장시키기 
 * 4. list 로 글 목록 보기 for 문 작성 
 * 5. write , list 외에는 존재하지 않는 명령어로 처리 
 * 6. exit로 종료
 * 
 */