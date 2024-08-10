package com.sgtest.constructor;
class NewsPaper
{
    String paperName;
    String language;
    int paperCost;
    NewsPaper(String PaperName,String Language,int PaperCost)
    {
        paperName=PaperName;
        language=Language;
        paperCost=PaperCost;
        System.out.println("Papaer Name:"+paperName);
        System.out.println("Language:"+language);
        System.out.println("Paper Cost:"+paperCost);
    }

}
class Magazine
{
    String magazineName;
    String language;
    int magazineCost;
    Magazine(String MagazineName,String Language,int MagazineCost)
    {
        magazineName=MagazineName;
        language=Language;
        magazineCost=MagazineCost;
        System.out.println("Magazine Name:"+magazineName);
        System.out.println("Language:"+language);
        System.out.println("Paper Cost:"+magazineCost);
    }

}
class Comics
{
    String comicsName;
    String language;
    int comicsCost;
    Comics(String ComicsName,String Language,int ComicsCost)
    {
        comicsName=ComicsName;
        language=Language;
        comicsCost=ComicsCost;
        System.out.println("Comics Name:"+comicsName);
        System.out.println("Language:"+language);
        System.out.println("Comics Cost:"+comicsCost);
    }

}
public class ParameterizedConstructor4 {
    public static void main(String[] args) {
        NewsPaper obj1=new NewsPaper("Prajavani","Kannada",5);
        Magazine obj2=new Magazine("Moto GP","English",25);
        Comics obj3=new Comics("Spider Man","English",99);
    }
}
