package com.google.firebase.messaging;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class a implements k6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final k6.a f14931a = new a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class C0196a implements j6.d<x6.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0196a f14932a = new C0196a();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f14933b = j6.c.a("projectNumber").b(m6.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final j6.c f14934c = j6.c.a("messageId").b(m6.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final j6.c f14935d = j6.c.a("instanceId").b(m6.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final j6.c f14936e = j6.c.a("messageType").b(m6.a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final j6.c f14937f = j6.c.a("sdkPlatform").b(m6.a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final j6.c f14938g = j6.c.a(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME).b(m6.a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final j6.c f14939h = j6.c.a("collapseKey").b(m6.a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final j6.c f14940i = j6.c.a(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).b(m6.a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final j6.c f14941j = j6.c.a("ttl").b(m6.a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final j6.c f14942k = j6.c.a("topic").b(m6.a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final j6.c f14943l = j6.c.a("bulkId").b(m6.a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final j6.c f14944m = j6.c.a("event").b(m6.a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final j6.c f14945n = j6.c.a("analyticsLabel").b(m6.a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final j6.c f14946o = j6.c.a("campaignId").b(m6.a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final j6.c f14947p = j6.c.a("composerLabel").b(m6.a.b().c(15).a()).a();

        private C0196a() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(x6.a aVar, j6.e eVar) throws IOException {
            eVar.b(f14933b, aVar.l());
            eVar.d(f14934c, aVar.h());
            eVar.d(f14935d, aVar.g());
            eVar.d(f14936e, aVar.i());
            eVar.d(f14937f, aVar.m());
            eVar.d(f14938g, aVar.j());
            eVar.d(f14939h, aVar.d());
            eVar.a(f14940i, aVar.k());
            eVar.a(f14941j, aVar.o());
            eVar.d(f14942k, aVar.n());
            eVar.b(f14943l, aVar.b());
            eVar.d(f14944m, aVar.f());
            eVar.d(f14945n, aVar.a());
            eVar.b(f14946o, aVar.c());
            eVar.d(f14947p, aVar.e());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class b implements j6.d<x6.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f14948a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f14949b = j6.c.a("messagingClientEvent").b(m6.a.b().c(1).a()).a();

        private b() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(x6.b bVar, j6.e eVar) throws IOException {
            eVar.d(f14949b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class c implements j6.d<g0> {

        /* renamed from: a  reason: collision with root package name */
        static final c f14950a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final j6.c f14951b = j6.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // j6.d
        /* renamed from: b */
        public void a(g0 g0Var, j6.e eVar) throws IOException {
            eVar.d(f14951b, g0Var.b());
        }
    }

    private a() {
    }

    @Override // k6.a
    public void a(k6.b<?> bVar) {
        bVar.a(g0.class, c.f14950a);
        bVar.a(x6.b.class, b.f14948a);
        bVar.a(x6.a.class, C0196a.f14932a);
    }
}
