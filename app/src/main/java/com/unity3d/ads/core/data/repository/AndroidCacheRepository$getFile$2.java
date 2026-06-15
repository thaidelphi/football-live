package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import d9.o0;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.p;
/* compiled from: AndroidCacheRepository.kt */
@f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2", f = "AndroidCacheRepository.kt", l = {55, 63, 79}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidCacheRepository$getFile$2 extends l implements p<o0, d<? super CacheResult>, Object> {
    final /* synthetic */ String $objectId;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCacheRepository.kt */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$1", f = "AndroidCacheRepository.kt", l = {65, 72}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements t8.l<d<? super w>, Object> {
        final /* synthetic */ g9.w<CacheResult> $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ String $objectId;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidCacheRepository androidCacheRepository, String str, String str2, int i10, String str3, g9.w<CacheResult> wVar, d<? super AnonymousClass1> dVar) {
            super(1, dVar);
            this.this$0 = androidCacheRepository;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i10;
            this.$objectId = str3;
            this.$fileResult = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$filename, this.$url, this.$priority, this.$objectId, this.$fileResult, dVar);
        }

        @Override // t8.l
        public final Object invoke(d<? super w> dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(w.f26638a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = n8.b.c()
                int r1 = r14.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                i8.p.b(r15)
                goto L97
            L13:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1b:
                i8.p.b(r15)
                goto L42
            L1f:
                i8.p.b(r15)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = r14.this$0
                com.unity3d.ads.core.data.datasource.CacheDataSource r4 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r15)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = r14.this$0
                java.io.File r5 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCacheDir$p(r15)
                java.lang.String r6 = r14.$filename
                java.lang.String r7 = r14.$url
                int r15 = r14.$priority
                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.c(r15)
                r14.label = r3
                r9 = r14
                java.lang.Object r15 = r4.getFile(r5, r6, r7, r8, r9)
                if (r15 != r0) goto L42
                return r0
            L42:
                com.unity3d.ads.core.data.model.CacheResult r15 = (com.unity3d.ads.core.data.model.CacheResult) r15
                boolean r1 = r15 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L77
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r14.this$0
                r1 = r15
                com.unity3d.ads.core.data.model.CacheResult$Success r1 = (com.unity3d.ads.core.data.model.CacheResult.Success) r1
                com.unity3d.ads.core.data.model.CachedFile r2 = r1.getCachedFile()
                java.lang.String r3 = r14.$objectId
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 254(0xfe, float:3.56E-43)
                r13 = 0
                com.unity3d.ads.core.data.model.CachedFile r1 = com.unity3d.ads.core.data.model.CachedFile.copy$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$addFileToCache(r0, r1)
                g9.w<com.unity3d.ads.core.data.model.CacheResult> r1 = r14.$fileResult
            L67:
                java.lang.Object r0 = r1.getValue()
                r2 = r0
                com.unity3d.ads.core.data.model.CacheResult r2 = (com.unity3d.ads.core.data.model.CacheResult) r2
                boolean r0 = r1.i(r0, r15)
                if (r0 == 0) goto L67
                i8.w r15 = i8.w.f26638a
                return r15
            L77:
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = r14.this$0
                com.unity3d.ads.core.data.datasource.CacheDataSource r3 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r15)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r15 = r14.this$0
                java.io.File r4 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCacheDir$p(r15)
                java.lang.String r5 = r14.$filename
                java.lang.String r6 = r14.$url
                int r15 = r14.$priority
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r15)
                r14.label = r2
                r8 = r14
                java.lang.Object r15 = r3.getFile(r4, r5, r6, r7, r8)
                if (r15 != r0) goto L97
                return r0
            L97:
                com.unity3d.ads.core.data.model.CacheResult r15 = (com.unity3d.ads.core.data.model.CacheResult) r15
                boolean r0 = r15 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r0 == 0) goto Lba
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r14.this$0
                r1 = r15
                com.unity3d.ads.core.data.model.CacheResult$Success r1 = (com.unity3d.ads.core.data.model.CacheResult.Success) r1
                com.unity3d.ads.core.data.model.CachedFile r2 = r1.getCachedFile()
                java.lang.String r3 = r14.$objectId
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 254(0xfe, float:3.56E-43)
                r13 = 0
                com.unity3d.ads.core.data.model.CachedFile r1 = com.unity3d.ads.core.data.model.CachedFile.copy$default(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$addFileToCache(r0, r1)
            Lba:
                g9.w<com.unity3d.ads.core.data.model.CacheResult> r0 = r14.$fileResult
            Lbc:
                java.lang.Object r1 = r0.getValue()
                r2 = r1
                com.unity3d.ads.core.data.model.CacheResult r2 = (com.unity3d.ads.core.data.model.CacheResult) r2
                boolean r1 = r0.i(r1, r15)
                if (r1 == 0) goto Lbc
                i8.w r15 = i8.w.f26638a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFile$2(AndroidCacheRepository androidCacheRepository, String str, int i10, String str2, d<? super AndroidCacheRepository$getFile$2> dVar) {
        super(2, dVar);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$priority = i10;
        this.$objectId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidCacheRepository$getFile$2(this.this$0, this.$url, this.$priority, this.$objectId, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, d<? super CacheResult> dVar) {
        return ((AndroidCacheRepository$getFile$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r6 = r19
            java.lang.Object r7 = n8.b.c()
            int r0 = r6.label
            r8 = 0
            r9 = 3
            r10 = 2
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 == r1) goto L2c
            if (r0 == r10) goto L23
            if (r0 != r9) goto L1b
            i8.p.b(r20)
            r0 = r20
            goto Lc5
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.Object r0 = r6.L$0
            g9.w r0 = (g9.w) r0
            i8.p.b(r20)
            goto Lb6
        L2c:
            java.lang.Object r0 = r6.L$0
            java.lang.String r0 = (java.lang.String) r0
            i8.p.b(r20)
            r13 = r0
            r0 = r20
            goto L66
        L37:
            i8.p.b(r20)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r6.this$0
            java.lang.String r2 = r6.$url
            java.lang.String r11 = r0.getFilename(r2)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = r6.this$0
            com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r2 = r6.this$0
            java.io.File r2 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getCacheDir$p(r2)
            java.lang.String r3 = r6.$url
            int r4 = r6.$priority
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            r6.L$0 = r11
            r6.label = r1
            r1 = r2
            r2 = r11
            r5 = r19
            java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L65
            return r7
        L65:
            r13 = r11
        L66:
            com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
            boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r1 == 0) goto L8c
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r6.this$0
            r2 = r0
            com.unity3d.ads.core.data.model.CacheResult$Success r2 = (com.unity3d.ads.core.data.model.CacheResult.Success) r2
            com.unity3d.ads.core.data.model.CachedFile r7 = r2.getCachedFile()
            java.lang.String r8 = r6.$objectId
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r18 = 0
            com.unity3d.ads.core.data.model.CachedFile r2 = com.unity3d.ads.core.data.model.CachedFile.copy$default(r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$addFileToCache(r1, r2)
            return r0
        L8c:
            g9.w r0 = g9.l0.a(r8)
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r1 = r6.this$0
            com.unity3d.ads.core.domain.work.DownloadPriorityQueue r1 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r1)
            int r2 = r6.$priority
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$1 r3 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2$1
            com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r6.this$0
            java.lang.String r14 = r6.$url
            java.lang.String r4 = r6.$objectId
            r18 = 0
            r11 = r3
            r15 = r2
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r6.L$0 = r0
            r6.label = r10
            java.lang.Object r1 = r1.invoke(r2, r3, r6)
            if (r1 != r7) goto Lb6
            return r7
        Lb6:
            g9.e r0 = g9.g.q(r0)
            r6.L$0 = r8
            r6.label = r9
            java.lang.Object r0 = g9.g.r(r0, r6)
            if (r0 != r7) goto Lc5
            return r7
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFile$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
