package y7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
/* compiled from: ScarInterstitialAd.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class e extends a<InterstitialAd> implements u7.a {
    public e(Context context, x7.a aVar, u7.c cVar, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, dVar);
        this.f33295e = new f(hVar, this);
    }

    @Override // u7.a
    public void a(Activity activity) {
        T t10 = this.f33291a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f33296f.handleError(com.unity3d.scar.adapter.common.b.a(this.f33293c));
        }
    }

    @Override // y7.a
    protected void c(AdRequest adRequest, u7.b bVar) {
        InterstitialAd.load(this.f33292b, this.f33293c.b(), adRequest, ((f) this.f33295e).e());
    }
}
