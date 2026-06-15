package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetIsFileCache.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(cacheRepository, "cacheRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.String r12, m8.d<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r1 = r0.J$0
            java.lang.Object r12 = r0.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetIsFileCache r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache) r0
            i8.p.b(r13)
            goto L65
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            i8.p.b(r13)
            c9.j r13 = c9.j.f5618a
            long r4 = r13.a()
            java.lang.String r13 = "/"
            r2 = 0
            r6 = 2
            java.lang.String r13 = b9.f.p0(r12, r13, r2, r6, r2)
            java.lang.String r7 = "."
            java.lang.String r13 = b9.f.t0(r13, r7, r2, r6, r2)
            com.unity3d.ads.core.data.repository.CacheRepository r2 = r11.cacheRepository
            r0.L$0 = r11
            r0.L$1 = r12
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r13 = r2.doesFileExist(r13, r0)
            if (r13 != r1) goto L63
            return r1
        L63:
            r0 = r11
            r1 = r4
        L65:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r0.sendDiagnosticEvent
            if (r13 == 0) goto L72
            java.lang.String r0 = "native_show_is_file_cached_success_time"
            goto L74
        L72:
            java.lang.String r0 = "native_show_is_file_cached_failure_time"
        L74:
            r4 = r0
            c9.j$a r0 = c9.j.a.b(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)
            java.lang.Double r5 = kotlin.coroutines.jvm.internal.b.b(r0)
            java.lang.String r0 = "url"
            i8.n r12 = i8.s.a(r0, r12)
            java.util.Map r6 = j8.g0.d(r12)
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.b.a(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke(java.lang.String, m8.d):java.lang.Object");
    }
}
