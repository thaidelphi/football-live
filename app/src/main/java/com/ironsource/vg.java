package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class vg extends FrameLayout implements vh {

    /* renamed from: b  reason: collision with root package name */
    private static final String f21137b = "IronSourceAdContainer";

    /* renamed from: a  reason: collision with root package name */
    private ah f21138a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21140b;

        a(String str, String str2) {
            this.f21139a = str;
            this.f21140b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            vg vgVar = vg.this;
            vgVar.removeView(vgVar.f21138a.getPresentingView());
            vg.this.f21138a.a(this.f21139a, this.f21140b);
            vg.this.f21138a = null;
        }
    }

    public vg(Context context) {
        super(context);
    }

    public vg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public vg(ah ahVar, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(ahVar.d().c(), ahVar.d().a()));
        this.f21138a = ahVar;
        addView(ahVar.getPresentingView());
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f21138a.c().a().getJSONObject(ug.f21001p).getJSONObject(ug.f21004s);
        } catch (Exception e8) {
            o9.d().a(e8);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f21138a.b());
        this.f21138a.c().a(b9.g.S, jSONObject);
    }

    public void a() throws Exception {
        ah ahVar = this.f21138a;
        if (ahVar == null || ahVar.c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    @Override // com.ironsource.vh
    public synchronized void a(String str, String str2) {
        ah ahVar = this.f21138a;
        if (ahVar != null && ahVar.c() != null && this.f21138a.getPresentingView() != null) {
            this.f21138a.c().e();
            hg.f17676a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.vh
    public void a(String str, String str2, String str3) {
        ah ahVar = this.f21138a;
        if (ahVar == null) {
            return;
        }
        ahVar.a(str, str2, str3);
    }

    @Override // com.ironsource.vh
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f21138a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.vh
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f21138a.b(jSONObject, str, str2);
    }

    @Override // com.ironsource.vh
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f21138a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.vh
    public WebView getPresentingView() {
        return this.f21138a.getPresentingView();
    }

    public tg getSize() {
        ah ahVar = this.f21138a;
        return ahVar != null ? ahVar.d() : new tg();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        Logger.i(f21137b, "onVisibilityChanged: " + i10);
        ah ahVar = this.f21138a;
        if (ahVar == null) {
            return;
        }
        try {
            ahVar.c().a(ug.f20996k, i10, isShown());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        Logger.i(f21137b, "onWindowVisibilityChanged: " + i10);
        ah ahVar = this.f21138a;
        if (ahVar == null) {
            return;
        }
        try {
            ahVar.c().a(ug.f20997l, i10, isShown());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }
}
