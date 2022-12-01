package net.wenzuo.codes.designpattern.composite;

/**
 * @author Catch
 * @since 2022-04-12
 */
public class Main {

    public static void main(String[] args) {
        Region henan = new Region(1, "河南省");

        Region zhengzhou = new Region(2, "郑州市");
        Region luoyang = new Region(3, "洛阳市");

        Region zhongyuan = new Region(4, "中原区");
        Region jinshui = new Region(5, "金水区");

        henan.add(zhengzhou);
        henan.add(luoyang);

        zhengzhou.add(zhongyuan);
        zhengzhou.add(jinshui);

        System.out.println(henan);
    }

}