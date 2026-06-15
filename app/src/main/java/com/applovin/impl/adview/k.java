package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.x1;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k extends View {

    /* renamed from: a  reason: collision with root package name */
    private final x1 f6639a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6640b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a();

        void onFailure();
    }

    public k(x1 x1Var, Context context) {
        super(context);
        this.f6639a = x1Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f6640b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f6639a.b();
    }

    public void a(a aVar) {
        if (this.f6640b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a10 = this.f6639a.a();
        if (a10 == null) {
            if (aVar != null) {
                aVar.onFailure();
                return;
            }
            return;
        }
        setBackground(a10);
        this.f6640b = true;
        if (aVar != null) {
            aVar.a();
        }
    }
}
