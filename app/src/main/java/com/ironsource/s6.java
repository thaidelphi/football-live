package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s6 extends r1 {

    /* renamed from: b  reason: collision with root package name */
    private final ISBannerSize f20092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(f1 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f20092b = iSBannerSize;
    }

    @Override // com.ironsource.r1, com.ironsource.g5
    public void a(com.ironsource.mediationsdk.i auctionRequestParams) {
        kotlin.jvm.internal.n.f(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.f20092b);
    }
}
