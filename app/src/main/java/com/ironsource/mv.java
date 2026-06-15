package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mv implements xc {

    /* renamed from: a  reason: collision with root package name */
    private final ep f19321a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19322b;

    public mv(ep folderRootUrl, String version) {
        kotlin.jvm.internal.n.f(folderRootUrl, "folderRootUrl");
        kotlin.jvm.internal.n.f(version, "version");
        this.f19321a = folderRootUrl;
        this.f19322b = version;
    }

    public final String a() {
        return this.f19322b;
    }

    @Override // com.ironsource.xc
    public String value() {
        return this.f19321a.a() + "/versions/" + this.f19322b + "/mobileController.html";
    }
}
