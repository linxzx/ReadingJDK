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
        String a = "�����ı�";
        int ahash = a.hashCode();
        String b = "�����ı�";
        int bhash = b.hashCode();
        System.out.println("a��ֵ��" + a + "\tb��ֵ:" + b);
        System.out.println("a��hashֵ��" + ahash + "\tb��hashֵ��" + bhash + "\t" + (ahash == bhash));

        String c = a + "c";
        int chash = c.hashCode();
        System.out.println("a��ֵ��" + a + "\tc��ֵ:" + c);
        System.out.println("a��hashֵ��" + ahash + "\tc��hashֵ��" + chash + "\t" + (ahash == chash));

        String d = c.substring(0, c.length() - 1);
        int dhash = d.hashCode();
        System.out.println("a��ֵ��" + a + "\td��ֵ:" + d);
        System.out.println("a��hashֵ��" + ahash + "\td��hashֵ��" + dhash + "\t" + (ahash == dhash));

        System.out.println(
            "===============================================Map========================================================");
        Map<String, String> ma = new HashMap<String, String>();
        Map<String, String> mb = new HashMap<String, String>();
        int mah = ma.hashCode();
        int mbh = mb.hashCode();

        System.out.println("ma��ֵ��" + ma + "\tmb��ֵ:" + mb);
        System.out.println("ma��hashֵ��" + mah + "\tmb��hashֵ��" + mbh + "\t" + (mah == mbh));

        ma.put("a", a);
        mb.put("a", c);
        mah = ma.hashCode();
        mbh = mb.hashCode();
        System.out.println("ma��ֵ��" + ma + "\tmb��ֵ:" + mb);
        System.out.println("ma��hashֵ��" + mah + "\tmb��hashֵ��" + mbh + "\t" + (mah == mbh));

        mb.put("a", a);
        mah = ma.hashCode();
        mbh = mb.hashCode();
        System.out.println("ma��ֵ��" + ma + "\tmb��ֵ:" + mb);
        System.out.println("ma��hashֵ��" + mah + "\tmb��hashֵ��" + mbh + "\t" + (mah == mbh));

        System.out.println(
            "================================ObjectTestHandler========================================================");
        HashCodeTestHandler otha = new HashCodeTestHandler();
        HashCodeTestHandler othb = new HashCodeTestHandler();
        int othah = otha.hashCode();
        int othbh = othb.hashCode();

        System.out.println("otha��ֵ��" + otha + "\nothb��ֵ:" + othb);
        System.out.println("otha��hashֵ��" + othah + "\tmb��hashֵ��" + othbh + "\n����֮���hash��" + (othah == othbh)
            + "\n�����Ƿ���ͬ��" + (otha.equals(othb)));

        System.out.println(
            "================================ObjectTestHandler1========================================================");

        otha.setA(a);
        othah = otha.hashCode();
        othbh = othb.hashCode();
        System.out.println("otha��ֵ��" + otha + "\nothb��ֵ:" + othb);
        System.out.println("otha��hashֵ��" + othah + "\tmb��hashֵ��" + othbh + "\n����֮���hash��" + (othah == othbh)
            + "\n�����Ƿ���ͬ��" + (otha.equals(othb)));
        System.out.println(
            "================================ObjectTestHandler2========================================================");
        othb.setB(b);
        othah = otha.hashCode();
        othbh = othb.hashCode();
        System.out.println("otha��ֵ��" + otha + "\nothb��ֵ:" + othb);
        System.out.println("otha��hashֵ��" + othah + "\tmb��hashֵ��" + othbh + "\n����֮���hash��" + (othah == othbh)
            + "\n�����Ƿ���ͬ��" + (otha.equals(othb)));
        System.out.println(
            "================================ObjectTestHandler3========================================================");
        otha.setB(b);
        othb.setA(a);
        othah = otha.hashCode();
        othbh = othb.hashCode();
        System.out.println("otha��ֵ��" + otha + "\nothb��ֵ:" + othb);
        System.out.println("otha��hashֵ��" + othah + "\tmb��hashֵ��" + othbh + "\n����֮���hash��" + (othah == othbh)
            + "\n�����Ƿ���ͬ��" + (otha.equals(othb)));

        System.out.println(
            "================================ObjectTestHandlerRe========================================================");
        HashCodeTestHandlerRe othra = new HashCodeTestHandlerRe();
        HashCodeTestHandlerRe othrb = new HashCodeTestHandlerRe();
        int othrah = othra.hashCode();
        int othrbh = othrb.hashCode();

        System.out.println("othra��ֵ��" + othra + "\nothrb��ֵ:" + othrb);
        System.out.println("othra��hashֵ��" + othrah + "\tmb��hashֵ��" + othrbh + "\n����֮���hash��" + (othrah == othrbh)
            + "\n�����Ƿ���ͬ��" + (othra.equals(othrb)));

        System.out.println(
            "================================ObjectTestHandlerRe1========================================================");

        othra.setA(a);
        othrah = othra.hashCode();
        othrbh = othrb.hashCode();
        System.out.println("othra��ֵ��" + othra + "\nothrb��ֵ:" + othrb);
        System.out.println("othra��hashֵ��" + othrah + "\tmb��hashֵ��" + othrbh + "\n����֮���hash��" + (othrah == othrbh)
            + "\n�����Ƿ���ͬ��" + (othra.equals(othrb)));
        System.out.println(
            "================================ObjectTestHandlerRe2========================================================");
        othrb.setB(b);
        othrah = othra.hashCode();
        othrbh = othrb.hashCode();
        System.out.println("othra��ֵ��" + othra + "\nothrb��ֵ:" + othrb);
        System.out.println("othra��hashֵ��" + othrah + "\tmb��hashֵ��" + othrbh + "\n����֮���hash��" + (othrah == othrbh)
            + "\n�����Ƿ���ͬ��" + (othra.equals(othrb)));
        System.out.println(
            "================================ObjectTestHandlerRe3========================================================");
        othra.setB(b);
        othrb.setA(a);
        othrah = othra.hashCode();
        othrbh = othrb.hashCode();
        System.out.println("othra��ֵ��" + othra + "\nothrb��ֵ:" + othrb);
        System.out.println("othra��hashֵ��" + othrah + "\tmb��hashֵ��" + othrbh + "\n����֮���hash��" + (othrah == othrbh)
            + "\n�����Ƿ���ͬ��" + (othra.equals(othrb)));
    }

}
