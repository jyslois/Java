/*
다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이
다. 코드를 완성하여 실행결과와 같은 결과를 출력하시오.
ArrayList클래스의 addAll(), removeAll(), retainAll()을 사용하라.
 */
import java.util.*;
class Question1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList(); // 교집합
        ArrayList cha = new ArrayList(); // 차집합
        ArrayList hap = new ArrayList(); // 합집합
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

//        // 교집합 retainAll()
//        ArrayList temp1 = (ArrayList) list1.clone();
//        temp1.retainAll(list2);
//        kyo = temp1;
//
//        // 차집합 removeAll()
//        ArrayList temp2 = (ArrayList) list1.clone();
//        temp2.removeAll(list2);
//        cha = temp2;
//
//        // 합집합 addAll();
//        ArrayList temp3 = (ArrayList) list1.clone();
//        temp3.addAll(list2);
//        HashSet temset = new HashSet(temp3);
//        hap = new ArrayList(temset);

        kyo.addAll(list1);   // list1의 모든 요소를 kyo에 저장
        kyo.retainAll(list2);  // list2와 kyo의 공통 요소만 남기고 삭제.

        cha.addAll(list1);   // list1의 모든 요소를 cha에 저장
        cha.removeAll(list2);  // list2와 cha의 공통된 요소들을 모두 삭제.

        hap.addAll(list1); // list1의 모든 요소를 hap에 저장
        hap.removeAll(kyo); // hap에서 kyo와 공통된 모든 요소 삭제(교집합 삭제)
        hap.addAll(list2); // list2의 모든 요소를 hap에 저장

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }
}