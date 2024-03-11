package day6;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
//        Array is collection elements of same data type(Homogenios data).
//        We can store multiple values into a single variable.
//
//        int a[]=new int[100];
//
//        (or)
//
//        int []a=new int[100];
//
//        2 types of arrays
//                ---------
//        1) Single dimensional
//        2) two dimensional/multidimensional
//
//        Single dimensional
//        ----------------------
//        1) Declare an array
//        2) insert values into array
//        3) Find size of an array
//        4) read single value from an array
//        5) read multiple values from an array


        //declaration
        //approach1
        int[]a=new int[5]; //declare
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        //approach2
        int[]b={100,200,300,400,500,600};

        //size/length of array
        System.out.println(a.length);

        //get single value from array
        System.out.println(a[2]); //300

        //get all values from array - just for output
        System.out.println(Arrays.toString(b));

        //get all values by using loop
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + "  ");
        }

        //get all values by using enhanced loop / by each
        for (int x:a){
            System.out.println(x);
        }

        //2-dimensional array
        //_____________________

        //declaration
        //approach1
        int[][]arrayTwoDim=new int[3][2]; //3 is number of rows and 2 is number of columns
        arrayTwoDim[0][0]=100;
        arrayTwoDim[0][1]=200;

        arrayTwoDim[1][0]=300;
        arrayTwoDim[1][1]=400;

        arrayTwoDim[2][0]=500;
        arrayTwoDim[2][1]=600;

        //approach2
        int [][]arrayTwoDim2={{100,200},{300,400},{500,600}};

        //length of 2dim array
        System.out.println(arrayTwoDim2.length);//3 this reads out number of rows
        System.out.println(arrayTwoDim2[1].length);//2 this reads out number of elements in specific row

        //read specific value
        System.out.println(arrayTwoDim2[2][1]);

        //reading data from 2dim array using classic for loop
        for(int r=0; r<arrayTwoDim.length; r++){
            for(int c=0; c<arrayTwoDim[r].length;c++){
                System.out.print(arrayTwoDim[r][c]+"  ");
            }
            System.out.println();
        }

        //reading data from 2dim array using enhanced for loop
        for (int[]x:arrayTwoDim){
            for (int y:x){
                System.out.println(y);
            }
        }

        //object array can store different data types
        Object[] objectArray=new Object[5];
        objectArray[0]=10;
        objectArray[1]=10.32425;
        objectArray[2]="welcome";
        objectArray[3]='$';
        objectArray[4]=true;

        for (Object x:objectArray){
            System.out.println(x);
        }

    }
}
