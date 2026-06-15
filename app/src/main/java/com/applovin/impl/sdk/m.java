package com.applovin.impl.sdk;

import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m {

    /* renamed from: j  reason: collision with root package name */
    private static final a f8972j = new a();

    /* renamed from: a  reason: collision with root package name */
    private final j f8973a;

    /* renamed from: c  reason: collision with root package name */
    private long f8975c;

    /* renamed from: f  reason: collision with root package name */
    private long f8978f;

    /* renamed from: g  reason: collision with root package name */
    private Object f8979g;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f8974b = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final Object f8976d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f8977e = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private final Map f8980h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Object f8981i = new Object();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f8982a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f8983b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f8982a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
            }
            return false;
        }

        public int hashCode() {
            long b10 = b();
            return ((((int) (b10 ^ (b10 >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f8983b;
            aVar.f8983b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f8983b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j jVar) {
        this.f8973a = jVar;
    }

    public void a(boolean z10) {
        synchronized (this.f8976d) {
            this.f8977e.set(z10);
            if (z10) {
                this.f8978f = System.currentTimeMillis();
                this.f8973a.I();
                if (n.a()) {
                    n I = this.f8973a.I();
                    I.a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f8978f);
                }
                final Long l10 = (Long) this.f8973a.a(o4.O1);
                if (l10.longValue() >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.this.a(l10);
                        }
                    }, l10.longValue());
                }
            } else {
                this.f8978f = 0L;
                this.f8973a.I();
                if (n.a()) {
                    n I2 = this.f8973a.I();
                    I2.a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public long b() {
        return this.f8975c;
    }

    public boolean c() {
        return this.f8974b.get();
    }

    public boolean d() {
        return this.f8977e.get();
    }

    public void b(Object obj) {
        if (!o3.a(obj) && this.f8974b.compareAndSet(true, false)) {
            this.f8979g = null;
            this.f8973a.I();
            if (n.a()) {
                n I = this.f8973a.I();
                I.a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.f8981i) {
            a aVar = (a) this.f8980h.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f8980h.put(str, aVar);
            }
            aVar.f8982a = System.currentTimeMillis();
            a.a(aVar);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f8981i) {
            aVar = (a) this.f8980h.get(str);
            if (aVar == null) {
                aVar = f8972j;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (d() && System.currentTimeMillis() - this.f8978f >= l10.longValue()) {
            this.f8973a.I();
            if (n.a()) {
                this.f8973a.I().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f8977e.set(false);
        }
    }

    public Object a() {
        return this.f8979g;
    }

    public void a(final Object obj) {
        if (!o3.a(obj) && this.f8974b.compareAndSet(false, true)) {
            this.f8979g = obj;
            this.f8975c = System.currentTimeMillis();
            this.f8973a.I();
            if (n.a()) {
                n I = this.f8973a.I();
                I.a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f8975c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final Long l10 = (Long) this.f8973a.a(o4.P1);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.a(l10, obj);
                    }
                }, l10.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f8974b.get() && System.currentTimeMillis() - this.f8975c >= l10.longValue()) {
            this.f8973a.I();
            if (n.a()) {
                this.f8973a.I().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f8981i) {
            this.f8980h.remove(str);
        }
    }
}
