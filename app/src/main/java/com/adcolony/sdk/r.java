package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.adcolony.sdk.e0;
import com.ironsource.b9;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private h0 f6219a;

    /* renamed from: b  reason: collision with root package name */
    private AlertDialog f6220b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6221c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements j0 {
        a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (com.adcolony.sdk.a.c() && (com.adcolony.sdk.a.a() instanceof Activity)) {
                if (c0.b(h0Var.a(), "on_resume")) {
                    r.this.f6219a = h0Var;
                    return;
                } else {
                    r.this.a(h0Var);
                    return;
                }
            }
            new e0.a().a("Missing Activity reference, can't build AlertDialog.").a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f6223a;

        b(h0 h0Var) {
            this.f6223a = h0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r.this.f6220b = null;
            dialogInterface.dismiss();
            f1 b10 = c0.b();
            c0.b(b10, "positive", true);
            r.this.f6221c = false;
            this.f6223a.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f6225a;

        c(h0 h0Var) {
            this.f6225a = h0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            r.this.f6220b = null;
            dialogInterface.dismiss();
            f1 b10 = c0.b();
            c0.b(b10, "positive", false);
            r.this.f6221c = false;
            this.f6225a.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f6227a;

        d(h0 h0Var) {
            this.f6227a = h0Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            r.this.f6220b = null;
            r.this.f6221c = false;
            f1 b10 = c0.b();
            c0.b(b10, "positive", false);
            this.f6227a.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f6229a;

        e(AlertDialog.Builder builder) {
            this.f6229a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f6221c = true;
            r.this.f6220b = this.f6229a.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r() {
        com.adcolony.sdk.a.a("Alert.show", new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        h0 h0Var = this.f6219a;
        if (h0Var != null) {
            a(h0Var);
            this.f6219a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f6221c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public void a(h0 h0Var) {
        AlertDialog.Builder builder;
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            builder = new AlertDialog.Builder(a10, 16974374);
        } else {
            builder = new AlertDialog.Builder(a10, 16974126);
        }
        f1 a11 = h0Var.a();
        String h10 = c0.h(a11, "message");
        String h11 = c0.h(a11, b9.h.D0);
        String h12 = c0.h(a11, "positive");
        String h13 = c0.h(a11, "negative");
        builder.setMessage(h10);
        builder.setTitle(h11);
        builder.setPositiveButton(h12, new b(h0Var));
        if (!h13.equals("")) {
            builder.setNegativeButton(h13, new c(h0Var));
        }
        builder.setOnCancelListener(new d(h0Var));
        z0.b(new e(builder));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlertDialog a() {
        return this.f6220b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AlertDialog alertDialog) {
        this.f6220b = alertDialog;
    }
}
