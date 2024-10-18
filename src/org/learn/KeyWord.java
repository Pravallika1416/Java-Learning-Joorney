package org.learn;

public class KeyWord
        //implements Comparable<KeyWord>
        {
    String key;
    Integer count;
    KeyWord(String key,Integer count){
        this.key=key;
        this.count=count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "KeyWord{" +
                "key='" + key + '\'' +
                ", count=" + count +
                '}';
    }

 /*  @Override
    public int compareTo(KeyWord o) {
        if(o.getCount() > this.getCount()){
            return 1;
        } else if (o.getCount() <this.getCount()) {
            return -1;
        }else{
            return 0;
        }
    }*/
}
