package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.a3;
import com.ironsource.b9;
import com.ironsource.bh;
import com.ironsource.cc;
import com.ironsource.er;
import com.ironsource.gh;
import com.ironsource.kw;
import com.ironsource.lh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.nv;
import com.ironsource.o9;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.so;
import com.ironsource.u5;
import com.ironsource.vj;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ControllerActivity extends Activity implements so, nv {

    /* renamed from: n  reason: collision with root package name */
    private static final String f20159n = "ControllerActivity";

    /* renamed from: o  reason: collision with root package name */
    private static final int f20160o = 1;

    /* renamed from: p  reason: collision with root package name */
    private static String f20161p = "removeWebViewContainerView | mContainer is null";

    /* renamed from: q  reason: collision with root package name */
    private static String f20162q = "removeWebViewContainerView | view is null";

    /* renamed from: a  reason: collision with root package name */
    private String f20163a;

    /* renamed from: b  reason: collision with root package name */
    private v f20164b;

    /* renamed from: c  reason: collision with root package name */
    private RelativeLayout f20165c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f20166d;

    /* renamed from: e  reason: collision with root package name */
    private nf f20167e;

    /* renamed from: g  reason: collision with root package name */
    private String f20169g;

    /* renamed from: k  reason: collision with root package name */
    private a3 f20173k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20174l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20175m;
    public int currentRequestedRotation = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20168f = false;

    /* renamed from: h  reason: collision with root package name */
    private Handler f20170h = new Handler();

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f20171i = new a();

    /* renamed from: j  reason: collision with root package name */
    final RelativeLayout.LayoutParams f20172j = new RelativeLayout.LayoutParams(-1, -1);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f20168f));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                ControllerActivity.this.f20170h.removeCallbacks(ControllerActivity.this.f20171i);
                ControllerActivity.this.f20170h.postDelayed(ControllerActivity.this.f20171i, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private View a(ViewGroup viewGroup) {
        return d() ? viewGroup.findViewById(1) : bh.a().a(this.f20163a).getPresentingView();
    }

    private FrameLayout a(String str) {
        return !b(str) ? this.f20164b.s() : kw.a(getApplicationContext(), bh.a().a(str).getPresentingView());
    }

    private void a() {
        runOnUiThread(new d());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i10) {
        int i11;
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                g();
            } else if ("portrait".equalsIgnoreCase(str)) {
                h();
            } else {
                if (b9.h.G.equalsIgnoreCase(str)) {
                    if (!this.f20167e.E(this)) {
                        return;
                    }
                    i11 = 1;
                } else if (getRequestedOrientation() != -1) {
                    return;
                } else {
                    i11 = 4;
                }
                setRequestedOrientation(i11);
            }
        }
    }

    private void b() {
        String str = f20159n;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f20164b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.u.Gone);
        this.f20164b.C();
        this.f20164b.D();
        this.f20164b.g(this.f20169g, "onDestroy");
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        Intent intent = getIntent();
        a(intent.getStringExtra(b9.h.A), intent.getIntExtra(b9.h.B, 0));
    }

    private boolean d() {
        return this.f20163a == null;
    }

    private void e() {
        runOnUiThread(new c());
    }

    private void f() {
        ViewGroup viewGroup;
        try {
            if (this.f20165c == null) {
                throw new Exception(f20161p);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f20166d.getParent();
            View a10 = a(viewGroup2);
            if (a10 == null) {
                throw new Exception(f20162q);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) a10.getParent()) != null) {
                viewGroup.removeView(a10);
            }
            viewGroup2.removeView(this.f20166d);
        } catch (Exception e8) {
            o9.d().a(e8);
            lh.a(er.f17311s, new gh().a(cc.A, e8.getMessage()).a());
            String str = f20159n;
            Logger.i(str, "removeWebViewContainerView fail " + e8.getMessage());
        }
    }

    private void g() {
        String str;
        String str2;
        int L = this.f20167e.L(this);
        String str3 = f20159n;
        Logger.i(str3, "setInitiateLandscapeOrientation");
        if (L != 0) {
            if (L == 2) {
                str2 = "ROTATION_180";
            } else if (L == 3) {
                str2 = "ROTATION_270 Right Landscape";
            } else if (L != 1) {
                Logger.i(str3, "No Rotation");
                return;
            } else {
                str = "ROTATION_90 Left Landscape";
            }
            Logger.i(str3, str2);
            setRequestedOrientation(8);
            return;
        }
        str = "ROTATION_0";
        Logger.i(str3, str);
        setRequestedOrientation(0);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void h() {
        String str;
        int L = this.f20167e.L(this);
        String str2 = f20159n;
        Logger.i(str2, "setInitiatePortraitOrientation");
        if (L == 0) {
            str = "ROTATION_0";
        } else if (L == 2) {
            Logger.i(str2, "ROTATION_180");
            setRequestedOrientation(9);
            return;
        } else if (L == 1) {
            str = "ROTATION_270 Right Landscape";
        } else if (L != 3) {
            Logger.i(str2, "No Rotation");
            return;
        } else {
            str = "ROTATION_90 Left Landscape";
        }
        Logger.i(str2, str);
        setRequestedOrientation(1);
    }

    @Override // com.ironsource.so
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f20159n, "onBackPressed");
        if (u5.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.so
    public void onCloseRequested() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20167e = mm.S().f();
        try {
            new com.ironsource.m(this).a();
            new com.ironsource.l(this).a();
            v vVar = (v) vj.b((Context) this).a().j();
            this.f20164b = vVar;
            vVar.s().setId(1);
            this.f20164b.a((so) this);
            this.f20164b.a((nv) this);
            Intent intent = getIntent();
            this.f20169g = intent.getStringExtra(b9.h.f16662m);
            this.f20168f = intent.getBooleanExtra(b9.h.f16680v, false);
            this.f20163a = intent.getStringExtra("adViewId");
            this.f20174l = false;
            this.f20175m = intent.getBooleanExtra(b9.h.f16689z0, false);
            if (this.f20168f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f20171i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f20165c = relativeLayout;
            setContentView(relativeLayout, this.f20172j);
            this.f20166d = a(this.f20163a);
            if (this.f20165c.findViewById(1) == null && this.f20166d.getParent() != null) {
                finish();
            }
            c();
            this.f20165c.addView(this.f20166d, this.f20172j);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = f20159n;
        Logger.i(str, "onDestroy");
        f();
        if (this.f20174l) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f20164b.y()) {
            this.f20164b.x();
            return true;
        }
        if (this.f20168f && (i10 == 25 || i10 == 24)) {
            this.f20170h.removeCallbacks(this.f20171i);
            this.f20170h.postDelayed(this.f20171i, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.so
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        String str = f20159n;
        Logger.i(str, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f20164b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f20175m) {
                this.f20164b.B();
            }
            this.f20164b.a(false, b9.h.Z);
            this.f20164b.g(this.f20169g, b9.h.f16677t0);
        }
        if (isFinishing()) {
            this.f20174l = true;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f20159n, b9.h.f16679u0);
        v vVar = this.f20164b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f20175m) {
                this.f20164b.F();
            }
            this.f20164b.a(true, b9.h.Z);
            this.f20164b.g(this.f20169g, b9.h.f16679u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(f20159n, "onStart");
        v vVar = this.f20164b;
        if (vVar != null) {
            vVar.g(this.f20169g, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(f20159n, "onStop");
        v vVar = this.f20164b;
        if (vVar != null) {
            vVar.g(this.f20169g, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f20159n, "onUserLeaveHint");
        v vVar = this.f20164b;
        if (vVar != null) {
            vVar.g(this.f20169g, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.nv
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.nv
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.nv
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.nv
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.nv
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f20168f && z10) {
            runOnUiThread(this.f20171i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            String str = f20159n;
            Logger.i(str, "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            e();
        } else {
            a();
        }
    }
}
