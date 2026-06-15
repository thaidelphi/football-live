package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.k2;
import com.applovin.impl.z0;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class y0 extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private z0 f9649a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f9650b;

    /* renamed from: c  reason: collision with root package name */
    private ListView f9651c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9652a;

        /* renamed from: com.applovin.impl.y0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0140a implements d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d2 f9654a;

            C0140a(d2 d2Var) {
                this.f9654a = d2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((k1) y0.this.f9649a.d().get(this.f9654a.a()), y0.this.f9649a.e());
            }
        }

        a(c cVar) {
            this.f9652a = cVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            if (d2Var.b() != z0.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(y0.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f9652a, new C0140a(d2Var));
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f9650b = (FrameLayout) findViewById(16908290);
        this.f9651c = (ListView) findViewById(R.id.listView);
        u7.a(this.f9650b, com.applovin.impl.sdk.j.f8884u0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        z0 z0Var = this.f9649a;
        if (z0Var != null) {
            z0Var.a((k2.a) null);
            this.f9649a.g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        z0 z0Var = this.f9649a;
        if (z0Var == null) {
            finish();
            return;
        }
        this.f9651c.setAdapter((ListAdapter) z0Var);
        z0 z0Var2 = this.f9649a;
        if (z0Var2 != null && !z0Var2.e().v().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        z0 z0Var3 = this.f9649a;
        if (z0Var3 == null || !z0Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(z0 z0Var, c cVar) {
        this.f9649a = z0Var;
        z0Var.a(new a(cVar));
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f9650b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f9650b.bringChildToFront(textView);
    }
}
