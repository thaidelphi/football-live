package com.ironsource;

import com.ironsource.zu;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface xu {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private long f21447a;

        /* renamed from: b  reason: collision with root package name */
        private long f21448b;

        public final long a() {
            return this.f21448b;
        }

        public final void a(long j10) {
            this.f21448b = j10;
        }

        public final long b() {
            return this.f21447a;
        }

        public final void b(long j10) {
            this.f21447a = j10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface c {
        xu a(b bVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d implements c {
        @Override // com.ironsource.xu.c
        public xu a(b timerConfig) {
            kotlin.jvm.internal.n.f(timerConfig, "timerConfig");
            return new e(new zu(timerConfig.b()));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class e implements xu {

        /* renamed from: a  reason: collision with root package name */
        private final zu f21449a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class a implements zu.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f21450a;

            a(a aVar) {
                this.f21450a = aVar;
            }

            @Override // com.ironsource.zu.a
            public void a() {
                this.f21450a.a();
            }
        }

        public e(zu timer) {
            kotlin.jvm.internal.n.f(timer, "timer");
            this.f21449a = timer;
        }

        @Override // com.ironsource.xu
        public void a(a callback) {
            kotlin.jvm.internal.n.f(callback, "callback");
            this.f21449a.a((zu.a) new a(callback));
        }

        @Override // com.ironsource.xu
        public void cancel() {
            this.f21449a.e();
        }
    }

    void a(a aVar);

    void cancel();
}
