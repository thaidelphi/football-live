package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.n;
/* compiled from: GetTopicsRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3719a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3720b;

    /* compiled from: GetTopicsRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f3721a = "";

        /* renamed from: b  reason: collision with root package name */
        private boolean f3722b = true;

        public final b a() {
            if (this.f3721a.length() > 0) {
                return new b(this.f3721a, this.f3722b);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final a b(String adsSdkName) {
            n.f(adsSdkName, "adsSdkName");
            this.f3721a = adsSdkName;
            return this;
        }

        public final a c(boolean z10) {
            this.f3722b = z10;
            return this;
        }
    }

    public b() {
        this(null, false, 3, null);
    }

    public b(String adsSdkName, boolean z10) {
        n.f(adsSdkName, "adsSdkName");
        this.f3719a = adsSdkName;
        this.f3720b = z10;
    }

    public final String a() {
        return this.f3719a;
    }

    public final boolean b() {
        return this.f3720b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return n.a(this.f3719a, bVar.f3719a) && this.f3720b == bVar.f3720b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f3719a.hashCode() * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.f3720b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f3719a + ", shouldRecordObservation=" + this.f3720b;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
