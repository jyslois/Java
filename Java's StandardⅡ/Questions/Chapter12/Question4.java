import java.util.ArrayList;

class Product {

}

class Ch12Question4 {
    public static <T extends Product> ArrayList<T> merge (ArrayList<T> list, ArrayList<T> list2) {
        ArrayList<T> newList = new ArrayList<>((list));
        newList.addAll(list2);
        return newList;
    }
}
