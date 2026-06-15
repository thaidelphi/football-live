package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzflq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzflq(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzflq zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflo
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = zzflq.zza;
                    taskCompletionSource.setResult(zzfnq.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflp
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = zzflq.zza;
                    TaskCompletionSource.this.setResult(zzfnq.zzc());
                }
            });
        }
        return new zzflq(context, executor, taskCompletionSource.getTask(), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (this.zze) {
            Context context = this.zzb;
            final zzaql zza2 = zzaqp.zza();
            zza2.zza(context.getPackageName());
            zza2.zze(j10);
            zza2.zzg(zzf);
            if (exc != null) {
                int i11 = zzfts.zza;
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zzb(str2);
            }
            if (str != null) {
                zza2.zzc(str);
            }
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfln
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i12 = zzflq.zza;
                    if (task.isSuccessful()) {
                        int i13 = i10;
                        zzfno zza3 = ((zzfnq) task.getResult()).zza(((zzaqp) zzaql.this.zzbn()).zzaV());
                        zza3.zza(i13);
                        zza3.zzc();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzflm
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Boolean.valueOf(task.isSuccessful());
            }
        });
    }

    public final Task zzb(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public final Task zze(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }
}
