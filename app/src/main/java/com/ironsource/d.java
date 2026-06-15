package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d implements xc {

    /* renamed from: a  reason: collision with root package name */
    private final ep f16932a;

    public d(ep folderRootUrl) {
        kotlin.jvm.internal.n.f(folderRootUrl, "folderRootUrl");
        this.f16932a = folderRootUrl;
    }

    @Override // com.ironsource.xc
    public String value() {
        return this.f16932a.a() + "/abTestMap.json";
    }
}
