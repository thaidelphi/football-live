package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdcq;
import com.google.android.gms.internal.ads.zzdpz;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzw implements zzdcq {

    /* renamed from: a  reason: collision with root package name */
    private final zzdpz f11831a;

    /* renamed from: b  reason: collision with root package name */
    private final zzv f11832b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11833c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11834d;

    public zzw(zzdpz zzdpzVar, zzv zzvVar, String str, int i10) {
        this.f11831a = zzdpzVar;
        this.f11832b = zzvVar;
        this.f11833c = str;
        this.f11834d = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zze(zzbk zzbkVar) {
        String str;
        if (zzbkVar == null || this.f11834d == 2) {
            return;
        }
        if (!TextUtils.isEmpty(zzbkVar.zzc)) {
            try {
                str = new JSONObject(zzbkVar.zzc).optString("request_id");
            } catch (JSONException e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "RenderSignals.getRequestId");
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f11832b.zze(str, zzbkVar.zzc, this.f11831a);
            return;
        }
        this.f11832b.zze(this.f11833c, zzbkVar.zzb, this.f11831a);
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf(String str) {
    }
}
