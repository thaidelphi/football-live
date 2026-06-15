package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface te {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements te {

        /* renamed from: a  reason: collision with root package name */
        private final qe f20839a;

        public a(qe failure) {
            kotlin.jvm.internal.n.f(failure, "failure");
            this.f20839a = failure;
        }

        public static /* synthetic */ a a(a aVar, qe qeVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qeVar = aVar.f20839a;
            }
            return aVar.a(qeVar);
        }

        public final qe a() {
            return this.f20839a;
        }

        public final a a(qe failure) {
            kotlin.jvm.internal.n.f(failure, "failure");
            return new a(failure);
        }

        @Override // com.ironsource.te
        public void a(ue handler) {
            kotlin.jvm.internal.n.f(handler, "handler");
            handler.a(this.f20839a);
        }

        public final qe b() {
            return this.f20839a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f20839a, ((a) obj).f20839a);
        }

        public int hashCode() {
            return this.f20839a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f20839a + ')';
        }
    }

    void a(ue ueVar);
}
