package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final DataBuffer<T> f12416a;

    /* renamed from: b  reason: collision with root package name */
    protected int f12417b = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.f12416a = (DataBuffer) Preconditions.m(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12417b < this.f12416a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.f12416a;
            int i10 = this.f12417b + 1;
            this.f12417b = i10;
            return dataBuffer.get(i10);
        }
        int i11 = this.f12417b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i11);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
