package com.startapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.startapp.c1;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.ads.list3d.List3DView;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j3 {

    /* renamed from: a  reason: collision with root package name */
    public final t4<Executor> f22124a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<w2> f22125b;

    /* renamed from: f  reason: collision with root package name */
    public k6 f22129f;

    /* renamed from: g  reason: collision with root package name */
    public int f22130g = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Hashtable<String, Bitmap> f22127d = new Hashtable<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f22128e = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public final ConcurrentLinkedQueue<a> f22131h = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, s7> f22126c = new HashMap<>();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f22132a;

        /* renamed from: b  reason: collision with root package name */
        public final String f22133b;

        /* renamed from: c  reason: collision with root package name */
        public final String f22134c;

        /* compiled from: Sta */
        /* renamed from: com.startapp.j3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class RunnableC0246a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Bitmap f22136a;

            public RunnableC0246a(Bitmap bitmap) {
                this.f22136a = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a poll;
                ArrayList arrayList;
                a aVar = a.this;
                Bitmap bitmap = this.f22136a;
                j3 j3Var = j3.this;
                j3Var.f22130g--;
                if (bitmap != null) {
                    j3Var.f22127d.put(aVar.f22133b, bitmap);
                    k6 k6Var = j3.this.f22129f;
                    if (k6Var != null) {
                        int i10 = aVar.f22132a;
                        List3DActivity list3DActivity = (List3DActivity) k6Var;
                        List3DView list3DView = list3DActivity.f22623a;
                        View childAt = list3DView.getChildAt(i10 - list3DView.f22646i);
                        if (childAt != null) {
                            z4 z4Var = (z4) childAt.getTag();
                            b5 b5Var = list3DActivity.f22631i;
                            a5 a10 = b5Var != null ? b5Var.a(list3DActivity.f22628f) : null;
                            if (a10 != null && (arrayList = a10.f21758b) != null && i10 < arrayList.size()) {
                                y4 y4Var = (y4) a10.f21758b.get(i10);
                                z4Var.f23664b.setImageBitmap(a10.f21757a.a(y4Var.f23564a, i10, y4Var.f23572i));
                                z4Var.f23664b.requestLayout();
                                z4Var.a(y4Var.f23577n != null);
                            }
                        }
                    }
                    j3 j3Var2 = j3.this;
                    if (j3Var2.f22131h.isEmpty() || (poll = j3Var2.f22131h.poll()) == null) {
                        return;
                    }
                    j3Var2.f22124a.a().execute(poll);
                }
            }
        }

        public a(int i10, String str, String str2) {
            this.f22132a = i10;
            this.f22133b = str;
            this.f22134c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            HttpURLConnection httpURLConnection;
            String str = this.f22134c;
            Bitmap bitmap2 = null;
            bitmap2 = null;
            HttpURLConnection httpURLConnection2 = null;
            if (str != null) {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
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
                    j3.this.f22125b.a().execute(new RunnableC0246a(bitmap2));
                }
            }
            j3.this.f22125b.a().execute(new RunnableC0246a(bitmap2));
        }
    }

    public j3(t4<Executor> t4Var, t4<w2> t4Var2) {
        this.f22124a = t4Var;
        this.f22125b = t4Var2;
    }

    public final Bitmap a(String str, int i10, String str2) {
        Bitmap bitmap = this.f22127d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f22128e.contains(str)) {
            return null;
        }
        this.f22128e.add(str);
        int i11 = this.f22130g;
        if (i11 >= 15) {
            this.f22131h.add(new a(i10, str, str2));
            return null;
        }
        this.f22130g = i11 + 1;
        this.f22124a.a().execute(new a(i10, str, str2));
        return null;
    }
}
