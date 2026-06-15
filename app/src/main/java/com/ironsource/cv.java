package com.ironsource;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class cv {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f16924a = bv.f16794a.a();

    /* renamed from: b  reason: collision with root package name */
    private final he f16925b = new he();

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b10 = ie.b(jSONObject.optJSONObject(fe.f17455u));
        if (b10 != null) {
            jSONObject.put(fe.f17455u, b10);
        }
        return jSONObject;
    }

    public final JSONObject a() {
        JSONObject a10 = this.f16925b.a(this.f16924a);
        kotlin.jvm.internal.n.e(a10, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a10);
    }

    public final JSONObject a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        JSONObject a10 = this.f16925b.a(context, this.f16924a);
        kotlin.jvm.internal.n.e(a10, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(a10);
    }
}
