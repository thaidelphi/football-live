package y7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.i;
/* compiled from: ScarRewardedAd.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class g extends a<RewardedAd> implements u7.a {
    public g(Context context, x7.a aVar, u7.c cVar, com.unity3d.scar.adapter.common.d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f33295e = new h(iVar, this);
    }

    @Override // u7.a
    public void a(Activity activity) {
        T t10 = this.f33291a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((h) this.f33295e).f());
        } else {
            this.f33296f.handleError(com.unity3d.scar.adapter.common.b.a(this.f33293c));
        }
    }

    @Override // y7.a
    protected void c(AdRequest adRequest, u7.b bVar) {
        RewardedAd.load(this.f33292b, this.f33293c.b(), adRequest, ((h) this.f33295e).e());
    }
}
