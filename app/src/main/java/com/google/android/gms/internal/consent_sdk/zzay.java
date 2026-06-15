package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.core.view.k0;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzay implements ConsentForm {
    private final Application zzb;
    private final zzbt zzc;
    private final zzam zzd;
    private final zzbm zze;
    private final zzdp zzf;
    private Dialog zzg;
    private zzbr zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzay(Application application, zzab zzabVar, zzbt zzbtVar, zzam zzamVar, zzbm zzbmVar, zzdp zzdpVar) {
        this.zzb = application;
        this.zzc = zzbtVar;
        this.zzd = zzamVar;
        this.zze = zzbmVar;
        this.zzf = zzdpVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzav zzavVar = (zzav) this.zzl.getAndSet(null);
        if (zzavVar != null) {
            zzav.zza(zzavVar);
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzco.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        zzav zzavVar = new zzav(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzavVar);
        this.zzl.set(zzavVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        k0.b(window, false);
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbr zzc() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbr zza = ((zzbs) this.zzf).zza();
        this.zzh = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new zzbp(zza, null));
        this.zzj.set(new zzaw(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, null));
        zzbr zzbrVar = this.zzh;
        zzbm zzbmVar = this.zze;
        zzbrVar.loadDataWithBaseURL(zzbmVar.zza(), zzbmVar.zzb(), "text/html", "UTF-8", null);
        zzco.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzau
            @Override // java.lang.Runnable
            public final void run() {
                zzay.this.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(int i10) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zzd.zzg(3);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(zzg zzgVar) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi() {
        zzaw zzawVar = (zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadSuccess(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(zzg zzgVar) {
        zzaw zzawVar = (zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
