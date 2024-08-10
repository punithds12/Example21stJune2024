package com.sgtest.StringDemo1;

public class CountOfWordSentance
{
    static int getNoofWordsCount(String sentence)
    {
        String s[]=sentence.split(" ");
        int count=s.length;
        return count;

    }
    public static void main(String[] args)
    {
        int no=getNoofWordsCount("It was a good movie");
        System.out.println("the number of words in given sentance:"+no);
    }
}
