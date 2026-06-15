package com.ironsource;

import com.ironsource.fe;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    private final fe.a f16502a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<String> f16503b = new ArrayList<>(new z4().a());

    /* renamed from: c  reason: collision with root package name */
    private final he f16504c = new he();

    public b5(fe.a aVar) {
        this.f16502a = aVar;
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b10 = ie.b(jSONObject.optJSONObject(fe.f17455u));
        if (b10 != null) {
            jSONObject.put(fe.f17455u, b10);
        }
        return jSONObject;
    }

    public final JSONObject a() {
        fe.a aVar = this.f16502a;
        JSONObject a10 = aVar != null ? this.f16504c.a(this.f16503b, aVar) : null;
        if (a10 == null) {
            a10 = this.f16504c.a(this.f16503b);
            kotlin.jvm.internal.n.e(a10, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(a10);
    }
}
