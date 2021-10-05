package com.example.asdfe;

public class ItemData {
    private int imgID;
    private String title;


    public ItemData(int imgID , String title) {//생성과동시에 리스트항목에 뿌려주기위해
        this.imgID=imgID;//필드와 매개변수가 같을때 구분하는문자 this
        this.title=title;

    }
    public int getImgID() {
        return imgID;
    }
    public String getTitle() {
        return title;
    }


    public void setImgID(int imgID){
        this.imgID=imgID;
    }
    public void setTitle(String title){
        this.title=title;
    }

}
