package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class j {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static j f15867d = new j();

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f15868a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15869b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15870c = false;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z10;
            boolean z11;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z10 = jVar.f15870c;
                z11 = true;
            } else if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            } else {
                jVar = j.this;
                z10 = jVar.f15870c;
                z11 = false;
            }
            jVar.a(z11, z10);
            j.this.f15869b = z11;
        }
    }

    public static j b() {
        return f15867d;
    }

    public void a() {
        Context context = this.f15868a.get();
        if (context == null) {
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean isDeviceLocked = Build.VERSION.SDK_INT >= 22 ? keyguardManager.isDeviceLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        a(this.f15869b, isDeviceLocked);
        this.f15870c = isDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f15868a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f15870c || this.f15869b)) {
            return;
        }
        for (com.iab.omid.library.ironsrc.adsession.a aVar : c.c().b()) {
            aVar.getAdSessionStatePublisher().b(z11 || z10);
        }
    }
}
