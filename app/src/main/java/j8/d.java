package j8;

import java.util.AbstractCollection;
/* compiled from: AbstractMutableCollection.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class d<E> extends AbstractCollection<E> {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
