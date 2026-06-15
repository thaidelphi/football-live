package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class DataBufferRef {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    protected final DataHolder f12419a;
    @KeepForSdk

    /* renamed from: b  reason: collision with root package name */
    protected int f12420b;

    /* renamed from: c  reason: collision with root package name */
    private int f12421c;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12419a.getCount()) {
            z10 = true;
        }
        Preconditions.p(z10);
        this.f12420b = i10;
        this.f12421c = this.f12419a.z0(i10);
    }

    @KeepForSdk
    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.a(Integer.valueOf(dataBufferRef.f12420b), Integer.valueOf(this.f12420b)) && Objects.a(Integer.valueOf(dataBufferRef.f12421c), Integer.valueOf(this.f12421c)) && dataBufferRef.f12419a == this.f12419a) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f12420b), Integer.valueOf(this.f12421c), this.f12419a);
    }
}
