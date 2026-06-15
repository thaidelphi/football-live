package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.b9;
import com.ironsource.eh;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.u3;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s3 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20061a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private static final String f20062b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f20063a;

        /* renamed from: b  reason: collision with root package name */
        private final eh.e f20064b;

        /* renamed from: c  reason: collision with root package name */
        private final String f20065c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f20066d;

        public a(String name, eh.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.n.f(name, "name");
            kotlin.jvm.internal.n.f(productType, "productType");
            kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.n.f(params, "params");
            this.f20063a = name;
            this.f20064b = productType;
            this.f20065c = demandSourceName;
            this.f20066d = params;
        }

        public static /* synthetic */ a a(a aVar, String str, eh.e eVar, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f20063a;
            }
            if ((i10 & 2) != 0) {
                eVar = aVar.f20064b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f20065c;
            }
            if ((i10 & 8) != 0) {
                jSONObject = aVar.f20066d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }

        public final a a(String name, eh.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.n.f(name, "name");
            kotlin.jvm.internal.n.f(productType, "productType");
            kotlin.jvm.internal.n.f(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.n.f(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        public final String a() {
            return this.f20063a;
        }

        public final eh.e b() {
            return this.f20064b;
        }

        public final String c() {
            return this.f20065c;
        }

        public final JSONObject d() {
            return this.f20066d;
        }

        public final String e() {
            return this.f20065c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                if (this == obj) {
                    return true;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.n.a(this.f20063a, aVar.f20063a) && this.f20064b == aVar.f20064b && kotlin.jvm.internal.n.a(this.f20065c, aVar.f20065c) && kotlin.jvm.internal.n.a(this.f20066d.toString(), aVar.f20066d.toString());
            }
            return false;
        }

        public final String f() {
            return this.f20063a;
        }

        public final JSONObject g() {
            return this.f20066d;
        }

        public final eh.e h() {
            return this.f20064b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() {
            JSONObject put = new JSONObject(this.f20066d.toString()).put(b9.h.f16662m, this.f20064b).put("demandSourceName", this.f20065c);
            kotlin.jvm.internal.n.e(put, "JSONObject(params.toStri…eName\", demandSourceName)");
            return put;
        }

        public String toString() {
            return "CallbackResult(name=" + this.f20063a + ", productType=" + this.f20064b + ", demandSourceName=" + this.f20065c + ", params=" + this.f20066d + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20067a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MeasurementManager f20069c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f20070d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MotionEvent f20071e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, m8.d<? super c> dVar) {
            super(2, dVar);
            this.f20069c = measurementManager;
            this.f20070d = uri;
            this.f20071e = motionEvent;
        }

        @Override // t8.p
        /* renamed from: a */
        public final Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new c(this.f20069c, this.f20070d, this.f20071e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f20067a;
            if (i10 == 0) {
                i8.p.b(obj);
                s3 s3Var = s3.this;
                MeasurementManager measurementManager = this.f20069c;
                Uri uri = this.f20070d;
                kotlin.jvm.internal.n.e(uri, "uri");
                MotionEvent motionEvent = this.f20071e;
                this.f20067a = 1;
                if (s3Var.a(measurementManager, uri, motionEvent, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements t8.p<d9.o0, m8.d<? super i8.w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20072a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MeasurementManager f20074c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f20075d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MeasurementManager measurementManager, Uri uri, m8.d<? super d> dVar) {
            super(2, dVar);
            this.f20074c = measurementManager;
            this.f20075d = uri;
        }

        @Override // t8.p
        /* renamed from: a */
        public final Object invoke(d9.o0 o0Var, m8.d<? super i8.w> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(i8.w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<i8.w> create(Object obj, m8.d<?> dVar) {
            return new d(this.f20074c, this.f20075d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.f20072a;
            if (i10 == 0) {
                i8.p.b(obj);
                s3 s3Var = s3.this;
                MeasurementManager measurementManager = this.f20074c;
                Uri uri = this.f20075d;
                kotlin.jvm.internal.n.e(uri, "uri");
                this.f20072a = 1;
                if (s3Var.a(measurementManager, uri, null, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            return i8.w.f26638a;
        }
    }

    static {
        String name = b.class.getName();
        kotlin.jvm.internal.n.e(name, "this::class.java.name");
        f20062b = name;
    }

    private final a a(Context context, u3.a aVar) {
        MeasurementManager a10 = k1.a(context);
        if (a10 == null) {
            Logger.i(f20062b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof u3.a.b) {
                return a(aVar, a10);
            }
            if (aVar instanceof u3.a.C0238a) {
                return a((u3.a.C0238a) aVar, a10);
            }
            throw new i8.l();
        } catch (Exception e8) {
            o9.d().a(e8);
            return a(aVar, "failed to handle attribution, message: " + e8.getMessage());
        }
    }

    private final a a(u3.a.C0238a c0238a, MeasurementManager measurementManager) {
        Uri parse = Uri.parse(c0238a.getUrl());
        long uptimeMillis = SystemClock.uptimeMillis();
        d9.j.b(null, new c(measurementManager, parse, MotionEvent.obtain(uptimeMillis, uptimeMillis, c0238a.m(), c0238a.n().c(), c0238a.n().d(), c0238a.o()), null), 1, null);
        return a(c0238a);
    }

    private final a a(u3.a aVar) {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof u3.a.C0238a ? c9.f16851d : "impression"));
        String c10 = aVar.c();
        eh.e b10 = aVar.b();
        String d10 = aVar.d();
        kotlin.jvm.internal.n.e(params, "params");
        return new a(c10, b10, d10, params);
    }

    private final a a(u3.a aVar, MeasurementManager measurementManager) {
        d9.j.b(null, new d(measurementManager, Uri.parse(aVar.getUrl()), null), 1, null);
        return a(aVar);
    }

    private final a a(u3 u3Var, String str) {
        JSONObject put = new JSONObject().put("reason", str).put("type", u3Var instanceof u3.a.C0238a ? c9.f16851d : "impression");
        String a10 = u3Var.a();
        eh.e b10 = u3Var.b();
        String d10 = u3Var.d();
        JSONObject put2 = new JSONObject().put("params", put);
        kotlin.jvm.internal.n.e(put2, "JSONObject().put(\"params\", payload)");
        return new a(a10, b10, d10, put2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, m8.d<? super i8.w> dVar) {
        m8.d b10;
        Object c10;
        Object c11;
        b10 = n8.c.b(dVar);
        m8.i iVar = new m8.i(b10);
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), t3.a(iVar));
        Object a10 = iVar.a();
        c10 = n8.d.c();
        if (a10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = n8.d.c();
        return a10 == c11 ? a10 : i8.w.f26638a;
    }

    public final a a(Context context, u3 message) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(message, "message");
        if (message instanceof u3.a) {
            return a(context, (u3.a) message);
        }
        throw new i8.l();
    }
}
