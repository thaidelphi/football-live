package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzftk {
    private final zzftj zza;

    private zzftk(zzftj zzftjVar) {
        int i10 = zzfsf.zzb;
        this.zza = zzftjVar;
    }

    public static zzftk zza(int i10) {
        return new zzftk(new zzftg(4000));
    }

    public static zzftk zzb(zzfsg zzfsgVar) {
        return new zzftk(new zzftc(zzfsgVar));
    }

    public static zzftk zzc(Pattern pattern) {
        zzfsm zzfsmVar = new zzfsm(pattern);
        zzfsv.zzi(!((zzfsl) zzfsmVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfsmVar);
        return new zzftk(new zzfte(zzfsmVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfth(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
