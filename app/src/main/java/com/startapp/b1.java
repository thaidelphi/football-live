package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.startapp.c1;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21775a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21776b;

    /* renamed from: c  reason: collision with root package name */
    public final b f21777c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21778d;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* compiled from: Sta */
        /* renamed from: com.startapp.b1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class RunnableC0243a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f21780a;

            public RunnableC0243a(Bitmap bitmap) {
                this.f21780a = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b1 b1Var = b1.this;
                b bVar = b1Var.f21777c;
                if (bVar != null) {
                    bVar.a(this.f21780a, b1Var.f21778d);
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnection2 = null;
            Bitmap bitmap2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(b1.this.f21776b).openConnection();
            } catch (Throwable unused) {
                bitmap = null;
            }
            try {
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                bitmap2 = BitmapFactory.decodeStream(new c1.a(inputStream));
                bufferedInputStream.close();
                inputStream.close();
                httpURLConnection.disconnect();
            } catch (Throwable unused2) {
                Bitmap bitmap3 = bitmap2;
                httpURLConnection2 = httpURLConnection;
                bitmap = bitmap3;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                bitmap2 = bitmap;
                new Handler(Looper.getMainLooper()).post(new RunnableC0243a(bitmap2));
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0243a(bitmap2));
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        void a(Bitmap bitmap, int i10);
    }

    public b1(Context context, String str, b bVar, int i10) {
        this.f21775a = context;
        this.f21776b = str;
        this.f21777c = bVar;
        this.f21778d = i10;
    }

    public final void a() {
        com.startapp.sdk.components.a.a(this.f21775a).f23250z.a().execute(new a());
    }
}
