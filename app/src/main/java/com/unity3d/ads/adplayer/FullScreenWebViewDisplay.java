package com.unity3d.ads.adplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import d9.f1;
import d9.k;
import d9.p0;
import g9.e;
import g9.f;
import g9.g;
import g9.v;
import i8.w;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import org.json.JSONObject;
/* compiled from: FullScreenWebViewDisplay.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FullScreenWebViewDisplay extends ComponentActivity {
    private String opportunityId = "";
    private Map<String, ? extends Object> showOptions;

    private final void listenToAdPlayerEvents() {
        final v<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
        g.w(g.z(new e<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(m8.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // g9.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, m8.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = n8.b.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        i8.p.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        i8.p.b(r7)
                        g9.f r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.n.a(r2, r4)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        i8.w r6 = i8.w.f26638a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, m8.d):java.lang.Object");
                }
            }

            @Override // g9.e
            public Object collect(f<? super DisplayMessage> fVar, m8.d dVar) {
                Object c10;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                c10 = n8.d.c();
                return collect == c10 ? collect : w.f26638a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2(this, null)), q.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView(WebView webView) {
        k.d(q.a(this), null, null, new FullScreenWebViewDisplay$loadWebView$1(this, webView, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            setResult(0);
            finish();
            k.d(q.a(this), null, null, new FullScreenWebViewDisplay$onCreate$1$1(this, null), 3, null);
            return;
        }
        this.opportunityId = stringExtra;
        Boolean valueOf = Boolean.valueOf(getIntent().hasExtra("orientation"));
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            setRequestedOrientation(getIntent().getIntExtra("orientation", -1));
        }
        String stringExtra2 = getIntent().getStringExtra("showOptions");
        this.showOptions = stringExtra2 != null ? JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2)) : null;
        listenToAdPlayerEvents();
        k.d(q.a(this), null, null, new FullScreenWebViewDisplay$onCreate$5(this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        k.d(p0.a(f1.c()), null, null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3, null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return i10 == 4;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        k.d(q.a(this), null, null, new FullScreenWebViewDisplay$onPause$1(this, null), 3, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        k.d(q.a(this), null, null, new FullScreenWebViewDisplay$onResume$1(this, null), 3, null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        k.d(q.a(this), null, null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, z10, null), 3, null);
    }
}
