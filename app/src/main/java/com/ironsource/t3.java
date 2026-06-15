package com.ironsource;

import android.os.OutcomeReceiver;
import i8.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t3 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements OutcomeReceiver<Object, Exception> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m8.d<i8.w> f20778a;

        /* JADX WARN: Multi-variable type inference failed */
        a(m8.d<? super i8.w> dVar) {
            this.f20778a = dVar;
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(Exception error) {
            kotlin.jvm.internal.n.f(error, "error");
            m8.d<i8.w> dVar = this.f20778a;
            o.a aVar = i8.o.f26626b;
            dVar.resumeWith(i8.o.b(i8.p.a(error)));
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(Object obj) {
            m8.d<i8.w> dVar = this.f20778a;
            o.a aVar = i8.o.f26626b;
            dVar.resumeWith(i8.o.b(i8.w.f26638a));
        }
    }

    public static final OutcomeReceiver<Object, Exception> a(m8.d<? super i8.w> dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return new a(dVar);
    }
}
