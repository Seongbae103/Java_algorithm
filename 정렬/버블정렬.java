package 정렬;
import java.util.*;
class 삽입정렬 {
    public static void main(String[] args) {
        new 삽입정렬().solution();
    }
    void solution(){
        int[] arr = createArray();
        arr = sortArray(arr);
        printArray(arr); 
    }
    int createRandomNumber(){
        return (int)(Math.random()*10)+1;
    }
    int[] createArray(){
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = createRandomNumber();
        }
        return arr;
    }
    int[] sortArray(int[] arr){
        return arr;        
    }
    void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr);
        }
    }
}