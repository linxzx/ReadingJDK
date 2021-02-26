package reading.java.lang.object.clone;

import java.io.Serializable;

public class CloneSunHandler implements Cloneable, Serializable {

    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 1L;
    private String a;
    private String b;

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
    public CloneSunHandler shallowClone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (CloneSunHandler)o;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

}
