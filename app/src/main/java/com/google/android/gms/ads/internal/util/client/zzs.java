package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzs {
    private static DynamiteModule a(Context context) throws zzr {
        try {
            return DynamiteModule.e(context, DynamiteModule.f12795b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e8) {
            throw new zzr(e8);
        }
    }

    public static Context zza(Context context) throws zzr {
        return a(context).b();
    }

    public static Object zzb(Context context, String str, zzq zzqVar) throws zzr {
        try {
            return zzqVar.zza(a(context).d(str));
        } catch (Exception e8) {
            throw new zzr(e8);
        }
    }
}
