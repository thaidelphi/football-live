package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfmh {
    private final Context zza;
    private final Executor zzb;
    private final zzflq zzc;
    private final zzfmg zzd;
    private Task zze;

    zzfmh(Context context, Executor executor, zzflq zzflqVar, zzfls zzflsVar, zzfmf zzfmfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzflqVar;
        this.zzd = zzfmfVar;
    }

    public static /* synthetic */ zzasa zza(zzfmh zzfmhVar) {
        Context context = zzfmhVar.zza;
        return zzfly.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public static zzfmh zzc(Context context, Executor executor, zzflq zzflqVar, zzfls zzflsVar) {
        final zzfmh zzfmhVar = new zzfmh(context, executor, zzflqVar, zzflsVar, new zzfmf());
        zzfmhVar.zze = Tasks.call(zzfmhVar.zzb, new Callable() { // from class: com.google.android.gms.internal.ads.zzfmd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfmh.zza(zzfmh.this);
            }
        }).addOnFailureListener(zzfmhVar.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfme
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfmh.zzd(zzfmh.this, exc);
            }
        });
        return zzfmhVar;
    }

    public static /* synthetic */ void zzd(zzfmh zzfmhVar, Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfmhVar.zzc.zzc(2025, -1L, exc);
    }

    public final zzasa zzb() {
        zzfmg zzfmgVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfmgVar.zza() : (zzasa) task.getResult();
    }
}
