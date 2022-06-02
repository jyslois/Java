// with Generics 지네릭스 적용

import java.util.*;
class Studentg implements Comparable<Studentg> {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Studentg(String name, int ban, int no, int kor, int eng, int math) {
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

    public int compareTo(Studentg s) {
        return name.compareTo(s.name);
    }
}

class Question11Question5withGenerics {
    public static void main(String[] args) {
        ArrayList<Studentg> list = new ArrayList<Studentg>();
        list.add(new Studentg("홍길동",1,1,100,100,100));
        list.add(new Studentg("남궁성",1,2,90,70,80));
        list.add(new Studentg("김자바",1,3,80,80,90));
        list.add(new Studentg("이자바",1,4,70,90,70));
        list.add(new Studentg("안자바",1,5,60,100,80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
