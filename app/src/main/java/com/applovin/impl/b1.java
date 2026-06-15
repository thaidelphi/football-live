package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.ironsource.b9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6671a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.browser.customtabs.c f6672b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends androidx.browser.customtabs.e {
        a() {
        }

        @Override // androidx.browser.customtabs.e
        public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
            b1.this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b1.this.f6671a.I();
                I.a("CustomTabsManager", "Connection successful: " + componentName);
            }
            b1.this.f6672b = cVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b1.this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b1.this.f6671a.I();
                I.a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            b1.this.f6672b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends androidx.browser.customtabs.b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f6674a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f6674a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.b
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f6674a.get();
            if (aVar == null) {
                b1.this.f6671a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = b1.this.f6671a.I();
                    I.b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). Controller is null.");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.ad.b g10 = aVar.g();
            if (g10 == null) {
                b1.this.f6671a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I2 = b1.this.f6671a.I();
                    I2.b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (g10.O0()) {
                        b1.this.f6671a.j().trackCustomTabsNavigationStarted(g10);
                        return;
                    }
                    return;
                case 2:
                    if (g10.O0()) {
                        b1.this.f6671a.j().trackCustomTabsNavigationFinished(g10);
                        return;
                    }
                    return;
                case 3:
                    if (g10.O0()) {
                        b1.this.f6671a.j().trackCustomTabsNavigationFailed(g10);
                        return;
                    }
                    return;
                case 4:
                    if (g10.O0()) {
                        b1.this.f6671a.j().trackCustomTabsNavigationAborted(g10);
                        return;
                    }
                    return;
                case 5:
                    if (g10.O0()) {
                        b1.this.f6671a.j().trackCustomTabsTabShown(g10);
                    }
                    l2.c(aVar.e(), g10, aVar.i());
                    return;
                case 6:
                    if (g10.O0()) {
                        b1.this.f6671a.j().trackCustomTabsTabHidden(g10);
                    }
                    l2.a(aVar.e(), g10, aVar.i());
                    return;
                default:
                    b1.this.f6671a.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I3 = b1.this.f6671a.I();
                        I3.a("CustomTabsManager", "Unknown navigation event: " + i10);
                        return;
                    }
                    return;
            }
        }

        @Override // androidx.browser.customtabs.b
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            b1.this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = b1.this.f6671a.I();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z10 ? "succeeded" : b9.h.f16676t);
                sb.append(" for session-URL relation(");
                sb.append(i10);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                I.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public b1(com.applovin.impl.sdk.j jVar) {
        this.f6671a = jVar;
    }

    public void b(final List list, final androidx.browser.customtabs.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        if (fVar == null) {
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6671a.I().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                return;
            }
            return;
        }
        a("warmup urls", new Runnable() { // from class: com.applovin.impl.q8
            @Override // java.lang.Runnable
            public final void run() {
                b1.this.a(list, fVar);
            }
        });
    }

    public void a() {
        if (((Boolean) this.f6671a.a(o4.f8193p6)).booleanValue() && this.f6672b == null) {
            String d10 = androidx.browser.customtabs.c.d(com.applovin.impl.sdk.j.m(), this.f6671a.c(o4.f8201q6), true);
            String c10 = androidx.browser.customtabs.c.c(com.applovin.impl.sdk.j.m(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f6671a.a(o4.f8209r6)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(c10, linkedList);
                CollectionUtils.addUniqueObjectIfExists(d10, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(d10, linkedList);
                CollectionUtils.addUniqueObjectIfExists(c10, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f6671a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f6671a.I().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (com.applovin.impl.sdk.n.a() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.LinkedList r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Retrying with next package name..."
            java.lang.String r1 = "CustomTabsManager"
            r2 = 0
            android.content.Context r3 = com.applovin.impl.sdk.j.m()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r7.poll()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L44
            com.applovin.impl.b1$a r5 = new com.applovin.impl.b1$a     // Catch: java.lang.Throwable -> L44
            r5.<init>()     // Catch: java.lang.Throwable -> L44
            boolean r2 = androidx.browser.customtabs.c.a(r3, r4, r5)     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L30
            com.applovin.impl.sdk.j r3 = r6.f6671a     // Catch: java.lang.Throwable -> L44
            r3.I()     // Catch: java.lang.Throwable -> L44
            boolean r3 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L30
            com.applovin.impl.sdk.j r3 = r6.f6671a     // Catch: java.lang.Throwable -> L44
            com.applovin.impl.sdk.n r3 = r3.I()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "Custom Tabs service not available"
            r3.b(r1, r4)     // Catch: java.lang.Throwable -> L44
        L30:
            if (r2 != 0) goto L7a
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L7a
            com.applovin.impl.sdk.j r2 = r6.f6671a
            r2.I()
            boolean r2 = com.applovin.impl.sdk.n.a()
            if (r2 == 0) goto L77
            goto L6e
        L44:
            r3 = move-exception
            com.applovin.impl.sdk.j r4 = r6.f6671a     // Catch: java.lang.Throwable -> L7b
            r4.I()     // Catch: java.lang.Throwable -> L7b
            boolean r4 = com.applovin.impl.sdk.n.a()     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L5b
            com.applovin.impl.sdk.j r4 = r6.f6671a     // Catch: java.lang.Throwable -> L7b
            com.applovin.impl.sdk.n r4 = r4.I()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "Failed to bind to service"
            r4.a(r1, r5, r3)     // Catch: java.lang.Throwable -> L7b
        L5b:
            if (r2 != 0) goto L7a
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L7a
            com.applovin.impl.sdk.j r2 = r6.f6671a
            r2.I()
            boolean r2 = com.applovin.impl.sdk.n.a()
            if (r2 == 0) goto L77
        L6e:
            com.applovin.impl.sdk.j r2 = r6.f6671a
            com.applovin.impl.sdk.n r2 = r2.I()
            r2.a(r1, r0)
        L77:
            r6.a(r7)
        L7a:
            return
        L7b:
            r3 = move-exception
            if (r2 != 0) goto L9b
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L9b
            com.applovin.impl.sdk.j r2 = r6.f6671a
            r2.I()
            boolean r2 = com.applovin.impl.sdk.n.a()
            if (r2 == 0) goto L98
            com.applovin.impl.sdk.j r2 = r6.f6671a
            com.applovin.impl.sdk.n r2 = r2.I()
            r2.a(r1, r0)
        L98:
            r6.a(r7)
        L9b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b1.a(java.util.LinkedList):void");
    }

    public androidx.browser.customtabs.f a(com.applovin.impl.adview.a aVar) {
        if (this.f6672b == null) {
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6671a.I().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f6671a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f6671a.I().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            androidx.browser.customtabs.f e8 = this.f6672b.e(new b(aVar));
            a(e8, aVar.g());
            return e8;
        } catch (Exception e10) {
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6671a.I().a("CustomTabsManager", "Failed to create Custom Tabs session", e10);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, androidx.browser.customtabs.f fVar) {
        this.f6671a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f6671a.I();
            I.a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse((String) it.next()));
            arrayList.add(bundle);
        }
        boolean g10 = fVar.g(Uri.parse(str), null, arrayList);
        this.f6671a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I2 = this.f6671a.I();
            StringBuilder sb = new StringBuilder();
            sb.append("Warmup for URLs ");
            sb.append(g10 ? "succeeded" : b9.h.f16676t);
            I2.a("CustomTabsManager", sb.toString());
        }
    }

    public void a(final String str, final com.applovin.impl.adview.a aVar, final Activity activity) {
        a("launch url", new Runnable() { // from class: com.applovin.impl.o8
            @Override // java.lang.Runnable
            public final void run() {
                b1.this.a(aVar, activity, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        a(aVar, activity).a(activity, Uri.parse(str));
    }

    private void a(final androidx.browser.customtabs.f fVar, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.x0()) {
            return;
        }
        a("client warmup", new Runnable() { // from class: com.applovin.impl.p8
            @Override // java.lang.Runnable
            public final void run() {
                b1.this.a(bVar, fVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, androidx.browser.customtabs.f fVar) {
        this.f6672b.g(0L);
        c1 x10 = bVar.x();
        if (x10 == null) {
            return;
        }
        Integer e8 = x10.e();
        String b10 = x10.b();
        if (e8 == null || TextUtils.isEmpty(b10)) {
            return;
        }
        if (fVar == null) {
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f6671a.I().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f6671a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = this.f6671a.I();
            I.a("CustomTabsManager", "Validating session-URL relation: " + e8 + " with digital asset link: " + b10);
        }
        fVar.k(e8.intValue(), Uri.parse(b10), null);
    }

    private androidx.browser.customtabs.d a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f6671a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f6671a.I().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b g10 = aVar.g();
        d.C0026d c0026d = new d.C0026d(aVar.h());
        c1 x10 = g10 != null ? g10.x() : null;
        if (((Boolean) this.f6671a.a(o4.f8217s6)).booleanValue()) {
            int i10 = R.anim.applovin_slide_up_animation;
            int i11 = R.anim.applovin_slide_down_animation;
            c0026d.l(activity, i10, i11);
            c0026d.e(activity, i10, i11);
        }
        if (x10 != null) {
            Integer h10 = x10.h();
            if (h10 != null) {
                c0026d.d(new a.C0023a().b(h10.intValue()).a());
            }
            Integer a10 = x10.a();
            if (a10 != null) {
                c0026d.b(2, new a.C0023a().b(a10.intValue()).a());
            }
            Boolean i12 = x10.i();
            if (i12 != null) {
                c0026d.m(i12.booleanValue());
            }
            Boolean g11 = x10.g();
            if (g11 != null) {
                c0026d.k(g11.booleanValue());
            }
            Boolean c10 = x10.c();
            if (c10 != null) {
                c0026d.f(c10.booleanValue());
            }
            Integer f10 = x10.f();
            if (f10 != null) {
                c0026d.j(f10.intValue());
            }
        }
        androidx.browser.customtabs.d a11 = c0026d.a();
        if (x10 != null) {
            String d10 = x10.d();
            if (d10 != null) {
                a11.f1858a.putExtra("android.intent.extra.REFERRER", Uri.parse(d10));
            }
            Bundle s10 = g10.s();
            if (!s10.isEmpty()) {
                a11.f1858a.putExtra("com.android.browser.headers", s10);
            }
        }
        return a11;
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f6671a.I();
                I.a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I2 = this.f6671a.I();
                I2.a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (Throwable th) {
            this.f6671a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I3 = this.f6671a.I();
                I3.a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f6671a.D().a("CustomTabsManager", str, th);
        }
    }
}
