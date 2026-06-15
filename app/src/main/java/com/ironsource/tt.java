package com.ironsource;

import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class tt implements fp {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f20875a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20876b;

    /* renamed from: c  reason: collision with root package name */
    private long f20877c;

    /* renamed from: d  reason: collision with root package name */
    private long f20878d;

    /* renamed from: e  reason: collision with root package name */
    private long f20879e;

    /* renamed from: f  reason: collision with root package name */
    private final b f20880f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f20881a;

        /* renamed from: b  reason: collision with root package name */
        private final long f20882b;

        public a(long j10, long j11) {
            this.f20881a = j10;
            this.f20882b = j11;
        }

        public static /* synthetic */ a a(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = aVar.f20881a;
            }
            if ((i10 & 2) != 0) {
                j11 = aVar.f20882b;
            }
            return aVar.a(j10, j11);
        }

        public final long a() {
            return this.f20881a;
        }

        public final a a(long j10, long j11) {
            return new a(j10, j11);
        }

        public final long b() {
            return this.f20882b;
        }

        public final long c() {
            return this.f20881a;
        }

        public final long d() {
            return this.f20882b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f20881a == aVar.f20881a && this.f20882b == aVar.f20882b;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.privacysandbox.ads.adservices.topics.d.a(this.f20881a) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.f20882b);
        }

        public String toString() {
            return "Status(remainingTime=" + this.f20881a + ", timePassed=" + this.f20882b + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f20883a;

        b(Runnable runnable) {
            this.f20883a = runnable;
        }

        @Override // com.ironsource.hr
        public void a() {
            this.f20883a.run();
        }
    }

    public tt(Handler handler, Runnable task, long j10) {
        kotlin.jvm.internal.n.f(handler, "handler");
        kotlin.jvm.internal.n.f(task, "task");
        this.f20875a = handler;
        this.f20876b = j10;
        this.f20880f = new b(task);
        this.f20879e = c();
        a();
    }

    private final long c() {
        return System.currentTimeMillis();
    }

    private final long d() {
        return this.f20876b - this.f20877c;
    }

    @Override // com.ironsource.fp
    public a a() {
        if (e()) {
            this.f20878d = c();
            this.f20879e = 0L;
            this.f20875a.postDelayed(this.f20880f, d());
        }
        return new a(d(), this.f20877c);
    }

    @Override // com.ironsource.fp
    public a b() {
        if (!e()) {
            long c10 = c();
            this.f20879e = c10;
            this.f20877c += c10 - this.f20878d;
            this.f20875a.removeCallbacks(this.f20880f);
        }
        return new a(d(), this.f20877c);
    }

    public final boolean e() {
        return this.f20879e > 0;
    }
}
