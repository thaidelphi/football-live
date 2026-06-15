package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzl {
    private final Application zza;
    private final zzam zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(Application application, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzamVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcf zzc(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzg {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzn.zza(new zzn(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
