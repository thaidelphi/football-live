package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzr implements AppSetIdClient {
    private final AppSetIdClient zza;
    private final AppSetIdClient zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, GoogleApiAvailabilityLight.h());
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return task;
        }
        Exception exception = task.getException();
        if (exception instanceof ApiException) {
            int b10 = ((ApiException) exception).b();
            if (b10 == 43001 || b10 == 43002 || b10 == 43003 || b10 == 17) {
                return zzrVar.zzb.getAppSetIdInfo();
            }
            if (b10 == 43000) {
                return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
            }
            return b10 != 15 ? task : Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        return task;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(zzr.this, task);
            }
        });
    }
}
