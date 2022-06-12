import java.util.*;

// 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서
// 이름(name)이 기본 정렬기준이 되도록 하시오.

class Student implements Comparable {

    String name;
    int ban;
    int no;
    int kor, eng, math;

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student tmp = (Student) o;
            return name.compareTo(tmp.name); // String클래스의 compareTo() 호출
        } else {
            return -1;
        }
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }

    public String toString() {
        return name +","+ban +","+no +","+kor +","+eng +","+math
                +","+getTotal() +","+getAverage();
    }

}

class Question5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이자바",1,4,70,90,70));
        list.add(new Student("안자바",1,5,60,100,80));

        Collections.sort(list); // list에 저장된 요소들을 정리한다(compareTo()호출)
        // Collections.sort(List list)를 이용하려면, ArrayList에 저장된 요소들은
        // 모두 Comparable인터페이트를 구현한 것이어야 한다. 이 인터페이스에는 compareTo메서드가
        // 정의되어 있는데, 이 메서드는 Collections.sort(List list)에 의해 호출되어
        // 정렬기준을 제공하게 된다.
        // public interface Comparable {
        //     public int compareTo(Object o); } // 주어진 객체(o)와 자신의 멤버변수를 비교
        // compareTo메서드는 매개변수로 주어진 객체(o)를 인스턴스자신과 비교해서 자신이 작으면
        // 음수를, 같으면 0을, 크면 양수를 반환하도록 구현되어야 한다.
        // 문제에서는 학생의 이름으로 정렬될 것을 요구했으므로, 인스턴스변수 name만 비교하도록
        // compareTo메서드를 구현하면 된다.

        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}