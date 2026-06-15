package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.lI  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1977lI implements C5D {
    public final /* synthetic */ MR A00;
    public final /* synthetic */ AnonymousClass58 A01;

    public C1977lI(MR mr, AnonymousClass58 anonymousClass58) {
        this.A00 = mr;
        this.A01 = anonymousClass58;
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final Object A56(int i10) {
        AnonymousClass56 compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final List<Object> A6O(String str, int i10) {
        List<AnonymousClass56> A03 = this.A01.A03(str, i10);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(A03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final Object A6P(int i10) {
        AnonymousClass56 compatInfo = this.A01.A01(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.X.C5D
    public final boolean AG3(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
