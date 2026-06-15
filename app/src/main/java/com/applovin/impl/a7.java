package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a7 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f6506a;

    /* renamed from: b  reason: collision with root package name */
    private k2 f6507b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            return i10 == d.SETTINGS.ordinal() ? a7.this.c() : a7.this.a();
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return e.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            if (i10 == d.SETTINGS.ordinal()) {
                return new m4("SETTINGS");
            }
            return new m4("GDPR APPLICABILITY");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f6509a;

        b(com.applovin.impl.sdk.j jVar) {
            this.f6509a = jVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            if (d2Var.b() == d.SETTINGS.ordinal()) {
                if (d2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f6509a.u().f() != null) {
                        b7.a(this.f6509a.u().f(), com.applovin.impl.sdk.j.m(), this.f6509a);
                    } else {
                        d7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", a7.this);
                    }
                } else if (d2Var.a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f6509a.u().h() == null) {
                } else {
                    b7.a(this.f6509a.u().h(), com.applovin.impl.sdk.j.m(), this.f6509a);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private j2 d() {
        j2.b d10 = j2.a().d("Terms of Service URL");
        if (this.f6506a.u().h() != null) {
            d10.a(R.drawable.applovin_ic_check_mark_bordered);
            d10.b(j0.a(R.color.applovin_sdk_checkmarkColor, this));
            d10.a(true);
        } else {
            d10.c("None");
            d10.a(false);
        }
        return d10.a();
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f6506a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f6506a = jVar;
        a aVar = new a(this);
        this.f6507b = aVar;
        aVar.a(new b(jVar));
        this.f6507b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f6507b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k2 k2Var = this.f6507b;
        if (k2Var != null) {
            k2Var.a((k2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f6506a.s().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography d10 = this.f6506a.u().d();
        boolean z10 = d7.c(this.f6506a) && d10 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(j2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z10));
        arrayList.add(b(d10, z10));
        return arrayList;
    }

    private j2 b() {
        boolean z10 = this.f6506a.u().f() != null;
        return j2.a().d("Privacy Policy URL").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(j0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }

    private j2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return j2.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? AdColonyAppOptions.GDPR : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z10).a();
    }

    private j2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z10) {
        return j2.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? AdColonyAppOptions.GDPR : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z10).a();
    }
}
