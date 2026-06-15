package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejv implements zzerv {
    public final Context zza;
    public final com.google.android.gms.ads.internal.client.zzr zzb;
    public final List zzc;

    public zzejv(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, List list) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        zzcth zzcthVar = (zzcth) obj;
        if (((Boolean) zzbdp.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            com.google.android.gms.ads.internal.zzv.zzq();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    str = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", str);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("width", this.zzb.zze);
            bundle2.putInt("height", this.zzb.zzb);
            bundle.putBundle("size", bundle2);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcthVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
