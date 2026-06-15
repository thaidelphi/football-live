package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class uk implements ks<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final ks<String> f21035a;

    public uk(ks<String> serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        this.f21035a = serverResponse;
    }

    @Override // com.ironsource.ks
    /* renamed from: b */
    public JSONObject a() {
        return new JSONObject(this.f21035a.a());
    }
}
