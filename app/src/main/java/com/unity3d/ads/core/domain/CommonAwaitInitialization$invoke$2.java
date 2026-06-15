package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import d9.o0;
import g9.e;
import g9.g;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: CommonAwaitInitialization.kt */
@f(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class CommonAwaitInitialization$invoke$2 extends l implements p<o0, m8.d<? super InitializationState>, Object> {
    int label;
    final /* synthetic */ CommonAwaitInitialization this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAwaitInitialization$invoke$2(CommonAwaitInitialization commonAwaitInitialization, m8.d<? super CommonAwaitInitialization$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = commonAwaitInitialization;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        return new CommonAwaitInitialization$invoke$2(this.this$0, dVar);
    }

    @Override // t8.p
    public final Object invoke(o0 o0Var, m8.d<? super InitializationState> dVar) {
        return ((CommonAwaitInitialization$invoke$2) create(o0Var, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        SessionRepository sessionRepository;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            sessionRepository = this.this$0.sessionRepository;
            final e<InitializationState> observeInitializationState = sessionRepository.getObserveInitializationState();
            e<InitializationState> eVar = new e<InitializationState>() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
                public static final class AnonymousClass2<T> implements g9.f {
                    final /* synthetic */ g9.f $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", f = "CommonAwaitInitialization.kt", l = {223}, m = "emit")
                    /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(m8.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(g9.f fVar) {
                        this.$this_unsafeFlow = fVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // g9.f
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = n8.b.c()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            i8.p.b(r7)
                            goto L50
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            i8.p.b(r7)
                            g9.f r7 = r5.$this_unsafeFlow
                            r2 = r6
                            com.unity3d.ads.core.data.model.InitializationState r2 = (com.unity3d.ads.core.data.model.InitializationState) r2
                            com.unity3d.ads.core.data.model.InitializationState r4 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
                            if (r2 == r4) goto L44
                            com.unity3d.ads.core.data.model.InitializationState r4 = com.unity3d.ads.core.data.model.InitializationState.FAILED
                            if (r2 != r4) goto L42
                            goto L44
                        L42:
                            r2 = 0
                            goto L45
                        L44:
                            r2 = r3
                        L45:
                            if (r2 == 0) goto L50
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L50
                            return r1
                        L50:
                            i8.w r6 = i8.w.f26638a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                    }
                }

                @Override // g9.e
                public Object collect(g9.f<? super InitializationState> fVar, m8.d dVar) {
                    Object c11;
                    Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                    c11 = n8.d.c();
                    return collect == c11 ? collect : w.f26638a;
                }
            };
            this.label = 1;
            obj = g.r(eVar, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return obj;
    }
}
