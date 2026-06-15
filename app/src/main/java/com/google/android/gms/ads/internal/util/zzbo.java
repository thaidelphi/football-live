package com.google.android.gms.ads.internal.util;

import android.content.Context;
import b6.a;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzanx;
import com.google.android.gms.internal.ads.zzaos;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbyu;
import com.ironsource.in;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbo {

    /* renamed from: a  reason: collision with root package name */
    private static zzaos f11445a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f11446b = new Object();

    public zzbo(Context context) {
        zzaos zza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f11446b) {
            if (f11445a == null) {
                zzbbm.zza(context);
                if (!ClientLibraryUtils.a()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzex)).booleanValue()) {
                        zza = zzaz.zzb(context);
                        f11445a = zza;
                    }
                }
                zza = zzapw.zza(context, null);
                f11445a = zza;
            }
        }
    }

    public final a zza(String str) {
        zzbyu zzbyuVar = new zzbyu();
        f11445a.zza(new zzbm(str, null, zzbyuVar));
        return zzbyuVar;
    }

    public final a zzb(int i10, String str, Map map, byte[] bArr) {
        zzbk zzbkVar = new zzbk(null);
        zzbi zzbiVar = new zzbi(this, str, zzbkVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(this, i10, str, zzbkVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, in.f17848a, zzbjVar.zzl(), zzbjVar.zzx());
            } catch (zzanx e8) {
                String message = e8.getMessage();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj(message);
            }
        }
        f11445a.zza(zzbjVar);
        return zzbkVar;
    }
}
