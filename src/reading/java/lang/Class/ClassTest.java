package reading.java.lang.Class;

public class ClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 还不知道到这几个十六进制的数字是什么意思
        // private final int ANNOTATION= 0x00002000;
        // private final int ENUM = 0x00004000;
        // private static final int SYNTHETIC = 0x00001000;

        // ClassDesc是类，函数的描述
        // private static final ClassDesc[] EMPTY_CLASS_DESC_ARRAY = new ClassDesc[0];

        /*在java.lang.System、java.lang.Object、java.lang.Class中均有一个这种调用c的方法
         * 为了让JVM找到您的本机函数，必须以某种方式命名它们。例如，对于java.lang.Object.registerNatives，
         * 相应的C函数被命名为Java_java_lang_Object_registerNatives。通过使用registerNatives
         * （或更确切地说，是JNI函数RegisterNatives），您可以随心所欲地命名C函数。
         * 
         *         private static native void registerNatives();
            static {
                registerNatives();
            }*/

    }

}
