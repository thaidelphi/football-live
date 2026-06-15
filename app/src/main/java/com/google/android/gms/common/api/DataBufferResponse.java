package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) a()).close();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final T get(int i10) {
        return (T) ((AbstractDataBuffer) a()).get(i10);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) a()).getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) a()).iterator();
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        ((AbstractDataBuffer) a()).release();
    }
}
