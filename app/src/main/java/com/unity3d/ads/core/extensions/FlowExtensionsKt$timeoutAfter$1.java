package com.unity3d.ads.core.extensions;

import d9.k;
import d9.o0;
import d9.z0;
import f9.r;
import f9.u;
import g9.e;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.a;
import t8.p;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: FlowExtensions.kt */
@f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class FlowExtensionsKt$timeoutAfter$1<T> extends l implements p<r<? super T>, d<? super w>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ p<a<w>, d<? super w>, Object> $block;
    final /* synthetic */ e<T> $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExtensions.kt */
    @f(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super w>, Object> {
        final /* synthetic */ r<T> $$this$channelFlow;
        final /* synthetic */ e<T> $this_timeoutAfter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(e<? extends T> eVar, r<? super T> rVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_timeoutAfter = eVar;
            this.$$this$channelFlow = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, dVar);
        }

        @Override // t8.p
        public final Object invoke(o0 o0Var, d<? super w> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                e<T> eVar = this.$this_timeoutAfter;
                final r<T> rVar = this.$$this$channelFlow;
                g9.f<? super T> fVar = new g9.f() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                    @Override // g9.f
                    public final Object emit(T t10, d<? super w> dVar) {
                        Object c11;
                        Object i11 = rVar.i(t10, dVar);
                        c11 = n8.d.c();
                        return i11 == c11 ? i11 : w.f26638a;
                    }
                };
                this.label = 1;
                if (eVar.collect(fVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i8.p.b(obj);
            }
            u.a.a(this.$$this$channelFlow, null, 1, null);
            return w.f26638a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowExtensions.kt */
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.a implements a<w> {
        AnonymousClass2(Object obj) {
            super(0, obj, r.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
        }

        @Override // t8.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u.a.a((r) this.receiver, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtensionsKt$timeoutAfter$1(long j10, boolean z10, p<? super a<w>, ? super d<? super w>, ? extends Object> pVar, e<? extends T> eVar, d<? super FlowExtensionsKt$timeoutAfter$1> dVar) {
        super(2, dVar);
        this.$timeoutMillis = j10;
        this.$active = z10;
        this.$block = pVar;
        this.$this_timeoutAfter = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, dVar);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    public final Object invoke(r<? super T> rVar, d<? super w> dVar) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(rVar, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // t8.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, d<? super w> dVar) {
        return invoke((r) ((r) obj), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        r rVar;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            rVar = (r) this.L$0;
            k.d(rVar, null, null, new AnonymousClass1(this.$this_timeoutAfter, rVar, null), 3, null);
            long j10 = this.$timeoutMillis;
            this.L$0 = rVar;
            this.label = 1;
            if (z0.a(j10, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                i8.p.b(obj);
                return w.f26638a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            rVar = (r) this.L$0;
            i8.p.b(obj);
        }
        if (this.$active) {
            p<a<w>, d<? super w>, Object> pVar = this.$block;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(rVar);
            this.L$0 = null;
            this.label = 2;
            if (pVar.invoke(anonymousClass2, this) == c10) {
                return c10;
            }
        }
        return w.f26638a;
    }
}
