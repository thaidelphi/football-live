package m6;

import java.lang.annotation.Annotation;
import m6.d;
/* compiled from: AtProtobuf.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f27757a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f27758b = d.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: m6.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class C0315a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f27759a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a f27760b;

        C0315a(int i10, d.a aVar) {
            this.f27759a = i10;
            this.f27760b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f27759a == dVar.tag() && this.f27760b.equals(dVar.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f27759a ^ 14552422) + (this.f27760b.hashCode() ^ 2041407134);
        }

        @Override // m6.d
        public d.a intEncoding() {
            return this.f27760b;
        }

        @Override // m6.d
        public int tag() {
            return this.f27759a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f27759a + "intEncoding=" + this.f27760b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0315a(this.f27757a, this.f27758b);
    }

    public a c(int i10) {
        this.f27757a = i10;
        return this;
    }
}
