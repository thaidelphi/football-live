package com.ironsource.mediationsdk.demandOnly;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface p {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements p {

        /* renamed from: a  reason: collision with root package name */
        private final String f18784a;

        public a(String plumbus) {
            kotlin.jvm.internal.n.f(plumbus, "plumbus");
            this.f18784a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public String value() {
            return this.f18784a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
