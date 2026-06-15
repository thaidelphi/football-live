package c8;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.i;
/* compiled from: ScarRewardedAd.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class g extends a<RewardedAd> implements u7.a {
    public g(Context context, b8.a aVar, u7.c cVar, com.unity3d.scar.adapter.common.d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.f5575e = new h(iVar, this);
    }

    @Override // u7.a
    public void a(Activity activity) {
        T t10 = this.f5571a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((h) this.f5575e).f());
        } else {
            this.f5576f.handleError(com.unity3d.scar.adapter.common.b.a(this.f5573c));
        }
    }

    @Override // c8.a
    protected void c(AdRequest adRequest, u7.b bVar) {
        RewardedAd.load(this.f5572b, this.f5573c.b(), adRequest, ((h) this.f5575e).e());
    }
}
