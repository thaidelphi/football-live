package o6;

import java.util.List;
import java.util.Objects;
/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f29446a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f29447b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f29446a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f29447b = list;
    }

    @Override // o6.l
    public List<String> b() {
        return this.f29447b;
    }

    @Override // o6.l
    public String c() {
        return this.f29446a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f29446a.equals(lVar.c()) && this.f29447b.equals(lVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f29446a.hashCode() ^ 1000003) * 1000003) ^ this.f29447b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f29446a + ", usedDates=" + this.f29447b + "}";
    }
}
