package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j2 {

    /* renamed from: a  reason: collision with root package name */
    protected c f7265a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f7266b;

    /* renamed from: c  reason: collision with root package name */
    protected SpannedString f7267c;

    /* renamed from: d  reason: collision with root package name */
    protected SpannedString f7268d;

    /* renamed from: e  reason: collision with root package name */
    protected String f7269e;

    /* renamed from: f  reason: collision with root package name */
    protected String f7270f;

    /* renamed from: g  reason: collision with root package name */
    protected int f7271g;

    /* renamed from: h  reason: collision with root package name */
    protected int f7272h;

    /* renamed from: i  reason: collision with root package name */
    protected int f7273i;

    /* renamed from: j  reason: collision with root package name */
    protected int f7274j;

    /* renamed from: k  reason: collision with root package name */
    protected int f7275k;

    /* renamed from: l  reason: collision with root package name */
    protected int f7276l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f7277m;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final c f7278a;

        /* renamed from: b  reason: collision with root package name */
        boolean f7279b;

        /* renamed from: c  reason: collision with root package name */
        SpannedString f7280c;

        /* renamed from: d  reason: collision with root package name */
        SpannedString f7281d;

        /* renamed from: e  reason: collision with root package name */
        String f7282e;

        /* renamed from: f  reason: collision with root package name */
        String f7283f;

        /* renamed from: g  reason: collision with root package name */
        int f7284g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f7285h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f7286i = -16777216;

        /* renamed from: j  reason: collision with root package name */
        int f7287j = -16777216;

        /* renamed from: k  reason: collision with root package name */
        int f7288k = 0;

        /* renamed from: l  reason: collision with root package name */
        int f7289l = 0;

        /* renamed from: m  reason: collision with root package name */
        boolean f7290m;

        public b(c cVar) {
            this.f7278a = cVar;
        }

        public b a(boolean z10) {
            this.f7279b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f7280c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f7281d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f7282e = str;
            return this;
        }

        public b a(String str) {
            this.f7283f = str;
            return this;
        }

        public b b(int i10) {
            this.f7289l = i10;
            return this;
        }

        public b c(int i10) {
            this.f7287j = i10;
            return this;
        }

        public b d(int i10) {
            this.f7286i = i10;
            return this;
        }

        public b a(int i10) {
            this.f7285h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f7290m = z10;
            return this;
        }

        public b a(Context context) {
            this.f7285h = R.drawable.applovin_ic_disclosure_arrow;
            this.f7289l = j0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public j2 a() {
            return new j2(this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f7298a;

        c(int i10) {
            this.f7298a = i10;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            if (this == DETAIL) {
                return R.layout.applovin_debugger_list_item_detail;
            }
            return R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f7298a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f7270f;
    }

    public String c() {
        return this.f7269e;
    }

    public int d() {
        return this.f7272h;
    }

    public int e() {
        return this.f7276l;
    }

    public SpannedString f() {
        return this.f7268d;
    }

    public int g() {
        return this.f7274j;
    }

    public int h() {
        return this.f7271g;
    }

    public int i() {
        return this.f7275k;
    }

    public int j() {
        return this.f7265a.b();
    }

    public SpannedString k() {
        return this.f7267c;
    }

    public int l() {
        return this.f7273i;
    }

    public int m() {
        return this.f7265a.c();
    }

    public boolean o() {
        return this.f7266b;
    }

    public boolean p() {
        return this.f7277m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j2(c cVar) {
        this.f7271g = 0;
        this.f7272h = 0;
        this.f7273i = -16777216;
        this.f7274j = -16777216;
        this.f7275k = 0;
        this.f7276l = 0;
        this.f7265a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private j2(b bVar) {
        this.f7271g = 0;
        this.f7272h = 0;
        this.f7273i = -16777216;
        this.f7274j = -16777216;
        this.f7275k = 0;
        this.f7276l = 0;
        this.f7265a = bVar.f7278a;
        this.f7266b = bVar.f7279b;
        this.f7267c = bVar.f7280c;
        this.f7268d = bVar.f7281d;
        this.f7269e = bVar.f7282e;
        this.f7270f = bVar.f7283f;
        this.f7271g = bVar.f7284g;
        this.f7272h = bVar.f7285h;
        this.f7273i = bVar.f7286i;
        this.f7274j = bVar.f7287j;
        this.f7275k = bVar.f7288k;
        this.f7276l = bVar.f7289l;
        this.f7277m = bVar.f7290m;
    }
}
