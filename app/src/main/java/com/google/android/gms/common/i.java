package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class i extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference f12443c = new WeakReference(null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f12444b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(byte[] bArr) {
        super(bArr);
        this.f12444b = f12443c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.g
    public final byte[] u0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f12444b.get();
            if (bArr == null) {
                bArr = v0();
                this.f12444b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] v0();
}
