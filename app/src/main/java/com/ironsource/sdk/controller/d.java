package com.ironsource.sdk.controller;

import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.er;
import com.ironsource.gb;
import com.ironsource.gh;
import com.ironsource.lh;
import com.ironsource.nh;
import com.ironsource.o9;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: h  reason: collision with root package name */
    static final String f20238h = "controllerSourceData";

    /* renamed from: i  reason: collision with root package name */
    private static final String f20239i = "next_";

    /* renamed from: j  reason: collision with root package name */
    private static final String f20240j = "fallback_";

    /* renamed from: k  reason: collision with root package name */
    private static final String f20241k = "controllerSourceCode";

    /* renamed from: a  reason: collision with root package name */
    private long f20242a;

    /* renamed from: b  reason: collision with root package name */
    private int f20243b;

    /* renamed from: c  reason: collision with root package name */
    private c f20244c;

    /* renamed from: d  reason: collision with root package name */
    private EnumC0231d f20245d = EnumC0231d.NONE;

    /* renamed from: e  reason: collision with root package name */
    private String f20246e;

    /* renamed from: f  reason: collision with root package name */
    private String f20247f;

    /* renamed from: g  reason: collision with root package name */
    private gb f20248g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends JSONObject {
        a() throws JSONException {
            putOpt(b9.a.f16539j, Integer.valueOf(d.this.f20243b));
            putOpt(d.f20241k, Integer.valueOf(d.this.f20245d.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20250a;

        static {
            int[] iArr = new int[c.values().length];
            f20250a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20250a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20250a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum EnumC0231d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: a  reason: collision with root package name */
        private int f20262a;

        EnumC0231d(int i10) {
            this.f20262a = i10;
        }

        public int a() {
            return this.f20262a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(JSONObject jSONObject, String str, String str2, gb gbVar) {
        int optInt = jSONObject.optInt(b9.a.f16539j, -1);
        this.f20243b = optInt;
        this.f20244c = a(optInt);
        this.f20246e = str;
        this.f20247f = str2;
        this.f20248g = gbVar;
    }

    private c a(int i10) {
        return i10 != 1 ? i10 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private void a(nh nhVar) {
        if (this.f20248g.c()) {
            return;
        }
        this.f20248g.a(nhVar, this.f20247f);
    }

    private void a(EnumC0231d enumC0231d) {
        gh a10 = new gh().a(cc.f16883y, Integer.valueOf(this.f20243b)).a(cc.f16884z, Integer.valueOf(enumC0231d.a()));
        if (this.f20242a > 0) {
            a10.a(cc.B, Long.valueOf(System.currentTimeMillis() - this.f20242a));
        }
        lh.a(er.f17315w, a10.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e8) {
            o9.d().a(e8);
            return false;
        }
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            nh g10 = g();
            if (g10.exists()) {
                nh h10 = h();
                if (h10.exists()) {
                    h10.delete();
                }
                IronSourceStorageUtils.renameFile(g10.getPath(), h10.getPath());
            }
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private nh h() {
        return new nh(this.f20246e, "fallback_mobileController.html");
    }

    private nh i() {
        return new nh(this.f20246e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        gh a10 = new gh().a(cc.f16883y, Integer.valueOf(this.f20243b));
        if (this.f20242a > 0) {
            a10.a(cc.B, Long.valueOf(System.currentTimeMillis() - this.f20242a));
        }
        lh.a(er.f17316x, a10.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(gh ghVar) {
        ghVar.a(cc.f16883y, Integer.valueOf(this.f20243b));
        lh.a(er.f17314v, ghVar.a());
        this.f20242a = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f20244c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0231d enumC0231d = EnumC0231d.CONTROLLER_FROM_SERVER;
        this.f20245d = enumC0231d;
        a(enumC0231d);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f20244c != c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK || !a()) {
            l();
            runnable2.run();
            return;
        }
        EnumC0231d enumC0231d = EnumC0231d.FALLBACK_CONTROLLER_RECOVERY;
        this.f20245d = enumC0231d;
        a(enumC0231d);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject f() throws JSONException {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nh g() {
        return new nh(this.f20246e, b9.f16511f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        nh nhVar;
        int i10 = b.f20250a[this.f20244c.ordinal()];
        if (i10 == 1) {
            e();
            nhVar = new nh(this.f20246e, SDKUtils.getFileName(this.f20247f));
        } else if (i10 != 2) {
            if (i10 == 3) {
                try {
                    nh g10 = g();
                    nh i11 = i();
                    if (!i11.exists() && !g10.exists()) {
                        a(new nh(this.f20246e, SDKUtils.getFileName(this.f20247f)));
                        return false;
                    } else if (!i11.exists() && g10.exists()) {
                        EnumC0231d enumC0231d = EnumC0231d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f20245d = enumC0231d;
                        a(enumC0231d);
                        a(new nh(this.f20246e, i11.getName()));
                        return true;
                    } else {
                        c();
                        if (b()) {
                            EnumC0231d enumC0231d2 = EnumC0231d.PREPARED_CONTROLLER_LOADED;
                            this.f20245d = enumC0231d2;
                            a(enumC0231d2);
                            d();
                            a(new nh(this.f20246e, i11.getName()));
                            return true;
                        } else if (!a()) {
                            a(new nh(this.f20246e, SDKUtils.getFileName(this.f20247f)));
                            return false;
                        } else {
                            EnumC0231d enumC0231d3 = EnumC0231d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f20245d = enumC0231d3;
                            a(enumC0231d3);
                            a(new nh(this.f20246e, i11.getName()));
                            return true;
                        }
                    }
                } catch (Exception e8) {
                    o9.d().a(e8);
                }
            }
            return false;
        } else {
            c();
            nhVar = new nh(this.f20246e, SDKUtils.getFileName(this.f20247f));
        }
        a(nhVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f20245d != EnumC0231d.NONE;
    }
}
