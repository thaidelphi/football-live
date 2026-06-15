package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b6.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzffc;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzgal;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaq implements zzgal {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f11689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzbxr f11690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbxk f11691c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ zzffc f11692d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzau f11693e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzau zzauVar, a aVar, zzbxr zzbxrVar, zzbxk zzbxkVar, zzffc zzffcVar) {
        this.f11689a = aVar;
        this.f11690b = zzbxrVar;
        this.f11691c = zzbxkVar;
        this.f11692d = zzffcVar;
        this.f11693e = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhF)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzffn T0 = zzau.T0(this.f11689a, this.f11690b);
        if (((Boolean) zzbdf.zze.zze()).booleanValue() && T0 != null) {
            zzffc zzffcVar = this.f11692d;
            zzffcVar.zzh(th);
            zzffcVar.zzg(false);
            T0.zza(zzffcVar);
            T0.zzh();
        }
        if (this.f11691c == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f11691c.zzb(message);
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        JSONObject jSONObject;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        VersionInfoParcel versionInfoParcel;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzbk zzbkVar = (zzbk) obj;
        zzffn T0 = zzau.T0(this.f11689a, this.f11690b);
        atomicBoolean = this.f11693e.B;
        atomicBoolean.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhA)).booleanValue()) {
            try {
                zzbxk zzbxkVar = this.f11691c;
                if (zzbxkVar != null) {
                    zzbxkVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e8) {
                String concat = "QueryInfo generation has been disabled.".concat(e8.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(concat);
            }
            if (!((Boolean) zzbdf.zze.zze()).booleanValue() || T0 == null) {
                return;
            }
            zzffc zzffcVar = this.f11692d;
            zzffcVar.zzc("QueryInfo generation has been disabled.");
            zzffcVar.zzg(false);
            T0.zza(zzffcVar);
            T0.zzh();
            return;
        }
        try {
            try {
                if (zzbkVar == null) {
                    zzbxk zzbxkVar2 = this.f11691c;
                    if (zzbxkVar2 != null) {
                        zzbxkVar2.zzc(null, null, null);
                    }
                    this.f11692d.zzg(true);
                    if (!((Boolean) zzbdf.zze.zze()).booleanValue() || T0 == null) {
                        return;
                    }
                    T0.zza(this.f11692d);
                    T0.zzh();
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(zzbkVar.zzc)) {
                        jSONObject = new JSONObject(zzbkVar.zzc);
                    } else {
                        jSONObject = new JSONObject(zzbkVar.zzb);
                    }
                    if (TextUtils.isEmpty(jSONObject.optString("request_id", ""))) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("The request ID is empty in request JSON.");
                        zzbxk zzbxkVar3 = this.f11691c;
                        if (zzbxkVar3 != null) {
                            zzbxkVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzffc zzffcVar2 = this.f11692d;
                        zzffcVar2.zzc("Request ID empty");
                        zzffcVar2.zzg(false);
                        if (!((Boolean) zzbdf.zze.zze()).booleanValue() || T0 == null) {
                            return;
                        }
                        T0.zza(this.f11692d);
                        T0.zzh();
                        return;
                    }
                    Bundle bundle = zzbkVar.zzf;
                    zzau zzauVar = this.f11693e;
                    z10 = zzauVar.f11716p;
                    if (z10 && bundle != null) {
                        str5 = zzauVar.f11718r;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzau zzauVar2 = this.f11693e;
                            str6 = zzauVar2.f11718r;
                            atomicInteger = zzauVar2.f11719s;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzau zzauVar3 = this.f11693e;
                    z11 = zzauVar3.f11715o;
                    if (z11 && bundle != null) {
                        str = zzauVar3.f11717q;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.f11693e.f11721u;
                            if (TextUtils.isEmpty(str2)) {
                                zzau zzauVar4 = this.f11693e;
                                com.google.android.gms.ads.internal.util.zzs zzq = com.google.android.gms.ads.internal.zzv.zzq();
                                zzau zzauVar5 = this.f11693e;
                                context = zzauVar5.f11702b;
                                versionInfoParcel = zzauVar5.f11720t;
                                zzauVar4.f11721u = zzq.zzc(context, versionInfoParcel.afmaVersion);
                            }
                            zzau zzauVar6 = this.f11693e;
                            str3 = zzauVar6.f11717q;
                            str4 = zzauVar6.f11721u;
                            bundle.putString(str3, str4);
                        }
                    }
                    if (this.f11691c != null) {
                        if (!TextUtils.isEmpty(zzbkVar.zzc)) {
                            this.f11691c.zzc(zzbkVar.zza, zzbkVar.zzc, bundle);
                        } else {
                            this.f11691c.zzc(zzbkVar.zza, zzbkVar.zzb, bundle);
                        }
                    }
                    this.f11692d.zzg(true);
                    if (!((Boolean) zzbdf.zze.zze()).booleanValue() || T0 == null) {
                        return;
                    }
                    T0.zza(this.f11692d);
                    T0.zzh();
                } catch (JSONException e10) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create JSON object from the request string.");
                    zzbxk zzbxkVar4 = this.f11691c;
                    if (zzbxkVar4 != null) {
                        String obj2 = e10.toString();
                        zzbxkVar4.zzb("Internal error for request JSON: " + obj2);
                    }
                    zzffc zzffcVar3 = this.f11692d;
                    zzffcVar3.zzh(e10);
                    zzffcVar3.zzg(false);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbdf.zze.zze()).booleanValue() || T0 == null) {
                        return;
                    }
                    T0.zza(this.f11692d);
                    T0.zzh();
                }
            } catch (RemoteException e11) {
                zzffc zzffcVar4 = this.f11692d;
                zzffcVar4.zzh(e11);
                zzffcVar4.zzg(false);
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e11);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbdf.zze.zze()).booleanValue() || T0 == null) {
                    return;
                }
                T0.zza(this.f11692d);
                T0.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbdf.zze.zze()).booleanValue() && T0 != null) {
                T0.zza(this.f11692d);
                T0.zzh();
            }
            throw th;
        }
    }
}
