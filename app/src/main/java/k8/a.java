package k8;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.n;
/* compiled from: MapBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends j8.f<E> {
    public final boolean b(E element) {
        n.f(element, "element");
        return c(element);
    }

    public abstract boolean c(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract /* bridge */ boolean d(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }
}
