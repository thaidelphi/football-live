package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: c  reason: collision with root package name */
    private T f12440c;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            int i10 = this.f12417b + 1;
            this.f12417b = i10;
            if (i10 == 0) {
                T t10 = (T) Preconditions.m(this.f12416a.get(0));
                this.f12440c = t10;
                if (!(t10 instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(t10.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) Preconditions.m(this.f12440c)).a(this.f12417b);
            }
            return this.f12440c;
        }
        int i11 = this.f12417b;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
