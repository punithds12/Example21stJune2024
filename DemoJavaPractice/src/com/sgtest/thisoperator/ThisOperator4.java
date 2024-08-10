package com.sgtest.thisoperator;
class NewsPaper
{
    String paperName;
    String language;
    int paperCost;
    NewsPaper(String paperName,String language,int paperCost)
    {
        this.paperName=paperName;
        this.language=language;
        this.paperCost=paperCost;
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
    Magazine(String magazineName,String language,int magazineCost)
    {
        this.magazineName=magazineName;
        this.language=language;
        this.magazineCost=magazineCost;
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
    Comics(String comicsName,String language,int comicsCost)
    {
        this.comicsName=comicsName;
        this.language=language;
        this.comicsCost=comicsCost;
        System.out.println("Comics Name:"+comicsName);
        System.out.println("Language:"+language);
        System.out.println("Comics Cost:"+comicsCost);
    }

}
public class ThisOperator4 {
    public static void main(String[] args) {
        NewsPaper obj1=new NewsPaper("Prajakiya","Kannada",5);
        Magazine obj2=new Magazine("Moto GP","English",25);
        Comics obj3=new Comics("Super Man","English",99);
    }
}

