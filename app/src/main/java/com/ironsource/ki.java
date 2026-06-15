package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ki {

    /* renamed from: a  reason: collision with root package name */
    private final e2 f18083a;

    public ki(e2 e2Var) {
        this.f18083a = e2Var;
    }

    public void a() {
        this.f18083a.a(b2.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        this.f18083a.a(b2.INIT_FAILED, hashMap);
    }

    public void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f18083a.a(b2.INIT_ENDED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f18083a.a(b2.INIT_STARTED, hashMap);
    }
}
