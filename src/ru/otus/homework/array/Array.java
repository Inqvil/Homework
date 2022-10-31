package ru.otus.homework.array;

class Array {
    int arr[];
    int count;
    public Array(int length) {
        arr = new int[length];
    }
    public void printArray(){
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void add(int element) {
        if (arr.length == count) {
            int newArr[] = new int[2 * count];

            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = element;
    }


    public static void main(String[] args) {
        Array numbers = new Array(3);


        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);



        numbers.printArray();
    }
}