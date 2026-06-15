package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class u6 {

    /* renamed from: p  reason: collision with root package name */
    private static final int f20940p = 0;

    /* renamed from: a  reason: collision with root package name */
    private h4 f20941a;

    /* renamed from: b  reason: collision with root package name */
    private int f20942b;

    /* renamed from: c  reason: collision with root package name */
    private long f20943c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20944d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<h7> f20945e;

    /* renamed from: f  reason: collision with root package name */
    private h7 f20946f;

    /* renamed from: g  reason: collision with root package name */
    private int f20947g;

    /* renamed from: h  reason: collision with root package name */
    private int f20948h;

    /* renamed from: i  reason: collision with root package name */
    private o5 f20949i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20950j;

    /* renamed from: k  reason: collision with root package name */
    private long f20951k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20952l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20953m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20954n;

    /* renamed from: o  reason: collision with root package name */
    private long f20955o;

    public u6() {
        this.f20941a = new h4();
        this.f20945e = new ArrayList<>();
    }

    public u6(int i10, long j10, boolean z10, h4 h4Var, int i11, o5 o5Var, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14, long j12) {
        this.f20945e = new ArrayList<>();
        this.f20942b = i10;
        this.f20943c = j10;
        this.f20944d = z10;
        this.f20941a = h4Var;
        this.f20947g = i11;
        this.f20948h = i12;
        this.f20949i = o5Var;
        this.f20950j = z11;
        this.f20951k = j11;
        this.f20952l = z12;
        this.f20953m = z13;
        this.f20954n = z14;
        this.f20955o = j12;
    }

    public int a() {
        return this.f20942b;
    }

    public h7 a(String str) {
        Iterator<h7> it = this.f20945e.iterator();
        while (it.hasNext()) {
            h7 next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(h7 h7Var) {
        if (h7Var != null) {
            this.f20945e.add(h7Var);
            if (this.f20946f == null || h7Var.isPlacementId(0)) {
                this.f20946f = h7Var;
            }
        }
    }

    public long b() {
        return this.f20943c;
    }

    public boolean c() {
        return this.f20944d;
    }

    public o5 d() {
        return this.f20949i;
    }

    public long e() {
        return this.f20951k;
    }

    public int f() {
        return this.f20948h;
    }

    public h4 g() {
        return this.f20941a;
    }

    public int h() {
        return this.f20947g;
    }

    public h7 i() {
        Iterator<h7> it = this.f20945e.iterator();
        while (it.hasNext()) {
            h7 next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        h7 h7Var = this.f20946f;
        return h7Var != null ? h7Var : new lb();
    }

    public long j() {
        return this.f20955o;
    }

    public boolean k() {
        return this.f20950j;
    }

    public boolean l() {
        return this.f20952l;
    }

    public boolean m() {
        return this.f20954n;
    }

    public boolean n() {
        return this.f20953m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f20942b + ", bidderExclusive=" + this.f20944d + '}';
    }
}
