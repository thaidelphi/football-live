package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface j9 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements j9 {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f17941a;

        public a(boolean z10) {
            this.f17941a = z10;
        }

        @Override // com.ironsource.j9
        public void a() {
            lh.a(er.f17316x, new gh().a(cc.f16883y, Boolean.valueOf(this.f17941a)).a());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements j9 {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f17942a;

        /* renamed from: b  reason: collision with root package name */
        private final long f17943b;

        /* renamed from: c  reason: collision with root package name */
        private final q9 f17944c;

        public b(boolean z10, long j10, q9 currentTimeProvider) {
            kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
            this.f17942a = z10;
            this.f17943b = j10;
            this.f17944c = currentTimeProvider;
        }

        @Override // com.ironsource.j9
        public void a() {
            gh a10 = new gh().a(cc.f16883y, Boolean.valueOf(this.f17942a));
            if (this.f17943b > 0) {
                a10.a(cc.B, Long.valueOf(this.f17944c.a() - this.f17943b));
            }
            lh.a(er.f17315w, a10.a());
        }

        public final q9 b() {
            return this.f17944c;
        }
    }

    void a();
}
