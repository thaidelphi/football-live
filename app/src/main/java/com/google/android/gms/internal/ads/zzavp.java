package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzavp extends zzaws {
    private final Activity zzh;
    private final View zzi;

    public zzavp(zzavf zzavfVar, String str, String str2, zzarf zzarfVar, int i10, int i11, View view, Activity activity) {
        super(zzavfVar, "rbM1+IJKml7pK+8stsIEoLVWU08Pr9FbdEoZJlCacgPQDaiImdRY7YZ1yR+usDwp", "qIQ8RScVvIrhv3pJZgjHxMU1QEZI7Qp5PW5iOiVriA8=", zzarfVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcJ)).booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, this.zzi, this.zzh, Boolean.valueOf(booleanValue));
        synchronized (this.zzd) {
            this.zzd.zzc(((Long) objArr[0]).longValue());
            this.zzd.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zzd.zzd((String) objArr[2]);
            }
        }
    }
}
