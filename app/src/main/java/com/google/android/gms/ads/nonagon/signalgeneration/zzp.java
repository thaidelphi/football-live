package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzdqk;
import com.ironsource.mediationsdk.metadata.a;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzp extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    private final zzo f11808a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdqk f11809b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11810c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11811d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11812e = com.google.android.gms.ads.internal.zzv.zzC().a();

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f11813f;

    public zzp(zzo zzoVar, boolean z10, int i10, Boolean bool, zzdqk zzdqkVar) {
        this.f11808a = zzoVar;
        this.f11810c = z10;
        this.f11811d = i10;
        this.f11813f = bool;
        this.f11809b = zzdqkVar;
    }

    private static long a() {
        return com.google.android.gms.ads.internal.zzv.zzC().a() + ((Long) zzbdr.zzf.zze()).longValue();
    }

    private final long b() {
        return com.google.android.gms.ads.internal.zzv.zzC().a() - this.f11812e;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", a.f18924g);
        pairArr[5] = new Pair("lat_ms", Long.toString(b()));
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(this.f11811d));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.f11813f));
        pairArr[8] = new Pair("tpc", true != this.f11810c ? "0" : "1");
        zzaa.zzd(this.f11809b, null, "sgpcf", pairArr);
        this.f11808a.a(this.f11810c, new zzq(null, str, a(), this.f11811d));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", a.f18924g);
        pairArr[4] = new Pair("lat_ms", Long.toString(b()));
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(this.f11811d));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.f11813f));
        pairArr[7] = new Pair("tpc", true != this.f11810c ? "0" : "1");
        zzaa.zzd(this.f11809b, null, "sgpcs", pairArr);
        this.f11808a.a(this.f11810c, new zzq(queryInfo, "", a(), this.f11811d));
    }
}
