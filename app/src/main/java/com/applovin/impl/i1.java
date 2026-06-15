package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i1 extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private k1 f7200a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.sdk.j f7201b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f7202c;

    /* renamed from: d  reason: collision with root package name */
    private Button f7203d;

    private void b() {
        n2 n2Var = new n2();
        n2Var.a(this.f7201b.v().a(this.f7200a));
        String b10 = this.f7201b.v().b(this.f7200a.a());
        if (b10 != null) {
            n2Var.a("\nBid Response Preview:\n");
            n2Var.a(b10);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f7202c = textView;
        textView.setText(n2Var.toString());
        this.f7202c.setTextColor(-16777216);
    }

    public void a(k1 k1Var, com.applovin.impl.sdk.j jVar) {
        this.f7200a = k1Var;
        this.f7201b = jVar;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f7200a.c() + " - " + this.f7200a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        u7.a(findViewById(16908290), this.f7201b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f7203d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ya
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i1.this.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        } else if (R.id.action_share == menuItem.getItemId()) {
            this.f7201b.v().a(this.f7200a, (Context) this, false);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f7201b.v().a(this.f7200a, (Context) this, true);
    }

    private boolean a() {
        return (this.f7200a == null || this.f7201b == null) ? false : true;
    }
}
