package reading.java.lang.object.hashcode;

import java.util.Objects;

public class HashCodeTestHandlerRe {

    private String a;
    private String b;
    private String c;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public boolean equals(Object obj) {

        HashCodeTestHandlerRe objh = (HashCodeTestHandlerRe)obj;

        if (this.getA() == objh.getA()) {
            if (this.getA() == objh.getA()) {
                if (this.getA() == objh.getA()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public String toString() {

        String context = "";

        if (this.getA() != null) {
            context += "\ta��ֵ��" + this.a + "\ta��hashcode��" + this.a.hashCode();
        }

        if (this.getB() != null) {
            context += "\tb��ֵ��" + this.b + "\tb��hashcode��" + this.b.hashCode();
        }

        if (this.getC() != null) {
            context += "\tc��ֵ��" + this.c + "\tc��hashcode��" + this.c.hashCode();
        }
        return context;
    }

}
