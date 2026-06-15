package com.ironsource;

import android.os.Looper;
import android.util.Log;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p4 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19671a = new a(null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final void a() {
            if (kotlin.jvm.internal.n.a(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }
    }

    public static final void a() {
        f19671a.a();
    }
}
