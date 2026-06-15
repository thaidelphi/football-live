package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdc extends zzdg {
    private final Object zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdc(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
