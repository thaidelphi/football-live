package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i extends k2 {

    /* renamed from: e  reason: collision with root package name */
    private final j f7171e;

    /* renamed from: f  reason: collision with root package name */
    private final k f7172f;

    /* renamed from: g  reason: collision with root package name */
    private final y7 f7173g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7174h;

    /* renamed from: i  reason: collision with root package name */
    private final List f7175i;

    /* renamed from: j  reason: collision with root package name */
    private final List f7176j;

    /* renamed from: k  reason: collision with root package name */
    private final List f7177k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends r3 {

        /* renamed from: p  reason: collision with root package name */
        private final y7 f7183p;

        b(y7 y7Var, String str, boolean z10) {
            super(y7Var.b().d(), i.this.f7386a);
            this.f7183p = y7Var;
            this.f7267c = StringUtils.createSpannedString(y7Var.b().a(), -16777216, 18, 1);
            this.f7268d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f7266b = z10;
        }

        @Override // com.applovin.impl.j2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.r3, com.applovin.impl.j2
        public boolean o() {
            return this.f7266b;
        }

        public y7 v() {
            return this.f7183p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar, k kVar, y7 y7Var, Context context) {
        super(context);
        this.f7171e = jVar;
        this.f7173g = y7Var;
        this.f7172f = kVar != null ? kVar : jVar.f();
        this.f7174h = kVar != null ? kVar.c() : jVar.d();
        this.f7175i = h();
        this.f7176j = e();
        this.f7177k = l();
        notifyDataSetChanged();
    }

    private j2 f() {
        return j2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private j2 g() {
        return j2.a().d("ID").c(this.f7171e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f7172f.b() != null) {
            arrayList.add(f());
        }
        if (this.f7173g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private j2 i() {
        return j2.a().d("Selected Network").c(this.f7173g.b().a()).a();
    }

    private List l() {
        y7 y7Var = this.f7173g;
        if (y7Var == null || !y7Var.d()) {
            List<y7> e8 = this.f7172f.e();
            ArrayList arrayList = new ArrayList(e8.size());
            for (y7 y7Var2 : e8) {
                y7 y7Var3 = this.f7173g;
                if (y7Var3 == null || y7Var3.b().c().equals(y7Var2.b().c())) {
                    arrayList.add(new b(y7Var2, null, this.f7173g == null));
                    for (s3 s3Var : y7Var2.c()) {
                        arrayList.add(j2.a().d(s3Var.a()).c(s3Var.b()).b(true).a());
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // com.applovin.impl.k2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    protected List c(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f7175i;
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return this.f7176j;
        }
        return this.f7177k;
    }

    @Override // com.applovin.impl.k2
    protected int d(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return this.f7175i.size();
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return this.f7176j.size();
        }
        return this.f7177k.size();
    }

    @Override // com.applovin.impl.k2
    protected j2 e(int i10) {
        if (i10 == a.INFO.ordinal()) {
            return new m4("INFO");
        }
        if (i10 == a.BIDDERS.ordinal()) {
            return new m4("BIDDERS");
        }
        return new m4("WATERFALL");
    }

    public k j() {
        return this.f7172f;
    }

    public String k() {
        return this.f7174h;
    }

    private j2 d() {
        return j2.a().d("Ad Format").c(this.f7171e.b()).a();
    }

    private List e() {
        y7 y7Var = this.f7173g;
        if (y7Var == null || y7Var.d()) {
            List<y7> a10 = this.f7172f.a();
            ArrayList arrayList = new ArrayList(a10.size());
            for (y7 y7Var2 : a10) {
                y7 y7Var3 = this.f7173g;
                if (y7Var3 == null || y7Var3.b().c().equals(y7Var2.b().c())) {
                    arrayList.add(new b(y7Var2, y7Var2.a() != null ? y7Var2.a().a() : "", this.f7173g == null));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
