package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import b6.a;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzdtd;
import com.google.android.gms.internal.ads.zzdte;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzay {

    /* renamed from: a  reason: collision with root package name */
    private final Object f11420a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private String f11421b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f11422c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f11423d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11424e = false;

    /* renamed from: f  reason: collision with root package name */
    protected String f11425f = "";

    /* renamed from: g  reason: collision with root package name */
    private zzdte f11426g;

    protected static final String c(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        a zzb = new zzbo(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeS)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            String valueOf = String.valueOf(str);
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Interrupted while retrieving a response from: ".concat(valueOf), e8);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            String valueOf2 = String.valueOf(str);
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Timeout while retrieving a response from: ".concat(valueOf2), e10);
            zzb.cancel(true);
            return null;
        } catch (Exception e11) {
            String valueOf3 = String.valueOf(str);
            int i12 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving a response from: ".concat(valueOf3), e11);
            return null;
        }
    }

    private final Uri d(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f11420a) {
            if (TextUtils.isEmpty(this.f11421b)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                try {
                    str5 = new String(IOUtils.d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.f11421b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.f11421b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String str6 = this.f11421b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e8) {
                        int i11 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error writing to file in internal storage.", e8);
                    }
                }
            }
            str4 = this.f11421b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Context context, String str, boolean z10, boolean z11) {
        if (!(context instanceof Activity)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
            return;
        }
        zzs.zza.post(new zzax(this, context, str, z10, z11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbbd r0 = com.google.android.gms.internal.ads.zzbbm.zzeP
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.d(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = c(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L27
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r4)
            return r0
        L27:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L85
            r6.<init>(r4)     // Catch: org.json.JSONException -> L85
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L85
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L85
            r3.f11425f = r6     // Catch: org.json.JSONException -> L85
            com.google.android.gms.internal.ads.zzbbd r6 = com.google.android.gms.internal.ads.zzbbm.zzjf     // Catch: org.json.JSONException -> L85
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: org.json.JSONException -> L85
            java.lang.Object r6 = r1.zzb(r6)     // Catch: org.json.JSONException -> L85
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L85
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L85
            r1 = 1
            if (r6 == 0) goto L7b
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f11425f     // Catch: org.json.JSONException -> L85
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L85
            if (r6 != 0) goto L68
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f11425f     // Catch: org.json.JSONException -> L85
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L85
            if (r6 == 0) goto L66
            goto L68
        L66:
            r6 = r0
            goto L69
        L68:
            r6 = r1
        L69:
            r3.zzf(r6)     // Catch: org.json.JSONException -> L85
            com.google.android.gms.internal.ads.zzbyf r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: org.json.JSONException -> L85
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()     // Catch: org.json.JSONException -> L85
            if (r6 != 0) goto L78
            java.lang.String r5 = ""
        L78:
            r2.zzw(r5)     // Catch: org.json.JSONException -> L85
        L7b:
            java.lang.Object r5 = r3.f11420a
            monitor-enter(r5)
            r3.f11422c = r4     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            return r1
        L82:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            throw r4
        L85:
            r4 = move-exception
            int r5 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.b(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final zzdte zza() {
        return this.f11426g;
    }

    public final String zzb() {
        String str;
        synchronized (this.f11420a) {
            str = this.f11422c;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzdte zzdteVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue() || (zzdteVar = this.f11426g) == null) {
            return;
        }
        zzdteVar.zzh(new zzav(this, context), zzdtd.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(context, d(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeO), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = d(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeR), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzM(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z10) {
        synchronized (this.f11420a) {
            this.f11424e = z10;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(z10);
                zzdte zzdteVar = this.f11426g;
                if (zzdteVar != null) {
                    zzdteVar.zzl(z10);
                }
            }
        }
    }

    public final void zzg(zzdte zzdteVar) {
        this.f11426g = zzdteVar;
    }

    public final void zzh(boolean z10) {
        synchronized (this.f11420a) {
            this.f11423d = z10;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String c10 = c(context, d(context, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeQ), str, str2).toString(), str2);
        if (TextUtils.isEmpty(c10)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(c10.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
                zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.zzw(str);
            }
            return equals;
        } catch (JSONException e8) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get debug mode response json.", e8);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.f11420a) {
            z10 = this.f11424e;
        }
        return z10;
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.f11420a) {
            z10 = this.f11423d;
        }
        return z10;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
