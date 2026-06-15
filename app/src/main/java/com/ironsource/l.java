package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class l implements sv {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f18122a;

    public l(Activity activity) {
        this.f18122a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.sv
    public void a() {
        Activity activity = this.f18122a.get();
        if (activity == null) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i10 < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
