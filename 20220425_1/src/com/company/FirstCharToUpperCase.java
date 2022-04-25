package com.company;

public class FirstCharToUpperCase {
    public String transform(String str){
        if(str!=null&&!str.isEmpty()){
          String res="";
          res=str.substring(0,1).toUpperCase()+str.substring(1);
          return res;
        } else {
            return "";
        }

    }

}
