package reading.java.lang.Class;

public class ClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // ����֪�����⼸��ʮ�����Ƶ�������ʲô��˼
        // private final int ANNOTATION= 0x00002000;
        // private final int ENUM = 0x00004000;
        // private static final int SYNTHETIC = 0x00001000;

        // ClassDesc���࣬����������
        // private static final ClassDesc[] EMPTY_CLASS_DESC_ARRAY = new ClassDesc[0];

        /*��java.lang.System��java.lang.Object��java.lang.Class�о���һ�����ֵ���c�ķ���
         * Ϊ����JVM�ҵ����ı���������������ĳ�ַ�ʽ�������ǡ����磬����java.lang.Object.registerNatives��
         * ��Ӧ��C����������ΪJava_java_lang_Object_registerNatives��ͨ��ʹ��registerNatives
         * �����ȷ�е�˵����JNI����RegisterNatives������������������������C������
         * 
         *         private static native void registerNatives();
            static {
                registerNatives();
            }*/

    }

}
