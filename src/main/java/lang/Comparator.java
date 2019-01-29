package lang;

import java.util.*;

/**
 * 具体的比较类（比较器），实现Comparator接口
 *
 * @author breeze
 */
class ComparatorConsumerInfo implements java.util.Comparator<ConsumerInfo> {
    /**
     * 顺序（从小到大）：
     * if(price < o.price){
     * return -1;
     * }
     * if(price > o.price){
     * return 1;
     * }
     * 倒序（从大到小）：
     * if(price < o.price){
     * return 1;
     * }
     * if(price > o.price){
     * return -1;
     * }
     */
    @Override
    public int compare(ConsumerInfo o1, ConsumerInfo o2) {
        //首先比较price，如果price相同，则比较uid
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        }

        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }

        if (o1.getPrice() == o2.getPrice()) {
            if (o1.getUid() > o2.getUid()) {
                return 1;
            }
            if (o1.getUid() < o2.getUid()) {
                return -1;
            }
        }
        return 0;
    }

}

//测试类
public class Comparator {

    public static void main(String[] args) {

        ConsumerInfo ConsumerInfo1 = new ConsumerInfo(100, "ConsumerInfo1", 400.0, new Date());
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

        //排序前
        System.out.println("排序前：");
        for (ConsumerInfo ConsumerInfo : list) {
            System.out.println(ConsumerInfo);
        }

        ComparatorConsumerInfo comparatorConsumerInfo = new ComparatorConsumerInfo();//比较器
        Collections.sort(list, comparatorConsumerInfo);//排序

        //排序后
        System.out.println("排序后：");
        for (ConsumerInfo ConsumerInfo : list) {
            System.out.println(ConsumerInfo);
        }
    }
}
