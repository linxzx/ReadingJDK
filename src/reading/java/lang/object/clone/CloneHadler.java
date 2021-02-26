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
 * @Description: clone������
 * @author �������������
 * @date 2020��12��28�� ����2:55:07
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
     * @Description:��¡���󷽷���ǳ��¡��
     * @param @return
     * @return CloneHadler
     * @author �������������
     * @throws @date
     *             2020��12��28�� ����2:54:24
     */
    public CloneHadler shallowClone() {
        long time = System.nanoTime();// ȡ��ϵͳ��ǰʱ��
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
     * ʹ��super.clone��Ҫʵ��Cloneable��ǩ�ӿڣ�����ᱨ�� Object�е�cloneֻ��ǳ��¡�����¡��Ҫ�Լ���д ��Ȼ�ﵽ�����¡��Ŀ�ģ�����ʵ�ʻ���ǳ��¡��Ƕ�״�ɣ�
     * һ��������Ƕ�׶�����ö���Ŷ��~~~~~~~~
     * 
     * @Title: fakeDeepClone
     * @Description: α���¡
     * @param @return
     * @return CloneHadler
     * @author �������������
     * @throws @date
     *             2020��12��28�� ����3:10:04
     */
    public CloneHadler fakeDeepClone() {
        long time = System.nanoTime();// ȡ��ϵͳ��ǰʱ��
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
     * ʹ�����л���ʵ�����¡��������Ҫʵ��Serializable�ӿڣ���������������ö����Ƕ�ף���ô���ö���Ҳ��Ҫʵ��Serializable�ӿڣ����򱨴� java.io.NotSerializableException
     * ����ʹ�����л��ٶ�������淽������
     * 
     * 
     * @Title: deepClone
     * @Description: ���¡
     * @param @return
     * @param @throws
     *            IOException
     * @param @throws
     *            ClassNotFoundException
     * @return CloneHadler
     * @author �������������
     * @throws @date
     *             2020��12��28�� ����3:22:05
     */

    public CloneHadler deepClone() throws IOException, ClassNotFoundException {

        long time = System.nanoTime();// ȡ��ϵͳ��ǰʱ��

        // ������д������
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // �����ж�����
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        getRunTime("deepClone", time);
        return (CloneHadler)oi.readObject();

    }

    /**
     * 
     * �������ֵת��Ϊjson��Ȼ����ת����������ַ�ʽ����Ҫʵ���κνӿڣ�ֻ��Ҫ����json��jar��������һ�ַ�ʽ�����ǣ�ʱ�俪��������QAQ
     * 
     * @Title: jsonClone
     * @Description:json��¡
     * @param @return
     * @return CloneHadler
     * @author �������������
     * @throws @date
     *             2020��12��28�� ����3:53:41
     */
    public CloneHadler jsonClone() {

        long time = System.nanoTime();// ȡ��ϵͳ��ǰʱ��
        // fastJsonʵ�ֿ�¡
        CloneHadler c = JSONObject.parseObject(JSONObject.toJSONBytes(this), this.getClass());
        getRunTime("jsonClone", time);
        return c;
    }

    public void getRunTime(String name, long time) {
        System.out.println("===================������" + name + "========ʹ��ʱ��" + (System.nanoTime() - time)
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
                context += "\n\ts.a��ֵ��" + this.s.getA() + "\ts.a��hashcode��" + this.s.getA().hashCode();
            }

            if (this.s.getB() != null) {
                context += "\ts.b��ֵ��" + this.s.getB() + "\ts.b��hashcode��" + this.s.getB().hashCode();
            }

        }

        return context;
    }

}
