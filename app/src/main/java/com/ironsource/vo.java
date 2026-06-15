package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vo {

    /* renamed from: a  reason: collision with root package name */
    private final e2 f21186a;

    public vo(e2 eventsWrapper) {
        kotlin.jvm.internal.n.f(eventsWrapper, "eventsWrapper");
        this.f21186a = eventsWrapper;
    }

    public final void a() {
        this.f21186a.a(b2.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f21186a.a(b2.OPERATIONAL_LOAD_SUCCESS, hashMap);
    }

    public final void a(long j10, int i10, String reason) {
        kotlin.jvm.internal.n.f(reason, "reason");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", reason);
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f21186a.a(b2.OPERATIONAL_LOAD_FAILED, hashMap);
    }

    public final void b() {
        this.f21186a.a(b2.PAUSE_AD, null);
    }

    public final void c() {
        this.f21186a.a(b2.RESUME_AD, null);
    }
}
