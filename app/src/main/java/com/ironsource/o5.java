package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o5 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19505a;

    /* renamed from: b  reason: collision with root package name */
    private String f19506b;

    /* renamed from: c  reason: collision with root package name */
    private String f19507c;

    /* renamed from: d  reason: collision with root package name */
    private String f19508d;

    /* renamed from: e  reason: collision with root package name */
    private int f19509e;

    /* renamed from: f  reason: collision with root package name */
    private int f19510f;

    /* renamed from: g  reason: collision with root package name */
    private int f19511g;

    /* renamed from: h  reason: collision with root package name */
    private long f19512h;

    /* renamed from: i  reason: collision with root package name */
    private long f19513i;

    /* renamed from: j  reason: collision with root package name */
    private long f19514j;

    /* renamed from: k  reason: collision with root package name */
    private long f19515k;

    /* renamed from: l  reason: collision with root package name */
    private long f19516l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f19517m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<String> f19518n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f19519o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f19520p;

    /* renamed from: q  reason: collision with root package name */
    private int f19521q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19522r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f19523s;

    public o5() {
        this.f19506b = "";
        this.f19507c = "";
        this.f19508d = "";
        this.f19513i = 0L;
        this.f19514j = 0L;
        this.f19515k = 0L;
        this.f19516l = 0L;
        this.f19517m = true;
        this.f19518n = new ArrayList<>();
        this.f19511g = 0;
        this.f19519o = false;
        this.f19520p = false;
        this.f19521q = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o5(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15) {
        this.f19506b = str;
        this.f19507c = str2;
        this.f19508d = str3;
        this.f19509e = i10;
        this.f19510f = i11;
        this.f19512h = j10;
        this.f19505a = z13;
        this.f19513i = j11;
        this.f19514j = j12;
        this.f19515k = j13;
        this.f19516l = j14;
        this.f19517m = z10;
        this.f19511g = i12;
        this.f19518n = new ArrayList<>();
        this.f19519o = z11;
        this.f19520p = z12;
        this.f19521q = i13;
        this.f19522r = z14;
        this.f19523s = z15;
    }

    public String a() {
        return this.f19506b;
    }

    public String a(boolean z10) {
        return z10 ? this.f19508d : this.f19507c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19518n.add(str);
    }

    public long b() {
        return this.f19514j;
    }

    public int c() {
        return this.f19510f;
    }

    public int d() {
        return this.f19521q;
    }

    public boolean e() {
        return this.f19517m;
    }

    public ArrayList<String> f() {
        return this.f19518n;
    }

    public int g() {
        return this.f19509e;
    }

    public boolean h() {
        return this.f19505a;
    }

    public int i() {
        return this.f19511g;
    }

    public long j() {
        return this.f19515k;
    }

    public long k() {
        return this.f19513i;
    }

    public long l() {
        return this.f19516l;
    }

    public long m() {
        return this.f19512h;
    }

    public boolean n() {
        return this.f19519o;
    }

    public boolean o() {
        return this.f19520p;
    }

    public boolean p() {
        return this.f19523s;
    }

    public boolean q() {
        return this.f19522r;
    }
}
