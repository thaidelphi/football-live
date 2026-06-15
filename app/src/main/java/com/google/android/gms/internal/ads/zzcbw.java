package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.xn;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcbw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcbx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbw(zzcbx zzcbxVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcbxVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            hashMap.put("cachedSrc", this.zzb);
        }
        String str = this.zzc;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 96784904:
                if (str.equals(xn.a.f21422g)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = "internal";
        switch (c10) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case '\b':
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        hashMap.put("type", str2);
        hashMap.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            hashMap.put("message", this.zzd);
        }
        zzcbx.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
