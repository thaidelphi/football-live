package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.Invocation;
import i8.w;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import t8.p;
/* compiled from: HandleInvocationsFromAdViewer.kt */
@f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3", f = "HandleInvocationsFromAdViewer.kt", l = {165}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class HandleInvocationsFromAdViewer$invoke$3 extends l implements p<Invocation, m8.d<? super w>, Object> {
    final /* synthetic */ Map<String, t8.a<ExposedFunction>> $definition;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @f(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1", f = "HandleInvocationsFromAdViewer.kt", l = {165}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class AnonymousClass1 extends l implements t8.l<m8.d<? super Object>, Object> {
        final /* synthetic */ ExposedFunction $exposedFunction;
        final /* synthetic */ Invocation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, m8.d<? super AnonymousClass1> dVar) {
            super(1, dVar);
            this.$exposedFunction = exposedFunction;
            this.$it = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(m8.d<?> dVar) {
            return new AnonymousClass1(this.$exposedFunction, this.$it, dVar);
        }

        @Override // t8.l
        public /* bridge */ /* synthetic */ Object invoke(m8.d<? super Object> dVar) {
            return invoke2((m8.d<Object>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(m8.d<Object> dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = n8.d.c();
            int i10 = this.label;
            if (i10 == 0) {
                i8.p.b(obj);
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                obj = exposedFunction.invoke(parameters, this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandleInvocationsFromAdViewer$invoke$3(Map<String, ? extends t8.a<? extends ExposedFunction>> map, m8.d<? super HandleInvocationsFromAdViewer$invoke$3> dVar) {
        super(2, dVar);
        this.$definition = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final m8.d<w> create(Object obj, m8.d<?> dVar) {
        HandleInvocationsFromAdViewer$invoke$3 handleInvocationsFromAdViewer$invoke$3 = new HandleInvocationsFromAdViewer$invoke$3(this.$definition, dVar);
        handleInvocationsFromAdViewer$invoke$3.L$0 = obj;
        return handleInvocationsFromAdViewer$invoke$3;
    }

    @Override // t8.p
    public final Object invoke(Invocation invocation, m8.d<? super w> dVar) {
        return ((HandleInvocationsFromAdViewer$invoke$3) create(invocation, dVar)).invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        ExposedFunction invoke;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            Invocation invocation = (Invocation) this.L$0;
            t8.a<ExposedFunction> aVar = this.$definition.get(invocation.getLocation());
            if (aVar != null && (invoke = aVar.invoke()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(invoke, invocation, null);
                this.label = 1;
                if (invocation.handle(anonymousClass1, this) == c10) {
                    return c10;
                }
            } else {
                return w.f26638a;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
