package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c2 {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6733a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f6734b;

    /* renamed from: c  reason: collision with root package name */
    private AlertDialog f6735c;

    /* renamed from: d  reason: collision with root package name */
    private a f6736d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a();

        void b();
    }

    public c2(Activity activity, com.applovin.impl.sdk.j jVar) {
        this.f6733a = jVar;
        this.f6734b = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i10) {
        this.f6736d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.f6735c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f6735c = new AlertDialog.Builder(this.f6734b).setTitle((CharSequence) this.f6733a.a(o4.f8116g1)).setMessage((CharSequence) this.f6733a.a(o4.f8124h1)).setCancelable(false).setPositiveButton((CharSequence) this.f6733a.a(o4.f8140j1), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.q9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                c2.this.a(dialogInterface, i10);
            }
        }).setNegativeButton((CharSequence) this.f6733a.a(o4.f8132i1), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.p9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                c2.this.b(dialogInterface, i10);
            }
        }).show();
    }

    public void a(a aVar) {
        this.f6736d = aVar;
    }

    public void e() {
        this.f6734b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.r9
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.d();
            }
        });
    }

    public void a() {
        this.f6734b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s9
            @Override // java.lang.Runnable
            public final void run() {
                c2.this.c();
            }
        });
    }

    public boolean b() {
        AlertDialog alertDialog = this.f6735c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        this.f6736d.b();
    }
}
