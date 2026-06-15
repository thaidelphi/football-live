package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.b;
import com.iab.omid.library.unity3d.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a extends AdSession {

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f16071l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    private final AdSessionContext f16072a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionConfiguration f16073b;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.unity3d.weakreference.a f16075d;

    /* renamed from: e  reason: collision with root package name */
    private AdSessionStatePublisher f16076e;

    /* renamed from: h  reason: collision with root package name */
    private final String f16079h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16080i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16081j;

    /* renamed from: k  reason: collision with root package name */
    private PossibleObstructionListener f16082k;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f16074c = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f16077f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16078g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f16073b = adSessionConfiguration;
        this.f16072a = adSessionContext;
        String uuid = UUID.randomUUID().toString();
        this.f16079h = uuid;
        d(null);
        this.f16076e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.unity3d.publisher.a(uuid, adSessionContext.getWebView()) : new b(uuid, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f16076e.i();
        c.c().a(this);
        this.f16076e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f16080i) {
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
            if (!f16071l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f16074c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void b() {
        if (this.f16081j) {
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
                aVar.f16075d.clear();
            }
        }
    }

    private void d(View view) {
        this.f16075d = new com.iab.omid.library.unity3d.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.unity3d.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.unity3d.weakreference.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f16082k.onPossibleObstructionsDetected(this.f16079h, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f16081j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f16078g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f16074c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f16075d.get();
    }

    public List<e> d() {
        return this.f16074c;
    }

    public boolean e() {
        return this.f16082k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f16078g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f16077f && !this.f16078g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f16078g) {
            return;
        }
        this.f16075d.clear();
        removeAllFriendlyObstructions();
        this.f16078g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f16076e = null;
        this.f16082k = null;
    }

    public boolean g() {
        return this.f16078g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f16079h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f16076e;
    }

    public boolean h() {
        return this.f16073b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f16073b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f16077f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f16080i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f16081j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f16078g) {
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

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f16078g) {
            return;
        }
        this.f16074c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f16078g) {
            return;
        }
        a(view);
        e b10 = b(view);
        if (b10 != null) {
            this.f16074c.remove(b10);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f16082k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f16077f) {
            return;
        }
        this.f16077f = true;
        c.c().c(this);
        this.f16076e.a(h.c().b());
        this.f16076e.a(com.iab.omid.library.unity3d.internal.a.a().b());
        this.f16076e.a(this, this.f16072a);
    }
}
