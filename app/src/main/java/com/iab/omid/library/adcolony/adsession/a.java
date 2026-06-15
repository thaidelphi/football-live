package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.b.c;
import com.iab.omid.library.adcolony.b.f;
import com.iab.omid.library.adcolony.d.e;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f15567a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f15568b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f15569c;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.adcolony.e.a f15571e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f15572f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15576j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15577k;

    /* renamed from: l  reason: collision with root package name */
    private PossibleObstructionListener f15578l;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f15570d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f15573g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15574h = false;

    /* renamed from: i  reason: collision with root package name */
    private final String f15575i = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f15569c = adSessionConfiguration;
        this.f15568b = adSessionContext;
        c(null);
        this.f15572f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.adcolony.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f15572f.a();
        com.iab.omid.library.adcolony.b.a.a().a(this);
        this.f15572f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f15570d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f15567a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f15571e = new com.iab.omid.library.adcolony.e.a(view);
    }

    private void d(View view) {
        Collection<a> b10 = com.iab.omid.library.adcolony.b.a.a().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.e() == view) {
                aVar.f15571e.clear();
            }
        }
    }

    private void k() {
        if (this.f15576j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void l() {
        if (this.f15577k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f15570d;
    }

    public void a(List<com.iab.omid.library.adcolony.e.a> list) {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.adcolony.e.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f15578l.onPossibleObstructionsDetected(this.f15575i, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        l();
        getAdSessionStatePublisher().a(jSONObject);
        this.f15577k = true;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f15574h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f15570d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public boolean b() {
        return this.f15578l != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        k();
        getAdSessionStatePublisher().g();
        this.f15576j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        l();
        getAdSessionStatePublisher().h();
        this.f15577k = true;
    }

    public View e() {
        return this.f15571e.get();
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f15574h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f15573g && !this.f15574h;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void finish() {
        if (this.f15574h) {
            return;
        }
        this.f15571e.clear();
        removeAllFriendlyObstructions();
        this.f15574h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.adcolony.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f15572f = null;
        this.f15578l = null;
    }

    public boolean g() {
        return this.f15573g;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public String getAdSessionId() {
        return this.f15575i;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f15572f;
    }

    public boolean h() {
        return this.f15574h;
    }

    public boolean i() {
        return this.f15569c.isNativeImpressionOwner();
    }

    public boolean j() {
        return this.f15569c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f15574h) {
            return;
        }
        e.a(view, "AdView is null");
        if (e() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f15574h) {
            return;
        }
        this.f15570d.clear();
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f15574h) {
            return;
        }
        b(view);
        c a10 = a(view);
        if (a10 != null) {
            this.f15570d.remove(a10);
        }
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f15578l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.adcolony.adsession.AdSession
    public void start() {
        if (this.f15573g) {
            return;
        }
        this.f15573g = true;
        com.iab.omid.library.adcolony.b.a.a().b(this);
        this.f15572f.a(f.a().d());
        this.f15572f.a(this, this.f15568b);
    }
}
