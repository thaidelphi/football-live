package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepi implements zzerw {
    private final zzgba zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzepi(zzgba zzgbaVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgbaVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public static /* synthetic */ zzepj zzc(zzepi zzepiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfN)).booleanValue() && zzepiVar.zzb != null && zzepiVar.zzd.contains("banner")) {
            return new zzepj(Boolean.valueOf(zzepiVar.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfO)).booleanValue() && zzepiVar.zzd.contains(IronSourceConstants.EVENTS_NATIVE)) {
            Context context = zzepiVar.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzepj(bool);
            }
        }
        return new zzepj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepi.zzc(zzepi.this);
            }
        });
    }
}
