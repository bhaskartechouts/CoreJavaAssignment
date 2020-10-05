package org.techouts.app.problem7;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
  
public class FindDuplicate 
{ 
    
    public static void main(String[] args) 
    { 
        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,10}; 
        int n = arr.length; 
        printDuplicates(arr, n); 
    } 
    public static void printDuplicates(int[] arr, int n)  
    { 
        Map<Integer,Integer> map = new HashMap<>(); 
        int count = 0; 
        boolean dup = false; 
        for(int i = 0; i < n; i++){ 
            if(map.containsKey(arr[i])){ 
                count = map.get(arr[i]); 
                map.put(arr[i], count + 1); 
            } 
            else{ 
                map.put(arr[i], 1); 
            } 
        } 
          
        for(Entry<Integer,Integer> entry : map.entrySet()) 
        { 
            if(entry.getValue() > 1){ 
                System.out.print(entry.getKey()+ " "); 
                dup = true; 
            } 
        } 
        if(!dup){ 
            System.out.println("-1"); 
        } 
    } 
} 
