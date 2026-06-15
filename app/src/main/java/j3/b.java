package j3;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f26852a;

    /* renamed from: b  reason: collision with root package name */
    private final b3.o f26853b;

    /* renamed from: c  reason: collision with root package name */
    private final b3.i f26854c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j10, b3.o oVar, b3.i iVar) {
        this.f26852a = j10;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f26853b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f26854c = iVar;
    }

    @Override // j3.k
    public b3.i b() {
        return this.f26854c;
    }

    @Override // j3.k
    public long c() {
        return this.f26852a;
    }

    @Override // j3.k
    public b3.o d() {
        return this.f26853b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f26852a == kVar.c() && this.f26853b.equals(kVar.d()) && this.f26854c.equals(kVar.b());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26852a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f26853b.hashCode()) * 1000003) ^ this.f26854c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f26852a + ", transportContext=" + this.f26853b + ", event=" + this.f26854c + "}";
    }
}
