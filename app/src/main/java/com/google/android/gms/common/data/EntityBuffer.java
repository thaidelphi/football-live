package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f12438b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<Integer> f12439c;

    private final void k() {
        synchronized (this) {
            if (!this.f12438b) {
                int count = ((DataHolder) Preconditions.m(this.f12409a)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f12439c = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String f10 = f();
                    String y02 = this.f12409a.y0(f10, 0, this.f12409a.z0(0));
                    for (int i10 = 1; i10 < count; i10++) {
                        int z02 = this.f12409a.z0(i10);
                        String y03 = this.f12409a.y0(f10, i10, z02);
                        if (y03 != null) {
                            if (!y03.equals(y02)) {
                                this.f12439c.add(Integer.valueOf(i10));
                                y02 = y03;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(f10).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(f10);
                            sb.append(", at row: ");
                            sb.append(i10);
                            sb.append(", for window: ");
                            sb.append(z02);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f12438b = true;
            }
        }
    }

    @KeepForSdk
    protected String a() {
        return null;
    }

    @KeepForSdk
    protected abstract T b(int i10, int i11);

    @KeepForSdk
    protected abstract String f();

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public final T get(int i10) {
        int intValue;
        int intValue2;
        k();
        int j10 = j(i10);
        int i11 = 0;
        if (i10 >= 0 && i10 != this.f12439c.size()) {
            if (i10 == this.f12439c.size() - 1) {
                intValue = ((DataHolder) Preconditions.m(this.f12409a)).getCount();
                intValue2 = this.f12439c.get(i10).intValue();
            } else {
                intValue = this.f12439c.get(i10 + 1).intValue();
                intValue2 = this.f12439c.get(i10).intValue();
            }
            int i12 = intValue - intValue2;
            if (i12 == 1) {
                int j11 = j(i10);
                int z02 = ((DataHolder) Preconditions.m(this.f12409a)).z0(j11);
                String a10 = a();
                if (a10 == null || this.f12409a.y0(a10, j11, z02) != null) {
                    i11 = 1;
                }
            } else {
                i11 = i12;
            }
        }
        return b(j10, i11);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        k();
        return this.f12439c.size();
    }

    final int j(int i10) {
        if (i10 >= 0 && i10 < this.f12439c.size()) {
            return this.f12439c.get(i10).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i10);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }
}
