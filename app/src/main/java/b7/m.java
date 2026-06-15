package b7;

import java.util.Map;
import java.util.Set;
/* compiled from: JsonObject.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m extends j {

    /* renamed from: a  reason: collision with root package name */
    private final d7.f<String, j> f5274a = new d7.f<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f5274a.equals(this.f5274a));
    }

    public void h(String str, j jVar) {
        if (jVar == null) {
            jVar = l.f5273a;
        }
        this.f5274a.put(str, jVar);
    }

    public int hashCode() {
        return this.f5274a.hashCode();
    }

    public Set<Map.Entry<String, j>> i() {
        return this.f5274a.entrySet();
    }
}
