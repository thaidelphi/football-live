package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.hV  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1750hV extends JK {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ C0728Dn A00;

    public C1750hV(C0728Dn c0728Dn) {
        this.A00 = c0728Dn;
    }

    @Override // com.facebook.ads.redexgen.X.JK
    public final void A03() {
        AbstractC0722Dh abstractC0722Dh;
        JL jl;
        C0710Cv c0710Cv;
        WeakReference weakReference;
        JL jl2;
        C0710Cv c0710Cv2;
        AbstractC0722Dh abstractC0722Dh2;
        JL jl3;
        abstractC0722Dh = this.A00.A07;
        if (abstractC0722Dh != null) {
            abstractC0722Dh2 = this.A00.A07;
            if (!abstractC0722Dh2.A0D()) {
                jl3 = this.A00.A09;
                jl3.A0T();
                return;
            }
        }
        jl = this.A00.A09;
        jl.A0V();
        c0710Cv = this.A00.A05;
        if (!c0710Cv.A07()) {
            c0710Cv2 = this.A00.A05;
            c0710Cv2.A05();
        }
        weakReference = this.A00.A0B;
        InterfaceC0727Dm listener = (InterfaceC0727Dm) weakReference.get();
        if (listener != null) {
            listener.ADP();
        }
        C0728Dn c0728Dn = this.A00;
        String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        jl2 = c0728Dn.A09;
        jl2.A0V();
    }
}
