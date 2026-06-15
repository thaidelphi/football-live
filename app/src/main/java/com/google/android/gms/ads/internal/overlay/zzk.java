package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzk extends com.google.android.gms.ads.internal.util.zzb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzm f11326a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzk(zzm zzmVar, zzl zzlVar) {
        this.f11326a = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap zza = com.google.android.gms.ads.internal.zzv.zzv().zza(Integer.valueOf(this.f11326a.f11329b.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzv.zzq();
            zzm zzmVar = this.f11326a;
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.f11329b.zzo;
            boolean z10 = zzlVar.zzd;
            float f10 = zzlVar.zze;
            Activity activity = zzmVar.f11328a;
            if (z10 && f10 > 0.0f && f10 <= 25.0f) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f10);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
                }
            } else {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    zzk.this.f11326a.f11328a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
