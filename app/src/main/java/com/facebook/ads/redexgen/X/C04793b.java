package com.facebook.ads.redexgen.X;

import java.util.Objects;
/* renamed from: com.facebook.ads.redexgen.X.3b  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04793b extends OI<Object> {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    public C04793b(Object[] alternatingKeysAndValues, int offset, int size) {
        this.A02 = alternatingKeysAndValues;
        this.A00 = offset;
        this.A01 = size;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public final boolean A0K() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int index) {
        AbstractC1790iD.A00(index, this.A01);
        return Objects.requireNonNull(this.A02[(index * 2) + this.A00]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
