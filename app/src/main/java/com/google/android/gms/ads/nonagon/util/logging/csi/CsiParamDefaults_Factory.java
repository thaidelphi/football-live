package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhdk;
import com.google.android.gms.internal.ads.zzhdt;
import com.google.android.gms.internal.ads.zzhdv;
import com.google.android.gms.internal.ads.zzheb;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class CsiParamDefaults_Factory implements zzhdk<CsiParamDefaults> {

    /* renamed from: a  reason: collision with root package name */
    private final zzhdt f11843a;

    /* renamed from: b  reason: collision with root package name */
    private final zzhdt f11844b;

    public CsiParamDefaults_Factory(zzhdt<Context> zzhdtVar, zzhdt<VersionInfoParcel> zzhdtVar2) {
        this.f11843a = zzhdtVar;
        this.f11844b = zzhdtVar2;
    }

    public static CsiParamDefaults_Factory create(zzhdt<Context> zzhdtVar, zzhdt<VersionInfoParcel> zzhdtVar2) {
        return new CsiParamDefaults_Factory(zzhdtVar, zzhdtVar2);
    }

    public static CsiParamDefaults_Factory create(zzheb<Context> zzhebVar, zzheb<VersionInfoParcel> zzhebVar2) {
        return new CsiParamDefaults_Factory(zzhdv.zza(zzhebVar), zzhdv.zza(zzhebVar2));
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    /* renamed from: get */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.f11843a.zzb(), (VersionInfoParcel) this.f11844b.zzb());
    }
}
