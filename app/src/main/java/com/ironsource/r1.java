package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class r1 implements g5 {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f19922a;

    public r1(f1 adProperties) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f19922a = adProperties;
    }

    @Override // com.ironsource.g5
    public void a(com.ironsource.mediationsdk.i auctionRequestParams) {
        kotlin.jvm.internal.n.f(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f19922a.c());
        auctionRequestParams.a(this.f19922a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
