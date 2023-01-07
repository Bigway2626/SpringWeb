package com.marketweb.webdamo.model;

public class gitData {
    static String git_add = "git add //新增檔案到git";
    static String git_commit = "git commit -m //保存進度加入註解";
    static String git_log = "git log //查看執行紀錄";
   public  static  String ReturnGitFounction(String Founction){
       if(Founction== git_add){
           return git_add;
       }
       else if(Founction== git_log){
           return git_log;
       }else {
           return git_commit;
       }
   }
}
