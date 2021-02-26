package reading.java.lang.object.hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author lxf
 * @date 2020/12/23
 */
public class HashCode {

    public static void main(String[] args) {

        HashCode o = new HashCode();
        o.hashCodeTest();
    }

    public void hashCodeTest() {

        System.out.println(
            "===============================================String========================================================");
        String a = "测试文本";
        int ahash = a.hashCode();
        String b = "测试文本";
        int bhash = b.hashCode();
        System.out.println("a的值：" + a + "\tb的值:" + b);
        System.out.println("a的hash值：" + ahash + "\tb的hash值：" + bhash + "\t" + (ahash == bhash));

        String c = a + "c";
        int chash = c.hashCode();
        System.out.println("a的值：" + a + "\tc的值:" + c);
        System.out.println("a的hash值：" + ahash + "\tc的hash值：" + chash + "\t" + (ahash == chash));

        String d = c.substring(0, c.length() - 1);
        int dhash = d.hashCode();
        System.out.println("a的值：" + a + "\td的值:" + d);
        System.out.println("a的hash值：" + ahash + "\td的hash值：" + dhash + "\t" + (ahash == dhash));

        System.out.println(
            "===============================================Map========================================================");
        Map<String, String> ma = new HashMap<String, String>();
        Map<String, String> mb = new HashMap<String, String>();
        int mah = ma.hashCode();
        int mbh = mb.hashCode();

        System.out.println("ma的值：" + ma + "\tmb的值:" + mb);
        System.out.println("ma的hash值：" + mah + "\tmb的hash值：" + mbh + "\t" + (mah == mbh));

        ma.put("a", a);
        mb.put("a", c);
        mah = ma.hashCode();
        mbh = mb.hashCode();
        System.out.println("ma的值：" + ma + "\tmb的值:" + mb);
        System.out.println("ma的hash值：" + mah + "\tmb的hash值：" + mbh + "\t" + (mah == mbh));

        mb.put("a", a);
        mah = ma.hashCode();
        mbh = mb.hashCode();
        System.out.println("ma的值：" + ma + "\tmb的值:" + mb);
        System.out.println("ma的hash值：" + mah + "\tmb的hash值：" + mbh + "\t" + (mah == mbh));

        System.out.println(
            "================================ObjectTestHandler========================================================");
        HashCodeTestHandler otha = new HashCodeTestHandler();
        HashCodeTestHandler othb = new HashCodeTestHandler();
        int othah = otha.hashCode();
        int othbh = othb.hashCode();

        System.out.println("otha的值：" + otha + "\nothb的值:" + othb);
        System.out.println("otha的hash值：" + othah + "\tmb的hash值：" + othbh + "\n两者之间的hash：" + (othah == othbh)
            + "\n两者是否相同：" + (otha.equals(othb)));

        System.out.println(
            "================================ObjectTestHandler1========================================================");

        otha.setA(a);
        othah = otha.hashCode();
        othbh = othb.hashCode();
        System.out.println("otha的值：" + otha + "\nothb的值:" + othb);
        System.out.println("otha的hash值：" + othah + "\tmb的hash值：" + othbh + "\n两者之间的hash：" + (othah == othbh)
            + "\n两者是否相同：" + (otha.equals(othb)));
        System.out.println(
            "================================ObjectTestHandler2========================================================");
        othb.setB(b);
        othah = otha.hashCode();
        othbh = othb.hashCode();
        System.out.println("otha的值：" + otha + "\nothb的值:" + othb);
        System.out.println("otha的hash值：" + othah + "\tmb的hash值：" + othbh + "\n两者之间的hash：" + (othah == othbh)
            + "\n两者是否相同：" + (otha.equals(othb)));
        System.out.println(
            "================================ObjectTestHandler3========================================================");
        otha.setB(b);
        othb.setA(a);
        othah = otha.hashCode();
        othbh = othb.hashCode();
        System.out.println("otha的值：" + otha + "\nothb的值:" + othb);
        System.out.println("otha的hash值：" + othah + "\tmb的hash值：" + othbh + "\n两者之间的hash：" + (othah == othbh)
            + "\n两者是否相同：" + (otha.equals(othb)));

        System.out.println(
            "================================ObjectTestHandlerRe========================================================");
        HashCodeTestHandlerRe othra = new HashCodeTestHandlerRe();
        HashCodeTestHandlerRe othrb = new HashCodeTestHandlerRe();
        int othrah = othra.hashCode();
        int othrbh = othrb.hashCode();

        System.out.println("othra的值：" + othra + "\nothrb的值:" + othrb);
        System.out.println("othra的hash值：" + othrah + "\tmb的hash值：" + othrbh + "\n两者之间的hash：" + (othrah == othrbh)
            + "\n两者是否相同：" + (othra.equals(othrb)));

        System.out.println(
            "================================ObjectTestHandlerRe1========================================================");

        othra.setA(a);
        othrah = othra.hashCode();
        othrbh = othrb.hashCode();
        System.out.println("othra的值：" + othra + "\nothrb的值:" + othrb);
        System.out.println("othra的hash值：" + othrah + "\tmb的hash值：" + othrbh + "\n两者之间的hash：" + (othrah == othrbh)
            + "\n两者是否相同：" + (othra.equals(othrb)));
        System.out.println(
            "================================ObjectTestHandlerRe2========================================================");
        othrb.setB(b);
        othrah = othra.hashCode();
        othrbh = othrb.hashCode();
        System.out.println("othra的值：" + othra + "\nothrb的值:" + othrb);
        System.out.println("othra的hash值：" + othrah + "\tmb的hash值：" + othrbh + "\n两者之间的hash：" + (othrah == othrbh)
            + "\n两者是否相同：" + (othra.equals(othrb)));
        System.out.println(
            "================================ObjectTestHandlerRe3========================================================");
        othra.setB(b);
        othrb.setA(a);
        othrah = othra.hashCode();
        othrbh = othrb.hashCode();
        System.out.println("othra的值：" + othra + "\nothrb的值:" + othrb);
        System.out.println("othra的hash值：" + othrah + "\tmb的hash值：" + othrbh + "\n两者之间的hash：" + (othrah == othrbh)
            + "\n两者是否相同：" + (othra.equals(othrb)));
    }

}
