package com.ironsource.mediationsdk;

import com.ironsource.f5;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final IronSource.AD_UNIT f18826a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f5> f18827b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18828c;

    /* renamed from: d  reason: collision with root package name */
    private String f18829d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18830e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f18831f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f18832g;

    /* renamed from: h  reason: collision with root package name */
    private int f18833h;

    /* renamed from: i  reason: collision with root package name */
    private h f18834i;

    /* renamed from: j  reason: collision with root package name */
    private IronSourceSegment f18835j;

    /* renamed from: k  reason: collision with root package name */
    private String f18836k;

    /* renamed from: l  reason: collision with root package name */
    private ISBannerSize f18837l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f18838m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f18839n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18840o;

    /* renamed from: p  reason: collision with root package name */
    private String f18841p;

    /* renamed from: q  reason: collision with root package name */
    private String f18842q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f18843r;

    public i(IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f18826a = adUnit;
        this.f18827b = new ArrayList<>();
        this.f18829d = "";
        this.f18831f = new HashMap();
        this.f18832g = new ArrayList();
        this.f18833h = -1;
        this.f18836k = "";
    }

    public static /* synthetic */ i a(i iVar, IronSource.AD_UNIT ad_unit, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ad_unit = iVar.f18826a;
        }
        return iVar.a(ad_unit);
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void l() {
    }

    public final IronSource.AD_UNIT a() {
        return this.f18826a;
    }

    public final i a(IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        return new i(adUnit);
    }

    public final void a(int i10) {
        this.f18833h = i10;
    }

    public final void a(f5 instanceInfo) {
        kotlin.jvm.internal.n.f(instanceInfo, "instanceInfo");
        this.f18827b.add(instanceInfo);
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.f18837l = iSBannerSize;
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f18835j = ironSourceSegment;
    }

    public final void a(h hVar) {
        this.f18834i = hVar;
    }

    public final void a(Boolean bool) {
        this.f18843r = bool;
    }

    public final void a(String str) {
        this.f18842q = str;
    }

    public final void a(List<String> list) {
        kotlin.jvm.internal.n.f(list, "<set-?>");
        this.f18832g = list;
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f18831f = map;
    }

    public final void a(boolean z10) {
        this.f18838m = z10;
    }

    public final String b() {
        return this.f18842q;
    }

    public final void b(String str) {
        this.f18841p = str;
    }

    public final void b(boolean z10) {
        this.f18830e = z10;
    }

    public final IronSource.AD_UNIT c() {
        return this.f18826a;
    }

    public final void c(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f18829d = str;
    }

    public final void c(boolean z10) {
        this.f18828c = z10;
    }

    public final String d() {
        return this.f18841p;
    }

    public final void d(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f18836k = str;
    }

    public final void d(boolean z10) {
        this.f18839n = z10;
    }

    public final h e() {
        return this.f18834i;
    }

    public final void e(boolean z10) {
        this.f18840o = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f18826a == ((i) obj).f18826a;
    }

    public final ISBannerSize f() {
        return this.f18837l;
    }

    public final Map<String, Object> g() {
        return this.f18831f;
    }

    public int hashCode() {
        return this.f18826a.hashCode();
    }

    public final String i() {
        return this.f18829d;
    }

    public final ArrayList<f5> j() {
        return this.f18827b;
    }

    public final List<String> k() {
        return this.f18832g;
    }

    public final IronSourceSegment m() {
        return this.f18835j;
    }

    public final int n() {
        return this.f18833h;
    }

    public final boolean o() {
        return this.f18839n;
    }

    public final boolean p() {
        return this.f18840o;
    }

    public final String q() {
        return this.f18836k;
    }

    public final boolean r() {
        return this.f18838m;
    }

    public final boolean s() {
        return this.f18830e;
    }

    public final Boolean t() {
        return this.f18843r;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f18826a + ')';
    }

    public final boolean u() {
        return this.f18828c;
    }
}
