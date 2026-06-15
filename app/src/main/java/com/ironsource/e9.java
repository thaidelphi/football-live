package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e9 {

    /* renamed from: a  reason: collision with root package name */
    MutableContextWrapper f17202a;

    public Activity a() {
        return (Activity) this.f17202a.getBaseContext();
    }

    public synchronized void a(Activity activity) {
        if (this.f17202a == null) {
            this.f17202a = new MutableContextWrapper(activity);
        }
        this.f17202a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f17202a = null;
    }
}
