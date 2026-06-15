package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class bq {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zn> f16770a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.l<String, i8.n<? extends String, ? extends zn>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f16771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.f16771a = jSONObject;
        }

        @Override // t8.l
        /* renamed from: a */
        public final i8.n<String, zn> invoke(String networkName) {
            kotlin.jvm.internal.n.e(networkName, "networkName");
            JSONObject jSONObject = this.f16771a.getJSONObject(networkName);
            kotlin.jvm.internal.n.e(jSONObject, "providerSettings.getJSONObject(networkName)");
            return i8.s.a(networkName, new zn(networkName, jSONObject));
        }
    }

    public bq(JSONObject providerSettings) {
        a9.f c10;
        a9.f l10;
        Map<String, zn> p10;
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        Iterator<String> keys = providerSettings.keys();
        kotlin.jvm.internal.n.e(keys, "providerSettings\n          .keys()");
        c10 = a9.l.c(keys);
        l10 = a9.n.l(c10, new a(providerSettings));
        p10 = j8.j0.p(l10);
        this.f16770a = p10;
        for (Map.Entry<String, zn> entry : p10.entrySet()) {
            entry.getKey();
            zn value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final zn a(zn znVar) {
        return this.f16770a.get(znVar.h());
    }

    private final boolean b(zn znVar) {
        if (znVar.o()) {
            if (znVar.l().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final Map<String, zn> a() {
        return this.f16770a;
    }
}
