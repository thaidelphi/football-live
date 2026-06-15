package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.c;
import i8.p;
import i8.w;
import j8.m;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m8.d;
import t8.q;
/* compiled from: AndroidScarManager.kt */
@f(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {123}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class AndroidScarManager$show$2 extends l implements q<g9.f<? super GmaEventData>, GmaEventData, d<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidScarManager$show$2(d<? super AndroidScarManager$show$2> dVar) {
        super(3, dVar);
    }

    @Override // t8.q
    public final Object invoke(g9.f<? super GmaEventData> fVar, GmaEventData gmaEventData, d<? super Boolean> dVar) {
        AndroidScarManager$show$2 androidScarManager$show$2 = new AndroidScarManager$show$2(dVar);
        androidScarManager$show$2.L$0 = fVar;
        androidScarManager$show$2.L$1 = gmaEventData;
        return androidScarManager$show$2.invokeSuspend(w.f26638a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        GmaEventData gmaEventData;
        boolean j10;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
            this.L$0 = gmaEventData2;
            this.label = 1;
            if (((g9.f) this.L$0).emit(gmaEventData2, this) == c10) {
                return c10;
            }
            gmaEventData = gmaEventData2;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            gmaEventData = (GmaEventData) this.L$0;
            p.b(obj);
        }
        j10 = m.j(new c[]{c.AD_CLOSED, c.NO_AD_ERROR, c.INTERSTITIAL_SHOW_ERROR, c.REWARDED_SHOW_ERROR}, gmaEventData.getGmaEvent());
        return kotlin.coroutines.jvm.internal.b.a(!j10);
    }
}
