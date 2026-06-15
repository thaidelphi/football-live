package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.kP  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1924kP implements InterfaceC05907l {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C2076mv> A00;
    public final /* synthetic */ C1923kO A01;

    public C1924kP(C1923kO c1923kO, List<C2076mv> list) {
        this.A01 = c1923kO;
        this.A00 = list;
    }

    private void A00() {
        AnonymousClass72 anonymousClass72;
        AnonymousClass72 anonymousClass722;
        AnonymousClass72 anonymousClass723;
        C1900k1 c1900k1;
        AnonymousClass72 anonymousClass724;
        AnonymousClass72 anonymousClass725;
        C1900k1 c1900k12;
        anonymousClass72 = this.A01.A00;
        anonymousClass72.A05(true);
        anonymousClass722 = this.A01.A00;
        anonymousClass722.A02();
        anonymousClass723 = this.A01.A00;
        anonymousClass723.A03(0);
        Iterator<C2076mv> it = this.A00.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (hasNext) {
                c1900k1 = this.A01.A01;
                C1818ih A0K = C1816ie.A0K();
                anonymousClass724 = this.A01.A00;
                C1816ie c1816ie = new C1816ie(c1900k1, it.next(), null, A0K, anonymousClass724.A01());
                if (c1816ie.A0z() != null && c1816ie.A0z().A0F() != null) {
                    ((AbstractC2031mC) c1816ie.A0z().A0F()).A00(c1816ie);
                }
                anonymousClass725 = this.A01.A00;
                c1900k12 = this.A01.A01;
                anonymousClass725.A04(new NativeAd(c1900k12, c1816ie));
            } else {
                BP.A00(new C1925kQ(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACa() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05907l
    public final void ACj() {
        A00();
    }
}
