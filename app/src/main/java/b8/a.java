package b8;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
/* compiled from: AdRequestFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private t7.a f5281a;

    public a(t7.a aVar) {
        this.f5281a = aVar;
    }

    public AdRequest a() {
        return c().build();
    }

    public AdRequest b(String str) {
        if (str.isEmpty()) {
            return a();
        }
        return c().setAdString(str).build();
    }

    public AdRequest.Builder c() {
        return new AdRequest.Builder().setRequestAgent(this.f5281a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f5281a.a());
    }
}
