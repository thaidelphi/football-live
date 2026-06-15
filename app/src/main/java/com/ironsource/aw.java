package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o2;
import com.ironsource.q7;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class aw<Smash extends q7<?>> {

    /* renamed from: d  reason: collision with root package name */
    q7<?> f16407d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f16408e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16409f;

    /* renamed from: h  reason: collision with root package name */
    bw f16411h;

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f16404a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private String f16405b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f16406c = "";

    /* renamed from: g  reason: collision with root package name */
    private final Timer f16410g = new Timer();

    /* renamed from: i  reason: collision with root package name */
    private final int f16412i = 5;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16413a;

        a(String str) {
            this.f16413a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f16413a + " from memory");
                aw.this.f16404a.remove(this.f16413a);
                ironLog.verbose("waterfall size is currently " + aw.this.f16404a.size());
            } finally {
                cancel();
            }
        }
    }

    public aw(List<String> list, int i10, bw bwVar) {
        this.f16408e = list;
        this.f16409f = i10;
        this.f16411h = bwVar;
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.f16407d)) {
                smash.M();
            }
        }
    }

    private synchronized boolean e() {
        boolean z10;
        q7<?> q7Var = this.f16407d;
        if (q7Var != null && q7Var.C()) {
            z10 = this.f16407d.h().equals(this.f16406c);
        }
        return z10;
    }

    public void a(o2.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == o2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == o2.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f16404a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f16406c)) {
                if (e()) {
                    ironLog.verbose("ad from previous waterfall " + this.f16406c + " is still showing - the current waterfall " + this.f16405b + " will be deleted instead");
                    String str2 = this.f16405b;
                    this.f16405b = this.f16406c;
                    this.f16406c = str2;
                }
                this.f16410g.schedule(new a(this.f16406c), this.f16409f);
            }
        } else {
            this.f16404a.clear();
            this.f16404a.put(str, copyOnWriteArrayList);
        }
        this.f16406c = this.f16405b;
        this.f16405b = str;
        if (this.f16404a.size() > 5) {
            this.f16411h.a(this.f16404a.size());
        }
    }

    public synchronized void a(q7<?> q7Var) {
        IronLog.INTERNAL.verbose();
        q7<?> q7Var2 = this.f16407d;
        if (q7Var2 != null && !q7Var2.equals(q7Var)) {
            this.f16407d.M();
        }
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null && (adapterBaseInterface instanceof AdapterSettingsInterface) && ((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            ironLog.verbose(str + " - is using activity before impression and activity is null");
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r0.f16408e.contains(r3) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r0.f16407d.n().equals(r3) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:29:0x0049, B:6:0x0009, B:8:0x000d, B:11:0x0012, B:13:0x0016, B:16:0x001d, B:18:0x0021, B:21:0x002e, B:23:0x0032, B:25:0x003a), top: B:35:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(com.ironsource.o2.a r1, java.lang.String r2, java.lang.String r3, com.ironsource.mediationsdk.LoadWhileShowSupportState r4, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface r5, com.ironsource.mediationsdk.IronSource.AD_UNIT r6) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r5 = r0.a(r5, r6, r2)     // Catch: java.lang.Throwable -> L61
            r6 = 1
            if (r5 == 0) goto L9
            goto L46
        L9:
            com.ironsource.o2$a r5 = com.ironsource.o2.a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch: java.lang.Throwable -> L61
            if (r1 == r5) goto L12
            com.ironsource.o2$a r5 = com.ironsource.o2.a.MANUAL_WITH_LOAD_ON_SHOW     // Catch: java.lang.Throwable -> L61
            if (r1 == r5) goto L12
            goto L47
        L12:
            com.ironsource.q7<?> r1 = r0.f16407d     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L47
            boolean r1 = r1.C()     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto L1d
            goto L47
        L1d:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r1 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L61
            if (r4 != r1) goto L2e
            com.ironsource.q7<?> r1 = r0.f16407d     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L61
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L2e
            goto L46
        L2e:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r1 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L61
            if (r4 == r1) goto L3a
            java.util.List<java.lang.String> r1 = r0.f16408e     // Catch: java.lang.Throwable -> L61
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L47
        L3a:
            com.ironsource.q7<?> r1 = r0.f16407d     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r1.n()     // Catch: java.lang.Throwable -> L61
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L47
        L46:
            r6 = 0
        L47:
            if (r6 != 0) goto L5f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            r3.append(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = " will not be added to the auction request"
            r3.append(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L61
            r1.verbose(r2)     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r0)
            return r6
        L61:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.aw.a(com.ironsource.o2$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.ironsource.mediationsdk.IronSource$AD_UNIT):boolean");
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f16404a.get(this.f16405b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public synchronized void b(q7<?> q7Var) {
        IronLog.INTERNAL.verbose();
        this.f16407d = q7Var;
    }

    public String c() {
        return this.f16405b;
    }

    public q7<?> d() {
        return this.f16407d;
    }
}
