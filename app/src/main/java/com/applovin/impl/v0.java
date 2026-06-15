package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q0;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9396a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9397b;

    /* renamed from: c  reason: collision with root package name */
    private List f9398c;

    /* renamed from: d  reason: collision with root package name */
    private String f9399d;

    /* renamed from: e  reason: collision with root package name */
    private r0 f9400e;

    /* renamed from: f  reason: collision with root package name */
    private q0.b f9401f;

    /* renamed from: g  reason: collision with root package name */
    private r0 f9402g;

    /* renamed from: h  reason: collision with root package name */
    private Dialog f9403h;

    /* renamed from: i  reason: collision with root package name */
    private q0.a f9404i = new q0.a();

    /* renamed from: j  reason: collision with root package name */
    private final com.applovin.impl.b f9405j = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || v0.this.f9402g == null) {
                return;
            }
            if (v0.this.f9403h != null) {
                v0 v0Var = v0.this;
                if (!com.applovin.impl.d.a(v0Var.a(v0Var.f9403h))) {
                    v0.this.f9403h.dismiss();
                }
                v0.this.f9403h = null;
            }
            r0 r0Var = v0.this.f9402g;
            v0.this.f9402g = null;
            v0 v0Var2 = v0.this;
            v0Var2.a(v0Var2.f9400e, r0Var, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f9407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r0 f9408b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f9409c;

        b(t0 t0Var, r0 r0Var, Activity activity) {
            this.f9407a = t0Var;
            this.f9408b = r0Var;
            this.f9409c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            v0.this.f9402g = null;
            v0.this.f9403h = null;
            r0 a10 = v0.this.a(this.f9407a.a());
            if (a10 != null) {
                v0.this.a(this.f9408b, a10, this.f9409c);
                if (a10.c() != r0.b.ALERT) {
                    dialogInterface.dismiss();
                    return;
                }
                return;
            }
            v0.this.a("Destination state for TOS/PP alert is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f9411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9412b;

        c(Uri uri, Activity activity) {
            this.f9411a = uri;
            this.f9412b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            d7.a(this.f9411a, this.f9412b, v0.this.f9396a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f9414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9415b;

        d(Uri uri, Activity activity) {
            this.f9414a = uri;
            this.f9415b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            d7.a(this.f9414a, this.f9415b, v0.this.f9396a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements CmpServiceImpl.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f9417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9418b;

        e(r0 r0Var, Activity activity) {
            this.f9417a = r0Var;
            this.f9418b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            v0.this.f9404i.a(appLovinCmpError);
            v0.this.a(this.f9417a, this.f9418b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f9420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9421b;

        f(r0 r0Var, Activity activity) {
            this.f9420a = r0Var;
            this.f9421b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            v0.this.f9404i.a(appLovinCmpError);
            v0.this.a(this.f9420a, this.f9421b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements CmpServiceImpl.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f9423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f9424b;

        g(r0 r0Var, Activity activity) {
            this.f9423a = r0Var;
            this.f9424b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                v0.this.f9404i.a(appLovinCmpError);
            } else {
                v0.this.f9404i.a(true);
            }
            v0.this.b(this.f9423a, this.f9424b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0 f9426a;

        h(r0 r0Var) {
            this.f9426a = r0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            v0 v0Var = v0.this;
            v0Var.a(v0Var.f9400e, this.f9426a, v0.this.f9396a.m0());
        }
    }

    public v0(com.applovin.impl.sdk.j jVar) {
        this.f9396a = jVar;
        this.f9397b = ((Integer) jVar.a(o4.f8185o6)).intValue();
    }

    private void c(final r0 r0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ye
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.a(r0Var, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(r0 r0Var, Activity activity) {
        a(r0Var, activity, (Boolean) null);
    }

    private void b() {
        this.f9398c = null;
        this.f9400e = null;
        this.f9396a.e().b(this.f9405j);
        q0.b bVar = this.f9401f;
        if (bVar != null) {
            bVar.a(this.f9404i);
            this.f9401f = null;
        }
        this.f9404i = new q0.a();
    }

    public void a(Activity activity, q0.b bVar) {
        a(r0.a.IS_AL_GDPR.b(), activity, bVar);
    }

    public void a(int i10, Activity activity, q0.b bVar) {
        if (this.f9398c != null) {
            this.f9396a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f9396a.I();
                I.a("ConsentFlowStateMachine", "Unable to start states: " + this.f9398c);
            }
            this.f9396a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I2 = this.f9396a.I();
                I2.a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f9398c);
            }
            bVar.a(new q0.a(new p0(p0.f8319d, "Consent flow is already in progress.")));
            return;
        }
        List a10 = w0.a(this.f9396a);
        this.f9398c = a10;
        this.f9399d = String.valueOf(a10);
        this.f9401f = bVar;
        r0 a11 = a(i10);
        this.f9396a.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I3 = this.f9396a.I();
            I3.a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f9398c + "\nInitial state: " + a11);
        }
        com.applovin.impl.sdk.j.a(activity).a(this.f9405j);
        a((r0) null, a11, activity);
    }

    public boolean a() {
        return this.f9398c != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(r0 r0Var, Activity activity, Boolean bool) {
        a(r0Var, a(r0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(r0 r0Var, r0 r0Var2, Activity activity) {
        this.f9400e = r0Var;
        c(r0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(r0 r0Var, final Activity activity) {
        if (r0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f9396a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f9396a.I().a("ConsentFlowStateMachine", "Transitioning to state: " + r0Var);
        }
        if (r0Var.c() == r0.b.ALERT) {
            if (com.applovin.impl.d.a(activity)) {
                a(r0Var);
                return;
            }
            this.f9396a.z().trackEvent("cf_start");
            s0 s0Var = (s0) r0Var;
            this.f9402g = s0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (t0 t0Var : s0Var.d()) {
                b bVar = new b(t0Var, r0Var, activity);
                if (t0Var.c() == t0.a.POSITIVE) {
                    builder.setPositiveButton(t0Var.d(), bVar);
                } else if (t0Var.c() == t0.a.NEGATIVE) {
                    builder.setNegativeButton(t0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(t0Var.d(), bVar);
                }
            }
            String f10 = s0Var.f();
            SpannableString spannableString = null;
            if (StringUtils.isValidString(f10)) {
                spannableString = new SpannableString(f10);
                String a10 = com.applovin.impl.sdk.j.a(R.string.applovin_terms_of_service_text);
                String a11 = com.applovin.impl.sdk.j.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(f10, Arrays.asList(a10, a11))) {
                    Uri h10 = this.f9396a.u().h();
                    if (h10 != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(a10), new c(h10, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a11), new d(this.f9396a.u().f(), activity), true);
                }
            }
            final AlertDialog create = builder.setTitle(spannableString).setMessage(s0Var.e()).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.xe
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    v0.this.a(create, activity, dialogInterface);
                }
            });
            this.f9403h = create;
            create.show();
            this.f9404i.b(true);
        } else if (r0Var.c() == r0.b.POST_ALERT) {
            if (this.f9396a.u().k() && this.f9396a.u().m()) {
                if (com.applovin.impl.d.a(activity)) {
                    a(r0Var);
                    return;
                } else {
                    this.f9396a.p().loadCmp(activity, new e(r0Var, activity));
                    return;
                }
            }
            a(r0Var, activity, Boolean.FALSE);
        } else if (r0Var.c() == r0.b.EVENT) {
            u0 u0Var = (u0) r0Var;
            String e8 = u0Var.e();
            Map<String, String> d10 = u0Var.d();
            if (d10 == null) {
                d10 = new HashMap<>(1);
            }
            d10.put("flow_type", "unified");
            this.f9396a.z().trackEvent(e8, d10);
            b(u0Var, activity);
        } else if (r0Var.c() == r0.b.CMP_LOAD) {
            if (com.applovin.impl.d.a(activity)) {
                a(r0Var);
            } else if (this.f9396a.u().m()) {
                this.f9396a.p().preloadCmp(activity);
                a(r0Var, activity, Boolean.FALSE);
            } else {
                this.f9396a.p().loadCmp(activity, new f(r0Var, activity));
            }
        } else if (r0Var.c() == r0.b.CMP_SHOW) {
            if (com.applovin.impl.d.a(activity)) {
                a(r0Var);
                return;
            }
            if (!this.f9396a.u().m()) {
                this.f9396a.z().trackEvent("cf_start");
            }
            this.f9396a.p().showCmp(activity, new g(r0Var, activity));
        } else if (r0Var.c() == r0.b.DECISION) {
            r0.a a12 = r0Var.a();
            if (a12 == r0.a.IS_AL_GDPR) {
                a(r0Var, activity, Boolean.valueOf(this.f9396a.u().k()));
            } else if (a12 == r0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                a(r0Var, activity, Boolean.valueOf(((!this.f9396a.r0()) || ((Boolean) this.f9396a.a(q4.f8452o, Boolean.FALSE)).booleanValue()) ? true : true));
            } else if (a12 == r0.a.HAS_TERMS_OF_SERVICE_URI) {
                a(r0Var, activity, Boolean.valueOf(this.f9396a.u().h() != null));
            } else {
                a("Invalid consent flow decision type: " + a12);
            }
        } else if (r0Var.c() == r0.b.REINIT) {
            b();
        } else {
            a("Invalid consent flow destination state: " + r0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f9397b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
    }

    private void a(r0 r0Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(r0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        f1.a(str, new Object[0]);
        this.f9396a.D().a(y1.f9671i0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f9399d + "\nLast successful state: " + this.f9400e));
        q0.a aVar = this.f9404i;
        if (aVar != null) {
            aVar.a(new p0(p0.f8320e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r0 a(int i10) {
        List<r0> list = this.f9398c;
        if (list == null) {
            return null;
        }
        for (r0 r0Var : list) {
            if (i10 == r0Var.b()) {
                return r0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
            return null;
        }
        return null;
    }
}
