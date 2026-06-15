package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbxr;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzaz {

    /* renamed from: a  reason: collision with root package name */
    private final String f11743a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11744b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbxr f11745c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        String str;
        String str2;
        zzbxr zzbxrVar;
        str = zzaxVar.f11740a;
        this.f11743a = str;
        str2 = zzaxVar.f11741b;
        this.f11744b = str2;
        zzbxrVar = zzaxVar.f11742c;
        this.f11745c = zzbxrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbxr a() {
        return this.f11745c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.f11744b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zzbar.zza.EnumC0178zza zza() {
        char c10;
        String str = this.f11743a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        return zzbar.zza.EnumC0178zza.AD_INITIATER_UNSPECIFIED;
                    }
                    return zzbar.zza.EnumC0178zza.REWARD_BASED_VIDEO_AD;
                }
                return zzbar.zza.EnumC0178zza.AD_LOADER;
            }
            return zzbar.zza.EnumC0178zza.INTERSTITIAL;
        }
        return zzbar.zza.EnumC0178zza.BANNER;
    }

    public final String zzc() {
        return this.f11743a.toLowerCase(Locale.ROOT);
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f11743a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
