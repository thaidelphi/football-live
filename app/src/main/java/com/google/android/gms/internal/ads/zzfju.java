package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfju {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfjc zzfjcVar, String str) {
        zzfjt zzfjtVar;
        if (view != null) {
            if (zza.matcher("Ad overlay").matches()) {
                Iterator it = this.zzb.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzfjtVar = null;
                        break;
                    }
                    zzfjtVar = (zzfjt) it.next();
                    if (zzfjtVar.zzb().get() == view) {
                        break;
                    }
                }
                if (zzfjtVar == null) {
                    this.zzb.add(new zzfjt(view, zzfjcVar, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
