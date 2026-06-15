package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f15808a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f15809b;

    /* renamed from: c  reason: collision with root package name */
    private final f f15810c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f15811d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f15812e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15813f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15814g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15815h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15816i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15817j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f15818k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f15810c = new f();
        this.f15813f = false;
        this.f15814g = false;
        this.f15809b = adSessionConfiguration;
        this.f15808a = adSessionContext;
        this.f15815h = str;
        b(null);
        this.f15812e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f15812e.i();
        c.c().a(this);
        this.f15812e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f15816i) {
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
                aVar.f15811d.clear();
            }
        }
    }

    private void b() {
        if (this.f15817j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(View view) {
        this.f15811d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.ironsrc.weakreference.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f15818k.onPossibleObstructionsDetected(this.f15815h, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f15817j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f15814g) {
            return;
        }
        this.f15810c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f15811d.get();
    }

    public List<e> d() {
        return this.f15810c.a();
    }

    public boolean e() {
        return this.f15818k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f15814g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f15813f && !this.f15814g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f15814g) {
            return;
        }
        this.f15811d.clear();
        removeAllFriendlyObstructions();
        this.f15814g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f15812e = null;
        this.f15818k = null;
    }

    public boolean g() {
        return this.f15814g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f15815h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f15812e;
    }

    public boolean h() {
        return this.f15809b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f15809b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f15813f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f15816i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f15817j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f15814g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f15814g) {
            return;
        }
        this.f15810c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f15814g) {
            return;
        }
        this.f15810c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f15818k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f15813f || this.f15812e == null) {
            return;
        }
        this.f15813f = true;
        c.c().c(this);
        this.f15812e.a(i.c().b());
        this.f15812e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f15812e.a(this, this.f15808a);
    }
}
