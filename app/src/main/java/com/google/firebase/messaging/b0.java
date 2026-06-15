package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: ImageDownload.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f14957a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Future<?> f14958b;

    /* renamed from: c  reason: collision with root package name */
    private Task<Bitmap> f14959c;

    private b0(URL url) {
        this.f14957a = url;
    }

    private byte[] f() throws IOException {
        URLConnection openConnection = this.f14957a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = b.d(b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f14957a);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static b0 j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new b0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(b());
        } catch (Exception e8) {
            taskCompletionSource.setException(e8);
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f14957a);
        }
        byte[] f10 = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, f10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f14957a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f14957a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14958b.cancel(true);
    }

    public Task<Bitmap> k() {
        return (Task) Preconditions.m(this.f14959c);
    }

    public void w(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14958b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                b0.this.t(taskCompletionSource);
            }
        });
        this.f14959c = taskCompletionSource.getTask();
    }
}
