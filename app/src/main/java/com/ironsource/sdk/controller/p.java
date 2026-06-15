package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.o9;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.to;
import com.ironsource.uo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface p {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        private b f20435a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, uo openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.b(), new k.a());
            kotlin.jvm.internal.n.f(method, "method");
            kotlin.jvm.internal.n.f(openUrlConfigurations, "openUrlConfigurations");
        }

        public a(String method, uo openUrlConfigurations, com.ironsource.h activityIntentFactory, com.ironsource.g actionIntentFactory) {
            b aVar;
            kotlin.jvm.internal.n.f(method, "method");
            kotlin.jvm.internal.n.f(openUrlConfigurations, "openUrlConfigurations");
            kotlin.jvm.internal.n.f(activityIntentFactory, "activityIntentFactory");
            kotlin.jvm.internal.n.f(actionIntentFactory, "actionIntentFactory");
            int hashCode = method.hashCode();
            if (hashCode == -1455867212) {
                if (method.equals(b9.h.J)) {
                    aVar = new b.a(openUrlConfigurations, actionIntentFactory);
                }
                aVar = new b.C0234b(method);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && method.equals(b9.h.K)) {
                    aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0234b(method);
            } else {
                if (method.equals(b9.h.U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0234b(method);
            }
            this.f20435a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, to openUrl) {
            kotlin.jvm.internal.n.f(context, "context");
            kotlin.jvm.internal.n.f(openUrl, "openUrl");
            try {
                return this.f20435a.a(context, openUrl);
            } catch (Exception e8) {
                o9.d().a(e8);
                String message = e8.getMessage();
                String message2 = message == null || message.length() == 0 ? "" : e8.getMessage();
                kotlin.jvm.internal.n.c(message2);
                return new c.a(message2);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final uo f20436a;

            /* renamed from: b  reason: collision with root package name */
            private final com.ironsource.g f20437b;

            public a(uo configurations, com.ironsource.g intentFactory) {
                kotlin.jvm.internal.n.f(configurations, "configurations");
                kotlin.jvm.internal.n.f(intentFactory, "intentFactory");
                this.f20436a = configurations;
                this.f20437b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, to openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent a10 = this.f20437b.a();
                a10.setData(Uri.parse(openUrl.d()));
                String c10 = openUrl.c();
                if (!(c10 == null || c10.length() == 0)) {
                    a10 = a10.setPackage(openUrl.c());
                    kotlin.jvm.internal.n.e(a10, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    a10 = a10.addFlags(this.f20436a.c());
                }
                kotlin.jvm.internal.n.e(a10, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(a10);
                return c.b.f20444a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0234b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f20438a;

            public C0234b(String method) {
                kotlin.jvm.internal.n.f(method, "method");
                this.f20438a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, to openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                return new c.a("method " + this.f20438a + " is unsupported");
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            private final uo f20439a;

            /* renamed from: b  reason: collision with root package name */
            private final com.ironsource.h f20440b;

            public c(uo configurations, com.ironsource.h intentFactory) {
                kotlin.jvm.internal.n.f(configurations, "configurations");
                kotlin.jvm.internal.n.f(intentFactory, "intentFactory");
                this.f20439a = configurations;
                this.f20440b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, to openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f20440b).a(this.f20439a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f20444a;
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class d implements b {

            /* renamed from: a  reason: collision with root package name */
            private final uo f20441a;

            /* renamed from: b  reason: collision with root package name */
            private final com.ironsource.h f20442b;

            public d(uo configurations, com.ironsource.h intentFactory) {
                kotlin.jvm.internal.n.f(configurations, "configurations");
                kotlin.jvm.internal.n.f(intentFactory, "intentFactory");
                this.f20441a = configurations;
                this.f20442b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, to openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f20442b).a(this.f20441a.c()).a(openUrl.d()).a(this.f20441a.d()).b(true).a(context));
                return c.b.f20444a;
            }
        }

        c a(Context context, to toVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class c {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f20443a;

            public a() {
                this(null, 1, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
                this.f20443a = errorMessage;
            }

            public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.h hVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f20443a;
                }
                return aVar.a(str);
            }

            public final a a(String errorMessage) {
                kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public final String a() {
                return this.f20443a;
            }

            public final String b() {
                return this.f20443a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f20443a, ((a) obj).f20443a);
            }

            public int hashCode() {
                return this.f20443a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.f20443a + ')';
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f20444a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    c a(Context context, to toVar);
}
