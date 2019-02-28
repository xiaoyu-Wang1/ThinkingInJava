package lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 因为要实现对ConsumerInfo对象的排序，所以在ConsumerInfo类中要实现Comparable接口，也就是要实现compareTo()方法
 * 具体的比较参照：依次按照price、uid进行倒序排序
 *
 * @author breeze
 */
class ConsumerInfo implements java.lang.Comparable<ConsumerInfo> {
    private int uid;
    private String name;
    private double price;
    private Date datetime;

    ConsumerInfo(int uid, String name, double price, Date datetime) {
        this.uid = uid;
        this.name = name;
        this.price = price;
        this.datetime = datetime;

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "ConsumerInfo [uid=" + uid + ", name=" + name + ", price=" + price
                + ", datetime=" + datetime + "]";
    }

    /**
     * 这里比较的是什么, Collections.sort方法实现的就是按照此比较的东西排列 顺序（从小到大）： if(price < o.price){ return -1; }
     * if(price > o.price){ return 1; } 倒序（从大到小）： if(price < o.price){ return 1; } if(price >
     * o.price){ return -1; }
     */
    @Override
    public int compareTo(ConsumerInfo o) {
        //首先比较price，如果price相同，则比较uid
        if (price < o.price) {
            return -1;
        }
        if (price > o.price) {
            return 1;
        }

        if (price == o.price) {
            if (uid < o.uid) {
                return -1;
            }
            if (uid > o.uid) {
                return 1;
            }
        }
        return 0;
    }
}

//测试类


public class Comparable {

    public static void main(String[] args) {

        ConsumerInfo ConsumerInfo1 = new ConsumerInfo(100, "ConsumerInfo1", 400.1, new Date());
        ConsumerInfo ConsumerInfo2 = new ConsumerInfo(200, "ConsumerInfo1", 200.0, new Date());
        ConsumerInfo ConsumerInfo3 = new ConsumerInfo(300, "ConsumerInfo1", 100.0, new Date());
        ConsumerInfo ConsumerInfo4 = new ConsumerInfo(400, "ConsumerInfo1", 700.0, new Date());
        ConsumerInfo ConsumerInfo5 = new ConsumerInfo(500, "ConsumerInfo1", 800.0, new Date());
        ConsumerInfo ConsumerInfo6 = new ConsumerInfo(600, "ConsumerInfo1", 300.0, new Date());
        ConsumerInfo ConsumerInfo7 = new ConsumerInfo(700, "ConsumerInfo1", 900.0, new Date());
        ConsumerInfo ConsumerInfo8 = new ConsumerInfo(800, "ConsumerInfo1", 400.0, new Date());

        List<ConsumerInfo> list = new ArrayList<>();
        list.add(ConsumerInfo1);
        list.add(ConsumerInfo2);
        list.add(ConsumerInfo3);
        list.add(ConsumerInfo4);
        list.add(ConsumerInfo5);
        list.add(ConsumerInfo6);
        list.add(ConsumerInfo7);
        list.add(ConsumerInfo8);
        list.add(null);
        System.out.println("排序前：");
        //排序前
        for (ConsumerInfo ConsumerInfo : list) {
            System.out.println(ConsumerInfo);
        }

        Collections.sort(list);//排序
        System.out.println("排序后：");
        //排序后
        for (ConsumerInfo ConsumerInfo : list) {
            System.out.println(ConsumerInfo);
        }
    }
}