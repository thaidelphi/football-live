package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzayf;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbyf;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzeav;
import com.google.android.gms.internal.ads.zzeaw;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzv {
    private static final zzv D = new zzv();
    private final zzci A;
    private final zzcbq B;
    private final zzbzc C;

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.overlay.zza f11565a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.overlay.zzn f11566b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.ads.internal.util.zzs f11567c;

    /* renamed from: d  reason: collision with root package name */
    private final zzced f11568d;

    /* renamed from: e  reason: collision with root package name */
    private final zzaa f11569e;

    /* renamed from: f  reason: collision with root package name */
    private final zzayf f11570f;

    /* renamed from: g  reason: collision with root package name */
    private final zzbyf f11571g;

    /* renamed from: h  reason: collision with root package name */
    private final zzab f11572h;

    /* renamed from: i  reason: collision with root package name */
    private final zzazs f11573i;

    /* renamed from: j  reason: collision with root package name */
    private final Clock f11574j;

    /* renamed from: k  reason: collision with root package name */
    private final zzf f11575k;

    /* renamed from: l  reason: collision with root package name */
    private final zzbbs f11576l;

    /* renamed from: m  reason: collision with root package name */
    private final zzbcl f11577m;

    /* renamed from: n  reason: collision with root package name */
    private final zzay f11578n;

    /* renamed from: o  reason: collision with root package name */
    private final zzbuk f11579o;

    /* renamed from: p  reason: collision with root package name */
    private final zzbyv f11580p;

    /* renamed from: q  reason: collision with root package name */
    private final zzbmw f11581q;

    /* renamed from: r  reason: collision with root package name */
    private final zzz f11582r;

    /* renamed from: s  reason: collision with root package name */
    private final zzbt f11583s;

    /* renamed from: t  reason: collision with root package name */
    private final zzad f11584t;

    /* renamed from: u  reason: collision with root package name */
    private final zzae f11585u;

    /* renamed from: v  reason: collision with root package name */
    private final zzbny f11586v;

    /* renamed from: w  reason: collision with root package name */
    private final zzbu f11587w;

    /* renamed from: x  reason: collision with root package name */
    private final zzeaw f11588x;

    /* renamed from: y  reason: collision with root package name */
    private final zzbah f11589y;

    /* renamed from: z  reason: collision with root package name */
    private final zzbxb f11590z;

    protected zzv() {
        zzaa zzvVar;
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzced zzcedVar = new zzced();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            zzvVar = new zzy();
        } else if (i10 >= 28) {
            zzvVar = new zzx();
        } else {
            zzvVar = i10 >= 26 ? new com.google.android.gms.ads.internal.util.zzv() : i10 >= 24 ? new com.google.android.gms.ads.internal.util.zzu() : new com.google.android.gms.ads.internal.util.zzt();
        }
        zzayf zzayfVar = new zzayf();
        zzbyf zzbyfVar = new zzbyf();
        zzab zzabVar = new zzab();
        zzazs zzazsVar = new zzazs();
        Clock d10 = DefaultClock.d();
        zzf zzfVar = new zzf();
        zzbbs zzbbsVar = new zzbbs();
        zzbcl zzbclVar = new zzbcl();
        zzay zzayVar = new zzay();
        zzbuk zzbukVar = new zzbuk();
        zzbyv zzbyvVar = new zzbyv();
        zzbmw zzbmwVar = new zzbmw();
        zzz zzzVar = new zzz();
        zzbt zzbtVar = new zzbt();
        zzad zzadVar = new zzad();
        zzae zzaeVar = new zzae();
        zzbny zzbnyVar = new zzbny();
        zzbu zzbuVar = new zzbu();
        zzeav zzeavVar = new zzeav();
        zzbah zzbahVar = new zzbah();
        zzbxb zzbxbVar = new zzbxb();
        zzci zzciVar = new zzci();
        zzcbq zzcbqVar = new zzcbq();
        zzbzc zzbzcVar = new zzbzc();
        this.f11565a = zzaVar;
        this.f11566b = zznVar;
        this.f11567c = zzsVar;
        this.f11568d = zzcedVar;
        this.f11569e = zzvVar;
        this.f11570f = zzayfVar;
        this.f11571g = zzbyfVar;
        this.f11572h = zzabVar;
        this.f11573i = zzazsVar;
        this.f11574j = d10;
        this.f11575k = zzfVar;
        this.f11576l = zzbbsVar;
        this.f11577m = zzbclVar;
        this.f11578n = zzayVar;
        this.f11579o = zzbukVar;
        this.f11580p = zzbyvVar;
        this.f11581q = zzbmwVar;
        this.f11583s = zzbtVar;
        this.f11582r = zzzVar;
        this.f11584t = zzadVar;
        this.f11585u = zzaeVar;
        this.f11586v = zzbnyVar;
        this.f11587w = zzbuVar;
        this.f11588x = zzeavVar;
        this.f11589y = zzbahVar;
        this.f11590z = zzbxbVar;
        this.A = zzciVar;
        this.B = zzcbqVar;
        this.C = zzbzcVar;
    }

    public static zzced zzA() {
        return D.f11568d;
    }

    public static zzeaw zzB() {
        return D.f11588x;
    }

    public static Clock zzC() {
        return D.f11574j;
    }

    public static zzf zza() {
        return D.f11575k;
    }

    public static zzayf zzb() {
        return D.f11570f;
    }

    public static zzazs zzc() {
        return D.f11573i;
    }

    public static zzbah zzd() {
        return D.f11589y;
    }

    public static zzbbs zze() {
        return D.f11576l;
    }

    public static zzbcl zzf() {
        return D.f11577m;
    }

    public static zzbmw zzg() {
        return D.f11581q;
    }

    public static zzbny zzh() {
        return D.f11586v;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return D.f11565a;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzj() {
        return D.f11566b;
    }

    public static zzz zzk() {
        return D.f11582r;
    }

    public static zzad zzl() {
        return D.f11584t;
    }

    public static zzae zzm() {
        return D.f11585u;
    }

    public static zzbuk zzn() {
        return D.f11579o;
    }

    public static zzbxb zzo() {
        return D.f11590z;
    }

    public static zzbyf zzp() {
        return D.f11571g;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzq() {
        return D.f11567c;
    }

    public static zzaa zzr() {
        return D.f11569e;
    }

    public static zzab zzs() {
        return D.f11572h;
    }

    public static zzay zzt() {
        return D.f11578n;
    }

    public static zzbt zzu() {
        return D.f11583s;
    }

    public static zzbu zzv() {
        return D.f11587w;
    }

    public static zzci zzw() {
        return D.A;
    }

    public static zzbyv zzx() {
        return D.f11580p;
    }

    public static zzbzc zzy() {
        return D.C;
    }

    public static zzcbq zzz() {
        return D.B;
    }
}
