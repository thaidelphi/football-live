package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import d9.o0;
import i8.o;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitializeStateLoadCache.kt */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializeStateLoadCache$doWork$2 extends l implements p<o0, d<? super o<? extends InitializeStateLoadCache.LoadCacheResult>>, Object> {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, d<? super InitializeStateLoadCache$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super o<InitializeStateLoadCache.LoadCacheResult>> dVar) {
        return ((InitializeStateLoadCache$doWork$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super o<? extends InitializeStateLoadCache.LoadCacheResult>> dVar) {
        return invoke2(o0Var, (d<? super o<InitializeStateLoadCache.LoadCacheResult>>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x0063, CancellationException -> 0x0090, TryCatch #2 {CancellationException -> 0x0090, all -> 0x0063, blocks: (B:5:0x000e, B:7:0x001c, B:22:0x005e, B:8:0x0024, B:10:0x003b, B:16:0x004f, B:17:0x0054, B:21:0x005a), top: B:38:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            n8.b.c()
            int r0 = r5.label
            if (r0 != 0) goto L92
            i8.p.b(r6)
            com.unity3d.services.core.domain.task.InitializeStateLoadCache r6 = r5.this$0
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params r0 = r5.$params
            i8.o$a r1 = i8.o.f26626b     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            java.lang.String r1 = "Unity Ads init: check if webapp can be loaded from local cache"
            com.unity3d.services.core.log.DeviceLog.debug(r1)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            byte[] r6 = com.unity3d.services.core.domain.task.InitializeStateLoadCache.access$getWebViewData(r6)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            r1 = 1
            if (r6 != 0) goto L24
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r6 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            r0 = 2
            r2 = 0
            r6.<init>(r1, r2, r0, r2)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            goto L5e
        L24:
            java.lang.String r2 = com.unity3d.services.core.misc.Utilities.Sha256(r6)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            java.lang.String r4 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.n.e(r3, r4)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            r4.<init>(r6, r3)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            r6 = 0
            if (r2 == 0) goto L4c
            com.unity3d.services.core.configuration.Configuration r0 = r0.getConfig()     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            java.lang.String r0 = r0.getWebViewHash()     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            boolean r0 = kotlin.jvm.internal.n.a(r2, r0)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            if (r0 != 0) goto L4a
            goto L4c
        L4a:
            r0 = r6
            goto L4d
        L4c:
            r0 = r1
        L4d:
            if (r0 != 0) goto L54
            java.lang.String r2 = "Unity Ads init: webapp loaded from local cache"
            com.unity3d.services.core.log.DeviceLog.info(r2)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
        L54:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$LoadCacheResult     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            if (r0 == 0) goto L59
            goto L5a
        L59:
            r1 = r6
        L5a:
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            r6 = r2
        L5e:
            java.lang.Object r6 = i8.o.b(r6)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> L90
            goto L6e
        L63:
            r6 = move-exception
            i8.o$a r0 = i8.o.f26626b
            java.lang.Object r6 = i8.p.a(r6)
            java.lang.Object r6 = i8.o.b(r6)
        L6e:
            boolean r0 = i8.o.g(r6)
            if (r0 == 0) goto L7b
            i8.o$a r0 = i8.o.f26626b
            java.lang.Object r6 = i8.o.b(r6)
            goto L8b
        L7b:
            java.lang.Throwable r0 = i8.o.d(r6)
            if (r0 == 0) goto L8b
            i8.o$a r6 = i8.o.f26626b
            java.lang.Object r6 = i8.p.a(r0)
            java.lang.Object r6 = i8.o.b(r6)
        L8b:
            i8.o r6 = i8.o.a(r6)
            return r6
        L90:
            r6 = move-exception
            throw r6
        L92:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
