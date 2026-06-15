package com.ariabolds.dateobjectz;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import z4.l0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class W extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    RelativeLayout f10215a;

    /* renamed from: b  reason: collision with root package name */
    SharedPreferences f10216b;

    /* renamed from: c  reason: collision with root package name */
    private long f10217c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f10218d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements r1.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x057e  */
        @Override // r1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.String r26, java.lang.String r27, java.lang.String r28) {
            /*
                Method dump skipped, instructions count: 1519
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ariabolds.dateobjectz.W.a.a(java.lang.String, java.lang.String, java.lang.String):void");
        }

        @Override // r1.c
        public void onError(String str, String str2) {
            W w10 = W.this;
            if (w10.f10218d < 2) {
                if (c.f10244b.equals(l0.f33541f)) {
                    c.f10244b = l0.f33542g;
                    W.this.e();
                    return;
                } else if (c.f10244b.equals(l0.f33542g)) {
                    c.f10244b = l0.f33541f;
                    W.this.e();
                    return;
                }
            } else {
                w10.f10218d = 0;
            }
            W.this.f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            W.this.findViewById(2131362109).setVisibility(8);
            W.this.f10215a.setVisibility(0);
            W.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f10218d++;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10216b = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10216b = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            } catch (Exception unused2) {
            }
        }
        new r1.a(getApplicationContext(), c.f10244b + c.f10243a + "get_info.js", new a()).execute(new Void[0]);
    }

    public void f(String str) {
        ((Button) findViewById(2131362111)).setOnClickListener(new b());
        this.f10215a.setVisibility(8);
        if (str == null) {
            findViewById(2131362109).setVisibility(0);
            return;
        }
        View findViewById = findViewById(2131362109);
        TextView textView = (TextView) findViewById(2131362110);
        if (str.contains("404")) {
            textView.setText("The app is under maintenance, please visit again few moment later");
        } else if (str.contains("timeout")) {
            textView.setText("Please wait a moment We'll be back shortly.\nThe app is under maintenance, please visit again few moment later");
        } else {
            textView.setText("The app is under maintenance, please visit again few moment later");
        }
        findViewById.setVisibility(0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (System.currentTimeMillis() - this.f10217c > 2000) {
            Toast.makeText(this, "Press again to exit app", 0).show();
            this.f10217c = System.currentTimeMillis();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558430);
        try {
            getWindow().getDecorView().setSystemUiVisibility(4102);
            if (getSupportActionBar() != null) {
                getSupportActionBar().k();
            }
        } catch (Exception unused) {
        }
        this.f10215a = (RelativeLayout) findViewById(2131362214);
        FirebaseMessaging.l().C("app2024-7");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        this.f10216b = defaultSharedPreferences;
        if (defaultSharedPreferences.getString("intro", "").startsWith("www") || this.f10216b.getString("intro", "").startsWith("http")) {
            ImageView imageView = (ImageView) findViewById(2131362175);
            com.bumptech.glide.b.u(imageView).r(this.f10216b.getString("intro", "")).i(2131231168).T(2131231184).s0(imageView);
        }
        e();
    }
}
