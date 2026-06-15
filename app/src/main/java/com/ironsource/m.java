package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class m implements sv {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f18363a;

    public m(Activity activity) {
        this.f18363a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.sv
    public void a() {
        Activity activity = this.f18363a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
