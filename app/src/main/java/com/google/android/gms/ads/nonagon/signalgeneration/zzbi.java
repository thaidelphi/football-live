package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import b6.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzdvj;
import com.google.android.gms.internal.ads.zzdws;
import com.google.android.gms.internal.ads.zzfzw;
import com.google.android.gms.internal.ads.zzgap;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbi implements zzfzw {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11768a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvj f11769b;

    public zzbi(Executor executor, zzdvj zzdvjVar) {
        this.f11768a = executor;
        this.f11769b = zzdvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzw
    public final /* bridge */ /* synthetic */ a zza(Object obj) throws Exception {
        final zzbud zzbudVar = (zzbud) obj;
        return zzgap.zzn(this.f11769b.zzc(zzbudVar), new zzfzw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final a zza(Object obj2) {
                zzdws zzdwsVar = (zzdws) obj2;
                zzbk zzbkVar = new zzbk(new JsonReader(new InputStreamReader(zzdwsVar.zzb())), zzdwsVar.zza());
                zzbud zzbudVar2 = zzbud.this;
                try {
                    zzbkVar.zzb = com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(zzbudVar2.zza).toString();
                } catch (JSONException unused) {
                    zzbkVar.zzb = JsonUtils.EMPTY_JSON;
                }
                if (!zzbudVar2.zzn.isEmpty()) {
                    try {
                        zzbkVar.zzc = com.google.android.gms.ads.internal.client.zzbb.zzb().zzj(zzbudVar2.zzn).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgap.zzh(zzbkVar);
            }
        }, this.f11768a);
    }
}
