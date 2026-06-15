package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
/* renamed from: com.facebook.ads.redexgen.X.iB  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1788iB implements InterfaceC0698Cj {
    public final Collection<String> A00;

    public C1788iB() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void AGG(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0698Cj
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.A00) {
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
