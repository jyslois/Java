import java.util.*;

class Stu {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Stu(String name, int ban, int no, int kor, int eng, int math) {
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
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                ;
    }
} // class Student
class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Stu && o2 instanceof Stu) {
            Stu s1 = (Stu) o1;
            Stu s2 = (Stu) o2;

            if (s1.ban == s2.ban) {
                return s1.no - s2.no;
            } else {
                return s1.ban - s2.ban;
            }
            // 삼항연산자
            // return s1.ban==s2.ban ? s1.no - s2.no : s1.ban - s1.ban;
        }
        return -1;
    }
}
class Question7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Stu("이자바",2,1,70,90,70));
        list.add(new Stu("안자바",2,2,60,100,80));
        list.add(new Stu("홍길동",1,3,100,100,100));
        list.add(new Stu("남궁성",1,1,90,70,80));
        list.add(new Stu("김자바",1,2,80,80,90));
        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}