package com;
import java.io.*;

public class ExceptionTest {
    public static void main (String args[]){
        try{
            int[] a = new int[3];
            System.out.println("Access element three :" + a[3]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("异常抛出的值:"+e);
        }
        System.out.println("Out of the block");
    }
}
