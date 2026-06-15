package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.d8;
import com.startapp.l2;
import com.startapp.o9;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.y;
import java.io.Serializable;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class OverlayActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public l2 f22616a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22617b;

    /* renamed from: c  reason: collision with root package name */
    public int f22618c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22619d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f22620e;

    /* renamed from: f  reason: collision with root package name */
    public int f22621f = -1;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverlayActivity overlayActivity = OverlayActivity.this;
            if (overlayActivity.f22619d) {
                overlayActivity.f22619d = false;
                overlayActivity.f22621f = o9.a((Activity) overlayActivity, overlayActivity.f22618c, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.interstitials.OverlayActivity.a():void");
    }

    public final boolean b() {
        return this.f22617b && Build.VERSION.SDK_INT != 26;
    }

    @Override // android.app.Activity
    public final void finish() {
        l2 l2Var = this.f22616a;
        if (l2Var != null) {
            l2Var.h();
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        l2 l2Var = this.f22616a;
        if (l2Var == null || !l2Var.b()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (b()) {
            a();
            l2 l2Var = this.f22616a;
            if (l2Var != null) {
                l2Var.a(this.f22620e);
                this.f22616a.f();
            }
            this.f22617b = false;
        }
        l2 l2Var2 = this.f22616a;
        if (l2Var2 != null) {
            l2Var2.c();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (intExtra >= 0 && (serializableExtra instanceof Ad)) {
            d8 a10 = com.startapp.sdk.components.a.a(getApplicationContext()).f23235k.a();
            AdPreferences.Placement a11 = AdPreferences.Placement.a(intExtra);
            String adId = ((Ad) serializableExtra).getAdId();
            if (adId != null) {
                a10.f21892a.put(new d8.a(a11, -1), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.f22619d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f22621f = bundle.getInt("activityLockedOrientation", -1);
            this.f22619d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f22618c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
        this.f22617b = getResources().getConfiguration().orientation != this.f22618c;
        if (b()) {
            this.f22620e = bundle;
            return;
        }
        a();
        l2 l2Var = this.f22616a;
        if (l2Var != null) {
            l2Var.a(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!b()) {
            l2 l2Var = this.f22616a;
            if (l2Var != null) {
                l2Var.d();
                this.f22616a = null;
            }
            WeakHashMap weakHashMap = o9.f22359a;
            o9.a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l2 l2Var = this.f22616a;
        if (l2Var == null || l2Var.a(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (!b()) {
            l2 l2Var = this.f22616a;
            if (l2Var != null) {
                l2Var.e();
            }
            com.startapp.sdk.adsbase.a.b((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        l2 l2Var;
        super.onResume();
        int i10 = this.f22621f;
        if (i10 == -1) {
            this.f22621f = o9.a(this, this.f22618c, this.f22619d);
        } else {
            int i11 = y.f23556a;
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        }
        if (b() || (l2Var = this.f22616a) == null) {
            return;
        }
        l2Var.f();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (b()) {
            return;
        }
        l2 l2Var = this.f22616a;
        if (l2Var != null) {
            l2Var.b(bundle);
        }
        bundle.putInt("activityLockedOrientation", this.f22621f);
        bundle.putBoolean("activityShouldLockOrientation", this.f22619d);
    }

    @Override // android.app.Activity
    public final void onStop() {
        l2 l2Var;
        super.onStop();
        if (b() || (l2Var = this.f22616a) == null) {
            return;
        }
        l2Var.g();
    }
}
