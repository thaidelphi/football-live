package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a1 {
    private long A;
    private String B;
    private boolean C;
    private long D;
    private long E;

    /* renamed from: a  reason: collision with root package name */
    private final zzfy f12835a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12836b;

    /* renamed from: c  reason: collision with root package name */
    private String f12837c;

    /* renamed from: d  reason: collision with root package name */
    private String f12838d;

    /* renamed from: e  reason: collision with root package name */
    private String f12839e;

    /* renamed from: f  reason: collision with root package name */
    private String f12840f;

    /* renamed from: g  reason: collision with root package name */
    private long f12841g;

    /* renamed from: h  reason: collision with root package name */
    private long f12842h;

    /* renamed from: i  reason: collision with root package name */
    private long f12843i;

    /* renamed from: j  reason: collision with root package name */
    private String f12844j;

    /* renamed from: k  reason: collision with root package name */
    private long f12845k;

    /* renamed from: l  reason: collision with root package name */
    private String f12846l;

    /* renamed from: m  reason: collision with root package name */
    private long f12847m;

    /* renamed from: n  reason: collision with root package name */
    private long f12848n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12849o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12850p;

    /* renamed from: q  reason: collision with root package name */
    private String f12851q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f12852r;

    /* renamed from: s  reason: collision with root package name */
    private long f12853s;

    /* renamed from: t  reason: collision with root package name */
    private List f12854t;

    /* renamed from: u  reason: collision with root package name */
    private String f12855u;

    /* renamed from: v  reason: collision with root package name */
    private long f12856v;

    /* renamed from: w  reason: collision with root package name */
    private long f12857w;

    /* renamed from: x  reason: collision with root package name */
    private long f12858x;

    /* renamed from: y  reason: collision with root package name */
    private long f12859y;

    /* renamed from: z  reason: collision with root package name */
    private long f12860z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(zzfy zzfyVar, String str) {
        Preconditions.m(zzfyVar);
        Preconditions.g(str);
        this.f12835a = zzfyVar;
        this.f12836b = str;
        zzfyVar.zzaz().c();
    }

    public final long A() {
        this.f12835a.zzaz().c();
        return 0L;
    }

    public final void B(long j10) {
        Preconditions.a(j10 >= 0);
        this.f12835a.zzaz().c();
        this.C |= this.f12841g != j10;
        this.f12841g = j10;
    }

    public final void C(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12842h != j10;
        this.f12842h = j10;
    }

    public final void D(boolean z10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12849o != z10;
        this.f12849o = z10;
    }

    public final void E(Boolean bool) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12852r, bool);
        this.f12852r = bool;
    }

    public final void F(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12839e, str);
        this.f12839e = str;
    }

    public final void G(List list) {
        this.f12835a.zzaz().c();
        if (zzg.a(this.f12854t, list)) {
            return;
        }
        this.C = true;
        this.f12854t = list != null ? new ArrayList(list) : null;
    }

    public final void H(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12855u, str);
        this.f12855u = str;
    }

    public final boolean I() {
        this.f12835a.zzaz().c();
        return this.f12850p;
    }

    public final boolean J() {
        this.f12835a.zzaz().c();
        return this.f12849o;
    }

    public final boolean K() {
        this.f12835a.zzaz().c();
        return this.C;
    }

    public final long L() {
        this.f12835a.zzaz().c();
        return this.f12845k;
    }

    public final long M() {
        this.f12835a.zzaz().c();
        return this.D;
    }

    public final long N() {
        this.f12835a.zzaz().c();
        return this.f12859y;
    }

    public final long O() {
        this.f12835a.zzaz().c();
        return this.f12860z;
    }

    public final long P() {
        this.f12835a.zzaz().c();
        return this.f12858x;
    }

    public final long Q() {
        this.f12835a.zzaz().c();
        return this.f12857w;
    }

    public final long R() {
        this.f12835a.zzaz().c();
        return this.A;
    }

    public final long S() {
        this.f12835a.zzaz().c();
        return this.f12856v;
    }

    public final long T() {
        this.f12835a.zzaz().c();
        return this.f12848n;
    }

    public final long U() {
        this.f12835a.zzaz().c();
        return this.f12853s;
    }

    public final long V() {
        this.f12835a.zzaz().c();
        return this.E;
    }

    public final long W() {
        this.f12835a.zzaz().c();
        return this.f12847m;
    }

    public final long X() {
        this.f12835a.zzaz().c();
        return this.f12843i;
    }

    public final long Y() {
        this.f12835a.zzaz().c();
        return this.f12841g;
    }

    public final long Z() {
        this.f12835a.zzaz().c();
        return this.f12842h;
    }

    public final String a() {
        this.f12835a.zzaz().c();
        return this.f12839e;
    }

    public final Boolean a0() {
        this.f12835a.zzaz().c();
        return this.f12852r;
    }

    public final String b() {
        this.f12835a.zzaz().c();
        return this.f12855u;
    }

    public final String b0() {
        this.f12835a.zzaz().c();
        return this.f12851q;
    }

    public final List c() {
        this.f12835a.zzaz().c();
        return this.f12854t;
    }

    public final String c0() {
        this.f12835a.zzaz().c();
        String str = this.B;
        y(null);
        return str;
    }

    public final void d() {
        this.f12835a.zzaz().c();
        this.C = false;
    }

    public final String d0() {
        this.f12835a.zzaz().c();
        return this.f12836b;
    }

    public final void e() {
        this.f12835a.zzaz().c();
        long j10 = this.f12841g + 1;
        if (j10 > 2147483647L) {
            this.f12835a.zzay().r().b("Bundle index overflow. appId", zzeo.u(this.f12836b));
            j10 = 0;
        }
        this.C = true;
        this.f12841g = j10;
    }

    public final String e0() {
        this.f12835a.zzaz().c();
        return this.f12837c;
    }

    public final void f(String str) {
        this.f12835a.zzaz().c();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ zzg.a(this.f12851q, str);
        this.f12851q = str;
    }

    public final String f0() {
        this.f12835a.zzaz().c();
        return this.f12846l;
    }

    public final void g(boolean z10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12850p != z10;
        this.f12850p = z10;
    }

    public final String g0() {
        this.f12835a.zzaz().c();
        return this.f12844j;
    }

    public final void h(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12837c, str);
        this.f12837c = str;
    }

    public final String h0() {
        this.f12835a.zzaz().c();
        return this.f12840f;
    }

    public final void i(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12846l, str);
        this.f12846l = str;
    }

    public final String i0() {
        this.f12835a.zzaz().c();
        return this.f12838d;
    }

    public final void j(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12844j, str);
        this.f12844j = str;
    }

    public final String j0() {
        this.f12835a.zzaz().c();
        return this.B;
    }

    public final void k(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12845k != j10;
        this.f12845k = j10;
    }

    public final void l(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.D != j10;
        this.D = j10;
    }

    public final void m(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12859y != j10;
        this.f12859y = j10;
    }

    public final void n(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12860z != j10;
        this.f12860z = j10;
    }

    public final void o(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12858x != j10;
        this.f12858x = j10;
    }

    public final void p(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12857w != j10;
        this.f12857w = j10;
    }

    public final void q(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.A != j10;
        this.A = j10;
    }

    public final void r(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12856v != j10;
        this.f12856v = j10;
    }

    public final void s(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12848n != j10;
        this.f12848n = j10;
    }

    public final void t(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12853s != j10;
        this.f12853s = j10;
    }

    public final void u(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.E != j10;
        this.E = j10;
    }

    public final void v(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.f12840f, str);
        this.f12840f = str;
    }

    public final void w(String str) {
        this.f12835a.zzaz().c();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.C |= true ^ zzg.a(this.f12838d, str);
        this.f12838d = str;
    }

    public final void x(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12847m != j10;
        this.f12847m = j10;
    }

    public final void y(String str) {
        this.f12835a.zzaz().c();
        this.C |= !zzg.a(this.B, str);
        this.B = str;
    }

    public final void z(long j10) {
        this.f12835a.zzaz().c();
        this.C |= this.f12843i != j10;
        this.f12843i = j10;
    }
}
