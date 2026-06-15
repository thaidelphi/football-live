package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbb {

    /* renamed from: f  reason: collision with root package name */
    private static final zzbb f11201f = new zzbb();
    public static final /* synthetic */ int zza = 0;

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.util.client.zzf f11202a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaz f11203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11204c;

    /* renamed from: d  reason: collision with root package name */
    private final VersionInfoParcel f11205d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f11206e;

    protected zzbb() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaz zzazVar = new zzaz(new zzk(), new zzi(), new zzfb(), new zzbgu(), new zzbvu(), new zzbsa(), new zzbgv(), new zzl());
        String zzf = com.google.android.gms.ads.internal.util.client.zzf.zzf();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 250505300, true);
        Random random = new Random();
        this.f11202a = zzfVar;
        this.f11203b = zzazVar;
        this.f11204c = zzf;
        this.f11205d = versionInfoParcel;
        this.f11206e = random;
    }

    public static zzaz zza() {
        return f11201f.f11203b;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zzb() {
        return f11201f.f11202a;
    }

    public static VersionInfoParcel zzc() {
        return f11201f.f11205d;
    }

    public static String zzd() {
        return f11201f.f11204c;
    }

    public static Random zze() {
        return f11201f.f11206e;
    }
}
