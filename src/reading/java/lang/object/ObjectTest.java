package reading.java.lang.object;

import reading.java.lang.object.equals.Equals;
import reading.java.lang.object.hashcode.HashCode;

public class ObjectTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public void hashCodeTest() {
        HashCode h = new HashCode();
    }

    public void equalsTest() {
        Equals e = new Equals();

    }

    protected native Object clone() throws CloneNotSupportedException;

    /**
     * 没啥东东，就是获取本类类名+十六进制的hashcode
     */
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /**
     * TODO notify,notifyAll,wait
     */

}
