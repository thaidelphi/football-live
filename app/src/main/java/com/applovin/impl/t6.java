package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class t6 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f9285a;

    /* renamed from: b  reason: collision with root package name */
    private String f9286b;

    /* renamed from: c  reason: collision with root package name */
    private String f9287c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f9287c);
        intent.putExtra("android.intent.extra.TITLE", this.f9286b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f9286b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f9285a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.j jVar) {
        this.f9285a = jVar;
        this.f9286b = str;
        this.f9287c = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f9286b);
        ((TextView) findViewById(R.id.textView)).setText(this.f9287c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
