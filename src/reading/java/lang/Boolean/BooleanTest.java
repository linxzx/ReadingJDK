package reading.java.lang.Boolean;

import java.util.Date;

public class BooleanTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // newBooleanTime();
        // getTime();

        /*        �������ݣ���̬����
        Boolean.TRUE
        Boolean.FALSE
        Boolean.TYPE
        Boolean.value
        Boolean.serialVersionUID*/

        /*        ���췽��
        public Boolean(boolean value);
        public Boolean(String s);
        ��String����boolean
        public static boolean parseBoolean(String s) ;*/

        /*��ȡBoolean��value��ֵ
        public boolean booleanValue();*/

        /*     ����boolean����String��ȡBoolean   
        public static Boolean valueOf(boolean b) ;
        public static Boolean valueOf(String s);*/

        /*     ����Boolean����boolean��String   
        public static String toString(boolean b);
        public String toString() ;*/

        /*��ȡBoolean����boolean��hashcode
        public static int hashCode(boolean value);
        public int hashCode();*/

        /*
        public boolean equals(Object obj);*/

        /*����String��ȡϵͳ����������ת��Ϊboolean
        public static boolean getBoolean(String name);*/

        /*�Ƚ�˳��
         * ����=1������ = 0��С��-1
        public int compareTo(Boolean b);
        public static int compare(boolean x, boolean y);*/

        if (Boolean.TRUE || Boolean.FALSE) {

        }
        /*&&,||,^
         * ���룬���
         * TODO �߼����㣬����ֱ��ʹ��BooleanҲ���ԣ�����ΪʲôҪ��װ����        
        public static boolean logicalOr(boolean a, boolean b);
        public static boolean logicalOr(boolean a, boolean b);
        public static boolean logicalXor(boolean a, boolean b);
        */
        BooleanBase();

    }

    public static final Boolean FALSE = new Boolean(false);
    public static final Boolean TRUE = new Boolean(true);

    /**
     * 
     * @Title: newBooleanTime
     * @Description: ��ͬ��ʽ���ɵ�Boolean����Ҫ�ĵ�ʱ��
     * @param
     * @return void
     * @author �������������
     * @throws @date
     *             2020��12��28�� ����5:39:57
     */
    public static void newBooleanTime() {
        long time = System.nanoTime();

        Boolean b1 = Boolean.FALSE;

        long time1 = System.nanoTime();

        System.out.println("Boolean b1 = Boolean.FALSE; ����Boolean���ͣ���Ҫ��ʱ�䣺" + (time1 - time));
        time = System.nanoTime();
        Boolean b = new Boolean(false);

        time1 = System.nanoTime();
        System.out.println("Boolean b = new Boolean(false);����һ��Boolean���ͣ���Ҫ��ʱ�䣺" + (time1 - time));

        time = System.nanoTime();
        Boolean b2 = false;

        time1 = System.nanoTime();
        System.out.println("Boolean b2 = false;����һ��Boolean���ͣ���Ҫ��ʱ�䣺" + (time1 - time));

    }

    /**
     * ��ȡBoolean�ķ�װ���class����
     * 
     * TODO ����û�붮ΪʲôҪ����дһ����Ҳ�Ǹ�����һ����Ϊ�˼ӿ죿
     */
    // public static final Class<Boolean> TYPE = (Class<Boolean>) Class.getPrimitiveClass("boolean");

    // ���л��İ汾�ţ����ǲ���Ϊʲô�������ֵ����֣�
    // private static final long serialVersionUID = -3665804199014368530L;

    public static void getTime() {

        long time = -3665804199014368530L;

        Date d = new Date(time);
        System.out.println(d);

    }

    public static void BooleanBase() {

        /*ΪɶBoolean��hashֵΪʲôѡ�������������أ�
        ��Ҫԭ���ǣ�1231��1237�ǱȽϴ����������ѡ��������Ϊ����ɢ��Ͱ����õط������ݣ���ʵBooleanҲ����ѡ������������Ϊ���ϣֵ����˵�ⴿ�������ߵĸ���ϲ�á�
        �и���Ȥ�ĵط��ǣ���
        true: 1231 => 1 + 2 + 3 + 1 = 7��
        7-��ŷ�޴�ͳ�е��������֣�
        false: 1237 => 1 + 2 + 3 + 7 = 13��
        13���ǲ���������֣�*/

        Boolean b = new Boolean("");
        System.out.println(" new Boolean(\"\");��ֵ��" + b.booleanValue() + ",hashcodeֵΪ" + b.hashCode());

        Boolean b1 = Boolean.FALSE;
        System.out.println(" b1��ֵ��" + b1.booleanValue() + ",hashcodeֵΪ" + b1.hashCode());

        Boolean b2 = new Boolean(false);
        System.out.println(" b2��ֵ��" + b2.booleanValue() + ",hashcodeֵΪ" + b2.hashCode());
        Boolean b3 = false;
        System.out.println(" b3��ֵ��" + b3.booleanValue() + ",hashcodeֵΪ" + b3.hashCode());

        Boolean b5 = Boolean.TRUE;
        System.out.println(" b5��ֵ��" + b5.booleanValue() + ",hashcodeֵΪ" + b5.hashCode());

        Boolean b6 = new Boolean(true);
        System.out.println(" b6��ֵ��" + b6.booleanValue() + ",hashcodeֵΪ" + b6.hashCode());
        Boolean b7 = true;
        System.out.println(" b7��ֵ��" + b7.booleanValue() + ",hashcodeֵΪ" + b7.hashCode());

        Boolean b4 = new Boolean("true");
        System.out.println("new Boolean (\"true\");��ֵ��" + b4.booleanValue() + ",hashcodeֵΪ" + b4.hashCode());

        boolean b8 = false;
        System.out.println(" b8��ֵ��" + b8 + ",hashcodeֵΪ");

    }

    /*    
     * 
     *����Boolean��ֵ 
     * public boolean booleanValue() {
        return value;
    }    
     */

    /*
     * ���췽��
     * 
     *     public Boolean(boolean value) {
        this.value = value;
    }
     * 
     * public Boolean(String s) {
        this(parseBoolean(s));
    }
    
    *����String
    */
    public static boolean parseBoolean(String s) {
        return ((s != null) && s.equalsIgnoreCase("true"));// ���Դ�Сд
    }

    /**
     * ���ݻ�������boolean��String���ط�װ��Boolean
     * 
     * @Title: valueOf
     * @Description:
     * @param b
     * @return Boolean
     * @author �������������
     * @throws @date
     *             2020��12��29�� ����10:57:37
     */

    public static Boolean valueOf(boolean b) {
        return (b ? TRUE : FALSE);
    }

    public static Boolean valueOf(String s) {
        return parseBoolean(s) ? TRUE : FALSE;
    }

    /**
     * 
     * @Title: toString
     * @Description: ��̬���������ڻ�������boolean��ӡ
     * @param b
     * @return String
     * @author �������������
     * @throws @date
     *             2020��12��29�� ����10:49:59
     */

    /*    public static String toString(boolean b) {
        return b ? "true" : "false";
    }
    
    public String toString() {
        return value ? "true" : "false";
    }*/

}
