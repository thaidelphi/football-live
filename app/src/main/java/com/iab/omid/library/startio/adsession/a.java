package com.iab.omid.library.startio.adsession;

import android.view.View;
import com.iab.omid.library.startio.internal.c;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.internal.h;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import com.iab.omid.library.startio.publisher.b;
import com.iab.omid.library.startio.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends AdSession {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f15943l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f15944a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f15945b;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.startio.weakreference.a f15947d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f15948e;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15952i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15953j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f15954k;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f15946c = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f15949f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15950g = false;

    /* renamed from: h  reason: collision with root package name */
    private final String f15951h = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f15945b = adSessionConfiguration;
        this.f15944a = adSessionContext;
        d(null);
        this.f15948e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.startio.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f15948e.i();
        c.c().a(this);
        this.f15948e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f15952i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f15943l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f15946c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void b() {
        if (this.f15953j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> b10 = c.c().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.c() == view) {
                aVar.f15947d.clear();
            }
        }
    }

    private void d(View view) {
        this.f15947d = new com.iab.omid.library.startio.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.startio.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.startio.weakreference.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f15954k.onPossibleObstructionsDetected(this.f15951h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f15953j = true;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f15950g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f15946c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f15947d.get();
    }

    public List<e> d() {
        return this.f15946c;
    }

    public boolean e() {
        return this.f15954k != null;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f15950g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f15949f && !this.f15950g;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void finish() {
        if (this.f15950g) {
            return;
        }
        this.f15947d.clear();
        removeAllFriendlyObstructions();
        this.f15950g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f15948e = null;
        this.f15954k = null;
    }

    public boolean g() {
        return this.f15950g;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public String getAdSessionId() {
        return this.f15951h;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f15948e;
    }

    public boolean h() {
        return this.f15945b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f15945b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f15949f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f15952i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f15953j = true;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f15950g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f15950g) {
            return;
        }
        this.f15946c.clear();
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f15950g) {
            return;
        }
        a(view);
        e b10 = b(view);
        if (b10 != null) {
            this.f15946c.remove(b10);
        }
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f15954k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void start() {
        if (this.f15949f) {
            return;
        }
        this.f15949f = true;
        c.c().c(this);
        this.f15948e.a(h.c().b());
        this.f15948e.a(com.iab.omid.library.startio.internal.a.a().b());
        this.f15948e.a(this, this.f15944a);
    }
}
