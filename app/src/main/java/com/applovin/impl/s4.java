package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s4 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f8591a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8592b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f8593c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8594a;

        static {
            int[] iArr = new int[b.values().length];
            f8594a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8594a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8594a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final t4 f8599a;

        /* renamed from: b  reason: collision with root package name */
        private final long f8600b;

        /* renamed from: c  reason: collision with root package name */
        private final long f8601c;

        /* synthetic */ c(t4 t4Var, long j10, a aVar) {
            this(t4Var, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f8601c > this.f8600b;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public t4 c() {
            return this.f8599a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.a((Object) this) && b() == cVar.b() && a() == cVar.a()) {
                    t4 c10 = c();
                    t4 c11 = cVar.c();
                    return c10 != null ? c10.equals(c11) : c11 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            long b10 = b();
            long a10 = a();
            t4 c10 = c();
            return ((((((int) (b10 ^ (b10 >>> 32))) + 59) * 59) + ((int) ((a10 >>> 32) ^ a10))) * 59) + (c10 == null ? 43 : c10.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        private c(t4 t4Var, long j10) {
            this.f8599a = t4Var;
            this.f8600b = j10;
            this.f8601c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f8600b;
        }

        public long a() {
            return this.f8601c;
        }
    }

    public s4(com.applovin.impl.sdk.j jVar) {
        this.f8591a = jVar;
    }

    public void a(t4 t4Var, u4 u4Var, String str, MaxAdFormat maxAdFormat) {
        if (t4Var == null) {
            return;
        }
        long u10 = u4Var.u();
        if (u10 <= 0) {
            return;
        }
        this.f8591a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f8591a.I();
            I.a("SignalCacheManager", "Caching signal for: " + u4Var);
        }
        String a10 = a(u4Var, str, maxAdFormat);
        c cVar = new c(t4Var, u10, null);
        synchronized (this.f8593c) {
            this.f8592b.put(a10, cVar);
        }
    }

    public t4 b(u4 u4Var, String str, MaxAdFormat maxAdFormat) {
        String a10 = a(u4Var, str, maxAdFormat);
        synchronized (this.f8593c) {
            c cVar = (c) this.f8592b.get(a10);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.f8592b.remove(a10);
                return null;
            }
            this.f8591a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f8591a.I();
                I.a("SignalCacheManager", "Returning cached signal for: " + u4Var);
            }
            return cVar.f8599a;
        }
    }

    private String a(u4 u4Var, String str, MaxAdFormat maxAdFormat) {
        String c10 = u4Var.c();
        int i10 = a.f8594a[u4Var.t().ordinal()];
        if (i10 == 1) {
            return c10 + "_" + maxAdFormat.getLabel();
        } else if (i10 != 2) {
            return c10;
        } else {
            return c10 + "_" + str;
        }
    }
}
