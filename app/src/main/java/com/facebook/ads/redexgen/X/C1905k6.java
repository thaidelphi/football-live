package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.k6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1905k6 extends BY {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC05907l A00;
    public final /* synthetic */ C05917m A01;
    public final /* synthetic */ C05987t A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1905k6(C05987t c05987t, ArrayList arrayList, C05917m c05917m, InterfaceC05907l interfaceC05907l, ArrayList arrayList2) {
        this.A02 = c05987t;
        this.A03 = arrayList;
        this.A01 = c05917m;
        this.A00 = interfaceC05907l;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AtomicBoolean A0D;
        AnonymousClass85 anonymousClass85;
        Handler handler;
        AnonymousClass85 anonymousClass852;
        long j10;
        long j11;
        long j12;
        long j13;
        A0D = C05987t.A0D(this.A03);
        anonymousClass85 = this.A02.A04;
        if (anonymousClass85 instanceof C1900k1) {
            anonymousClass852 = this.A02.A04;
            C1900k1 c1900k1 = (C1900k1) anonymousClass852;
            if (this.A01.A00 == -1) {
                boolean z10 = A0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z10) {
                        InterfaceC04311f A0F = c1900k1.A0F();
                        j13 = this.A02.A00;
                        A0F.A4f(C0709Cu.A01(j13));
                    } else {
                        InterfaceC04311f A0F2 = c1900k1.A0F();
                        j12 = this.A02.A00;
                        A0F2.A4d(C0709Cu.A01(j12));
                    }
                }
                throw new RuntimeException();
            } else if (A0D.get()) {
                InterfaceC04311f A0F3 = c1900k1.A0F();
                j11 = this.A02.A00;
                long A01 = C0709Cu.A01(j11);
                C05917m c05917m = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    A0F3.A4g(A01, c05917m.A00);
                }
                throw new RuntimeException();
            } else {
                InterfaceC04311f A0F4 = c1900k1.A0F();
                j10 = this.A02.A00;
                A0F4.A4e(C0709Cu.A01(j10), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C1906k7(this, A0D));
        C05987t.A0D(this.A04);
    }
}
