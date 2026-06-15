package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class FragmentStateAdapter$5 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f4560a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f4561b;

    @Override // androidx.lifecycle.m
    public void onStateChanged(p pVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            this.f4560a.removeCallbacks(this.f4561b);
            pVar.getLifecycle().d(this);
        }
    }
}
