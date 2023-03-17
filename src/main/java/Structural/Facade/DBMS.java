package Structural.Facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String,Row> db = new HashMap<>();

    public DBMS() {
        db.put("johnny", new Row("johnny","1988.09.19","johnny@naver.com"));
        db.put("jane", new Row("jane","1990.02.19","jane@naver.com"));
        db.put("hwan", new Row("hwan","1990.05.22","hwan@naver.com"));
    }

    public Row query(String name){
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            e.printStackTrace();
        }
        return db.get(name);
    }
}
