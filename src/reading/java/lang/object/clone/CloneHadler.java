package reading.java.lang.object.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

import reading.java.lang.object.ObjectTestHandler;

/**
 * 
 * @ClassName: CloneHadler
 * @Description: clone测试类
 * @author 清茶袅袅落子声
 * @date 2020年12月28日 下午2:55:07
 */
public class CloneHadler extends ObjectTestHandler implements Cloneable, Serializable {

    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 1L;
    private CloneSunHandler s;

    public CloneHadler clone() {
        return shallowClone();
    }

    /**
     * 
     * @Title: shallowClone
     * @Description:克隆对象方法（浅克隆）
     * @param @return
     * @return CloneHadler
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月28日 下午2:54:24
     */
    public CloneHadler shallowClone() {
        long time = System.nanoTime();// 取得系统当前时间
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        getRunTime("shallowClone", time);
        return (CloneHadler)o;
    }

    /**
     * 使用super.clone需要实现Cloneable标签接口，否则会报错 Object中的clone只是浅克隆，深克隆需要自己复写 虽然达到了深克隆的目的，但是实际还是浅克隆的嵌套达成，
     * 一旦对象中嵌套多层引用对象，哦豁~~~~~~~~
     * 
     * @Title: fakeDeepClone
     * @Description: 伪深克隆
     * @param @return
     * @return CloneHadler
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月28日 下午3:10:04
     */
    public CloneHadler fakeDeepClone() {
        long time = System.nanoTime();// 取得系统当前时间
        CloneHadler o = null;
        try {
            o = (CloneHadler)super.clone();
            o.setS(this.s.shallowClone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        getRunTime("fakeDeepClone", time);
        return o;
    }

    /**
     * 
     * 
     * TODO Serializable
     * 
     * 使用序列化来实现深克隆，但是需要实现Serializable接口，如果对象中有引用对象的嵌套，那么引用对象也需要实现Serializable接口，否则报错 java.io.NotSerializableException
     * 而且使用序列化速度相对上面方法较慢
     * 
     * 
     * @Title: deepClone
     * @Description: 深克隆
     * @param @return
     * @param @throws
     *            IOException
     * @param @throws
     *            ClassNotFoundException
     * @return CloneHadler
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月28日 下午3:22:05
     */

    public CloneHadler deepClone() throws IOException, ClassNotFoundException {

        long time = System.nanoTime();// 取得系统当前时间

        // 将对象写到流中
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 从流中读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        getRunTime("deepClone", time);
        return (CloneHadler)oi.readObject();

    }

    /**
     * 
     * 将对象的值转换为json，然后在转换会对象，这种方式不需要实现任何接口，只需要引入json的jar包是最方便的一种方式，但是，时间开销是最大的QAQ
     * 
     * @Title: jsonClone
     * @Description:json克隆
     * @param @return
     * @return CloneHadler
     * @author 清茶袅袅落子声
     * @throws @date
     *             2020年12月28日 下午3:53:41
     */
    public CloneHadler jsonClone() {

        long time = System.nanoTime();// 取得系统当前时间
        // fastJson实现克隆
        CloneHadler c = JSONObject.parseObject(JSONObject.toJSONBytes(this), this.getClass());
        getRunTime("jsonClone", time);
        return c;
    }

    public void getRunTime(String name, long time) {
        System.out.println("===================方法：" + name + "========使用时间" + (System.nanoTime() - time)
            + "==========================");
    }

    public CloneSunHandler getS() {
        return s;
    }

    public void setS(CloneSunHandler s) {
        this.s = s;
    }

    @Override
    public String toString() {

        String context = super.toString();

        if (null != s) {

            if (this.s.getA() != null) {
                context += "\n\ts.a的值：" + this.s.getA() + "\ts.a的hashcode：" + this.s.getA().hashCode();
            }

            if (this.s.getB() != null) {
                context += "\ts.b的值：" + this.s.getB() + "\ts.b的hashcode：" + this.s.getB().hashCode();
            }

        }

        return context;
    }

}
