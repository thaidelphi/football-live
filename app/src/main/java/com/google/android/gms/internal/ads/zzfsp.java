package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfsp {
    private final String zza;
    private final zzfso zzb;
    private zzfso zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfsp(String str, zzfsq zzfsqVar) {
        zzfso zzfsoVar = new zzfso();
        this.zzb = zzfsoVar;
        this.zzc = zzfsoVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfso zzfsoVar = this.zzb.zzb;
        String str = "";
        while (zzfsoVar != null) {
            Object obj = zzfsoVar.zza;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfsoVar = zzfsoVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfsp zza(Object obj) {
        zzfso zzfsoVar = new zzfso();
        this.zzc.zzb = zzfsoVar;
        this.zzc = zzfsoVar;
        zzfsoVar.zza = obj;
        return this;
    }
}
