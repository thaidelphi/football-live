package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class al {

    /* renamed from: i  reason: collision with root package name */
    private static final String f16371i = "WaterfallLifeCycleHolder";

    /* renamed from: d  reason: collision with root package name */
    private com.ironsource.mediationsdk.r f16375d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f16376e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16377f;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<com.ironsource.mediationsdk.r>> f16372a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private String f16373b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f16374c = "";

    /* renamed from: g  reason: collision with root package name */
    private final Timer f16378g = new Timer();

    /* renamed from: h  reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f16379h = new ConcurrentHashMap<>();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16380a;

        a(String str) {
            this.f16380a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f16380a + " from memory");
                al.this.f16372a.remove(this.f16380a);
                ironLog.verbose("waterfall size is currently " + al.this.f16372a.size());
                ironLog.verbose("removing adInfo with id " + this.f16380a + " from memory");
                al.this.f16379h.remove(this.f16380a);
                ironLog.verbose("adInfo size is currently " + al.this.f16379h.size());
            } finally {
                cancel();
            }
        }
    }

    public al(List<String> list, int i10) {
        this.f16376e = list;
        this.f16377f = i10;
    }

    private void b() {
        Iterator<com.ironsource.mediationsdk.r> it = c().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.r next = it.next();
            if (!next.equals(this.f16375d)) {
                next.q();
            }
        }
    }

    public AdInfo a(String str) {
        if (this.f16379h.containsKey(str)) {
            return this.f16379h.get(str);
        }
        return null;
    }

    public synchronized void a(com.ironsource.mediationsdk.r rVar) {
        IronLog.INTERNAL.verbose();
        com.ironsource.mediationsdk.r rVar2 = this.f16375d;
        if (rVar2 != null && !rVar2.equals(rVar)) {
            this.f16375d.q();
        }
        this.f16375d = rVar;
    }

    public void a(String str, ImpressionData impressionData, am amVar) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f16379h.put(str, new AdInfo(impressionData, amVar));
    }

    public void a(CopyOnWriteArrayList<com.ironsource.mediationsdk.r> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f16372a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f16374c)) {
            if (g()) {
                ironLog.verbose("ad from previous waterfall " + this.f16374c + " is still showing - the current waterfall " + this.f16373b + " will be deleted instead");
                String str2 = this.f16373b;
                this.f16373b = this.f16374c;
                this.f16374c = str2;
            }
            this.f16378g.schedule(new a(this.f16374c), this.f16377f);
        }
        this.f16374c = this.f16373b;
        this.f16373b = str;
    }

    public boolean a() {
        return this.f16372a.size() > 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r5.f16376e.contains(r6.j()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r5.f16375d.j().equals(r6.j()) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(com.ironsource.mediationsdk.r r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L74
            r0.verbose()     // Catch: java.lang.Throwable -> L74
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L53
            boolean r3 = r6.o()     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L11
            goto L53
        L11:
            com.ironsource.mediationsdk.r r3 = r5.f16375d     // Catch: java.lang.Throwable -> L74
            if (r3 != 0) goto L16
            goto L54
        L16:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = r6.w()     // Catch: java.lang.Throwable -> L74
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L74
            if (r3 != r4) goto L2f
            com.ironsource.mediationsdk.r r3 = r5.f16375d     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r6.c()     // Catch: java.lang.Throwable -> L74
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L2f
            goto L53
        L2f:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = r6.w()     // Catch: java.lang.Throwable -> L74
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L74
            if (r3 == r4) goto L43
            java.util.List<java.lang.String> r3 = r5.f16376e     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> L74
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L54
        L43:
            com.ironsource.mediationsdk.r r3 = r5.f16375d     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = r3.j()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> L74
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L54
        L53:
            r2 = r1
        L54:
            if (r2 == 0) goto L70
            if (r6 == 0) goto L70
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L74
            r3.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = " will not be added to the auction request"
            r3.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L74
            r0.verbose(r6)     // Catch: java.lang.Throwable -> L74
        L70:
            r6 = r2 ^ 1
            monitor-exit(r5)
            return r6
        L74:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.al.b(com.ironsource.mediationsdk.r):boolean");
    }

    public CopyOnWriteArrayList<com.ironsource.mediationsdk.r> c() {
        CopyOnWriteArrayList<com.ironsource.mediationsdk.r> copyOnWriteArrayList = this.f16372a.get(this.f16373b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f16373b;
    }

    public int e() {
        return this.f16372a.size();
    }

    public com.ironsource.mediationsdk.r f() {
        return this.f16375d;
    }

    public synchronized boolean g() {
        boolean z10;
        com.ironsource.mediationsdk.r rVar = this.f16375d;
        if (rVar != null) {
            z10 = rVar.u().equals(this.f16374c);
        }
        return z10;
    }
}
