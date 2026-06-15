package c8;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
/* compiled from: ScarInterstitialAd.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class e extends a<InterstitialAd> implements u7.a {
    public e(Context context, b8.a aVar, u7.c cVar, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, dVar);
        this.f5575e = new f(hVar, this);
    }

    @Override // u7.a
    public void a(Activity activity) {
        T t10 = this.f5571a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f5576f.handleError(com.unity3d.scar.adapter.common.b.a(this.f5573c));
        }
    }

    @Override // c8.a
    protected void c(AdRequest adRequest, u7.b bVar) {
        InterstitialAd.load(this.f5572b, this.f5573c.b(), adRequest, ((f) this.f5575e).e());
    }
}
