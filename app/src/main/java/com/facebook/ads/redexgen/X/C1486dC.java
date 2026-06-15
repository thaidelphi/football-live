package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.dC  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1486dC extends JK {
    public final /* synthetic */ A7 A00;
    public final /* synthetic */ C0710Cv A01;
    public final /* synthetic */ C0821Hc A02;
    public final /* synthetic */ C1483d9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1486dC(C1483d9 c1483d9, String str, C0821Hc c0821Hc, A7 a72, Map map, C0710Cv c0710Cv) {
        this.A03 = c1483d9;
        this.A04 = str;
        this.A02 = c0821Hc;
        this.A00 = a72;
        this.A05 = map;
        this.A01 = c0710Cv;
    }

    @Override // com.facebook.ads.redexgen.X.JK
    public final void A03() {
        JL jl;
        SparseBooleanArray sparseBooleanArray;
        JL jl2;
        C04592h c04592h;
        C1900k1 c1900k1;
        SparseBooleanArray sparseBooleanArray2;
        jl = this.A03.A02;
        if (!jl.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                A7 a72 = this.A00;
                String str = this.A04;
                FB fb = new FB(this.A05);
                jl2 = this.A03.A03;
                a72.AB0(str, fb.A03(jl2).A02(this.A01).A05());
                c04592h = this.A03.A00;
                c1900k1 = this.A03.A06;
                C04592h.A07(c04592h, c1900k1);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
