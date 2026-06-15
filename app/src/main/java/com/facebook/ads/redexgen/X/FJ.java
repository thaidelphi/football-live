package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class FJ implements Runnable {
    public static String[] A01 = {"wQeUkUFktfM2l", "7XaAWiHxEbalq5gcAes6NrqtmXxPT4Y3", "2fv7kArIDvQtbqE5fFFu3pq8qRlQU6Cv", "0xhN0xjEaMXvjGar1KVcE", "ki2D6rKULGHthGJNrJcFjvO3aJEOf9d", "JHuN8xfhz8lLzrwSWaENIG05O1ASDFA", "9Zp5ZsxK45djlTC7gbsQv9P1cFfLGY7l", "GKuX8TC50ZMrYys0rib1"};
    public final /* synthetic */ AbstractC1694gb A00;

    public FJ(AbstractC1694gb abstractC1694gb) {
        this.A00 = abstractC1694gb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int A07;
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00 = this.A00.A0N.A04();
            AbstractC1694gb abstractC1694gb = this.A00;
            A07 = AbstractC1694gb.A07(this.A00.A0N.A04());
            abstractC1694gb.A02 = A07;
            this.A00.A0O();
        } catch (Throwable th) {
            if (A01[7].length() == 26) {
                throw new RuntimeException();
            }
            A01[2] = "KsmznMcBbJjrBrEeTGYdkeMkvFpYNuvy";
            BQ.A00(th, this);
        }
    }
}
