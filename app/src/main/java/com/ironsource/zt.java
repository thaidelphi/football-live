package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zt {

    /* renamed from: a  reason: collision with root package name */
    public static final zt f21716a = new zt();

    private zt() {
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> d10 = lu.f18358a.d();
        if (d10.containsKey(com.ironsource.mediationsdk.metadata.a.f18923f)) {
            return new JSONArray((Collection) d10.get(com.ironsource.mediationsdk.metadata.a.f18923f));
        }
        return null;
    }

    private final void a(int i10, Integer num, String str) {
        lu luVar = lu.f18358a;
        JSONObject a10 = luVar.a(false);
        if (num != null) {
            a10.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray a11 = a();
            if (a11 != null) {
                a10.put(com.ironsource.mediationsdk.metadata.a.f18923f, a11);
            }
        }
        if (str != null) {
            a10.put("reason", str);
        }
        luVar.a(i10, a10);
    }

    static /* synthetic */ void a(zt ztVar, int i10, Integer num, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        ztVar.a(i10, num, str);
    }

    public final void a(int i10) {
        a(72, Integer.valueOf(i10), null);
    }

    public final void a(String errorReason) {
        kotlin.jvm.internal.n.f(errorReason, "errorReason");
        a(74, Integer.valueOf((int) IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    public final void b() {
        a(this, 70, null, null, 6, null);
    }

    public final void c() {
        a(this, 71, null, null, 6, null);
    }

    public final void d() {
        a(this, 73, null, null, 6, null);
    }
}
