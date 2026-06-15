package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class z4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f9827a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f9828b;

    /* renamed from: c  reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f9829c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f9830d;

    /* renamed from: e  reason: collision with root package name */
    private String f9831e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9832f;

    public z4(String str, com.applovin.impl.sdk.j jVar) {
        this(str, jVar, false, null);
    }

    public Context a() {
        return this.f9830d;
    }

    public com.applovin.impl.sdk.j b() {
        return this.f9827a;
    }

    public String c() {
        return this.f9828b;
    }

    public boolean d() {
        return this.f9832f;
    }

    public z4(String str, com.applovin.impl.sdk.j jVar, boolean z10) {
        this(str, jVar, z10, null);
    }

    public void a(String str) {
        this.f9831e = str;
    }

    public ScheduledFuture b(final Thread thread, final long j10) {
        if (j10 <= 0) {
            return null;
        }
        com.applovin.impl.sdk.j jVar = this.f9827a;
        return this.f9827a.i0().b(new k6(jVar, "timeout:" + this.f9828b, new Runnable() { // from class: com.applovin.impl.yf
            @Override // java.lang.Runnable
            public final void run() {
                z4.this.a(thread, j10);
            }
        }), u5.b.TIMEOUT, j10);
    }

    public z4(String str, com.applovin.impl.sdk.j jVar, String str2) {
        this(str, jVar, false, str2);
    }

    public void a(boolean z10) {
        this.f9832f = z10;
    }

    public z4(String str, com.applovin.impl.sdk.j jVar, boolean z10, String str2) {
        this.f9828b = str;
        this.f9827a = jVar;
        this.f9829c = jVar.I();
        this.f9830d = com.applovin.impl.sdk.j.m();
        this.f9832f = z10;
        this.f9831e = str2;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f9828b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f9831e));
        this.f9827a.D().d(y1.f9687q0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f9831e)) {
            hashMap.put("details", this.f9831e);
        }
        this.f9827a.D().a(y1.f9689r0, this.f9828b, hashMap);
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.k(str, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
