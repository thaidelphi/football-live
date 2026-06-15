package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qh extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final String f19889a;

    /* renamed from: b  reason: collision with root package name */
    private a f19890b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(qv qvVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
        this.f19889a = "ISNNativeAdContainer";
    }

    private final qv a() {
        return new qv(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.f19890b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.n.f(changedView, "changedView");
        String str = this.f19889a;
        Logger.i(str, "onVisibilityChanged: " + i10);
        a aVar = this.f19890b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        String str = this.f19889a;
        Logger.i(str, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f19890b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.f19890b = aVar;
    }
}
