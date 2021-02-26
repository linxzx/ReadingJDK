package reading.java.lang.object.clone;

import java.io.IOException;

public class Clone {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO Auto-generated method stub

        cloneTest();
    }

    public static void cloneTest() throws ClassNotFoundException, IOException {
        CloneHadler a = new CloneHadler();
        a.setA("a");
        a.setB("b");

        CloneSunHandler s = new CloneSunHandler();
        s.setA("a");
        a.setS(s);

        System.out.println("===================cloneǰ=========================");
        System.out.println(a.toString());

        CloneHadler e = a.jsonClone();
        e.setC("c");
        e.getS().setB("jsonClone");
        System.out.println("===================jsonClone��=========================");
        System.out.println(a.toString());
        System.out.println(e.toString());

        CloneHadler d = a.deepClone();
        d.setC("c");
        d.getS().setB("deepClone");
        System.out.println("===================��clone��=========================");
        System.out.println(a.toString());
        System.out.println(d.toString());

        CloneHadler c = a.fakeDeepClone();
        c.setC("c");
        c.getS().setB("fakeDeepClone");
        System.out.println("===================α��clone��=========================");
        System.out.println(a.toString());
        System.out.println(c.toString());

        CloneHadler b = a.clone();
        b.setC("c");
        // ��Ϊǳ��¡�����ö���ֻ�ǿ�¡�˵�ַ�����ԣ������ö����ƣ�Դ��Ŀ����󶼻���ʾ��ֵ
        b.getS().setB("clone");
        System.out.println("===================ǳclone��=========================");
        System.out.println(a.toString());
        System.out.println(b.toString());

    }

}
