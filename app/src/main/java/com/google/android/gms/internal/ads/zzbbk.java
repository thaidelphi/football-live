package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.core.di.ServiceProvider;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbbk implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbbo.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzbbh
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zzb(final zzbbd zzbbdVar) {
        if (!this.zzc.block(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbdVar.zzk();
            }
        }
        if (zzbbdVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbbdVar.zzk();
            }
            return zzbbdVar.zzb(bundle);
        } else if (zzbbdVar.zze() == 1 && this.zzh.has(zzbbdVar.zzl())) {
            return zzbbdVar.zza(this.zzh);
        } else {
            return zzbbo.zza(new zzftn() { // from class: com.google.android.gms.internal.ads.zzbbi
                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object zza() {
                    Object zzc;
                    zzc = zzbbdVar.zzc(zzbbk.this.zze);
                    return zzc;
                }
            });
        }
    }

    public final Object zzc(zzbbd zzbbdVar) {
        return (this.zzd || this.zza) ? zzb(zzbbdVar) : zzbbdVar.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbbo.zza(new com.google.android.gms.internal.ads.zzbbg(r3))).optBoolean("local_flags_enabled") != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119 A[Catch: all -> 0x0159, TRY_ENTER, TryCatch #2 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:38:0x0097, B:39:0x009e, B:48:0x00cd, B:49:0x00d4, B:63:0x0119, B:64:0x0120, B:72:0x0147, B:73:0x014e, B:20:0x0042, B:23:0x004c, B:27:0x0055, B:30:0x0060, B:31:0x0068, B:33:0x006e, B:35:0x007e, B:37:0x0093, B:41:0x00a0, B:43:0x00a4, B:45:0x00b4, B:47:0x00c9, B:51:0x00d6, B:61:0x0115, B:66:0x0122, B:68:0x0139, B:70:0x013d, B:71:0x0140, B:54:0x00e7, B:56:0x00f5, B:58:0x00fd, B:59:0x0108), top: B:85:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122 A[Catch: all -> 0x0150, TRY_ENTER, TryCatch #2 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:38:0x0097, B:39:0x009e, B:48:0x00cd, B:49:0x00d4, B:63:0x0119, B:64:0x0120, B:72:0x0147, B:73:0x014e, B:20:0x0042, B:23:0x004c, B:27:0x0055, B:30:0x0060, B:31:0x0068, B:33:0x006e, B:35:0x007e, B:37:0x0093, B:41:0x00a0, B:43:0x00a4, B:45:0x00b4, B:47:0x00c9, B:51:0x00d6, B:61:0x0115, B:66:0x0122, B:68:0x0139, B:70:0x013d, B:71:0x0140, B:54:0x00e7, B:56:0x00f5, B:58:0x00fd, B:59:0x0108), top: B:85:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbk.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf() {
        return this.zzi;
    }
}
