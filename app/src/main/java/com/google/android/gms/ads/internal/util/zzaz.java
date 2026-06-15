package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaol;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzaos;
import com.google.android.gms.internal.ads.zzaoy;
import com.google.android.gms.internal.ads.zzapd;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfob;
import java.io.File;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaz extends zzape {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11427a;

    private zzaz(Context context, zzapd zzapdVar) {
        super(zzapdVar);
        this.f11427a = context;
    }

    public static zzaos zzb(Context context) {
        zzaos zzaosVar = new zzaos(new zzapl(new File(zzfob.zza(zzfoa.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzapq(null, null)), 4);
        zzaosVar.zzd();
        return zzaosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzape, com.google.android.gms.internal.ads.zzaoi
    public final zzaol zza(zzaop zzaopVar) throws zzaoy {
        if (zzaopVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzey), zzaopVar.zzk())) {
                Context context = this.f11427a;
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context, 13400000)) {
                    zzaol zza = new zzbkl(this.f11427a).zza(zzaopVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaopVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaopVar.zzk())));
                }
            }
        }
        return super.zza(zzaopVar);
    }
}
