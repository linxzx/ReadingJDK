package reading.java.lang.Boolean;

import java.util.Date;

public class BooleanTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // newBooleanTime();
        // getTime();

        /*        基本数据，静态变量
        Boolean.TRUE
        Boolean.FALSE
        Boolean.TYPE
        Boolean.value
        Boolean.serialVersionUID*/

        /*        构造方法
        public Boolean(boolean value);
        public Boolean(String s);
        将String返回boolean
        public static boolean parseBoolean(String s) ;*/

        /*获取Boolean中value的值
        public boolean booleanValue();*/

        /*     根据boolean或者String获取Boolean   
        public static Boolean valueOf(boolean b) ;
        public static Boolean valueOf(String s);*/

        /*     返回Boolean或者boolean的String   
        public static String toString(boolean b);
        public String toString() ;*/

        /*获取Boolean或者boolean的hashcode
        public static int hashCode(boolean value);
        public int hashCode();*/

        /*
        public boolean equals(Object obj);*/

        /*根据String获取系统变量，并且转换为boolean
        public static boolean getBoolean(String name);*/

        /*比较顺序：
         * 大于=1，等于 = 0，小于-1
        public int compareTo(Boolean b);
        public static int compare(boolean x, boolean y);*/

        if (Boolean.TRUE || Boolean.FALSE) {

        }
        /*&&,||,^
         * 或，与，异或
         * TODO 逻辑计算，但是直接使用Boolean也可以，不懂为什么要封装方法        
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
     * @Description: 不同方式生成的Boolean所需要的的时间
     * @param
     * @return void
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月28日 下午5:39:57
     */
    public static void newBooleanTime() {
        long time = System.nanoTime();

        Boolean b1 = Boolean.FALSE;

        long time1 = System.nanoTime();

        System.out.println("Boolean b1 = Boolean.FALSE; 生成Boolean类型，需要的时间：" + (time1 - time));
        time = System.nanoTime();
        Boolean b = new Boolean(false);

        time1 = System.nanoTime();
        System.out.println("Boolean b = new Boolean(false);生成一个Boolean类型，需要的时间：" + (time1 - time));

        time = System.nanoTime();
        Boolean b2 = false;

        time1 = System.nanoTime();
        System.out.println("Boolean b2 = false;生成一个Boolean类型，需要的时间：" + (time1 - time));

    }

    /**
     * 获取Boolean的封装类的class对象
     * 
     * TODO 但是没想懂为什么要特意写一个，也是跟上面一样，为了加快？
     */
    // public static final Class<Boolean> TYPE = (Class<Boolean>) Class.getPrimitiveClass("boolean");

    // 序列化的版本号，就是不懂为什么是这个奇怪的数字？
    // private static final long serialVersionUID = -3665804199014368530L;

    public static void getTime() {

        long time = -3665804199014368530L;

        Date d = new Date(time);
        System.out.println(d);

    }

    public static void BooleanBase() {

        /*为啥Boolean的hash值为什么选择这两个数字呢？
        主要原因是，1231与1237是比较大的素数，而选择素数是为了在散列桶中最好地分配数据，其实Boolean也可以选择其他素数作为其哈希值，据说这纯粹是作者的个人喜好。
        有个有趣的地方是，当
        true: 1231 => 1 + 2 + 3 + 1 = 7；
        7-是欧洲传统中的幸运数字；
        false: 1237 => 1 + 2 + 3 + 7 = 13；
        13则是不吉祥的数字；*/

        Boolean b = new Boolean("");
        System.out.println(" new Boolean(\"\");的值是" + b.booleanValue() + ",hashcode值为" + b.hashCode());

        Boolean b1 = Boolean.FALSE;
        System.out.println(" b1的值是" + b1.booleanValue() + ",hashcode值为" + b1.hashCode());

        Boolean b2 = new Boolean(false);
        System.out.println(" b2的值是" + b2.booleanValue() + ",hashcode值为" + b2.hashCode());
        Boolean b3 = false;
        System.out.println(" b3的值是" + b3.booleanValue() + ",hashcode值为" + b3.hashCode());

        Boolean b5 = Boolean.TRUE;
        System.out.println(" b5的值是" + b5.booleanValue() + ",hashcode值为" + b5.hashCode());

        Boolean b6 = new Boolean(true);
        System.out.println(" b6的值是" + b6.booleanValue() + ",hashcode值为" + b6.hashCode());
        Boolean b7 = true;
        System.out.println(" b7的值是" + b7.booleanValue() + ",hashcode值为" + b7.hashCode());

        Boolean b4 = new Boolean("true");
        System.out.println("new Boolean (\"true\");的值是" + b4.booleanValue() + ",hashcode值为" + b4.hashCode());

        boolean b8 = false;
        System.out.println(" b8的值是" + b8 + ",hashcode值为");

    }

    /*    
     * 
     *返回Boolean的值 
     * public boolean booleanValue() {
        return value;
    }    
     */

    /*
     * 构造方法
     * 
     *     public Boolean(boolean value) {
        this.value = value;
    }
     * 
     * public Boolean(String s) {
        this(parseBoolean(s));
    }
    
    *解析String
    */
    public static boolean parseBoolean(String s) {
        return ((s != null) && s.equalsIgnoreCase("true"));// 忽略大小写
    }

    /**
     * 根据基本类型boolean和String返回封装类Boolean
     * 
     * @Title: valueOf
     * @Description:
     * @param b
     * @return Boolean
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月29日 下午10:57:37
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
     * @Description: 静态方法：用于基本类型boolean打印
     * @param b
     * @return String
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月29日 下午10:49:59
     */

    /*    public static String toString(boolean b) {
        return b ? "true" : "false";
    }
    
    public String toString() {
        return value ? "true" : "false";
    }*/

}
