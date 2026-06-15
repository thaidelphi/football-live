package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: GifDrawable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: a  reason: collision with root package name */
    final ScheduledThreadPoolExecutor f29973a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f29974b;

    /* renamed from: c  reason: collision with root package name */
    long f29975c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f29976d;

    /* renamed from: e  reason: collision with root package name */
    protected final Paint f29977e;

    /* renamed from: f  reason: collision with root package name */
    final Bitmap f29978f;

    /* renamed from: g  reason: collision with root package name */
    final GifInfoHandle f29979g;

    /* renamed from: h  reason: collision with root package name */
    final ConcurrentLinkedQueue<aa.a> f29980h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f29981i;

    /* renamed from: j  reason: collision with root package name */
    private PorterDuffColorFilter f29982j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f29983k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f29984l;

    /* renamed from: m  reason: collision with root package name */
    final e f29985m;

    /* renamed from: n  reason: collision with root package name */
    private final h f29986n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f29987o;

    /* renamed from: p  reason: collision with root package name */
    ScheduledFuture<?> f29988p;

    /* renamed from: q  reason: collision with root package name */
    private int f29989q;

    /* renamed from: r  reason: collision with root package name */
    private int f29990r;

    /* renamed from: s  reason: collision with root package name */
    private ba.a f29991s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GifDrawable.java */
    /* renamed from: pl.droidsonroids.gif.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public class C0341a extends i {
        C0341a(a aVar) {
            super(aVar);
        }

        @Override // pl.droidsonroids.gif.i
        public void b() {
            if (a.this.f29979g.p()) {
                a.this.start();
            }
        }
    }

    /* compiled from: GifDrawable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class b extends i {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f29993b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, int i10) {
            super(aVar);
            this.f29993b = i10;
        }

        @Override // pl.droidsonroids.gif.i
        public void b() {
            a aVar = a.this;
            aVar.f29979g.t(this.f29993b, aVar.f29978f);
            this.f30029a.f29985m.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public a(Resources resources, int i10) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i10));
        float b10 = d.b(resources, i10);
        this.f29990r = (int) (this.f29979g.e() * b10);
        this.f29989q = (int) (this.f29979g.j() * b10);
    }

    private void a() {
        ScheduledFuture<?> scheduledFuture = this.f29988p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f29985m.removeMessages(-1);
    }

    private void h() {
        this.f29974b = false;
        this.f29985m.removeMessages(-1);
        this.f29979g.n();
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public int b() {
        return this.f29979g.a();
    }

    public int c() {
        int b10 = this.f29979g.b();
        return (b10 == 0 || b10 < this.f29979g.f()) ? b10 : b10 - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return d() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return d() > 1;
    }

    public int d() {
        return this.f29979g.h();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        if (this.f29982j == null || this.f29977e.getColorFilter() != null) {
            z10 = false;
        } else {
            this.f29977e.setColorFilter(this.f29982j);
            z10 = true;
        }
        ba.a aVar = this.f29991s;
        if (aVar == null) {
            canvas.drawBitmap(this.f29978f, this.f29987o, this.f29976d, this.f29977e);
        } else {
            aVar.b(canvas, this.f29977e, this.f29978f);
        }
        if (z10) {
            this.f29977e.setColorFilter(null);
        }
        if (this.f29984l && this.f29974b) {
            long j10 = this.f29975c;
            if (j10 != Long.MIN_VALUE) {
                long max = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f29975c = Long.MIN_VALUE;
                this.f29973a.remove(this.f29986n);
                this.f29988p = this.f29973a.schedule(this.f29986n, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean e() {
        return this.f29979g.l();
    }

    public void f() {
        this.f29973a.execute(new C0341a(this));
    }

    public void g(int i10) {
        this.f29979g.u(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29977e.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f29977e.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f29979g.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f29979g.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29990r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f29989q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f29979g.k() || this.f29977e.getAlpha() < 255) ? -2 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(long j10) {
        if (this.f29984l) {
            this.f29975c = 0L;
            this.f29985m.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        a();
        this.f29988p = this.f29973a.schedule(this.f29986n, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f29974b;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f29974b;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f29981i) != null && colorStateList.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f29976d.set(rect);
        ba.a aVar = this.f29991s;
        if (aVar != null) {
            aVar.a(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f29981i;
        if (colorStateList == null || (mode = this.f29983k) == null) {
            return false;
        }
        this.f29982j = j(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        if (i10 >= 0) {
            this.f29973a.execute(new b(this, i10));
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f29977e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29977e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z10) {
        this.f29977e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f29977e.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f29981i = colorStateList;
        this.f29982j = j(colorStateList, this.f29983k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f29983k = mode;
        this.f29982j = j(this.f29981i, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.f29984l) {
            if (z10) {
                if (z11) {
                    f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f29974b) {
                return;
            }
            this.f29974b = true;
            i(this.f29979g.q());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f29974b) {
                this.f29974b = false;
                a();
                this.f29979g.s();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f29979g.j()), Integer.valueOf(this.f29979g.e()), Integer.valueOf(this.f29979g.h()), Integer.valueOf(this.f29979g.g()));
    }

    public a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public a(ContentResolver contentResolver, Uri uri) throws IOException {
        this(GifInfoHandle.m(contentResolver, uri), null, null, true);
    }

    a(GifInfoHandle gifInfoHandle, a aVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.f29974b = true;
        this.f29975c = Long.MIN_VALUE;
        this.f29976d = new Rect();
        this.f29977e = new Paint(6);
        this.f29980h = new ConcurrentLinkedQueue<>();
        h hVar = new h(this);
        this.f29986n = hVar;
        this.f29984l = z10;
        this.f29973a = scheduledThreadPoolExecutor == null ? c.a() : scheduledThreadPoolExecutor;
        this.f29979g = gifInfoHandle;
        Bitmap bitmap = null;
        if (aVar != null) {
            synchronized (aVar.f29979g) {
                if (!aVar.f29979g.l() && aVar.f29979g.e() >= gifInfoHandle.e() && aVar.f29979g.j() >= gifInfoHandle.j()) {
                    aVar.h();
                    Bitmap bitmap2 = aVar.f29978f;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f29978f = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        } else {
            this.f29978f = bitmap;
        }
        this.f29978f.setHasAlpha(!gifInfoHandle.k());
        this.f29987o = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.f29985m = new e(this);
        hVar.b();
        this.f29989q = gifInfoHandle.j();
        this.f29990r = gifInfoHandle.e();
    }
}
