package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.d7;
import com.applovin.impl.h0;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final j f8406a;

    /* renamed from: b  reason: collision with root package name */
    private final n f8407b;

    /* renamed from: c  reason: collision with root package name */
    private ConsentForm f8408c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.privacy.cmp.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0130a implements ConsentInformation.OnConsentInfoUpdateSuccessListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f8409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f8410b;

        /* renamed from: com.applovin.impl.privacy.cmp.a$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0131a implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
            C0131a() {
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public void onConsentFormLoadSuccess(ConsentForm consentForm) {
                a.this.a("Successfully loaded consent form");
                a.this.f8408c = consentForm;
                C0130a.this.f8410b.onFlowLoaded(null);
            }
        }

        /* renamed from: com.applovin.impl.privacy.cmp.a$a$b */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class b implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
            b() {
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public void onConsentFormLoadFailure(FormError formError) {
                a aVar = a.this;
                aVar.b("Failed to load with error: " + formError.getMessage());
                C0130a c0130a = C0130a.this;
                c0130a.f8410b.onFlowLoadFailed(a.this.a(formError, "Consent form load failed"));
            }
        }

        C0130a(Activity activity, d dVar) {
            this.f8409a = activity;
            this.f8410b = dVar;
        }

        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
        public void onConsentInfoUpdateSuccess() {
            ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.f8409a);
            boolean isConsentFormAvailable = consentInformation.isConsentFormAvailable();
            int consentStatus = consentInformation.getConsentStatus();
            a aVar = a.this;
            aVar.a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + isConsentFormAvailable);
            if (!isConsentFormAvailable) {
                a.this.b("Failed to load form.");
                this.f8410b.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            } else if (consentStatus == 2) {
                a.this.a("Successfully requested consent info");
                a.this.a("Loading consent form...");
                UserMessagingPlatform.loadConsentForm(this.f8409a, new C0131a(), new b());
            } else {
                a aVar2 = a.this;
                aVar2.b("Failed to load with consent status: " + consentStatus);
                d dVar = this.f8410b;
                AppLovinCmpError.Code code = AppLovinCmpError.Code.FORM_NOT_REQUIRED;
                dVar.onFlowLoadFailed(new CmpErrorImpl(code, "Consent form not required for consent status: " + consentStatus));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements ConsentInformation.OnConsentInfoUpdateFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8414a;

        b(d dVar) {
            this.f8414a = dVar;
        }

        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
        public void onConsentInfoUpdateFailure(FormError formError) {
            a aVar = a.this;
            aVar.b("Failed to request consent info with error: " + formError.getMessage());
            this.f8414a.onFlowLoadFailed(a.this.a(formError, "Consent info update failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements ConsentForm.OnConsentFormDismissedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f8416a;

        c(d dVar) {
            this.f8416a = dVar;
        }

        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
        public void onConsentFormDismissed(FormError formError) {
            if (formError != null) {
                a aVar = a.this;
                aVar.b("Failed to show with error: " + formError.getMessage());
                this.f8416a.onFlowShowFailed(a.this.a(formError, "Consent form show failed"));
                return;
            }
            a.this.a("Consent form finished showing");
            this.f8416a.onFlowHidden(null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(j jVar) {
        this.f8406a = jVar;
        this.f8407b = jVar.I();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(j.m());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(j.m()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public void b(Activity activity, h0 h0Var, d dVar) {
        if (this.f8408c == null) {
            b("Failed to show - not ready yet");
            dVar.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
            return;
        }
        a("Showing consent form...");
        this.f8408c.show(activity, new c(dVar));
    }

    public void a() {
        if (this.f8408c != null) {
            this.f8408c = null;
        }
    }

    public void a(Activity activity, h0 h0Var, d dVar) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (d7.c(this.f8406a) && h0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f8406a.f0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new C0130a(activity, dVar), new b(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (n.a()) {
            this.f8407b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r1 != 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (n.a()) {
            this.f8407b.a("GoogleCmpAdapter", str);
        }
    }
}
