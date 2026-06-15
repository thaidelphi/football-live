package androidx.privacysandbox.ads.adservices.topics;
/* compiled from: Topic.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f3724a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3725b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3726c;

    public e(long j10, long j11, int i10) {
        this.f3724a = j10;
        this.f3725b = j11;
        this.f3726c = i10;
    }

    public final long a() {
        return this.f3725b;
    }

    public final long b() {
        return this.f3724a;
    }

    public final int c() {
        return this.f3726c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f3724a == eVar.f3724a && this.f3725b == eVar.f3725b && this.f3726c == eVar.f3726c;
        }
        return false;
    }

    public int hashCode() {
        return (((d.a(this.f3724a) * 31) + d.a(this.f3725b)) * 31) + this.f3726c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f3724a + ", ModelVersion=" + this.f3725b + ", TopicCode=" + this.f3726c + " }");
    }
}
