package generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (this.isFull()){
            reSize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void reSize(){
        Object[] temp = new Object[data.length * 2];

        for (int i=0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public int size(){
        return size;
    }


    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
//                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

        for (int i=0; i<15; i++){
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
