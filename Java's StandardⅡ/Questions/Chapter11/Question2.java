import java.util.*;
class Question2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        HashSet set = new HashSet(list);
        TreeSet tset = new TreeSet(set);
        Stack stack = new Stack();
        stack.addAll(tset);
        while(!stack.empty())
            System.out.println(stack.pop());
    }
}

// 다음 코드의 실행 결과를 적으시오.
/*
ArrayList - 3, 6, 2, 2, 2, 7 중복 허용, 순서 유지
set - 2, 6, 3, 7 중복 제거되고 순서 유지 안 됨
tset - 2, 3, 6, 7 오름차순으로 정렬된다 (따로 정렬기준이 없기에 기본 정렬인 오름차순)
stack pop - LIFO - 7, 6, 3, 2
7
6
3
2
 */
