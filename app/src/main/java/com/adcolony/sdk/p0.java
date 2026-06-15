package com.adcolony.sdk;

import android.util.Log;
import android.webkit.WebView;
import com.adcolony.sdk.e0;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private AdSession f6176a;

    /* renamed from: b  reason: collision with root package name */
    private AdEvents f6177b;

    /* renamed from: c  reason: collision with root package name */
    private MediaEvents f6178c;

    /* renamed from: e  reason: collision with root package name */
    private int f6180e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6182g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6183h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6184i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6185j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6186k;

    /* renamed from: l  reason: collision with root package name */
    private int f6187l;

    /* renamed from: m  reason: collision with root package name */
    private int f6188m;

    /* renamed from: n  reason: collision with root package name */
    private String f6189n;

    /* renamed from: o  reason: collision with root package name */
    private String f6190o;

    /* renamed from: d  reason: collision with root package name */
    private List<VerificationScriptResource> f6179d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private String f6181f = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6191a;

        a(String str) {
            this.f6191a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 b10 = c0.b();
            f1 b11 = c0.b();
            c0.b(b11, "session_type", p0.this.f6180e);
            c0.a(b11, "session_id", p0.this.f6181f);
            c0.a(b11, "event", this.f6191a);
            c0.a(b10, "type", "iab_hook");
            c0.a(b10, "message", b11.toString());
            new h0("CustomMessage.controller_send", 0, b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements AdColonyCustomMessageListener {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f6194a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f6195b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f6196c;

            a(String str, String str2, float f10) {
                this.f6194a = str;
                this.f6195b = str2;
                this.f6196c = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f6194a.equals(p0.this.f6190o)) {
                    p0.this.a(this.f6195b, this.f6196c);
                    return;
                }
                AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(this.f6194a);
                p0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.a(this.f6195b, this.f6196c);
                }
            }
        }

        b() {
        }

        @Override // com.adcolony.sdk.AdColonyCustomMessageListener
        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            f1 b10 = c0.b(adColonyCustomMessage.getMessage());
            String h10 = c0.h(b10, "event_type");
            float floatValue = BigDecimal.valueOf(c0.c(b10, IronSourceConstants.EVENTS_DURATION)).floatValue();
            boolean b11 = c0.b(b10, "replay");
            boolean equals = c0.h(b10, "skip_type").equals("dec");
            String h11 = c0.h(b10, "asi");
            if (h10.equals("skip") && equals) {
                p0.this.f6186k = true;
            } else if (b11 && (h10.equals("start") || h10.equals("first_quartile") || h10.equals("midpoint") || h10.equals("third_quartile") || h10.equals("complete"))) {
            } else {
                z0.b(new a(h11, h10, floatValue));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(f1 f1Var, String str) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        this.f6180e = -1;
        this.f6189n = "";
        this.f6190o = "";
        this.f6180e = a(f1Var);
        this.f6185j = c0.b(f1Var, "skippable");
        this.f6187l = c0.d(f1Var, "skip_offset");
        this.f6188m = c0.d(f1Var, "video_duration");
        e1 a10 = c0.a(f1Var, "js_resources");
        e1 a11 = c0.a(f1Var, "verification_params");
        e1 a12 = c0.a(f1Var, "vendor_keys");
        this.f6190o = str;
        for (int i10 = 0; i10 < a10.b(); i10++) {
            try {
                String b10 = c0.b(a11, i10);
                String b11 = c0.b(a12, i10);
                URL url = new URL(c0.b(a10, i10));
                if (!b10.equals("") && !b11.equals("")) {
                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(b11, url, b10);
                } else {
                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                }
                this.f6179d.add(createVerificationScriptResourceWithoutParameters);
            } catch (MalformedURLException unused) {
                new e0.a().a("Invalid js resource url passed to Omid").a(e0.f5981i);
            }
        }
        try {
            this.f6189n = com.adcolony.sdk.a.b().p().a(c0.h(f1Var, "filepath"), true).toString();
        } catch (IOException unused2) {
            new e0.a().a("Error loading IAB JS Client").a(e0.f5981i);
        }
    }

    private void e() {
        AdColony.addCustomMessageListener(new b(), "viewability_ad_event");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f6180e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f6183h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f6176a.finish();
        b("end_session");
        this.f6176a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSession c() {
        return this.f6176a;
    }

    private int a(f1 f1Var) {
        if (this.f6180e == -1) {
            int d10 = c0.d(f1Var, "ad_unit_type");
            String h10 = c0.h(f1Var, "ad_type");
            if (d10 == 0) {
                return 0;
            }
            if (d10 == 1) {
                if (h10.equals("video")) {
                    return 0;
                }
                if (h10.equals(b9.h.f16644d)) {
                    return 1;
                }
                if (h10.equals("banner_display") || h10.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f6180e;
    }

    private void b(String str) {
        if (z0.a(new a(str))) {
            return;
        }
        new e0.a().a("Executing ADCOmidManager.sendIabCustomMessage failed").a(e0.f5981i);
    }

    private void b(c cVar) {
        b("register_ad_view");
        b1 b1Var = com.adcolony.sdk.a.b().B().get(Integer.valueOf(cVar.k()));
        if (b1Var == null && !cVar.n().isEmpty()) {
            b1Var = cVar.n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f6176a;
        if (adSession != null && b1Var != null) {
            adSession.registerAdView(b1Var);
            if (b1Var instanceof l0) {
                ((l0) b1Var).p();
            }
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.a(this.f6176a);
            b("register_obstructions");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        VastProperties createVastPropertiesForNonSkippableMedia;
        if (this.f6184i || this.f6180e < 0 || this.f6176a == null) {
            return;
        }
        b(cVar);
        e();
        this.f6178c = this.f6180e != 0 ? null : MediaEvents.createMediaEvents(this.f6176a);
        try {
            this.f6176a.start();
            this.f6177b = AdEvents.createAdEvents(this.f6176a);
            b("start_session");
            if (this.f6178c != null) {
                Position position = Position.PREROLL;
                if (this.f6185j) {
                    createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(this.f6187l, true, position);
                } else {
                    createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                }
                this.f6177b.loaded(createVastPropertiesForNonSkippableMedia);
            } else {
                this.f6177b.loaded();
            }
            this.f6184i = true;
        } catch (NullPointerException e8) {
            AdSession adSession = this.f6176a;
            ErrorType errorType = ErrorType.GENERIC;
            adSession.error(errorType, "Exception occurred on AdSession.start: " + Log.getStackTraceString(e8));
            b();
            e0.a a10 = new e0.a().a("Exception in ADCOmidManager on AdSession.start: ").a(Log.getStackTraceString(e8));
            a10.a(" Ad with adSessionId: " + this.f6190o + ".").a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() throws IllegalArgumentException {
        a((WebView) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f6180e < 0 || (str = this.f6189n) == null || str.equals("") || (list = this.f6179d) == null) {
            return;
        }
        if (!list.isEmpty() || d() == 2) {
            k b10 = com.adcolony.sdk.a.b();
            Owner owner = Owner.NATIVE;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            int d10 = d();
            if (d10 == 0) {
                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(b10.t(), this.f6189n, this.f6179d, null, null));
                this.f6176a = createAdSession;
                this.f6181f = createAdSession.getAdSessionId();
                b("inject_javascript");
            } else if (d10 == 1) {
                AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, impressionType, owner, null, false), AdSessionContext.createNativeAdSessionContext(b10.t(), this.f6189n, this.f6179d, null, null));
                this.f6176a = createAdSession2;
                this.f6181f = createAdSession2.getAdSessionId();
                b("inject_javascript");
            } else if (d10 != 2) {
            } else {
                AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, impressionType, owner, null, false), AdSessionContext.createHtmlAdSessionContext(b10.t(), webView, "", null));
                this.f6176a = createAdSession3;
                this.f6181f = createAdSession3.getAdSessionId();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a(str, 0.0f);
    }

    void a(String str, float f10) {
        if (!com.adcolony.sdk.a.c() || this.f6176a == null) {
            return;
        }
        if (this.f6178c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
            char c10 = 65535;
            try {
                switch (str.hashCode()) {
                    case -1941887438:
                        if (str.equals("first_quartile")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1710060637:
                        if (str.equals("buffer_start")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case -1638835128:
                        if (str.equals("midpoint")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1367724422:
                        if (str.equals("cancel")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -934426579:
                        if (str.equals("resume")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case -651914917:
                        if (str.equals("third_quartile")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -599445191:
                        if (str.equals("complete")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -567202649:
                        if (str.equals("continue")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -342650039:
                        if (str.equals("sound_mute")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 3532159:
                        if (str.equals("skip")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 106440182:
                        if (str.equals("pause")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 109757538:
                        if (str.equals("start")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 583742045:
                        if (str.equals("in_video_engagement")) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case 823102269:
                        if (str.equals("html5_interaction")) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case 1648173410:
                        if (str.equals("sound_unmute")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1906584668:
                        if (str.equals("buffer_end")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.f6177b.impressionOccurred();
                        MediaEvents mediaEvents = this.f6178c;
                        if (mediaEvents != null) {
                            if (f10 <= 0.0f) {
                                f10 = this.f6188m;
                            }
                            mediaEvents.start(f10, 1.0f);
                        }
                        b(str);
                        return;
                    case 1:
                        this.f6178c.firstQuartile();
                        b(str);
                        return;
                    case 2:
                        this.f6178c.midpoint();
                        b(str);
                        return;
                    case 3:
                        this.f6178c.thirdQuartile();
                        b(str);
                        return;
                    case 4:
                        this.f6186k = true;
                        this.f6178c.complete();
                        b(str);
                        return;
                    case 5:
                        b(str);
                        b();
                        return;
                    case 6:
                    case 7:
                        MediaEvents mediaEvents2 = this.f6178c;
                        if (mediaEvents2 != null) {
                            mediaEvents2.skipped();
                        }
                        b(str);
                        b();
                        return;
                    case '\b':
                        this.f6178c.volumeChange(0.0f);
                        b(str);
                        return;
                    case '\t':
                        this.f6178c.volumeChange(1.0f);
                        b(str);
                        return;
                    case '\n':
                        if (this.f6182g || this.f6183h || this.f6186k) {
                            return;
                        }
                        this.f6178c.pause();
                        b(str);
                        this.f6182g = true;
                        this.f6183h = false;
                        return;
                    case 11:
                        if (!this.f6182g || this.f6186k) {
                            return;
                        }
                        this.f6178c.resume();
                        b(str);
                        this.f6182g = false;
                        return;
                    case '\f':
                        this.f6178c.bufferStart();
                        b(str);
                        return;
                    case '\r':
                        this.f6178c.bufferFinish();
                        b(str);
                        return;
                    case 14:
                    case 15:
                        this.f6178c.adUserInteraction(InteractionType.CLICK);
                        b(str);
                        if (!this.f6183h || this.f6182g || this.f6186k) {
                            return;
                        }
                        this.f6178c.pause();
                        b("pause");
                        this.f6182g = true;
                        this.f6183h = false;
                        return;
                    default:
                        return;
                }
            } catch (IllegalArgumentException | IllegalStateException e8) {
                new e0.a().a("Recording IAB event for ").a(str).a(" caused " + e8.getClass()).a(e0.f5979g);
            }
        }
    }
}
