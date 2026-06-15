package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpr {
    public static b6.a zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfpq zzfpqVar = new zzfpq(task, null);
        task.addOnCompleteListener(zzgbh.zzc(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfpp
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfpq zzfpqVar2 = zzfpq.this;
                if (task2.isCanceled()) {
                    zzfpqVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfpqVar2.zzc(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzfpqVar2.zzd(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfpqVar;
    }
}
