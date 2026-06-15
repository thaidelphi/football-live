package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzdh implements MuteThisAdReason {

    /* renamed from: a  reason: collision with root package name */
    private final String f11215a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdg f11216b;

    public zzdh(zzdg zzdgVar) {
        String str;
        this.f11216b = zzdgVar;
        try {
            str = zzdgVar.zze();
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            str = null;
        }
        this.f11215a = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.f11215a;
    }

    public final String toString() {
        return this.f11215a;
    }

    public final zzdg zza() {
        return this.f11216b;
    }
}
