package com.google.android.gms.common;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class h extends g {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f12442b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f12442b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.g
    public final byte[] u0() {
        return this.f12442b;
    }
}
