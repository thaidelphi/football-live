package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f15679a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f15680b;

    /* renamed from: c  reason: collision with root package name */
    private final f f15681c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f15682d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f15683e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15684f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15685g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15686h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15687i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15688j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f15689k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f15681c = new f();
        this.f15684f = false;
        this.f15685g = false;
        this.f15680b = adSessionConfiguration;
        this.f15679a = adSessionContext;
        this.f15686h = str;
        b(null);
        this.f15683e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f15683e.i();
        c.c().a(this);
        this.f15683e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f15687i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.c() == view) {
                aVar.f15682d.clear();
            }
        }
    }

    private void b() {
        if (this.f15688j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(View view) {
        this.f15682d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.applovin.weakreference.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f15689k.onPossibleObstructionsDetected(this.f15686h, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f15688j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f15685g) {
            return;
        }
        this.f15681c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f15682d.get();
    }

    public List<e> d() {
        return this.f15681c.a();
    }

    public boolean e() {
        return this.f15689k != null;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f15685g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f15684f && !this.f15685g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f15685g) {
            return;
        }
        this.f15682d.clear();
        removeAllFriendlyObstructions();
        this.f15685g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f15683e = null;
        this.f15689k = null;
    }

    public boolean g() {
        return this.f15685g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f15686h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f15683e;
    }

    public boolean h() {
        return this.f15680b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f15680b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f15684f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f15687i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f15688j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f15685g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f15685g) {
            return;
        }
        this.f15681c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f15685g) {
            return;
        }
        this.f15681c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f15689k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f15684f) {
            return;
        }
        this.f15684f = true;
        c.c().c(this);
        this.f15683e.a(i.c().b());
        this.f15683e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f15683e.a(this, this.f15679a);
    }
}
