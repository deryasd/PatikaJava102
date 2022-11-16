package com.company;

public class Book {
    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber){
        this.name = name;
        if(pageNumber < 0)
            pageNumber = 0;
        this.pageNumber = pageNumber;
    }

    public int getPageNumber(int pageNumber){
        return this.pageNumber;
    }

    public int setPageNummber(int pageNumber){
        if(pageNumber < 0)
            pageNumber = 0;
        this.pageNumber = pageNumber;
        return pageNumber;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
