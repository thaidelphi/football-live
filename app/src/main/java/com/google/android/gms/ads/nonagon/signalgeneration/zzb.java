package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfpn;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzb {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11746a;

    /* renamed from: b  reason: collision with root package name */
    private final zzd f11747b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11748c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f11749d;

    /* renamed from: e  reason: collision with root package name */
    private final PackageInfo f11750e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(Context context, long j10, PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.f11746a = context;
        this.f11748c = j10;
        this.f11750e = packageInfo;
        this.f11747b = zzdVar;
        this.f11749d = scheduledExecutorService;
    }

    private final boolean a() {
        return this.f11747b.zzf().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhy)).intValue();
    }

    private static final void b(Bundle bundle, zzdpn zzdpnVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhz)).booleanValue()) {
            bundle.putLong(zzdpnVar.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
    }

    private static final void c(Bundle bundle, int i10) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i10 - 1);
    }

    public static String zzb(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (charArray[i10] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i10 % 555));
        }
        return new String(charArray);
    }

    public static /* synthetic */ void zzc(zzb zzbVar, String str, zzau zzauVar, zzbxr zzbxrVar) {
        if (zzbVar.f11747b.zzj(str) || zzbVar.a()) {
            return;
        }
        zzauVar.zzf(ObjectWrapper.u0(zzbVar.f11746a), zzbxrVar, null);
    }

    public final zzbk zza(zzbxr zzbxrVar, final zzau zzauVar, Bundle bundle) {
        long j10;
        b(bundle, zzdpn.SIGNAL_ON_DISK_VALIDATION_START);
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN()) {
            this.f11747b.zzg();
            c(bundle, 7);
        } else if (this.f11750e == null) {
            this.f11747b.zzg();
            c(bundle, 10);
        } else {
            zzd zzdVar = this.f11747b;
            Context context = this.f11746a;
            String zze = zzdVar.zze();
            int zzb = zzdVar.zzb();
            String zzd = zzdVar.zzd();
            int zza = zzdVar.zza();
            if (TextUtils.equals(context.getApplicationInfo().packageName, zze) && zzb == this.f11750e.versionCode && TextUtils.equals(Build.MODEL, zzd) && zza == Build.VERSION.SDK_INT) {
                for (Map.Entry entry : this.f11747b.zzf().entrySet()) {
                    try {
                        j10 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                    } catch (IOException | JSONException unused) {
                    }
                    if (com.google.android.gms.ads.internal.zzv.zzC().a() - j10 <= ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhx)).longValue()) {
                        zzfpi zzh = zzfpm.zzj(this.f11746a).zzh(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                        zzfpi zzh2 = zzfpn.zzi(this.f11746a).zzh(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdr)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                        if (zzh.zza() != -1) {
                            if (zzh.zza() > j10) {
                            }
                        }
                        if (zzh2.zza() != -1 && zzh2.zza() > j10) {
                        }
                    }
                    this.f11747b.zzc((String) entry.getKey());
                }
            } else {
                this.f11747b.zzg();
                this.f11747b.zzi(this.f11746a.getApplicationInfo().packageName, this.f11750e.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
            }
            b(bundle, zzdpn.SIGNAL_ON_DISK_VALIDATION_END);
            if (com.google.android.gms.ads.internal.zzv.zzC().a() - this.f11748c > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhu)).longValue()) {
                c(bundle, 2);
                return null;
            }
            b(bundle, zzdpn.SIGNAL_ON_DISK_CACHE_KEY_START);
            String str = zzbxrVar.zza;
            String str2 = zzbxrVar.zzb;
            String bundle2 = zzbxrVar.zzd.zzn.toString();
            String bundle3 = zzbxrVar.zzd.zzc.toString();
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbxrVar.zzd;
            String str3 = zzmVar.zzi;
            String str4 = zzmVar.zzp;
            String valueOf = String.valueOf(zzmVar.zzo);
            final String zzh3 = com.google.android.gms.ads.internal.util.client.zzf.zzh(str + str2 + bundle2 + bundle3 + str3 + str4 + valueOf);
            if (TextUtils.isEmpty(zzh3)) {
                c(bundle, 3);
                return null;
            }
            b(bundle, zzdpn.SIGNAL_ON_DISK_CACHE_KEY_END);
            b(bundle, zzdpn.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
            String zzc = this.f11747b.zzc(zzh3);
            b(bundle, zzdpn.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
            if (!a()) {
                final zzbxr zzbxrVar2 = new zzbxr(zzbxrVar.zza, zzbxrVar.zzb, zzbxrVar.zzc, zzbxrVar.zzd, 2, zzh3);
                this.f11749d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzb.zzc(zzb.this, zzh3, zzauVar, zzbxrVar2);
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhw)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (TextUtils.isEmpty(zzc)) {
                c(bundle, 4);
                return null;
            }
            b(bundle, zzdpn.SIGNAL_ON_DISK_DECODE_START);
            try {
                JSONObject jSONObject = new JSONObject(zzc);
                String string = jSONObject.getString("sr");
                if (TextUtils.isEmpty(string)) {
                    c(bundle, 8);
                    return null;
                }
                String string2 = jSONObject.getString("rs");
                if (TextUtils.isEmpty(string2)) {
                    c(bundle, 9);
                    return null;
                }
                String zzb2 = zzb(new String(Base64.decode(string2, 10), StandardCharsets.UTF_8));
                b(bundle, zzdpn.SIGNAL_ON_DISK_DECODE_END);
                try {
                    zzbk zzbkVar = new zzbk(new JsonReader(new StringReader(string)), null);
                    zzbkVar.zzc = zzb2;
                    zzbkVar.zze = bundle;
                    bundle.putBoolean("sod_h", true);
                    return zzbkVar;
                } catch (IOException e8) {
                    c(bundle, 6);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            } catch (JSONException e10) {
                c(bundle, 5);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "DiskCachingManager.getSignalResponse");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.lang.String r6, com.google.android.gms.ads.nonagon.signalgeneration.zzbk r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L79
            boolean r0 = r5.a()
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L60
            r1.<init>()     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch: org.json.JSONException -> L60
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch: org.json.JSONException -> L60
            android.os.Bundle r4 = r7.zzf     // Catch: org.json.JSONException -> L60
            org.json.JSONObject r3 = r3.zzj(r4)     // Catch: org.json.JSONException -> L60
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r7 = r7.zzc     // Catch: org.json.JSONException -> L60
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L60
            if (r1 == 0) goto L3d
            java.lang.String r7 = ""
            goto L6e
        L3d:
            java.lang.String r7 = zzb(r7)     // Catch: org.json.JSONException -> L60
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L60
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L60
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L60
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch: org.json.JSONException -> L60
            long r1 = r1.a()     // Catch: org.json.JSONException -> L60
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L60
            goto L6a
        L60:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzbyf r1 = com.google.android.gms.ads.internal.zzv.zzp()
            java.lang.String r2 = "DiskCachingManager.createStringToWrite"
            r1.zzw(r7, r2)
        L6a:
            java.lang.String r7 = r0.toString()
        L6e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L79
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.f11747b
            r0.zzh(r6, r7)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zzd(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }
}
