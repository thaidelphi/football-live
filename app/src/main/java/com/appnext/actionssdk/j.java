package com.appnext.actionssdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j {
    private static final String bK = "ImageDownloader";
    private static final int bM = 10;
    private static final int bN = 10000;
    private static final ConcurrentHashMap<String, SoftReference<Bitmap>> bP = new ConcurrentHashMap<>(5);
    private int bL = b.CORRECT$76d658fb;
    private final HashMap<String, Bitmap> bO = new LinkedHashMap<String, Bitmap>(5, 0.75f, true) { // from class: com.appnext.actionssdk.j.1
        private static final long serialVersionUID = 1;

        {
            super(5, 0.75f, true);
        }

        @Override // java.util.LinkedHashMap
        protected final boolean removeEldestEntry(Map.Entry<String, Bitmap> entry) {
            if (size() > 10) {
                j.bP.put(entry.getKey(), new SoftReference(entry.getValue()));
                return true;
            }
            return false;
        }
    };
    private final Handler bQ = new Handler();
    private final Runnable bR = new Runnable() { // from class: com.appnext.actionssdk.j.2
        @Override // java.lang.Runnable
        public final void run() {
            j.this.clearCache();
        }
    };

    /* renamed from: com.appnext.actionssdk.j$3  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] bT;

        static {
            int[] iArr = new int[b.S().length];
            bT = iArr;
            try {
                iArr[b.NO_ASYNC_TASK$76d658fb - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                bT[b.NO_DOWNLOADED_DRAWABLE$76d658fb - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                bT[b.CORRECT$76d658fb - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends AsyncTask<String, Void, Bitmap> {
        private String bU;
        private final WeakReference<ImageView> bV;

        public a(ImageView imageView) {
            this.bV = new WeakReference<>(imageView);
        }

        protected final Bitmap b(String... strArr) {
            String str = strArr[0];
            this.bU = str;
            return j.J(str);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Bitmap doInBackground(String[] strArr) {
            String str = strArr[0];
            this.bU = str;
            return j.J(str);
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (isCancelled()) {
                bitmap2 = null;
            }
            j.this.a(this.bU, bitmap2);
            WeakReference<ImageView> weakReference = this.bV;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (this == j.a(imageView) || !(j.this.bL == b.CORRECT$76d658fb || imageView == null)) {
                    imageView.setImageBitmap(bitmap2);
                }
            }
        }

        protected final void a(Bitmap bitmap) {
            if (isCancelled()) {
                bitmap = null;
            }
            j.this.a(this.bU, bitmap);
            WeakReference<ImageView> weakReference = this.bV;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (this == j.a(imageView) || !(j.this.bL == b.CORRECT$76d658fb || imageView == null)) {
                    imageView.setImageBitmap(bitmap);
                }
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        private static final /* synthetic */ int[] $VALUES$4b954020 = {1, 2, 3};
        public static final int CORRECT$76d658fb = 3;
        public static final int NO_ASYNC_TASK$76d658fb = 1;
        public static final int NO_DOWNLOADED_DRAWABLE$76d658fb = 2;

        private b(String str, int i10) {
        }

        public static int[] S() {
            return (int[]) $VALUES$4b954020.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends ColorDrawable {
        private final WeakReference<a> bW;

        public c(a aVar) {
            super(-16777216);
            this.bW = new WeakReference<>(aVar);
        }

        public final a T() {
            return this.bW.get();
        }
    }

    static Bitmap J(String str) {
        Throwable th;
        InputStream inputStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return decodeStream;
            } catch (IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private Bitmap K(String str) {
        synchronized (this.bO) {
            Bitmap bitmap = this.bO.get(str);
            if (bitmap != null) {
                this.bO.remove(str);
                this.bO.put(str, bitmap);
                return bitmap;
            }
            ConcurrentHashMap<String, SoftReference<Bitmap>> concurrentHashMap = bP;
            SoftReference<Bitmap> softReference = concurrentHashMap.get(str);
            if (softReference != null) {
                Bitmap bitmap2 = softReference.get();
                if (bitmap2 != null) {
                    return bitmap2;
                }
                concurrentHashMap.remove(str);
                return null;
            }
            return null;
        }
    }

    private static boolean c(String str, ImageView imageView) {
        a a10 = a(imageView);
        if (a10 != null) {
            String str2 = a10.bU;
            if (str2 != null && str2.equals(str)) {
                return false;
            }
            a10.cancel(true);
        }
        return true;
    }

    public final void clearCache() {
        this.bO.clear();
        bP.clear();
    }

    private void b(String str, ImageView imageView) {
        if (str == null) {
            imageView.setImageDrawable(null);
        } else if (c(str, imageView)) {
            int i10 = AnonymousClass3.bT[this.bL - 1];
            if (i10 == 1) {
                Bitmap J = J(str);
                a(str, J);
                imageView.setImageBitmap(J);
            } else if (i10 == 2) {
                imageView.setMinimumHeight(156);
                new a(imageView).execute(str);
            } else if (i10 != 3) {
            } else {
                a aVar = new a(imageView);
                imageView.setImageDrawable(new c(aVar));
                imageView.setMinimumHeight(156);
                aVar.execute(str);
            }
        }
    }

    public final void a(String str, ImageView imageView) {
        Bitmap K = K(str);
        if (K != null) {
            c(str, imageView);
            imageView.setImageBitmap(K);
        } else if (str == null) {
            imageView.setImageDrawable(null);
        } else if (c(str, imageView)) {
            int i10 = AnonymousClass3.bT[this.bL - 1];
            if (i10 == 1) {
                Bitmap J = J(str);
                a(str, J);
                imageView.setImageBitmap(J);
            } else if (i10 == 2) {
                imageView.setMinimumHeight(156);
                new a(imageView).execute(str);
            } else if (i10 != 3) {
            } else {
                a aVar = new a(imageView);
                imageView.setImageDrawable(new c(aVar));
                imageView.setMinimumHeight(156);
                aVar.execute(str);
            }
        }
    }

    public final void c(int i10) {
        this.bL = i10;
        clearCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof c) {
                return ((c) drawable).T();
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Bitmap bitmap) {
        if (bitmap != null) {
            synchronized (this.bO) {
                this.bO.put(str, bitmap);
            }
        }
    }
}
