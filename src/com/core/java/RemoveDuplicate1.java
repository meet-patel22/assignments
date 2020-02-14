package com.core.java;




import java.util.Arrays;


public class RemoveDuplicate1{

    public static void main(String[]args){
        int array[] = {1,23,5,5,1,98,35};
        int length = array.length;
        int count = 0;

        Arrays.sort(array);
        int temp[] = new int[length+1];

        int i =0;
        int k=0;
        int j=i+1;
        while(j!=length){
            if(array[i]==array[j]){
                i++;
                j++;

            }
            else{
                temp[k]=array[i];
                i++;
                j++;                                            
                count++;
                k++;

            }
        }
            for(k=0;k<count;k++){
                System.out.print(temp[k]+" ");
            }
            
            System.out.print(temp[length-1]);
        }
    }
