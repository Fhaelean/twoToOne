package com.company;

public class Main 
{
    public static void main(String[] args)
    {
    String s1 = "fdkp";
        String s2 = "hgrcba";
        String s3 = s1 + s2;
        char[] charArray = s3.toCharArray();
        for(int i = 0; i < charArray.length; i++)
        {
            for(int j = i + 1; j < charArray.length; j++)
            {
                if(charArray[i] > charArray[j])
                {
                    char tempchar = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = tempchar;
                }
            }
        }
        System.out.println();
        int counter = 0;
        for(int i = 0; i < charArray.length - 1; i++)
        {
            if(charArray[i] == charArray[i + 1] && charArray[i] != 0)
            {
                counter++;
                for(int j = i; j < charArray.length - 1; j++)
                {
                    char temp = charArray[j + 1];
                    charArray[j] = temp;
                }
                i--;
                charArray[charArray.length - 1] = 0;
            }
        }
        String result = "";
        for(int i = 0; i < charArray.length - counter; i++)
            result = result + charArray[i];
        System.out.println(result);
    }
