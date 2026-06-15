package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfsm extends zzfsi implements Serializable {
    private final Pattern zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsm(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsi
    public final zzfsh zza(CharSequence charSequence) {
        return new zzfsl(this.zza.matcher(charSequence));
    }
}
