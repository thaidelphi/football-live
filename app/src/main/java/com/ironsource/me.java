package com.ironsource;

import android.os.Handler;
import com.ironsource.le;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class me {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements le.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f18475a;

        a(Handler handler) {
            this.f18475a = handler;
        }

        @Override // com.ironsource.le.a
        public void a(Runnable runnable, long j10) {
            kotlin.jvm.internal.n.f(runnable, "runnable");
            this.f18475a.postDelayed(runnable, j10);
        }
    }

    public static final le.a a(Handler handler) {
        kotlin.jvm.internal.n.f(handler, "<this>");
        return new a(handler);
    }
}
