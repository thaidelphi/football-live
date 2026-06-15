package com.ironsource;

import com.ironsource.mediationsdk.model.InterstitialPlacement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class mj {

    /* renamed from: n  reason: collision with root package name */
    private static final int f19233n = 0;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<InterstitialPlacement> f19234a;

    /* renamed from: b  reason: collision with root package name */
    private h4 f19235b;

    /* renamed from: c  reason: collision with root package name */
    private int f19236c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19237d;

    /* renamed from: e  reason: collision with root package name */
    private int f19238e;

    /* renamed from: f  reason: collision with root package name */
    private int f19239f;

    /* renamed from: g  reason: collision with root package name */
    private o5 f19240g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19241h;

    /* renamed from: i  reason: collision with root package name */
    private long f19242i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19243j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f19244k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f19245l;

    /* renamed from: m  reason: collision with root package name */
    private InterstitialPlacement f19246m;

    public mj() {
        this.f19234a = new ArrayList<>();
        this.f19235b = new h4();
        this.f19240g = new o5();
    }

    public mj(int i10, boolean z10, int i11, h4 h4Var, o5 o5Var, int i12, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f19234a = new ArrayList<>();
        this.f19236c = i10;
        this.f19237d = z10;
        this.f19238e = i11;
        this.f19235b = h4Var;
        this.f19240g = o5Var;
        this.f19243j = z12;
        this.f19244k = z13;
        this.f19239f = i12;
        this.f19241h = z11;
        this.f19242i = j10;
        this.f19245l = z14;
    }

    public InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.f19234a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f19246m;
    }

    public InterstitialPlacement a(String str) {
        Iterator<InterstitialPlacement> it = this.f19234a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(InterstitialPlacement interstitialPlacement) {
        if (interstitialPlacement != null) {
            this.f19234a.add(interstitialPlacement);
            if (this.f19246m == null || interstitialPlacement.isPlacementId(0)) {
                this.f19246m = interstitialPlacement;
            }
        }
    }

    public int b() {
        return this.f19239f;
    }

    public int c() {
        return this.f19236c;
    }

    public int d() {
        return this.f19238e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f19238e);
    }

    public boolean f() {
        return this.f19237d;
    }

    public o5 g() {
        return this.f19240g;
    }

    public long h() {
        return this.f19242i;
    }

    public h4 i() {
        return this.f19235b;
    }

    public boolean j() {
        return this.f19241h;
    }

    public boolean k() {
        return this.f19243j;
    }

    public boolean l() {
        return this.f19245l;
    }

    public boolean m() {
        return this.f19244k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f19236c + ", bidderExclusive=" + this.f19237d + '}';
    }
}
