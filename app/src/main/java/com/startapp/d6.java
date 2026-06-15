package com.startapp;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d6 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f21878a;

    /* renamed from: b  reason: collision with root package name */
    public final f6 f21879b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f21880c;

    /* renamed from: d  reason: collision with root package name */
    public final j2<NetworkDiagnosticConfig> f21881d;

    /* renamed from: e  reason: collision with root package name */
    public final a f21882e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final b f21883f = new b();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #3 {all -> 0x0167, blocks: (B:43:0x013c, B:45:0x0146, B:50:0x0151, B:55:0x015e), top: B:70:0x013c }] */
        /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.d6.a.run():void");
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements q3 {

        /* compiled from: Sta */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l3 f21886a;

            public a(l3 l3Var) {
                this.f21886a = l3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c cVar;
                String str;
                d6 d6Var = d6.this;
                l3 l3Var = this.f21886a;
                d6Var.getClass();
                Long l10 = l3Var.f22232h;
                String str2 = l3Var.f22235k;
                NetworkDiagnosticConfig networkDiagnosticConfig = null;
                boolean z10 = false;
                if (str2 != null) {
                    String[] split = str2.split(",");
                    if (split.length == 2 && (str = split[0]) != null && split[1] != null) {
                        try {
                            cVar = new c(Long.parseLong(str), Long.parseLong(split[1]));
                        } catch (NumberFormatException unused) {
                        }
                        if (l10 != null || cVar == null) {
                        }
                        try {
                            d6Var.f21879b.a().delete("traces", "requestId = ? AND statusId = ? AND timeMillis < ?", new String[]{String.valueOf(cVar.f21888a), String.valueOf(cVar.f21889b), String.valueOf(l10.longValue())});
                            return;
                        } catch (Throwable th) {
                            NetworkDiagnosticConfig call = d6Var.f21881d.call();
                            if (call != null && call.e()) {
                                networkDiagnosticConfig = call;
                            }
                            if (networkDiagnosticConfig != null && (networkDiagnosticConfig.a() & 4) == 4) {
                                z10 = true;
                            }
                            if (z10) {
                                l3.a(th);
                                return;
                            }
                            return;
                        }
                    }
                }
                cVar = null;
                if (l10 != null) {
                }
            }
        }

        public b() {
        }

        @Override // com.startapp.q3
        public final void a(l3 l3Var, int i10) {
            if (i10 == 1) {
                d6.this.f21880c.execute(new a(l3Var));
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f21888a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21889b;

        public c(long j10, long j11) {
            this.f21888a = j10;
            this.f21889b = j11;
        }
    }

    public d6(com.startapp.sdk.adsbase.e eVar, f6 f6Var, Executor executor, com.startapp.sdk.components.j jVar) {
        this.f21878a = eVar;
        this.f21879b = f6Var;
        this.f21880c = executor;
        this.f21881d = jVar;
    }
}
