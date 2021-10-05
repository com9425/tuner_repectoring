package com.example.asdfe;

public class gtItemData {
        public int imgID;
        public String title;
        public String content;


    public gtItemData(int imgID , String title , String content) {//생성과동시에 리스트항목에 뿌려주기위해
        this.imgID=imgID;//필드와 매개변수가 같을때 구분하는문자 this
        this.title=title;
        this.content=content;
    }



}
