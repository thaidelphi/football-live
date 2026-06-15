package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface qe {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements qe {

        /* renamed from: a  reason: collision with root package name */
        private final se f19887a;

        public a(se strategy) {
            kotlin.jvm.internal.n.f(strategy, "strategy");
            this.f19887a = strategy;
        }

        @Override // com.ironsource.qe
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.qe
        public se b() {
            return this.f19887a;
        }

        public final se c() {
            return this.f19887a;
        }
    }

    String a();

    se b();
}
