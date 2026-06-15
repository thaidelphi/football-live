package com.startapp;

import android.app.Activity;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n7 extends y1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l7 f22329a;

    public n7(l7 l7Var) {
        this.f22329a = l7Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f22329a.a(activity);
        } catch (Throwable th) {
            l3.a(th);
        }
    }
}
