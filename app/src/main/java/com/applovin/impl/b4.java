package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b4 extends v3 {

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ boolean f6695p = true;

    /* renamed from: h  reason: collision with root package name */
    private final e7 f6696h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f6697i;

    /* renamed from: j  reason: collision with root package name */
    private MediaEvents f6698j;

    /* renamed from: k  reason: collision with root package name */
    private final VastProperties f6699k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicBoolean f6700l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f6701m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f6702n;

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f6703o;

    public b4(e7 e7Var) {
        super(e7Var);
        this.f6697i = new AtomicBoolean();
        this.f6700l = new AtomicBoolean();
        this.f6701m = new AtomicBoolean();
        this.f6702n = new AtomicBoolean();
        this.f6703o = new AtomicBoolean();
        this.f6696h = e7Var;
        float k12 = (float) e7Var.k1();
        if (e7Var.k1() == -1) {
            this.f6699k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f6699k = VastProperties.createVastPropertiesForSkippableMedia(k12, true, Position.STANDALONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f6698j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f6698j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f6698j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f6698j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f6698j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f9457g.loaded(this.f6699k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f6698j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f6698j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f6698j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f6698j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f6698j.thirdQuartile();
    }

    public void A() {
        b("track resumed", new Runnable() { // from class: com.applovin.impl.t8
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.s();
            }
        });
    }

    public void B() {
        b("track skipped", new Runnable() { // from class: com.applovin.impl.z8
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.t();
            }
        });
    }

    public void C() {
        if (this.f6703o.compareAndSet(false, true)) {
            b("track third quartile", new Runnable() { // from class: com.applovin.impl.x8
                @Override // java.lang.Runnable
                public final void run() {
                    b4.this.u();
                }
            });
        }
    }

    @Override // com.applovin.impl.v3
    protected AdSessionContext a(WebView webView) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        if (f6695p || this.f6696h.d1() != null) {
            ArrayList arrayList = new ArrayList();
            for (f7 f7Var : this.f6696h.d1().b()) {
                List<l7> c10 = f7Var.c();
                if (c10.isEmpty()) {
                    q7.a(f7Var.b(), j7.FAILED_TO_LOAD_RESOURCE, this.f9452b);
                } else {
                    ArrayList<l7> arrayList2 = new ArrayList();
                    for (l7 l7Var : c10) {
                        if ("omid".equalsIgnoreCase(l7Var.b())) {
                            arrayList2.add(l7Var);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        q7.a(f7Var.b(), j7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f9452b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList();
                        for (l7 l7Var2 : arrayList2) {
                            try {
                                arrayList3.add(new URL(l7Var2.c()));
                            } catch (Throwable th) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f9453c.a(this.f9454d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            q7.a(f7Var.b(), j7.FAILED_TO_LOAD_RESOURCE, this.f9452b);
                        } else {
                            String e8 = f7Var.e();
                            String d10 = f7Var.d();
                            if (StringUtils.isValidString(e8) && !StringUtils.isValidString(d10)) {
                                q7.a(f7Var.b(), j7.FAILED_TO_LOAD_RESOURCE, this.f9452b);
                            } else {
                                for (URL url : arrayList3) {
                                    if (StringUtils.isValidString(e8)) {
                                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(d10, url, e8);
                                    } else {
                                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                    }
                                    arrayList.add(createVerificationScriptResourceWithoutParameters);
                                }
                            }
                        }
                    }
                }
            }
            String a10 = this.f9452b.V().a();
            if (TextUtils.isEmpty(a10)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9453c.b(this.f9454d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f9452b.V().b(), a10, arrayList, this.f6696h.getOpenMeasurementContentUrl(), this.f6696h.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9453c.a(this.f9454d, "Failed to create ad session context", th2);
                    return null;
                }
                return null;
            }
        }
        throw new AssertionError();
    }

    public void b(final float f10, final boolean z10) {
        if (this.f6700l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.v8
                @Override // java.lang.Runnable
                public final void run() {
                    b4.this.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.v3
    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.u8
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.p();
            }
        });
    }

    public void i() {
        if (this.f6697i.compareAndSet(true, false)) {
            b("buffer finished", new Runnable() { // from class: com.applovin.impl.b9
                @Override // java.lang.Runnable
                public final void run() {
                    b4.this.k();
                }
            });
        }
    }

    public void j() {
        if (this.f6697i.compareAndSet(false, true)) {
            b("buffer started", new Runnable() { // from class: com.applovin.impl.d9
                @Override // java.lang.Runnable
                public final void run() {
                    b4.this.l();
                }
            });
        }
    }

    public void v() {
        b("track clicked", new Runnable() { // from class: com.applovin.impl.e9
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.m();
            }
        });
    }

    public void w() {
        b("track completed", new Runnable() { // from class: com.applovin.impl.c9
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.n();
            }
        });
    }

    public void x() {
        if (this.f6701m.compareAndSet(false, true)) {
            b("track first quartile", new Runnable() { // from class: com.applovin.impl.f9
                @Override // java.lang.Runnable
                public final void run() {
                    b4.this.o();
                }
            });
        }
    }

    public void y() {
        if (this.f6702n.compareAndSet(false, true)) {
            b("track midpoint", new Runnable() { // from class: com.applovin.impl.y8
                @Override // java.lang.Runnable
                public final void run() {
                    b4.this.q();
                }
            });
        }
    }

    public void z() {
        b("track paused", new Runnable() { // from class: com.applovin.impl.a9
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.r();
            }
        });
    }

    public void b(final boolean z10) {
        b("track volume changed", new Runnable() { // from class: com.applovin.impl.w8
            @Override // java.lang.Runnable
            public final void run() {
                b4.this.a(z10);
            }
        });
    }

    @Override // com.applovin.impl.v3
    protected AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9453c.a(this.f9454d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.v3
    protected void a(AdSession adSession) {
        try {
            this.f6698j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9453c.a(this.f9454d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f6698j.start(f10, z10 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f6698j.volumeChange(z10 ? 0.0f : 1.0f);
    }
}
