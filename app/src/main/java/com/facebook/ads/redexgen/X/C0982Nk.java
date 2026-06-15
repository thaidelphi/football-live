package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* renamed from: com.facebook.ads.redexgen.X.Nk  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0982Nk implements InterfaceC2160oW {
    public final /* synthetic */ C0981Nj A00;

    public C0982Nk(C0981Nj c0981Nj) {
        this.A00 = c0981Nj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2160oW
    public final void AF0() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList<Runnable> arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC2160oW interfaceC2160oW;
        InterfaceC2160oW interfaceC2160oW2;
        linkedHashMap = this.A00.A07;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A07;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A07;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A07;
            linkedHashMap4.clear();
        }
        for (Runnable runnable2 : arrayList) {
            runnable2.run();
        }
        interfaceC2160oW = this.A00.A00;
        if (interfaceC2160oW != null) {
            interfaceC2160oW2 = this.A00.A00;
            interfaceC2160oW2.AF0();
        }
    }
}
