package b7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: JsonArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g extends j implements Iterable<j> {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f5272a = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).f5272a.equals(this.f5272a));
    }

    public void h(j jVar) {
        if (jVar == null) {
            jVar = l.f5273a;
        }
        this.f5272a.add(jVar);
    }

    public int hashCode() {
        return this.f5272a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return this.f5272a.iterator();
    }
}
