package com.demo;

import java.util.Arrays;

public class MostCommonPrefix {

	public String longestCommonPrefix(String[] a)
    {
        int size = a.length;
        //System.out.println(size);
 
        /* if size is 0, return empty string */
        if(size == 0)
        {
            return "";
        }
 
        if(size == 1)
            return a[0];
 
        /* sort the array of strings */
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
 
        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());
        
        System.out.println("First Element length is : "+a[0].length());
        System.out.println("Last Element length is : "+a[size-1].length());
        System.out.println("End is : "+end);

 
        /* find the common prefix between the first and
           last string */
        int i = 0;
        
        while(i < end && a[0].charAt(i) == a[size-1].charAt(i))
        {
            i++;
        }
//        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
//            i++;
 
        System.out.println(i);
        
        String pre = a[0].substring(0, i);
        
        return pre;
    }
	
	public String longestCommonPrefix2(String[] arr)
    {
       int n = arr.length;
       // take temp_prefix string and assign first element of arr : a.
       String result = arr[0];
       System.out.println(result);
       
       // Iterate for rest of element in string.
       for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.
            while(arr[i].indexOf(result) != 0)
            {
               
            	System.out.println(arr[i].indexOf(result));
                // update matched substring prefix
                result = result.substring(0, result.length()-1);
               
                // check for empty case. direct return if true..
                if(result.isEmpty())
                {
                    return "-1";
                }
            }
        }
        return result;
    }
 
    public static void main(String[] args)
    {
    	MostCommonPrefix obj1 = new MostCommonPrefix();
    	
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        
        String s1[] = {};
        String s2[] = {"Shiv"};
        
        String s13 = "";
        
        //System.out.println("The longest Common Prefix is : "+obj1.longestCommonPrefix(input));
        
        System.out.println("The longest Common Prefix is : "+obj1.longestCommonPrefix2(input));
        
//        System.out.println("The longest Common Prefix is : "+obj1.longestCommonPrefix(s1));
//
//        System.out.println("The longest Common Prefix is : "+obj1.longestCommonPrefix(s2));
        
        String myStr = "Hello planet earth, you are a great planet.";
        //System.out.println(myStr.indexOf("Hello"));
        //System.out.println(s13.isEmpty());

    }

}
