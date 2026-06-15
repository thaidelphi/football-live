package com.startapp.sdk.ads.list3d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.b9;
import com.startapp.a1;
import com.startapp.a5;
import com.startapp.b5;
import com.startapp.c5;
import com.startapp.e8;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.k6;
import com.startapp.l3;
import com.startapp.o9;
import com.startapp.q;
import com.startapp.s7;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.u4;
import com.startapp.y4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class List3DActivity extends Activity implements k6 {

    /* renamed from: a  reason: collision with root package name */
    public List3DView f22623a;

    /* renamed from: b  reason: collision with root package name */
    public int f22624b;

    /* renamed from: c  reason: collision with root package name */
    public Long f22625c;

    /* renamed from: d  reason: collision with root package name */
    public Long f22626d;

    /* renamed from: f  reason: collision with root package name */
    public String f22628f;

    /* renamed from: g  reason: collision with root package name */
    public String f22629g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f22630h;

    /* renamed from: i  reason: collision with root package name */
    public b5 f22631i;

    /* renamed from: e  reason: collision with root package name */
    public long f22627e = 0;

    /* renamed from: j  reason: collision with root package name */
    public a f22632j = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            List3DActivity.this.finish();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements AdapterView.OnItemClickListener {

        /* compiled from: Sta */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                List3DActivity.this.finish();
            }
        }

        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            String str;
            s7 s7Var;
            String str2 = ((y4) List3DActivity.this.f22630h.get(i10)).f23565b;
            String[] strArr = ((y4) List3DActivity.this.f22630h.get(i10)).f23567d;
            String str3 = ((y4) List3DActivity.this.f22630h.get(i10)).f23569f;
            boolean z10 = ((y4) List3DActivity.this.f22630h.get(i10)).f23574k;
            boolean z11 = ((y4) List3DActivity.this.f22630h.get(i10)).f23575l;
            String str4 = ((y4) List3DActivity.this.f22630h.get(i10)).f23577n;
            String str5 = ((y4) List3DActivity.this.f22630h.get(i10)).f23576m;
            Boolean bool = ((y4) List3DActivity.this.f22630h.get(i10)).f23579p;
            List3DActivity list3DActivity = List3DActivity.this;
            a5 a10 = list3DActivity.f22631i.a(list3DActivity.f22628f);
            String[] strArr2 = ((y4) List3DActivity.this.f22630h.get(i10)).f23566c;
            j3 j3Var = a10.f21757a;
            String str6 = a10.f21759c;
            j3Var.getClass();
            if (strArr2 != null) {
                str = TextUtils.join("^", strArr2) + str6;
            } else {
                str = null;
            }
            HashMap<String, s7> hashMap = j3Var.f22126c;
            if (hashMap != null && (s7Var = hashMap.get(str)) != null) {
                s7Var.a(null, null);
            }
            if (str4 != null && !TextUtils.isEmpty(str4)) {
                List3DActivity list3DActivity2 = List3DActivity.this;
                com.startapp.sdk.adsbase.a.a(str4, str5, str2, list3DActivity2, new TrackingParams(list3DActivity2.f22629g));
                List3DActivity.this.finish();
            } else if (TextUtils.isEmpty(str2)) {
            } else {
                boolean m7 = MetaData.f23158k.m();
                boolean a11 = com.startapp.sdk.adsbase.a.a(List3DActivity.this.getApplicationContext(), AdPreferences.Placement.INAPP_OFFER_WALL);
                if (z10 && !a11) {
                    List3DActivity list3DActivity3 = List3DActivity.this;
                    list3DActivity3.getClass();
                    com.startapp.sdk.adsbase.a.a(list3DActivity3, str2, strArr, str3, new CloseTrackingParams(list3DActivity3.f22629g, (SystemClock.uptimeMillis() - list3DActivity3.f22627e) / 1000), AdsCommonMetaData.f22889h.z(), AdsCommonMetaData.f22889h.y(), z11, bool, false, m7 ? new a() : null);
                    return;
                }
                List3DActivity list3DActivity4 = List3DActivity.this;
                list3DActivity4.getClass();
                com.startapp.sdk.adsbase.a.a((Context) list3DActivity4, str2, strArr, (TrackingParams) new CloseTrackingParams(list3DActivity4.f22629g, (SystemClock.uptimeMillis() - list3DActivity4.f22627e) / 1000), z11 && !a11, false);
                if (m7) {
                    List3DActivity.this.finish();
                }
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List3DActivity list3DActivity = List3DActivity.this;
            ArrayList arrayList = list3DActivity.f22630h;
            String str = "";
            if (arrayList != null && !arrayList.isEmpty() && ((y4) list3DActivity.f22630h.get(0)).f23568e != null) {
                str = ((y4) list3DActivity.f22630h.get(0)).f23568e;
            }
            List3DActivity list3DActivity2 = List3DActivity.this;
            list3DActivity2.getClass();
            com.startapp.sdk.adsbase.a.a(list3DActivity, str, new CloseTrackingParams(list3DActivity2.f22629g, (SystemClock.uptimeMillis() - list3DActivity2.f22627e) / 1000));
            List3DActivity.this.finish();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public final void run() {
            try {
                List3DActivity.this.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Throwable th) {
                if (o9.a(th, (Class<? extends Throwable>) RemoteException.class)) {
                    return;
                }
                l3.a(th);
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        String str;
        b5 b5Var;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.f22630h;
            if (arrayList == null || arrayList.isEmpty()) {
                str = "";
            } else {
                str = ((y4) this.f22630h.get(0)).f23568e != null ? ((y4) this.f22630h.get(0)).f23568e : "";
            }
            com.startapp.sdk.adsbase.a.a(this, str, new CloseTrackingParams(this.f22629g, (SystemClock.uptimeMillis() - this.f22627e) / 1000));
            Object obj = StartAppSDKInternal.C;
            StartAppSDKInternal.c.f22944a.f22923o = false;
            if (this.f22624b == getResources().getConfiguration().orientation) {
                c5.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                if (this.f22632j != null) {
                    c5.a(this).a(this.f22632j);
                    this.f22632j = null;
                }
            }
            String str2 = this.f22628f;
            if (str2 != null && (b5Var = this.f22631i) != null) {
                for (s7 s7Var : b5Var.a(str2).f21757a.f22126c.values()) {
                    if (s7Var != null) {
                        s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!q.f22400f.booleanValue()) {
                    this.f22631i.f21794a.remove(this.f22628f);
                }
            }
        } catch (Throwable th) {
            l3.a(th);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b5 b5Var = this.f22631i;
        if (b5Var != null) {
            for (s7 s7Var : b5Var.a(this.f22628f).f21757a.f22126c.values()) {
                if (s7Var != null) {
                    s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.startapp.sdk.adsbase.adinformation.AdInformationObject] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.startapp.sdk.ads.list3d.List3DActivity, android.content.Context, com.startapp.k6, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r15v32, types: [android.widget.RelativeLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.RelativeLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v28, types: [android.widget.ImageButton, android.widget.ImageView] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        TextView textView;
        try {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            if (getIntent().getBooleanExtra("fullscreen", false)) {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
            if (bundle == null) {
                c5.a((Context) this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.f22625c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f22626d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f22625c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f22626d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra(b9.h.L);
            this.f22628f = getIntent().getStringExtra("listModelUuid");
            c5.a((Context) this).a(this.f22632j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f22624b = getResources().getConfiguration().orientation;
            WeakHashMap weakHashMap = o9.f22359a;
            o9.a((Activity) this, getResources().getConfiguration().orientation, true);
            requestWindowFeature(1);
            this.f22629g = getIntent().getStringExtra("adTag");
            int d10 = AdsCommonMetaData.f22889h.d();
            int c10 = AdsCommonMetaData.f22889h.c();
            this.f22623a = new List3DView(this);
            this.f22623a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{d10, c10}));
            b5 a10 = com.startapp.sdk.components.a.a(this).O.a();
            this.f22631i = a10;
            ArrayList arrayList = a10.a(this.f22628f).f21758b;
            this.f22630h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f22623a.setStarted();
            this.f22623a.setHint(true);
            this.f22623a.setFade(true);
            u4 u4Var = new u4(this, this.f22630h, this.f22629g, this.f22628f);
            this.f22631i.a(this.f22628f).a(this);
            this.f22623a.setAdapter(u4Var);
            this.f22623a.setDynamics(new e8());
            this.f22623a.setOnItemClickListener(new b());
            ?? relativeLayout = new RelativeLayout(this);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(1475346432);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            ?? linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            relativeLayout.addView(linearLayout, layoutParams2);
            ?? relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setBackgroundColor(AdsCommonMetaData.f22889h.A().intValue());
            linearLayout.addView(relativeLayout2);
            TextView textView2 = new TextView(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            textView2.setLayoutParams(layoutParams3);
            float f10 = 2;
            textView2.setPadding(0, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5, getResources().getDisplayMetrics())));
            textView2.setTextColor(AdsCommonMetaData.f22889h.D().intValue());
            textView2.setTextSize(AdsCommonMetaData.f22889h.F().intValue());
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(AdsCommonMetaData.f22889h.B());
            textView2.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            j9.a(textView2, AdsCommonMetaData.f22889h.E());
            relativeLayout2.addView(textView2);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap b10 = a1.b(this, "close_button.png");
            if (b10 == null) {
                b10 = a1.b(this, "close_button.png");
            }
            if (b10 != null) {
                ?? imageButton = new ImageButton(this, null, 16973839);
                float f11 = 36;
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(b10, Math.round(TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics())), true));
                textView = imageButton;
            } else {
                TextView textView3 = new TextView(this);
                textView3.setText("   x   ");
                textView3.setTextSize(20.0f);
                textView = textView3;
            }
            textView.setLayoutParams(layoutParams4);
            textView.setOnClickListener(new c());
            textView.setContentDescription("x");
            textView.setId(1475346435);
            relativeLayout2.addView(textView);
            View view = new View(this);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics()))));
            view.setBackgroundColor(AdsCommonMetaData.f22889h.C().intValue());
            linearLayout.addView(view);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f22623a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f22623a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.f22889h.u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView4 = new TextView(this);
            textView4.setTextColor(AdsCommonMetaData.f22889h.v().intValue());
            textView4.setPadding(0, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3, getResources().getDisplayMetrics())));
            textView4.setText("Powered By ");
            textView4.setTextSize(16.0f);
            linearLayout2.addView(textView4);
            ImageView imageView = new ImageView(this);
            Bitmap b11 = a1.b(this, "logo.png");
            if (b11 == null) {
                b11 = a1.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(b11, Math.round(TypedValue.applyDimension(1, 56, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics())), true));
            linearLayout2.addView(imageView);
            new AdInformationObject(this, AdInformationObject.Size.LARGE, AdPreferences.Placement.INAPP_OFFER_WALL, (AdInformationOverrides) getIntent().getSerializableExtra("adInfoOverride"), null, null, null).a(relativeLayout);
            setContentView(relativeLayout, layoutParams);
            new Handler().postDelayed(new d(), 500L);
        } catch (Throwable th) {
            l3.a(th);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f22632j != null) {
            c5.a(this).a(this.f22632j);
        }
        WeakHashMap weakHashMap = o9.f22359a;
        o9.a((Activity) this, getResources().getConfiguration().orientation, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        b5 b5Var = this.f22631i;
        if (b5Var != null) {
            for (s7 s7Var : b5Var.a(this.f22628f).f21757a.f22126c.values()) {
                if (s7Var != null) {
                    s7Var.a();
                }
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if ((this.f22625c == null || this.f22626d == null || System.currentTimeMillis() - this.f22625c.longValue() <= this.f22626d.longValue()) ? false : true) {
            finish();
            return;
        }
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal.c.f22944a.f22923o = true;
        this.f22627e = SystemClock.uptimeMillis();
        b5 b5Var = this.f22631i;
        if (b5Var != null) {
            j3 j3Var = b5Var.a(this.f22628f).f21757a;
            for (String str : j3Var.f22126c.keySet()) {
                if (j3Var.f22126c.get(str) != null) {
                    j3Var.f22126c.get(str).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l10 = this.f22625c;
        if (l10 != null) {
            bundle.putSerializable("lastLoadTime", l10);
        }
        Long l11 = this.f22626d;
        if (l11 != null) {
            bundle.putSerializable("adCacheTtl", l11);
        }
    }
}
