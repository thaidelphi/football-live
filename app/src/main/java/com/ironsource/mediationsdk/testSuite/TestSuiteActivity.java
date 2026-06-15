package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.gi;
import com.ironsource.mu;
import com.ironsource.ru;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class TestSuiteActivity extends Activity implements gi {

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f19138a;

    /* renamed from: b  reason: collision with root package name */
    private ru f19139b;

    /* renamed from: c  reason: collision with root package name */
    private mu f19140c;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        n.f(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:4:0x000b, B:10:0x0017, B:11:0x001d), top: B:15:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #0 {Exception -> 0x0024, blocks: (B:4:0x000b, B:10:0x0017, B:11:0x001d), top: B:15:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.json.JSONObject b() {
        /*
            r2 = this;
            com.ironsource.au r0 = new com.ironsource.au
            r0.<init>()
            java.lang.String r0 = r0.b(r2)
            if (r0 == 0) goto L14
            int r1 = r0.length()     // Catch: java.lang.Exception -> L24
            if (r1 != 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            if (r1 == 0) goto L1d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24
            r0.<init>()     // Catch: java.lang.Exception -> L24
            goto L29
        L1d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L24
            r1.<init>(r0)     // Catch: java.lang.Exception -> L24
            r0 = r1
            goto L29
        L24:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.testSuite.TestSuiteActivity.b():org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        n.f(this$0, "this$0");
        ru ruVar = this$0.f19139b;
        ru ruVar2 = null;
        if (ruVar == null) {
            n.u("mWebViewWrapper");
            ruVar = null;
        }
        if (ruVar.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f19138a;
            if (relativeLayout == null) {
                n.u("mContainer");
                relativeLayout = null;
            }
            ru ruVar3 = this$0.f19139b;
            if (ruVar3 == null) {
                n.u("mWebViewWrapper");
                ruVar3 = null;
            }
            relativeLayout.removeView(ruVar3.d());
            RelativeLayout relativeLayout2 = this$0.f19138a;
            if (relativeLayout2 == null) {
                n.u("mContainer");
                relativeLayout2 = null;
            }
            ru ruVar4 = this$0.f19139b;
            if (ruVar4 == null) {
                n.u("mWebViewWrapper");
                ruVar4 = null;
            }
            relativeLayout2.addView(ruVar4.c(), this$0.c());
            ru ruVar5 = this$0.f19139b;
            if (ruVar5 == null) {
                n.u("mWebViewWrapper");
            } else {
                ruVar2 = ruVar5;
            }
            ruVar2.b();
        }
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f19138a;
        if (relativeLayout == null) {
            n.u("mContainer");
            return null;
        }
        return relativeLayout;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.gi
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.b
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f19138a = relativeLayout;
        setContentView(relativeLayout, c());
        ru ruVar = new ru(this, this, b(), a());
        this.f19139b = ruVar;
        mu muVar = new mu(ruVar);
        this.f19140c = muVar;
        muVar.d();
        RelativeLayout relativeLayout2 = this.f19138a;
        ru ruVar2 = null;
        if (relativeLayout2 == null) {
            n.u("mContainer");
            relativeLayout2 = null;
        }
        ru ruVar3 = this.f19139b;
        if (ruVar3 == null) {
            n.u("mWebViewWrapper");
        } else {
            ruVar2 = ruVar3;
        }
        relativeLayout2.addView(ruVar2.d(), c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        mu muVar = this.f19140c;
        ru ruVar = null;
        if (muVar == null) {
            n.u("mNativeBridge");
            muVar = null;
        }
        muVar.a();
        RelativeLayout relativeLayout = this.f19138a;
        if (relativeLayout == null) {
            n.u("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        ru ruVar2 = this.f19139b;
        if (ruVar2 == null) {
            n.u("mWebViewWrapper");
        } else {
            ruVar = ruVar2;
        }
        ruVar.a();
        super.onDestroy();
    }

    @Override // com.ironsource.gi
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.a
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(TestSuiteActivity.this);
            }
        });
    }
}
