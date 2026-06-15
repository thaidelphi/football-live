package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcdq;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcdq zzcdqVar) throws zzg {
        this.zzb = zzcdqVar.getLayoutParams();
        ViewParent parent = zzcdqVar.getParent();
        this.zzd = zzcdqVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcdqVar.zzF());
            viewGroup.removeView(zzcdqVar.zzF());
            zzcdqVar.zzaq(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
