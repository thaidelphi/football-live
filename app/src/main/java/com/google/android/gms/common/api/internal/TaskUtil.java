package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class TaskUtil {
    @KeepForSdk
    public static <TResult> void a(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.z0()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new ApiException(status));
        }
    }
}
