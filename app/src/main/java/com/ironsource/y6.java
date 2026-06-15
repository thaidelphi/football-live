package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y6 extends qp {

    /* renamed from: b  reason: collision with root package name */
    private final o1 f21479b;

    /* renamed from: c  reason: collision with root package name */
    private final ISBannerSize f21480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(o1 adTools, ISBannerSize size, String placement) {
        super(placement);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(size, "size");
        kotlin.jvm.internal.n.f(placement, "placement");
        this.f21479b = adTools;
        this.f21480c = size;
    }

    @Override // com.ironsource.qp, com.ironsource.d2
    public Map<String, Object> a(b2 b2Var) {
        Map<String, Object> v10;
        v10 = j8.j0.v(super.a(b2Var));
        this.f21479b.a(v10, this.f21480c);
        return v10;
    }
}
