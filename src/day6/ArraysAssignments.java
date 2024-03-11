package day6;

//Assignments
//------------
//1) Find Sum of Elements in Array
//a={1,2,3,4,5}
//Sum=15

//2) Print Even and Odd numbers  from array.
//a={1,2,3,4,5,6}
//Even= 3
//Odd=3

//3) Search an element in array
//a={10,20,30,40,50}
//num=30

import java.util.Arrays;
import java.util.Collections;

//4) Sorting elements
//a={50,20,40,10,100}
//after sorting 10 20 40 50 100
public class ArraysAssignments {
    public static void main(String[] args) {

        //1) Find Sum of Elements in Array
        int[]a = {5,2,3,4,56,23,523,64,65,324,53,6};
        int sum=0;

        for (int x:a){
            sum+=x;
        }
        System.out.println("Sum of array elements is " +sum);

        //2) Print Even and Odd numbers  from array.
        System.out.print("Even numbers are: ");
        for (int i=0; i<a.length; i++){
            if (a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd numbers are: ");
        for (int i=0; i<a.length;i++){
            if (a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();

        //3) Search an element in array
        int target =23;
        int targetIndex=-1;
        for (int i=0; i<a.length; i++){
            if (a[i]==target){
                targetIndex=i;
            }
        }
        if (targetIndex!=-1){
            System.out.println("Element found at "+targetIndex+" index");
        } else {
            System.out.println("Element not found in the array");
        }

        //4) Sorting elements
        //approach1
        System.out.println("Elements before sorting: " + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Elements after sorting: " + Arrays.toString(a));
        //approach2
        int[]b = {52,2,3,4,56,2355,523,64,65,324,53,6};
        System.out.println("Elements before sorting: " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Elements after sorting: " + Arrays.toString(b));

        //reverse descending order sorting (only working for non-primitive type!)
        Integer[]c = {52,2,3,4,56,2355,523,64,65,324,53,6};
        System.out.println("Elements before sorting: " + Arrays.toString(c));
        Arrays.sort(c, Collections.reverseOrder());
        System.out.println("Elements after sorting in descending order " + Arrays.toString(c));
    }
}
