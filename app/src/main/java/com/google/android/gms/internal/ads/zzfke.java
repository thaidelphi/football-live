package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfke implements zzfkc {
    private final zzfkc zza;

    public zzfke(zzfkc zzfkcVar) {
        this.zza = zzfkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final JSONObject zza(View view) {
        JSONObject zza = zzfkm.zza(0, 0, 0, 0);
        int zzb = zzfkp.zzb();
        int i10 = zzb - 1;
        if (zzb != 0) {
            try {
                zza.put("noOutputDevice", i10 == 0);
            } catch (JSONException e8) {
                zzfkn.zza("Error with setting output device status", e8);
            }
            return zza;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkc
    public final void zzb(View view, JSONObject jSONObject, zzfkb zzfkbVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfjq zza = zzfjq.zza();
        if (zza != null) {
            Collection<zzfiz> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfiz zzfizVar : zzb) {
                View zzf = zzfizVar.zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    }
                                    size2 = i10;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfkbVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
