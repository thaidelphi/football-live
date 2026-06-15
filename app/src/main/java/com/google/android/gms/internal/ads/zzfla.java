package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfla implements zzfkb {
    private static final zzfla zza = new zzfla();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfkw();
    private static final Runnable zze = new zzfkx();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfkt zzk = new zzfkt();
    private final zzfkd zzj = new zzfkd();
    private final zzfku zzl = new zzfku(new zzfld());

    zzfla() {
    }

    public static zzfla zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzfla zzflaVar) {
        zzflaVar.zzg = 0;
        zzflaVar.zzi.clear();
        zzflaVar.zzh = false;
        for (zzfiz zzfizVar : zzfjq.zza().zzb()) {
        }
        zzflaVar.zzm = System.nanoTime();
        zzflaVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfkc zza2 = zzflaVar.zzj.zza();
        if (zzflaVar.zzk.zze().size() > 0) {
            Iterator it = zzflaVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzflaVar.zzk.zza(str);
                zzfkc zzb2 = zzflaVar.zzj.zzb();
                String zzc2 = zzflaVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfkm.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e8) {
                        zzfkn.zza("Error with setting not visible reason", e8);
                    }
                    zzfkm.zzc(zza3, zza5);
                }
                zzfkm.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzflaVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzflaVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzflaVar.zzk(null, zza2, zza6, 1, false);
            zzfkm.zzf(zza6);
            zzflaVar.zzl.zzd(zza6, zzflaVar.zzk.zzf(), nanoTime);
        } else {
            zzflaVar.zzl.zzb();
        }
        zzflaVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzflaVar.zzm;
        if (zzflaVar.zzf.size() > 0) {
            for (zzfkz zzfkzVar : zzflaVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfkzVar.zzb();
                if (zzfkzVar instanceof zzfky) {
                    ((zzfky) zzfkzVar).zza();
                }
            }
        }
        zzfka.zza().zzc();
    }

    private final void zzk(View view, zzfkc zzfkcVar, JSONObject jSONObject, int i10, boolean z10) {
        zzfkcVar.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkb
    public final void zza(View view, zzfkc zzfkcVar, JSONObject jSONObject, boolean z10) {
        int zzl;
        boolean z11;
        if (zzfkr.zza(view) != null || (zzl = this.zzk.zzl(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfkcVar.zza(view);
        zzfkm.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzfkm.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
            } catch (JSONException e8) {
                zzfkn.zza("Error with setting has window focus", e8);
            }
            Boolean valueOf = Boolean.valueOf(this.zzk.zzj(zzd2));
            if (valueOf.booleanValue()) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (JSONException e10) {
                    zzfkn.zza("Error with setting is picture-in-picture active", e10);
                }
            }
            this.zzk.zzh();
        } else {
            zzfks zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzfjt zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put((String) zzb3.get(i10));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e11) {
                    zzfkn.zza("Error with setting friendly obstruction", e11);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            zzk(view, zzfkcVar, zza2, zzl, z10 || z11);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfkv(this));
    }
}
