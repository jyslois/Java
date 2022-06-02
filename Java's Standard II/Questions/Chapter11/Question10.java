import java.util.*;
class Question10 {
    public static void main(String[] args) {
        Set set = new HashSet();
        int[][] board = new int[5][5];

        for (int i = 0; set.size() < 25; i++) {
            set.add((int)(Math.random()*30)+1+"");
        }

        /*
        HashSet은 중복을 허용하지 않고 순서를 유지하지 않기 때문에 숫자들이 잘 섞이지 않는다는
        문제가 발생한다. 아무리 임의의 순서로 저장을 해도, 해싱(hashing) 알고리즘의 특성상
        한 숫자가 고정된 위치에 저장되기 때문이다. 이 문제를 해결하기 위해서는 저장순서를
        유지하는 List인터페이스를 구현한 컬렉션 클래스를 사용하도록 변경해야 한다.
         */

        ArrayList list = new ArrayList(set); // 저장 순서르 유지하는 ArrayList에 옮겨 담음
        Collections.shuffle(list); // 저장된 데이터의 순서를 뒤섞음음

       Iterator it = list.iterator();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
            }
            System.out.println();
        }
    } // main
}