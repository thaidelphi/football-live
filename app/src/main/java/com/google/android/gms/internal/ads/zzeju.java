package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeju implements zzerw {
    private final zzgba zza;
    private final Context zzb;
    private final zzfap zzc;
    private final View zzd;

    public zzeju(zzgba zzgbaVar, Context context, zzfap zzfapVar, ViewGroup viewGroup) {
        this.zza = zzgbaVar;
        this.zzb = context;
        this.zzc = zzfapVar;
        this.zzd = viewGroup;
    }

    public static /* synthetic */ zzejv zzc(zzeju zzejuVar) {
        ArrayList arrayList = new ArrayList();
        View view = zzejuVar.zzd;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzejv(zzejuVar.zzb, zzejuVar.zzc.zze, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        zzbbm.zza(this.zzb);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeju.zzc(zzeju.this);
            }
        });
    }
}
