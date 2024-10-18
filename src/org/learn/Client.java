package org.learn;

public class Client {
    public static void main(String[] args) {
       // KeyAnalyzer items=new ListKeyAnalyzerImpl();
       // KeyAnalyzer items=new SetKeyAnalyzer();;
        KeyAnalyzer items=new HashMapKeyAnalyzerImpl();
        items.store("pen");
        items.store("pencil");
        items.store("book");
        items.store("pen");
        items.store("earser");
        items.store("pencil");
        items.store("book");
        items.store("pen");
        items.store("pencil");
        items.store("pencil");
        items.store("pencil");
        System.out.println(items.fetchKeys());
        System.out.println(items.fetchKeysWithCount());
    }






}
