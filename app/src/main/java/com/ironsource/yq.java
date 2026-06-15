package com.ironsource;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class yq {

    /* renamed from: o  reason: collision with root package name */
    private static final int f21567o = 0;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<Placement> f21568a;

    /* renamed from: b  reason: collision with root package name */
    private h4 f21569b;

    /* renamed from: c  reason: collision with root package name */
    private int f21570c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21571d;

    /* renamed from: e  reason: collision with root package name */
    private int f21572e;

    /* renamed from: f  reason: collision with root package name */
    private int f21573f;

    /* renamed from: g  reason: collision with root package name */
    private int f21574g;

    /* renamed from: h  reason: collision with root package name */
    private long f21575h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21576i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f21577j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21578k;

    /* renamed from: l  reason: collision with root package name */
    private Placement f21579l;

    /* renamed from: m  reason: collision with root package name */
    private o5 f21580m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21581n;

    public yq() {
        this.f21568a = new ArrayList<>();
        this.f21569b = new h4();
    }

    public yq(int i10, boolean z10, int i11, int i12, h4 h4Var, o5 o5Var, int i13, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f21568a = new ArrayList<>();
        this.f21570c = i10;
        this.f21571d = z10;
        this.f21572e = i11;
        this.f21569b = h4Var;
        this.f21573f = i12;
        this.f21580m = o5Var;
        this.f21574g = i13;
        this.f21581n = z11;
        this.f21575h = j10;
        this.f21576i = z12;
        this.f21577j = z13;
        this.f21578k = z14;
    }

    public Placement a() {
        Iterator<Placement> it = this.f21568a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f21579l;
    }

    public Placement a(String str) {
        Iterator<Placement> it = this.f21568a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public void a(Placement placement) {
        if (placement != null) {
            this.f21568a.add(placement);
            if (this.f21579l == null || placement.isPlacementId(0)) {
                this.f21579l = placement;
            }
        }
    }

    public int b() {
        return this.f21574g;
    }

    public int c() {
        return this.f21573f;
    }

    public boolean d() {
        return this.f21581n;
    }

    public ArrayList<Placement> e() {
        return this.f21568a;
    }

    public boolean f() {
        return this.f21576i;
    }

    public int g() {
        return this.f21570c;
    }

    public int h() {
        return this.f21572e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f21572e);
    }

    public boolean j() {
        return this.f21571d;
    }

    public o5 k() {
        return this.f21580m;
    }

    public long l() {
        return this.f21575h;
    }

    public h4 m() {
        return this.f21569b;
    }

    public boolean n() {
        return this.f21578k;
    }

    public boolean o() {
        return this.f21577j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f21570c + ", bidderExclusive=" + this.f21571d + '}';
    }
}
