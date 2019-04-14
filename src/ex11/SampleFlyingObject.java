package ex11;

public class SampleFlyingObject {
    public static void main(String[] args) {
        FlyingObject aPlane, aBird;

        aPlane = new Boeing787();
        aBird = new Swallow();

        aPlane.fly();
        aBird.fly();
        aBird.pick();
        // aBird.pick(); // ���ιԤ��դ��ä���ȥ��顼�ˤʤ�
    }
}
