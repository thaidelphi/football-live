package d9;

import m8.g;
/* compiled from: CoroutineName.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n0 extends m8.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24490b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f24491a;

    /* compiled from: CoroutineName.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements g.c<n0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public n0(String str) {
        super(f24490b);
        this.f24491a = str;
    }

    public final String G0() {
        return this.f24491a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && kotlin.jvm.internal.n.a(this.f24491a, ((n0) obj).f24491a);
    }

    public int hashCode() {
        return this.f24491a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f24491a + ')';
    }
}
