package arrayindex;

public class ArrayString {

    public static void main(String[] args) {
        // 기존 배열
        int arr[] = {1, 2, 3};
        String[] games = {"lol", "피파", "배그"};
        
        // 새 문자열 배열
        String[] strArr = {"프로그래밍", "완전", "너무", "싫어", "노는게", "좋아요", "별로"};

        // 게임 이름 출력
        System.out.print("게임이름: ");
        for (int i = 0; i < games.length; i++) {
            System.out.print(games[i] + " ");
        }
        System.out.println();

        // 등수 출력
        System.out.print("등 수: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("     " + arr[i] + " ");
        }
        System.out.println();

        // 새로운 문자열 배열을 사용한 출력
        System.out.printf("%s,%s %s!", strArr[0], strArr[1], strArr[5]);
    }
}