package i3;

import i3.g;
import java.util.Map;
import java.util.Objects;
/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final l3.a f26437a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<z2.d, g.b> f26438b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(l3.a aVar, Map<z2.d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f26437a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f26438b = map;
    }

    @Override // i3.g
    l3.a e() {
        return this.f26437a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f26437a.equals(gVar.e()) && this.f26438b.equals(gVar.h());
        }
        return false;
    }

    @Override // i3.g
    Map<z2.d, g.b> h() {
        return this.f26438b;
    }

    public int hashCode() {
        return ((this.f26437a.hashCode() ^ 1000003) * 1000003) ^ this.f26438b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f26437a + ", values=" + this.f26438b + "}";
    }
}
